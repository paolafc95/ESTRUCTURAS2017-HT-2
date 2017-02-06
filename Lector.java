import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lector{

    public static void main(String[] arg){

        Cola cola= new Cola();
        Interpreter interpretador= new Interpreter();
        String archivo= "datos.txt";
        String[] resultados;
        int contador=0;
        try {
            File data = new File(archivo);
            FileReader fileReader = new FileReader(data);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                cola.enQueue(linea);
                contador++
            }
            resultados=new String[contador];


            }
            fileReader.close();
            System.out.println("Se ha terminado de leer el archivo "+archivo);
            System.out.println(interpretador.Read(cola.deQueue()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}