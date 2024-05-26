import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConvertirCadenaAFloat {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader(isr);
        String sdato;
        try {
            System.out.println("Introduzca un numero entero: ");
            sdato = flujoE.readLine();
            @SuppressWarnings("removal")
            Float f = new Float(sdato);
            float fdato = f.floatValue();
            System.out.println("La mitad de " + fdato + " es " + fdato/2);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
