public class Main {
    public static void main(String[] args) {

        String correo = "juan.perez@empresa.com";
        String fechaAscenso = "2023-04-15";
        double salario = 50000.75;

        //indicar de que punto partimos para el correo y la parte despues del "@"
        int indiceCorreo = correo.indexOf('@');
        String correoDos = correo.substring(0, indiceCorreo);
        String segundaParte = correo.substring(indiceCorreo);
        //funcion para inveritir el nombre
        String correoInvertido = new StringBuilder(correoDos).reverse().toString();
        //System.out.println(correoInvertido+segundaParte);

        //indicar punto para localizar fecha
        int primerguion = fechaAscenso.indexOf("-");
        int ultimoguion = fechaAscenso.lastIndexOf("-");

        //localizacion
        String año = fechaAscenso.substring(0,primerguion);
        String mes = fechaAscenso.substring(primerguion+1,ultimoguion);
        String dia = fechaAscenso.substring(ultimoguion+1);
        //cambiamos el String con (Integer.valueOf())
        int suma = Integer.valueOf(año) + Integer.valueOf(mes) + Integer.valueOf(dia);
        //System.out.println(suma);

        //convertirlo
        String conversion = Double.toString(salario);
        int punto = conversion.indexOf(".");
        String entero = conversion.substring(0,punto);
        String decimal = conversion.substring(punto+1);
        // System.out.println(entero+ " " + decimal);

        double diferencia = Integer.valueOf(entero) - Integer.valueOf(decimal);
        double diferenciaDos = Integer.valueOf(decimal) - Integer.valueOf(entero);
        double sumaDiferencias = diferencia + diferenciaDos;
        double multiplicacion = sumaDiferencias * 2;
        //System.out.println(multiplicacion);


        System.out.println(correoInvertido+segundaParte + "|" + suma + "|" + multiplicacion);

    }
}