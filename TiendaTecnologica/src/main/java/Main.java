import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import models.Compra;
import models.Direccion;
import models.Tienda;
import models.Usuario;

public class Main {

    public static void main(String[] args) {
        try {
            // Ruta al archivo JSON
            String rutaJson = "src/main/resources/tienda.json";

            // Leer el JSON y mapear el objeto 'tienda' a la clase Tienda
            ObjectMapper mapper = new ObjectMapper();
            java.util.Map<?,?> jsonMap = mapper.readValue(new File(rutaJson), java.util.Map.class);
            Object tiendaObj = jsonMap.get("tienda");
            Tienda tienda = mapper.convertValue(tiendaObj, Tienda.class);

            // Mostrar datos de la tienda
            System.out.println("Tienda: " + tienda.getNombre());

            // Mostrar clientes (usuarios)
            ArrayList<Usuario> usuarios = tienda.getUsuarios();
            if (usuarios != null) {
                for (Usuario usuario : usuarios) {
                    System.out.println("  Usuario (id_usuario): " + usuario.getId_usuario());
                    System.out.println("    Nombre: " + usuario.getNombre());
                    System.out.println("    Email: " + usuario.getEmail());
                    Direccion direccion = usuario.getDireccion();
                    if (direccion != null) {
                        System.out.println("    Dirección:");
                        System.out.println("      Calle: " + direccion.getCalle());
                        System.out.println("      Número: " + direccion.getNumero());
                        System.out.println("      Ciudad: " + direccion.getCiudad());
                        System.out.println("      País: " + direccion.getPais());
                    }
                    ArrayList<Compra> historial = usuario.getHistorialCompras();
                    if (historial != null) {
                        System.out.println("    Historial de compras:");
                        for (Compra compra : historial) {
                            System.out.println("      Id compra: " + compra.getId_compra());
                            System.out.println("      Cantidad: " + compra.getCantidad());
                            System.out.println("      Fecha: " + compra.getFecha());
                        }
                    }
                }
            }

            // Mostrar compras generales
            ArrayList<Compra> compras = tienda.getCompras();
            if (compras != null) {
                System.out.println("Compras generales:");
                for (Compra compra : compras) {
                    System.out.println("  Id compra: " + compra.getId_compra());
                    System.out.println("  Cantidad: " + compra.getCantidad());
                    System.out.println("  Fecha: " + compra.getFecha());
                }
            }

        } catch (Exception e) {
            System.err.println("Error al leer o mostrar el JSON: " + e.getMessage());
        }
    }
}