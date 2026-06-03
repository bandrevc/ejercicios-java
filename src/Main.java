public class Main
{
    public static void main(String[] args) {
        exercise1("Algoritmo de  la felicidad");
        exercice2(5, 10);
        exercise3(3, 4);
        exercise4(3, 5, 6, 2);
        exercise5("Per aspera ad astra");

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
        for(int i = 0; i < multiplicador; i++){
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
}