import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EscribirNombres {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Elena");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("nombres.txt"))) {

            for (String nombre : nombres) {
                writer.write(nombre);
                writer.newLine();
            }

            System.out.println("Nombres escritos correctamente en nombres.txt");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
