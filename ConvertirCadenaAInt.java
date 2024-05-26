import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConvertirCadenaAInt{
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader(isr);

        String sdato;
        int idato;

        try {
            System.out.println("Introduzca un numero entero: ");
            sdato = flujoE.readLine();
            idato = Integer.parseInt(sdato);
            System.out.println("Su numero es: " + idato);
            System.out.println("Su numero a la mitad es: " + idato/2);

            sdato = flujoE.readLine();
            @SuppressWarnings("removal")
            Float f = new Float(sdato);
            @SuppressWarnings("unused")
            float fdato = f.floatValue();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}