import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
        //exercise7();
        //exercise8();
        //exercise9();
        exercise10();
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
        String text = getValidText(sc, "Debes ingresar un texto: ");
        String[] characters = text.split("");
        int contador = 0;
        for (String character : characters) {
            if (isVowel(character)) {
                contador++;
            }
        }
        System.out.println("Texto válido: " + text);
        System.out.println("Cantidad de vocales: " + contador);
    }

    //------------------------------------------------------------------------------------------------------------------
    /*
    Crear un algoritmo que multiplique 2 números sin usar el operador de multiplicación. Por ejemplo:
    Multiplicando: 5
    Multiplicador: 10
    */
    public static void exercise2() {
        Scanner sc = new Scanner(System.in);
        int multiplicand = getValidInt(sc, "Multiplicando: ");
        int multiplier = getValidInt(sc, "Multiplicador: ");
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
        int vectorX = getValidInt(sc, "Vector componente X: ");
        int vectorY = getValidInt(sc, "Vector componente Y: ");
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
        int vectorX1 = getValidInt(sc, "Vector componente X1: ");
        int vectorY1 = getValidInt(sc, "Vector componente Y1: ");
        int vectorX2 = getValidInt(sc, "Vector componente X2: ");
        int vectorY2 = getValidInt(sc, "Vector componente Y2: ");
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
        String text = getValidText(sc, "Escribe un texto: ");
        String[] characters = text.split("");
        String textWithoutVowels = "";
        for (String character : characters) {
            if (!isVowel(character)) {
                textWithoutVowels += character;
            }
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
        int multiplier = getValidInt(sc, "Escriba un numero: ");
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
        int lastTerm = getValidInt(sc, "Escriba un numero: ");
        System.out.println("Numero n: " + lastTerm);
        int sum = calculateNaturalNumberSum(lastTerm);
        String numberChain = "";
        for (int i = 2; i <= lastTerm; i++) {
            numberChain = numberChain + " + " + i;
        }
        System.out.println("Suma de 1 a n: 1" + numberChain + " = " + sum);
    }



    //------------------------------------------------------------------------------------------------------------------
    /*Hacer una función que devuelva el reverso de una cadena de texto. Por ejemplo:

        Texto: “Arroz con leche”
        Texto al revés: “ehcel noc zorrA”
*/
    public static void exercise8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un texto: ");
        String text = getValidText(sc, "Escriba un texto: ");
            System.out.println("Texto: " + text);
            String[] characters = text.split("");
            String textInReverse = "";
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
        String first = getValidText(sc, "Primera palabra: ");
        String second = getValidText(sc, "Segunda palabra: ");
        if (isAnagram(first, second)) {
            System.out.println("Es un anagrama");
        } else {
            System.out.println("No es un anagrama");
                }
            }
    //------------------------------------------------------------------------------------------------------------------
    /*Realizar un algoritmo que, dado un texto, muestre el caracter inicial y final. Considerar validar
    que el texto no esté vacío ni con solo espacios. Por ejemplo:
        Texto: “Vampires will never hurt you”
        Caracter inicial: “V”
        Caracter final: “u”
     */
    public static void exercise10() {
        Scanner sc = new Scanner(System.in);
        String text = getValidText(sc, "Escriba un texto: ");
        char initialChar = text.charAt(0);
        char finalChar = text.charAt(text.length() - 1);
        System.out.println("Caracter inicial: \"" + initialChar + "\"");
        System.out.println("Caracter final: \"" + finalChar + "\"");
    }


    //------------------------------------------------------------------------------------------------------------------
    //Primer Método
    private static boolean isAnagram(String valueA, String valueB) {
        return Arrays.equals(sortCharacters(valueA), sortCharacters(valueB));
    }
    //Segundo método
    private static char[] sortCharacters(String value) {
        char[] characters = value.toUpperCase().toCharArray();
        Arrays.sort(characters);
        return characters;
    }
    //Tercer Método
    private static int getValidInt(Scanner sc, String mensaje) {
        final String ALLOWED_DIGITS = "0123456789";
        System.out.print(mensaje);
        String input = sc.next().trim();
        for (char c : input.toCharArray()) {
            String characterAsText = "" + c;
            if (!ALLOWED_DIGITS.contains(characterAsText)) {
                System.out.println("Error: Solo se permiten números enteros.");
                System.exit(0);
            }
        }
        return Integer.parseInt(input);
    }
    //Cuarto Método
    private static boolean isVowel(String character) {
        final String VOWELS = "aeiouáéíóú";
        return VOWELS.contains(character.toLowerCase());
    }
    // Quinto Método
    private static String getValidText(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        String text = sc.nextLine().trim();
        if (text.isEmpty()) {
            System.out.println("Error: No ingresaste nada o solo pusiste espacios.");
            System.exit(0);
        }
        if (text.matches(".*\\d.*")) {
            System.out.println("Error: El texto no debería contener números.");
            System.exit(0);
        }
        return text;
    }
    // Sexto Método
    private static int calculateNaturalNumberSum(int lastTerm) {
        return lastTerm * (lastTerm + 1) / 2;
    }
}

