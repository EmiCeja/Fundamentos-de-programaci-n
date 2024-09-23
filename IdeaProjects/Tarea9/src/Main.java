import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese cordenada x: ");
        double Xuno = input.nextDouble();
        System.out.println("Ingrese cordenada y: ");
        double Yuno = input.nextDouble();
        System.out.println("Ingrese cordenada x: ");
        double Xdos = input.nextDouble();
        System.out.println("Ingrese cordenada y: ");
        double Ydos = input.nextDouble();
        System.out.println("Ingrese cordenada x: ");
        double Xtres = input.nextDouble();
        System.out.println("Ingrese cordenada y: ");
        double Ytrees = input.nextDouble();

        // distancaia AB

        double distanciaAB = Math.sqrt(Math.pow(Xdos-Xuno,2)+Math.pow(Ydos-Yuno,2));
        System.out.println("Distancia A: "+distanciaAB);

        double distanciaB = Math.sqrt(Math.pow(Xtres-Xdos,2)+Math.pow(Ytrees-Ydos,2));
        System.out.println("Distancia B: "+distanciaB);

        double distanciaC = Math.sqrt(Math.pow(Xtres-Xuno,2)+Math.pow(Ytrees-Yuno,2));
        System.out.println("Distancia C: "+distanciaC);

        double perimetro = distanciaAB+distanciaB+distanciaC;
        System.out.println("\nEl perimetro es: "+perimetro);

        double S = (distanciaAB+distanciaB+distanciaC) /2 ;
        double Area = Math.sqrt(S*(S-distanciaAB)*(S-distanciaB)*(S-distanciaC));
        System.out.println("El Area es: "+Area);

        double alturaVer = 2 * Area / distanciaAB;
        System.out.println("El altura desde un vertice es: "+alturaVer);

        //Angulos internos con ley de coseno

       /* double cosenoUno = (Math.pow(distanciaB,2) + Math.pow(distanciaC,2) - Math.pow(distanciaAB,2)) / 2 * (distanciaB) * (distanciaC);
        double angulo = Math.toDegrees(Math.acos(cosenoUno));
        System.out.println("El angulo A es: "+angulo);*/

        double internoCosA = Math.pow(distanciaB, 2) + Math.pow(distanciaC, 2) - Math.pow(distanciaAB, 2);
        double divisionintCosA = internoCosA / (2 * (distanciaB * distanciaC));
        double cosA = Math.acos(divisionintCosA);
        double anguloA = Math.toDegrees(cosA);
        System.out.println("\nAngulo A: " + anguloA);

        // B

        double internoCosB = Math.pow(distanciaAB, 2) + Math.pow(distanciaC, 2) - Math.pow(distanciaB, 2);
        double divisionintCosB = internoCosB / (2 * (distanciaAB * distanciaC));
        double cosB = Math.acos(divisionintCosB);
        double anguloB = Math.toDegrees(cosB);
        System.out.println("Angulo B: " + anguloB);

        // C

        double internoCosC = Math.pow(distanciaAB, 2) + Math.pow(distanciaB, 2) - Math.pow(distanciaC, 2);
        double divisionintCosC = internoCosC / (2 * (distanciaAB * distanciaB));
        double cosC = Math.acos(divisionintCosC);
        double anguloC = Math.toDegrees(cosC);
        System.out.println("Angulo C: " + anguloC);

        // Diferencia entre longitudes (Trinagulo equilatero?)

        double diferencia = Math.abs(distanciaAB - distanciaB) + Math.abs(distanciaB - distanciaC) + Math.abs(distanciaC - distanciaAB);
        boolean esEquilatero = (diferencia == 0);

        if (esEquilatero) {
            System.out.println("Es un Triangulo Equilatero");
        }
        else {
            System.out.println("No es un Triangulo Equilatero");
        }

        // Punto medio entre puntos

        double puntoMedioABpUno = (Xuno + Xdos) / 2, puntoMedioABpDos = (Yuno + Ydos) / 2;
        System.out.println("\nPunto Medio AB: " + puntoMedioABpUno + ", " + puntoMedioABpDos);

        double puntoMedioBCpUno = (Xdos + Xtres) / 2, puntoMedioBCpDos = (Ydos + Ytrees) / 2;
        System.out.println("Punto Medio BC: " + puntoMedioBCpUno + ", " + puntoMedioBCpDos);

        double puntoMedioCApUno = (Xuno + Xtres) / 2, puntoMedioCApDos = (Yuno + Ytrees) / 2;
        System.out.println("Punto Medio CA: "+ puntoMedioCApUno + ", " + puntoMedioCApDos);




    }
}