public class Main {
    public static void main(String[] args) {

        String cadena ="Carlos Martinez|192.168.0.1|12345.";

        int primerEspacio = cadena.indexOf(" ");
        int primerPalito = cadena.indexOf("|");
        int ultimoPalit = cadena.lastIndexOf("|");


        //PrimeraParte
        String nombre = cadena.substring(0,primerEspacio);
        String apellido = cadena.substring(primerEspacio+1,primerPalito);
        //String nombreCompleto = nombre + " " + apellido;

        char primerCaracter = nombre.charAt(0);
        char ultimoCaracter = apellido.charAt(apellido.length()-1);
       /* nombre.replace((char) (0), ultimoCaracter);
        apellido.replace((char) (apellido.length() - 1), primerCaracter);*/
        //System.out.println(primerCaracter +" " + ultimoCaracter);

        String nombreCifrado = nombre
                .replace('a','1')
                .replace('e','2')
                .replace('i','3')
                .replace('o','4')
                .replace('u','5')
                .replace(primerCaracter,ultimoCaracter);

        String apellidoCifrado = apellido
                .replace('a','1')
                .replace('e','2')
                .replace('i','3')
                .replace('o','4')
                .replace('u','5')
                .replace(ultimoCaracter,primerCaracter);




        //Segunda parte

        String IP = cadena.substring(primerPalito+1,ultimoPalit);
        int primerPunto = IP.indexOf(".");
        int ultimoPunto = IP.lastIndexOf(".");
        int segundoPunto = IP.indexOf(".",primerPunto+1);
        String primerNum = IP.substring(0,primerPunto),
                segundoNum = IP.substring(primerPunto+1,segundoPunto),
                tercerNum = IP.substring(segundoPunto+1,ultimoPunto),
                cuarNum = IP.substring(ultimoPunto+1);
        // System.out.println(primerNum+" "+segundoNum+" "+tercerNum+" "+cuarNum);

        String hexadeUno = Integer.toHexString(Integer.valueOf(primerNum));
        String hexadeDos = Integer.toHexString(Integer.valueOf(segundoNum));
        String hexadeTres = Integer.toHexString(Integer.valueOf(tercerNum));
        String hexadeCuatro = Integer.toHexString(Integer.valueOf(cuarNum));

        String IPHexa = hexadeUno + "." + hexadeDos + "." + hexadeTres + "." + hexadeCuatro;


        //Parter tres

        String NoCliente = cadena.substring(ultimoPalit+1,cadena.length()-1);
        double NoFormula = (Integer.valueOf(NoCliente) * 3 +15)/(2);
        // System.out.println(NoFormula);


        //FINAL :D
        System.out.println(nombreCifrado + " " + apellidoCifrado + "|" + IPHexa + "|" + NoFormula);


    }
}