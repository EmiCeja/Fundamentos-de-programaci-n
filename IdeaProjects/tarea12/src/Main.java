public class Main {
    public static void main(String[] args) {

        String Direccion = ("Av. Libertador, 1234, Ciudad de México, C.P. 06000");

        int longitud = Direccion.length();
        System.out.println("La longitud de la direccion es: " + longitud);

        char primerCaracter = Direccion.charAt(0);
        System.out.println("El primer caracter dela direccion es: " + primerCaracter);

        char ultimoCaracter = Direccion.charAt(49);
        System.out.println("El ultimo carcacter dela direccion es: " + ultimoCaracter);

        String direccionMayusculas = Direccion.toUpperCase();
        System.out.println("Direccion en mayusculas: " + direccionMayusculas);

        String direccionMinusculas = Direccion.toLowerCase();
        System.out.println("Direccion en minusculas: " + direccionMinusculas);

        String calle = Direccion.substring(0, 14);
        System.out.println("Calle: " + calle);

        String numero = Direccion.substring(16, 20);
        System.out.println("Numero: " + numero);

        String ciudad = Direccion.substring(22,38);
        System.out.println("Ciudad: " + ciudad);

        String CP = Direccion.substring(45,50);
        System.out.println("Código Postal: " + CP);

        int primeraAparicionNum = Direccion.indexOf("1");
        System.out.println("La primera aparicion de un numero esta en la posicion: " + primeraAparicionNum);

        String correcion = Direccion.replace(Direccion,"Av Libertador 1234 Ciudad de México CP 06000");
        System.out.println("Direccion correjida: " + correcion);

        String DireccionSinEspacios = Direccion.trim();
        System.out.println("Direccion completa sin espacios extra: " + DireccionSinEspacios);

        String avUno = Direccion.substring(4,14);
        String avDos = Direccion.substring(16,20);
        String avTres = Direccion.substring(32,38);
        String avCuatro = Direccion.substring(45,50);

        System.out.println("Version abreviada de la direccion: " + avUno + ", " + avDos + ", " + avTres + ", " + avCuatro);


    }
}