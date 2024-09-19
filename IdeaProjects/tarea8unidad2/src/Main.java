import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // double numeroAleatorio = Math.random() * (limiteMayor - limiteMenor +

        // Coordenadas de los puntos
        System.out.print("Ingrese la coordenada x del primer punto: ");
        double xUno = input.nextDouble();
        System.out.print("Ingrese la coordenada y del primer punto: ");
        double yUno = input.nextDouble();
        System.out.print("Ingrese la coordenada x del segundo punto: ");
        double xDos = input.nextDouble();
        System.out.print("Ingrese la coordenada y del segundo punto: ");
        double yDos = input.nextDouble();

        // A -> x1, x2
        // B -> x2, y2
        // C -> xRandom, yRandom

        // Tercera coordenada aleatoria

        double xTres = Math.random() * 100;
        double yTres = Math.random() * 100;

        // Lado AB
        double distanciaABinterno = Math.pow(xDos - xUno, 2) + Math.pow(yDos - yUno, 2);
        double distanciaAB = Math.sqrt(distanciaABinterno);

        // Lado BC
        // B -> x1, y1
        // C -> x2, y2
        double distanciaBCinterno = Math.pow(xDos - xTres, 2) + Math.pow(yDos - yTres, 2);
        double distanciaBC = Math.sqrt(distanciaBCinterno);

        // Lado CA
        // C -> x1, y1
        // A -> x2, y2
        double distanciaCAinterno = Math.pow(xUno - xTres, 2) + Math.pow(yUno - yTres, 2);
        double distanciaCA = Math.sqrt(distanciaCAinterno);


        double s = (distanciaAB + distanciaBC + distanciaCA) / 2;
        double areaInterno = s * (s - distanciaAB) * (s - distanciaBC) * (s - distanciaCA);
        double area = Math.sqrt(areaInterno);

        System.out.println("\nEl area es: " + area);
    }
}