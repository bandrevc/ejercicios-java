import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Investiga cómo leer del teclado y aplicarlo a todos los ejercicios.
        // Agregar validaciones a todos los ejercicios
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
    }
    //------------------------------------------------------------------------------------------------------------------
    /*
    Realizar una función que te devuelva la cantidad de vocales de un texto pasado como argumento.
    Por ejemplo:

    Texto: “Algoritmo de la felicidad”
    Cantidad de vocales: 10
    */
    public static void exercise1() {
        System.out.println("Debes ingresar un texto");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if (text.isEmpty()) {
            System.out.println("Debes ingresar un texto");
        }
        else {
            String[] characters = text.split("");
            int contador = 0;
            final String VOWELS = "AEIOUaeiou";
            // [""]
            for (String character : characters) {
                if (VOWELS.contains(character))
                    contador++;
            }
            System.out.println("Texto: " + text);
            System.out.println("Cantidad de vocales: " + contador);
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    /*
    Crear un algoritmo que multiplique 2 números sin usar el operador de multiplicación. Por ejemplo:
    Multiplicando: 5
    Multiplicador: 10
    */
    public static void exercise2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Multiplicando: ");
        int multiplicando = sc.nextInt();
        System.out.print("Multiplicador: ");
        int multiplicador = sc.nextInt();
        int producto = 0;
        for (int i = 0; i < multiplicador; i++) {
            producto += multiplicando;
        }
        System.out.println("Producto: " + producto);
    }
    //------------------------------------------------------------------------------------------------------------------
    /*Crear una función que, dado un vector (x, y), devuelva
    su magnitud (RAIZ CUADRADA DE X^2 + Y^2). Por ejemplo:

    Vector componente X: 3
    Vector componente Y: 4
*/
    public static void exercise3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vector componente X: ");
        int vectorX = sc.nextInt();
        System.out.print("Vector componente Y: ");
        int vectorY = sc.nextInt();
        double magnitud = Math.sqrt((vectorX * vectorX) + (vectorY * vectorY));
        System.out.println("Vector componente X: " + vectorX);
        System.out.println("Vector componente Y: " + vectorY);
        System.out.println("El resultado es " + magnitud);
    }
    //------------------------------------------------------------------------------------------------------------------
    /*Crear un algoritmo que, dados dos vectores (x1, y2) y (x2, y2),
    determine su producto punto (|A|.|B| = (Ax1 * Ax2, Ay1 * Ay2). Por ejemplo:

    Vector componente X1: 3
    Vector componente Y1: 5
    Vector componente X2: 6
    Vector componente Y2: 2

    Producto punto: (18, 10)
*/
    public static void exercise4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vector componente X1: ");
        int vectorX1 = sc.nextInt();
        System.out.print("Vector componente Y1: ");
        int vectorY1 = sc.nextInt();
        System.out.print("Vector componente X2: ");
        int vectorX2 = sc.nextInt();
        System.out.print("Vector componente Y2: ");
        int vectorY2 = sc.nextInt();
        int componentX = vectorX1 * vectorX2;
        int componentY = vectorY1 * vectorY2;
        System.out.println("Producto punto es: (" + componentX + ", " + componentY + ")");
    }
    //------------------------------------------------------------------------------------------------------------------
    /*Crear un algoritmo que, dado un texto, muestre aquel texto sin vocales. Por ejemplo:

        Texto: “Per aspera ad astra”
        Texto sin vocales: “Pr spr d str”
*/
    public static void exercise5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un texto: ");
        String text = sc.nextLine();
        String[] characters = text.split("");
        // "manuel" -> ["m", "a", ...] -> ["m", "", "n", "", "", "l"]
        final String VOWELS = "aeiou";
        String textWithoutVowels = "";
        // "manuel" | "" -> "mnl"
        for (String character : characters) {
            if (!VOWELS.contains(character))
                textWithoutVowels += character;
        }
        System.out.println("Texto sin vocales: " + textWithoutVowels);
    }
    //------------------------------------------------------------------------------------------------------------------
    /* Realizar un algoritmo que dado un número, te muestre su
    tabla de multiplicar, del 1 al 12. Por ejemplo:

         Número: 4
         Tabla de multiplicar:
         4 x 1 = 4
         4 x 2 = 8
         4 x 3 = 12
         4 x 4 = 16
         ...
   */
    public static void exercise6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int multiplier = sc.nextInt();
        System.out.println("Número:" + multiplier);
        System.out.println("Tabla de multiplicar:");
        for (int multiplying = 1; multiplying <= 12; multiplying++) {
            int product = multiplying * multiplier;
            System.out.println(multiplier + " X " + multiplying + " = " + product);
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    /*Crear una función que dado un número n, sume
    los números naturales desde 1 a n. Por ejemplo:

            Número n: 10
            Suma de 1 a n: 1 + 2 + 3… + 10 = 55
    */
    public static void exercise7() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriba un numero: ");
        int lastTerm = sc.nextInt();
        System.out.println("Numero n: " + lastTerm);
        int sum = calculateNaturalNumberSum(lastTerm);
        String numberChain = "";
        for (int i = 2; i <= lastTerm; i++) {
            numberChain = numberChain + " + " + i;
        }
        System.out.println("Suma de 1 a n: 1" + numberChain + " = " + sum);
    }
    // f(x) = n * (n+1)/2
    private static int calculateNaturalNumberSum(int lastTerm) {
        return lastTerm * (lastTerm + 1) / 2;
    }
    //------------------------------------------------------------------------------------------------------------------
    /*Hacer una función que devuelva el reverso de una cadena de texto. Por ejemplo:

        Texto: “Arroz con leche”
        Texto al revés: “ehcel noc zorrA”
*/
    public static void exercise8() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriba un texto: ");
        String text = sc.nextLine();
        text = text.trim();
        System.out.println("Texto: " + text);
        String[] characters = text.split("");
        String textInReverse = "";
        // Código imperativo
        // ¿Qué debe hacer y cómo lo va a hacer?
        /*for (int i = characters.length - 1; i >= 0; i--) {
            textInReverse = textInReverse + characters[i];
        }*/

        // Código declarativo
        // ¿Qué debe hacer?
        for (String character : characters) {
            textInReverse = character + textInReverse;
        }
        System.out.println("Texto al revés: " + textInReverse);
    }
    //------------------------------------------------------------------------------------------------------------------
    /*Realizar un algoritmo que dado 2 textos, verifique si el segundo es un anagrama
    del primero, es decir si tienen las mismas letras independientemente del orden.
    Por ejemplo:

        Primera palabra: “amor”
        Segunda palabra: “roma”
        Es un anagrama
    */
    public static void exercise9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primera palabra: ");
        String first = sc.nextLine();
        System.out.print("Segunda palabra: ");
        String second = sc.nextLine();
        char[] charactersFirst = first.toUpperCase().toCharArray();
        char[] charactersSecond = second.toUpperCase().toCharArray();
        Arrays.sort(charactersFirst);
        Arrays.sort(charactersSecond);
        if (Arrays.equals(charactersFirst, charactersSecond)) {
            System.out.println("Es un anagrama");
        } else {
            System.out.println("No es un anagrama");
        }
    }
}