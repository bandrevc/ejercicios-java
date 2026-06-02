public class Main
{
    public static void main(String[] args) {
        exercise1("Algoritmo de  la felicidad");
        exercice2(5, 10);
    }
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
}