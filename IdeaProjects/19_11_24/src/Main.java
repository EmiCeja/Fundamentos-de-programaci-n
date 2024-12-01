import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// Primer Ejercicio

        System.out.println("Ingresa promedio final");
        double numero = sc.nextDouble();

        if (numero <= 7) {
            System.out.println("Esta reprobado");
        } else {
            System.out.println("Esta aprobado");
        }

//Segundo Ejercicio

        System.out.println("Ingresa un numero entero");
        int numeroUno = sc.nextInt();
        int contador = 0;
        int pares = 0;
        int impares = 0;

        while (contador < numeroUno) {
            contador++;
            if ((contador % 2) == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Total de pares: " + pares);

        System.out.println("Total de impares: " + impares);

//Tercer Ejercicio

        System.out.println("Ingresa un numero para la serie: ");

        int numeroDos = sc.nextInt();
        int a = 0, b = 1;

        System.out.print("Secuencia de Fibonacci hasta " + numeroDos + ": ");
        while (a <= numeroDos) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

//Cuarto Ejercicio

        System.out.println("Ingrese un numero: ");

        int numeroTres = sc.nextInt();

        boolean numeroPrimo = true;

        if (numeroTres <= 1) {
            numeroPrimo = false;
        } else if (numero == 2) {
            numeroPrimo = true;
        } else {
            for (int i = 2; i <= Math.sqrt(numeroTres); i++) {
                if (numeroTres % i == 0) {
                    numeroPrimo = false;
                    break;
                }

                System.out.println(numeroTres + (numeroPrimo ? " es primo" : " no es primo"));
            }
        }

//Quinto Ejercicio

        System.out.print("Ingrese un número: ");
        int numeroCuatro = Scanner.nextInt();

        System.out.print("Los divisores de " + numeroCuatro + " son: ");
        for (int i = 1; i <= numeroCuatro; i++) {
            if (numeroCuatro % i == 0) {
                System.out.print(i + " ");
            }
        }

//Sexto Ejercicio

        System.out.println("Ingresa un numero");

        numeroCinco = sc.nextInt();
        contador = 0;
        vecesImpreso = 0;
        boolean s = false;

        while (contador < numeroCinco) {
            contador++;
            if ((numeroCinco % contador == 0)) {
                System.out.println(contador);
                vecesImpreso++;
                if (vecesImpreso == 2) {
                    System.out.println("No tiene divisores aparte del 1 y si mismo");
                    break;
                }
            }
        }

//Septimo Ejercicio

        System.out.println("Ingresa un número:");
        int numeroSeis = input.nextInt();

        String posicion = String.valueOf(numeroSeis);
        int inicio = 0;
        int fin = posicion.length() - 1;

        boolean es_palindromo = true;
        while (inicio < fin) {
            if (posicion.charAt(inicio) != posicion.charAt(fin)) {
                es_palindromo = false;
                break;
            }
            inicio++;
            fin--;
        }

        if (es_palindromo){
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
//Octavo Ejercicio

        int numeroAleatorio = (int) (Math.random() * 100);
        boolean Correcto = false;

        while (!Correcto) {
            System.out.println("Adivina un numero entre 0-100 :)");
            int intentoNumero = sc.nextInt();
            if (intentoNumero == numeroAleatorio) {
                System.out.println("Felicidades lo conseguiste");
                Correcto = true;
            } else if (intentoNumero < numeroAleatorio) {
                System.out.println("El numero es mas grande");
            } else {
                System.out.println("El numero es mas pequeño");
            }
        }

//Noveno Ejercicio

        System.out.println(" Numero para multiplicar");
        int numeroSiete = input.nextInt();
        System.out.println("¿Hasta cual numero deseas multiplicar?");
        int limiteNumero = input.nextInt();

        for (int i = 1; i <= limiteNumero; i++) {
            int multiplicar = (numeroSiete * i);
            System.out.println(numeroSiete + " x  " + i + " = " + multiplicar);
        }


    }
}







