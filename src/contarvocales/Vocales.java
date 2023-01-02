package contarvocales;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
public class Vocales {
            
    public int leerArchivo(String caracter){
        int posicion, contador=0;
        String palabra="";
        File archivo=new File("ejemploScanner.txt");
        try{
            FileReader f=new FileReader (archivo);
            Scanner ingreso=new Scanner (f);            
            for(int i=0;i<5;i++){
                while (ingreso.hasNext()) {
                    palabra = ingreso.next();
                    System.out.println("Palabra: " + palabra);                  
                    posicion = palabra.indexOf(caracter);//se busca la primera vez que aparece
                    while (posicion != -1) { //mientras se encuentre el caracter
                        contador++;           //se cuenta                                        
                        posicion = palabra.indexOf(caracter, posicion + 1);//se sigue buscando a partir de la posición siguiente a la encontrada
                        System.out.println(caracter);
                    }
                }          
            }
            System.out.println(contador);
            }           
        catch(IOException ex){           
        }
        return contador;
    }
}