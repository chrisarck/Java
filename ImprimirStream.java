import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
@SuppressWarnings("unused")
public class ImprimirStream {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner neme = new Scanner(System.in);
        String sCadena = "Un lenguaje OOP";
        char [] cMatriz = {'a','b','c','d'};
        byte bytedato = Byte.MAX_VALUE;
        int idato = 7;
        long Idato = Long.MIN_VALUE;
        float fdato = Float.MAX_VALUE;
        double ddato = Math.PI; 
        boolean bdato = true;
        InputStreamReader isr = new InputStreamReader(System.in);
         @SuppressWarnings("unused")
        BufferedReader flujoE = new BufferedReader(isr);
        PrintWriter flujoS = new PrintWriter(System.out);
        
                flujoS.println(sCadena);
                flujoS.println(cMatriz);
                flujoS.println(bytedato);
                flujoS.println(idato);
                flujoS.println(Idato);
                flujoS.flush();
                System.out.println("CONTINUAR ENTER: ");
                neme.nextLine();
                flujoS.println(fdato);
                flujoS.println(ddato);
                flujoS.println(bdato);
                flujoS.flush();
    }
}
