public class Main {
    public static void main(String[] args) {

        String cadena= "12345,Laptop HP Pavilion;1500.99;Electrónica";

        int longitud = cadena.length();
        System.out.println("Longitud: "+longitud);

        String ID = cadena.substring(0,5);
        System.out.println("ID: "+ID);

        String nombreProducto = cadena.substring(6,24);
        System.out.println("Nombre del producto: "+nombreProducto);

        String nombreMayus = nombreProducto.toUpperCase();
        System.out.println("Nombre en Mayus: "+nombreMayus);

        String precio = cadena.substring(25,32);
        System.out.println("Precio del producto: "+precio);

        char caracter = cadena.charAt(11);
        System.out.println("Caracter en la posicion 10 del nombre: " + caracter);

        int primerOcurrencia = nombreProducto.indexOf("a");
        System.out.println("Primera ocurrencia de ´a´: " + primerOcurrencia);

        int ultimaOcurrencia = nombreProducto.lastIndexOf("o");
        System.out.println("Ultima ocurrencia de ´o´: " + ultimaOcurrencia);

        String categoria = cadena.substring(33,44);
        System.out.println("Precio y categoria: " + precio+ " - " + categoria);

        String subcadena = cadena.substring(13,24);
        System.out.println("Subcadena desde la posicion 7 del nombre: " + subcadena);

    }
}