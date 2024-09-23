public class Main {
    public static void main(String[] args) {

        String nombre = "García,Juan Carlos";
        int longitud = nombre.length();
        System.out.println("Longitud del nombre completo: " + longitud);

        String apellido = nombre.substring(0, 6);
        System.out.println("Apellido: " + apellido);

        String nombreC = nombre.substring(7, 18);
        System.out.println("Nombre sin apellido: " + nombreC);

        String primerNombre = nombre.substring(7, 11);
        System.out.println("Primer nombre: " + primerNombre);

        String apellidoM = apellido.toUpperCase();
        System.out.println("Apellido en mayúsculas: " + apellidoM);

        String apellidom = apellidoM.toLowerCase();
        System.out.println("Apellido en minúsculas: " + apellidom);

        char caracterPosicion = nombre.charAt(4);
        System.out.println("Carácter en la posición `5`: " + caracterPosicion);

        int primeraOcurrencia = nombre.indexOf("a");
        System.out.println("Primera ocurrencia de 'a': " + primeraOcurrencia);

        int ultimaOcurrencia = nombre.lastIndexOf("a");
        System.out.println("Última ocurrencia de 'a': " + ultimaOcurrencia);
    }
}