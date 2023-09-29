import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
* Ejemplo de programa que muestra el contenido de un fichero de texto línea a línea.
*Para leer se usa el método readLine() de la clase BufferedReader.
* */
public class EscribeConNumerosDeLineas {
    /*
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Indicar por favor el nombre del fichero");
            return;
        }
        String nomFich = args[0];

        try (BufferedReader fbr = new BufferedReader(new FileReader(nomFich))){
            int i=0;
            String linea = fbr.readLine();
            while (linea != null) {
                System.out.format("[%5d] %s", i++, linea);
                System.out.println();
                linea = fbr.readLine();
            }
        }   catch (FileNotFoundException e){
            System.out.println("No existe el fichero " + nomFich);
        }   catch (IOException e){
            System.out.println("Error de E/S: " + e.getMessage());
        }   catch (Exception e){
            e.printStackTrace();
        }
    }
}
