import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static <numero> void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LocalDate date = LocalDate.now();

        //numero entre 100 y 1
        int limiteMayor = 100, limiteMenor =1;

        double numeroAleatorioU = Math.random() * (limiteMayor - limiteMenor + 1);
        double numeroAleatorioD = Math.random() * (limiteMayor - limiteMenor + 1);
        double numeroAleatorioT = Math.random() * (limiteMayor - limiteMenor + 1);
        double numeroAleatorioC = Math.random() * (limiteMayor - limiteMenor + 1);
        double numeroAleatorioCi = Math.random() * (limiteMayor - limiteMenor + 1);
        double numeroAleatorioS = Math.random() * (limiteMayor - limiteMenor + 1);
        double numeroAleatorioSi = Math.random() * (limiteMayor - limiteMenor + 1);
        double numeroAleatorioO = Math.random() * (limiteMayor - limiteMenor + 1);
        double numeroAleatorioN = Math.random() * (limiteMayor - limiteMenor + 1);
        double numeroAleatorioDiez = Math.random() * (limiteMayor - limiteMenor + 1);
        //raiz
        double raiz = Math.sqrt( numeroAleatorioU );
        double raizDos = Math.sqrt( numeroAleatorioD );
        double raizTres = Math.sqrt( numeroAleatorioT );
        double raizCuatro = Math.sqrt( numeroAleatorioC );
        double raizCinco = Math.sqrt( numeroAleatorioCi );
        double raizSeis = Math.sqrt( numeroAleatorioS );
        double raizSiete = Math.sqrt( numeroAleatorioSi );
        double raizOcho = Math.sqrt( numeroAleatorioO );
        double raizNueve = Math.sqrt( numeroAleatorioN );
        double raizDiez = Math.sqrt( numeroAleatorioDiez );
        //potencia
        double Potencia = Math.pow(numeroAleatorioU, 2);
        double PotenciaDos = Math.pow(numeroAleatorioD, 2);
        double PotenciaTres = Math.pow(numeroAleatorioT, 2);
        double PotenciaCuatro = Math.pow(numeroAleatorioC, 2);
        double PotenciaCinco = Math.pow(numeroAleatorioCi, 2);
        double PotenciaSeis = Math.pow(numeroAleatorioS, 2);
        double PotenciaSiete = Math.pow(numeroAleatorioSi, 2);
        double PotenciaOcho = Math.pow(numeroAleatorioO, 2);
        double PotenciaNueve = Math.pow(numeroAleatorioN, 2);
        double PotenciaDiez = Math.pow(numeroAleatorioD, 2);

        double suma = numeroAleatorioU + numeroAleatorioD + numeroAleatorioT + numeroAleatorioC + numeroAleatorioCi + numeroAleatorioS + numeroAleatorioSi + numeroAleatorioO + numeroAleatorioN + numeroAleatorioDiez;
        double Media = suma / 10;

        double difMediaU = numeroAleatorioU - Media;
        double difMediaD = numeroAleatorioD - Media;
        double difMediaT = numeroAleatorioT - Media;
        double difMediaC = numeroAleatorioC - Media;
        double difMediaCi = numeroAleatorioCi - Media;
        double difMediaS = numeroAleatorioS - Media;
        double difMediaSie = numeroAleatorioSi - Media;
        double difMediaO = numeroAleatorioO - Media;
        double difMediaN = numeroAleatorioN - Media;
        double difMediaDiez = numeroAleatorioDiez - Media;

        double difCuadradoU = Math.pow(difMediaU, 2);
        double difCuadradoD = Math.pow(difMediaD, 2);
        double difCuadradoT = Math.pow(difMediaT, 2);
        double difCuadradoC = Math.pow(difMediaC, 2);
        double difCuadradoCi = Math.pow(difMediaCi, 2);
        double difCuadradoS = Math.pow(difMediaS, 2);
        double difCuadradoSi = Math.pow(difMediaS, 2);
        double difCuadradoO = Math.pow(difMediaO, 2);
        double difCuadradoN = Math.pow(difMediaN, 2);
        double difCuadradoDiez = Math.pow(difMediaDiez, 2);

        double  sumadeDiferencias = difCuadradoU + difCuadradoD + difCuadradoT + difCuadradoC + difCuadradoCi + difCuadradoS + difCuadradoSi + difCuadradoO + difCuadradoN + difCuadradoDiez;
        double varianza = sumadeDiferencias / 10;
        double desviacionEstandar = Math.sqrt(varianza);



        System.out.println("1: " + numeroAleatorioU);
        System.out.println("La raiz es: " + raiz);
        System.out.println("Elevado al cuadrado: " + Potencia);
        System.out.println(" ");

        System.out.println("2: " + numeroAleatorioD);
        System.out.println("La raiz es " + raizDos);
        System.out.println("Elevado al cuadrado: " + PotenciaDos);
        System.out.println(" ");

        System.out.println("3 : " + numeroAleatorioT);
        System.out.println("La raiz es " + raizTres);
        System.out.println("Elevado al cuadrado: " + PotenciaTres);
        System.out.println(" ");

        System.out.println("4 : " + numeroAleatorioC);
        System.out.println("La raiz es " + raizCuatro);
        System.out.println("Elevado al cuadrado: " + PotenciaCuatro);
        System.out.println(" ");

        System.out.println("5 : " + numeroAleatorioCi);
        System.out.println("La raiz es " + raizCinco);
        System.out.println("Elevado al cuadrado: " + PotenciaCinco);
        System.out.println(" ");

        System.out.println("6 : " + numeroAleatorioS);
        System.out.println("La raiz es " + raizSeis);
        System.out.println("Elevado al cuadrado: " + PotenciaSeis);
        System.out.println(" ");

        System.out.println("7 : " + numeroAleatorioSi);
        System.out.println("La raiz es " + raizOcho);
        System.out.println("Elevado al cuadrado: " + PotenciaOcho);
        System.out.println(" ");

        System.out.println("8 : " + numeroAleatorioO);
        System.out.println("La raiz es " + raizOcho);
        System.out.println("Elevado al cuadrado: " + PotenciaOcho);
        System.out.println(" ");

        System.out.println("9 : " + numeroAleatorioN);
        System.out.println("La raiz es " + raizNueve);
        System.out.println("Elevado al cuadrado: " + PotenciaNueve);
        System.out.println(" ");

        System.out.println("10 : " + numeroAleatorioDiez);
        System.out.println("La raiz es " +raizDiez);
        System.out.println("Elevado al cuadrado: " + PotenciaDiez);

        System.out.println(" ");

        System.out.println("La media es: " + Media);
        System.out.println("La desviacion estandar es: " + desviacionEstandar);


















    }
}