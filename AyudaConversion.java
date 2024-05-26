import java.io.BufferedReader; // Importa la clase BufferedReader que permite leer texto de una entrada de manera eficiente.
import java.io.InputStreamReader; // Importa la clase InputStreamReader que permite leer bytes y convertirlos en caracteres.

public class AyudaConversion { // Define la clase principal del programa llamada AyudaConversion.
    public static void main(String[] args) { // Define el método main, que es el punto de entrada del programa.
        InputStreamReader isr = new InputStreamReader(System.in); // Crea un objeto InputStreamReader que lee bytes de la entrada estándar (teclado) y los convierte en caracteres.
        BufferedReader flujoE = new BufferedReader(isr); // Crea un objeto BufferedReader que envuelve el InputStreamReader para leer texto de manera eficiente.
        String sdato; // Declara una variable de tipo String para almacenar la entrada del usuario.
        float multiplicacion = 1; // Declara una variable de tipo float para almacenar el resultado de la multiplicación, inicializada a 1.
        float suma = 0; // Declara una variable de tipo float para almacenar el resultado de la suma, inicializada a 0.
        try { // Inicia un bloque try para capturar excepciones que puedan ocurrir.
            for(int i = 0; i<3; i++){ // Inicia un bucle for que se ejecuta 3 veces.
                System.out.print("Introduzca un numero entero: "); // Muestra un mensaje pidiendo al usuario que introduzca un número entero.
                sdato = flujoE.readLine(); // Lee una línea de texto del usuario y la almacena en la variable sdato.
                @SuppressWarnings("removal")
                Float f = new Float(sdato); // Crea un objeto Float a partir de la cadena sdato.
                float fdato = f.floatValue(); // Convierte el objeto Float en un valor float primitivo.
                multiplicacion *= fdato; // Multiplica el valor actual de multiplicacion por fdato.
                suma += fdato; // Suma el valor de fdato a suma.
            }
            System.out.println("El producto es " + multiplicacion); // Muestra el resultado de la multiplicación.
            System.out.println("La suma es " + suma); // Muestra el resultado de la suma.
            if (multiplicacion % 2 == 0){ // Comprueba si el resultado de la multiplicación es par.
                System.out.println("El producto " + multiplicacion + " es par"); // Muestra que el producto es par.
            } else {
                System.out.println("El producto " + multiplicacion + " es impar"); // Muestra que el producto es impar.
            }
        } catch (Exception e) {} // Captura cualquier excepción que ocurra durante la ejecución del bloque try, aunque no hace nada con ella.
    }
}