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
        Scanner sc = new Scanner(System.in);
        System.out.println("Debes ingresar un texto:");
        String text = sc.nextLine().trim();
        if (text.isEmpty()) {
            System.out.println("Error: No ingresaste nada o solo pusiste espacios.");
        } else if (text.matches(".*\\d.*")) {
            System.out.println("Error: El texto no debería contener números.");
        } else {
            String[] characters = text.split("");
            int contador = 0;
            final String VOWELS = "AEIOUaeiou";
            for (String character : characters) {
                if (VOWELS.contains(character)) {
                    contador++;
                }
            }
            System.out.println("Texto válido: " + text);
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
        final String ALLOWED_DIGITS = "0123456789";
        // Validación para el Multiplicando
        System.out.print("Multiplicando: ");
        String input1 = sc.next().trim();
        for (int i = 0; i < input1.length(); i++) {
            char c = input1.charAt(i);
            String characterAsText = "" + c;
            if (!ALLOWED_DIGITS.contains(characterAsText)) {
                System.out.println("Error: Solo se permiten números enteros.");
                return;
            }
        }
        int multiplicand = Integer.parseInt(input1);
        //Validacion para el multiplicador
        System.out.print("Multiplicador: ");
        String input2 = sc.next().trim();
        for (int i = 0; i < input2.length(); i++) {
            char c = input2.charAt(i);
            String characterAsText = "" + c;
            if (!ALLOWED_DIGITS.contains(characterAsText)) {
                System.out.println("Error: Solo se permiten números enteros.");
                return;
            }
        }
        int multiplier = Integer.parseInt(input2);
        int product = 0;
        for (int i = 0; i < multiplier; i++) {
            product += multiplicand;
        }
        System.out.println("Producto: " + product);

    }

    //------------------------------------------------------------------------------------------------------------------
    /*Crear una función que, dado un vector (x, y), devuelva
    su magnitud (RAIZ CUADRADA DE X^2 + Y^2). Por ejemplo:

    Vector componente X: 3
    Vector componente Y: 4
*/
    public static void exercise3() {
        Scanner sc = new Scanner(System.in);
        final String ALLOWED_DIGITS = "0123456789";
        // Validacion del vector X
        System.out.print("Vector componente X: ");
        String inputX = sc.next().trim();
        for (int i = 0; i < inputX.length(); i++) {
            char c = inputX.charAt(i);
            String characterAsText = "" + c;
            if (!ALLOWED_DIGITS.contains(characterAsText)) {
                System.out.println("Error: Solo se permiten números enteros.");
                return;
            }
        }
        int vectorX = Integer.parseInt(inputX);
        // Validacion del vector y
        System.out.print("Vector componente Y: ");
        String inputY = sc.next().trim();
        for (int i = 0; i < inputY.length(); i++) {
            char c = inputY.charAt(i);
            String characterAsText = "" + c;
            if (!ALLOWED_DIGITS.contains(characterAsText)) {
                System.out.println("Error: Solo se permiten números enteros.");
                return;
            }
        }
        int vectorY = Integer.parseInt(inputY);
        double magnitude = Math.sqrt((vectorX * vectorX) + (vectorY * vectorY));
        System.out.println("Vector componente X: " + vectorX);
        System.out.println("Vector componente Y: " + vectorY);
        System.out.println("El resultado es " + magnitude);
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
        final String ALLOWED_DIGITS = "0123456789";
        // Validation for X1 component
        System.out.print("Vector componente X1: ");
        String inputX1 = sc.next().trim();
        for (int i = 0; i < inputX1.length(); i++) {
            char c = inputX1.charAt(i);
            String characterAsText = "" + c;
            if (!ALLOWED_DIGITS.contains(characterAsText)) {
                System.out.println("Error: Solo se permiten números enteros.");
                return;
            }
        }
        int vectorX1 = Integer.parseInt(inputX1);
        // Validation for Y1 component
        System.out.print("Vector componente Y1: ");
        String inputY1 = sc.next().trim();
        for (int i = 0; i < inputY1.length(); i++) {
            char c = inputY1.charAt(i);
            String characterAsText = "" + c;
            if (!ALLOWED_DIGITS.contains(characterAsText)) {
                System.out.println("Error: Solo se permiten números enteros.");
                return;
            }
        }
        int vectorY1 = Integer.parseInt(inputY1);
        // Validation for X2 component
        System.out.print("Vector componente X2: ");
        String inputX2 = sc.next().trim();
        for (int i = 0; i < inputX2.length(); i++) {
            char c = inputX2.charAt(i);
            String characterAsText = "" + c;
            if (!ALLOWED_DIGITS.contains(characterAsText)) {
                System.out.println("Error: Solo se permiten números enteros.");
                return;
            }
        }
        int vectorX2 = Integer.parseInt(inputX2);
        // Validation for Y2 component
        System.out.print("Vector componente Y2: ");
        String inputY2 = sc.next().trim();
        for (int i = 0; i < inputY2.length(); i++) {
            char c = inputY2.charAt(i);
            String characterAsText = "" + c;
            if (!ALLOWED_DIGITS.contains(characterAsText)) {
                System.out.println("Error: Solo se permiten números enteros.");
                return;
            }
        }
        int vectorY2 = Integer.parseInt(inputY2);
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
        System.out.print("Escribe un texto: ");
        String text = sc.nextLine().trim();
        if (text.trim().isEmpty()) {
            System.out.println("Error: No ingresaste nada o solo pusiste espacios.");
        } else if (text.matches(".*\\d.*")) {
            System.out.println("Error: El texto no debería contener números.");
        } else {
            String[] characters = text.split("");
            final String VOWELS = "aeiouAEIOU";
            String textWithoutVowels = "";
            for (String character : characters) {
                if (!VOWELS.contains(character) && !character.equals(" ")) {
                    textWithoutVowels += character;
                }
            }
            System.out.println("Texto sin vocales: " + textWithoutVowels);
        }
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
        final String ALLOWED_DIGITS = "0123456789";
        System.out.println("Escriba un numero: ");
        String input = sc.next().trim();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            String characterAsText = "" + c;
            if (!ALLOWED_DIGITS.contains(characterAsText)) {
                System.out.println("Error: Solo se permiten números enteros.");
                return;
            }
        }
        int multiplier = Integer.parseInt(input);
        System.out.println("Número: " + multiplier);
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
        Scanner sc = new Scanner(System.in);
        final String ALLOWED_DIGITS = "0123456789";
        System.out.println("Escriba un numero: ");
        String input = sc.next().trim();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            String characterAsText = "" + c;
            if (!ALLOWED_DIGITS.contains(characterAsText)) {
                System.out.println("Error: Solo se permiten números enteros.");
                return;
            }
        }
        int lastTerm = Integer.parseInt(input);
        System.out.println("Numero n: " + lastTerm);
        int sum = calculateNaturalNumberSum(lastTerm);
        String numberChain = "";
        for (int i = 2; i <= lastTerm; i++) {
            numberChain = numberChain + " + " + i;
        }
        System.out.println("Suma de 1 a n: 1" + numberChain + " = " + sum);
    }

    private static int calculateNaturalNumberSum(int lastTerm) {
        return lastTerm * (lastTerm + 1) / 2;
    }


    //------------------------------------------------------------------------------------------------------------------
    /*Hacer una función que devuelva el reverso de una cadena de texto. Por ejemplo:

        Texto: “Arroz con leche”
        Texto al revés: “ehcel noc zorrA”
*/
    public static void exercise8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un texto: ");
        String text = sc.nextLine().trim();
        // Validación de vacío y de números
        if (text.isEmpty()) {
            System.out.println("Error: No ingresaste nada o solo pusiste espacios.");
        } else if (text.matches(".*\\d.*")) {
            System.out.println("Error: El texto no debería contener números.");
        } else {
            System.out.println("Texto: " + text);
            String[] characters = text.split("");
            String textInReverse = "";
            for (String character : characters) {
                textInReverse = character + textInReverse;
            }
            System.out.println("Texto al revés: " + textInReverse);
        }
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
        //VALIDACIÓN DE LA PRIMERA PALABRA
        System.out.print("Primera palabra: ");
        String first = sc.nextLine().trim();
        if (first.isEmpty()) {
            System.out.println("Error: No ingresaste nada o solo pusiste espacios en la primera palabra.");
        } else if (first.matches(".*\\d.*")) {
            System.out.println("Error: La primera palabra no debería contener números.");
        } else {
            //VALIDACIÓN DE LA SEGUNDA PALABRA
            System.out.print("Segunda palabra: ");
            String second = sc.nextLine().trim();
            if (second.isEmpty()) {
                System.out.println("Error: No ingresaste nada o solo pusiste espacios en la segunda palabra.");
            } else if (second.matches(".*\\d.*")) {
                System.out.println("Error: La segunda palabra no debería contener números.");
            } else {
                // Ambas variables ya están limpias y validadas de forma independiente
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
    }
}