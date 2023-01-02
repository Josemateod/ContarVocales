package contarvocales;
import java.io.BufferedReader;
import java.io.FileReader;
public class ContarVocales {
    public static void main(String[] args) {
        Vocales objArchivo=new Vocales();
        int a=objArchivo.leerArchivo("a");
        int e=objArchivo.leerArchivo("e");
        int i=objArchivo.leerArchivo("i");
        int o=objArchivo.leerArchivo("o");
        int u=objArchivo.leerArchivo("u");
        System.out.println("El total de vocales en el texto es: "+(a+e+i+o+u));
    }
}
