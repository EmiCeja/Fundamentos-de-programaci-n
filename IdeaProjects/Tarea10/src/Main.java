
public class Main {
    public static void main(String[] args) {

        String palabra = "Supercalifragilisticoespialidoso";
        int longitud = palabra.length();
        System.out.println("Longitud: " + longitud);
        char posDiez = palabra.charAt(9);
        System.out.println("Caracter en posicion: " + posDiez);

        String mayusculas = palabra.toUpperCase();
        System.out.println("En mayusculas: " + mayusculas);

        String pCortada = palabra.substring(5, 16);
        System.out.println("Subcadena (5, 15): " + pCortada);

        int pOcurrencia = palabra.indexOf("i");
        System.out.println("Primera ocurrencia ´i´ : " + pOcurrencia);

        int ocurrenciaDos = palabra.lastIndexOf("o");
        System.out.println("Ultima Ocurrencia: ´o´ " + ocurrenciaDos);

        String minuscula = palabra.toLowerCase();
        System.out.println("En minusculas: " + minuscula);

        String subcadena = palabra.substring(6);
        System.out.println("Subcadena desde la posicion 7: " + subcadena);

        int uOcurrencia = palabra.lastIndexOf("li");
        System.out.println("Ultima ocurrencia de ´li´: " + uOcurrencia);





    }
}