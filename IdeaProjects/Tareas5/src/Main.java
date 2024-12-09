public class Main {
    //Ejercicio Uno

    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        double[] valoresCelsius = {0, 25, 30, -10, 100};

        System.out.println("Conversión de grados Celsius a Fahrenheit:");
        for (int i = 0; i < valoresCelsius.length; i++) {
            double celsius = valoresCelsius[i];
            System.out.println(celsius + "°C = " + celsiusAFahrenheit(celsius) + "°F");
        }

        //Ejercicio Dos

        public static double calcularMedia(int[] numeros) {
            int suma = 0;
            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i];
            }
            return (double) suma / numeros.length;
        }

        public static void main(String[] args) {
            int[] numeros = {10, 20, 30, 40, 50};

            System.out.println("La media del arreglo es: " + calcularMedia(numeros));

            //Ejercicio Tres

            public static void imprimirPositivos(int[] numeros) {
                System.out.println("Números positivos:");
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] > 0) {
                        System.out.println(numeros[i]);
                    }
                }
            }

            public static void main(String[] args) {
                int[] numeros = {-5, 10, 0, -3, 20, 15};

                imprimirPositivos(numeros);
    }
}