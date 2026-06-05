import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        exercise1("Algoritmo de  la felicidad");
        exercice2(5, 10);
        exercise3(3, 4);
        exercise4(3, 5, 6, 2);
        exercise5("Per aspera ad astra");
        exercise6(4);
        exercise7(10);
        exercise8("Arroz con leche");
        exercise9("Amor", "Roma");
    }

    //------------------------------------------------------------------------------------------------------------------
    /*
    Realizar una función que te devuelva la cantidad de vocales de un texto pasado como argumento.
    Por ejemplo:

    Texto: “Algoritmo de la felicidad”
    Cantidad de vocales: 10
    */
    public static void exercise1(String text) {
        text = text.toUpperCase();
        String[] characters = text.split("");
        int contador = 0;
        final String VOWELS = "AEIOU";
        for (String character : characters) {
            if (VOWELS.contains(character))
                contador++;
        }
        System.out.println("Texto: " + text);
        System.out.println("Cantidad de vocales: " + contador);
    }

    //------------------------------------------------------------------------------------------------------------------
    /*
    Crear un algoritmo que multiplique 2 números sin usar el operador de multiplicación. Por ejemplo:
    Multiplicando: 5
    Multiplicador: 10
    */
    public static void exercice2(int multiplicador, int multiplicando) {
        int contador = 0;
        for (int i = 0; i < multiplicador; i++) {
            contador += multiplicando;
        }
        System.out.println("Producto: " + contador);

    }

    //------------------------------------------------------------------------------------------------------------------
    /*Crear una función que, dado un vector (x, y), devuelva
    su magnitud (RAIZ CUADRADA DE X^2 + Y^2). Por ejemplo:

    Vector componente X: 3
    Vector componente Y: 4
*/
    public static void exercise3(int vectorX, int vectorY) {
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
    public static void exercise4(int vectorX1, int vectorY1, int vectorX2, int vectorY2) {
        int componentX = (vectorX1 * vectorX2);
        int componentY = (vectorY1 * vectorY2);
        System.out.println("Producto punto es: (" + componentX + ", " + componentY + ")");
    }

    //------------------------------------------------------------------------------------------------------------------
    /*Crear un algoritmo que, dado un texto, muestre aquel texto sin vocales. Por ejemplo:

        Texto: “Per aspera ad astra”
        Texto sin vocales: “Pr spr d str”
*/
    public static void exercise5(String text) {
        String[] characters = text.split("");
        final String VOWELS = "aeiou";
        for (int i = 0; i < characters.length; i++) {
            if (VOWELS.contains(characters[i])) {
                characters[i] = "";
            }
        }
        String resultado = String.join("", characters);
        System.out.println("Texto sin vocales: " + resultado);
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
    public static void exercise6(int number) {
        System.out.println("Número:" + number);
        System.out.println("Tabla de multiplicar:");
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    /*Crear una función que dado un número n, sume
    los números naturales desde 1 a n. Por ejemplo:

            Número n: 10
            Suma de 1 a n: 1 + 2 + 3… + 10 = 55
    */
    public static void exercise7(int numberN) {
        System.out.println("Numero n: " + numberN);
        int formula = numberN * (numberN + 1) / 2;
        String contador = "";
        for (int i = 2; i <= numberN; i++) {
            contador = contador + " + " + i;
        }
        System.out.println("Suma de 1 a n: 1" + contador + " = " + formula);
    }
    //------------------------------------------------------------------------------------------------------------------
    /*Hacer una función que devuelva el reverso de una cadena de texto. Por ejemplo:

        Texto: “Arroz con leche”
        Texto al revés: “ehcel noc zorrA”
*/
    public static void exercise8(String text) {
        System.out.println("Texto: " + text);
        String[] characters = text.split("");
        String backwards = "";
        for (int i = characters.length - 1; i >= 0; i--) {
            backwards = backwards + characters[i];
        }
        System.out.println("Texto al revés: " + backwards);
    }
    //------------------------------------------------------------------------------------------------------------------
    /*Realizar un algoritmo que dado 2 textos, verifique si el segundo es un anagrama
    del primero, es decir si tienen las mismas letras independientemente del orden.
    Por ejemplo:

        Primera palabra: “amor”
        Segunda palabra: “roma”
        Es un anagrama
    */
    public static void exercise9(String first, String second) {
        System.out.println("Primera palabra: " + first);
        System.out.println("Segunda palabra: " + second);
        first = first.toUpperCase();
        second = second.toUpperCase();
        String[] charactersFirst = first.split("");
        String[] charactersSecond = second.split("");
        Arrays.sort(charactersFirst);
        Arrays.sort(charactersSecond);
        if (Arrays.equals(charactersFirst, charactersSecond)) {
            System.out.println("Es un anagrama");
        } else {
            System.out.println("No es un anagrama");
        }
    }
}