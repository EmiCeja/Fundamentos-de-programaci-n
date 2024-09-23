import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        // Datos de mi domicilio

        System.out.print("Ingrese nombre de la calle: ");
        String calle = input.nextLine();
        System.out.print("El nombre de su calle: " + calle);

        System.out.print("\nIngrese el numero de tu domicilio: ");
        String numeroDeCalle = input.nextLine();
        System.out.print("El numero de tu domicilio es: " + numeroDeCalle);

        System.out.print("\nIngrese su colonia: ");
        String colonia = input.nextLine();
        System.out.print("La colonia de su domicilio es: " + colonia);

        System.out.print("\nIngrese la ciudad: ");
        String ciudad = input.nextLine();
        System.out.print("La ciudad del domicilio es: " + ciudad);

        System.out.print("\nIngrese el estado donde vive: ");
        String estado = input.nextLine();
        System.out.print("El estado es: " + estado);

        System.out.print("\nSu domicilio completo es: " + calle + " " + numeroDeCalle + ", " + "Col. " + colonia + ", " + ciudad + " " + estado);

        // Datos de su primaria, secundaria y preparatoria

        System.out.print("\nIngrese el nombre de su primaria: ");
        String primaria = input.nextLine();
        System.out.print("Su primaria fue: " + primaria);

        System.out.print("\nIngrese el nombre de su secundaria: ");
        String secundaria = input.nextLine();
        System.out.print("Su secundaria fue: " + secundaria);

        System.out.print("\nIngrese el nombre de su preparatoria: ");
        String preparatoria = input.nextLine();
        System.out.print("El nombre de su preparatoria: " + preparatoria);

        System.out.print("\nUsted curso en las siguientes escuelas: " + primaria + ", " + secundaria + ", " + preparatoria);

        // Datos de su deporte favorito

        System.out.print("\nIngrese el nombre de su deporte favorito: ");
        String deporte = input.nextLine();
        System.out.print("Su deporte favorito es: " + deporte);

        System.out.print("\nIngrese cuantos años lo practico: ");
        String anodepractica  = input.nextLine();
        System.out.print("Usted practico este deporte por: " + anodepractica);

        System.out.print("\nIngrese la posicion que jugaba: ");
        String posicion = input.nextLine();
        System.out.print("Su posicion fue: " + posicion);

        System.out.print("\nDatos de su deporte favorito: " + deporte + ", " + "Lo practico por " + anodepractica + ", " + "Jugo en la posicion de " + posicion);




    }
}