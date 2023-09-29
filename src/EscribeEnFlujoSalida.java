import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class EscribeEnFlujoSalida {
    public static void main(String[] args){
       String nomFichero = "f_texto.txt";
       File f = new File(nomFichero);
       if(f.exists()){
           System.out.println("Fichero " + nomFichero + " ya existe. No se hace nada");
           return;
       }

       try{
           BufferedWriter bfw = new BufferedWriter(new FileWriter(f));
           bfw.write(" Este es un fichero de texto. ");
           bfw.newLine();
           bfw.write(" quizá no está del todo bien.");
           bfw.newLine();
           bfw.close();
           bfw = new BufferedWriter(new FileWriter(f,true));
           bfw.write("Pero se puede arreglar.");
           bfw.newLine();
           bfw.close();
           System.out.println("Generado fichero " + nomFichero);

       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }
       catch (Exception e){
           e.printStackTrace();
       }
    }
}
