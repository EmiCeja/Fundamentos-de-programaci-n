public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese un numero entero");
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        if (numero % 3 == 0 ) {
            System.out.println("es divisible entre 3");
        }else if (numero % 5 == 0) {
            System.out.println("es divisible entre 5");
        }else {
            System.out.println("no es divisible entre 3 ni 5");
        }

        System.out.println("Ingrese 3 lados de un triangulo");
        int LadoUno = input.nextInt();
        int LadoDos = input.nextInt();
        int LadoTres = input.nextInt();

        if (LadoUno == LadoDos && LadoDos == LadoTres && LadoUno  == LadoTres) {
            System.out.println("es un triangulo equilatero ");
        } else if (LadoUno == LadoDos || LadoUno == LadoTres || LadoDos == LadoTres) {
            System.out.println("es un triangulo isoceles");
        }else {
            System.out.println("es un triangulo escaleno");
        }

        System.out.println("Ingrese su salario");
        int SalarioUno = input.nextInt();

        if (SalarioUno <= 10000 ) {
            System.out.println("no paga impuestos: " + SalarioUno);
        } else if (SalarioUno > 10000 && SalarioUno <= 20000) {
            double porcentaje = SalarioUno * .10;
            double SalarioCimpuesto = SalarioUno + porcentaje;
            System.out.println("Pagara un 10% de impuesto: " + SalarioCimpuesto);
        }else if (SalarioUno > 20000 ) {
            double porcentaje = SalarioUno * .20;
            double SalarioCimpuesto = SalarioUno + porcentaje;
            System.out.println("Pagara un 20% de impuesto: " + SalarioCimpuesto);
        }

        System.out.println("ingrese un numero entero");
        int NumeroUno = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

    }
}