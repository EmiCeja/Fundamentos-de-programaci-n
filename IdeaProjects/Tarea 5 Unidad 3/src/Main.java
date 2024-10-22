public class Main {
    public static void main(String[] args) {


        //ejercicio uno
        /*Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nacionalidad");
        String nacionalidad = input.nextLine();

        if (nacionalidad.equalsIgnoreCase("Méxicano")) {
            System.out.println("califica para cualquier puesto");
            System.exit(0);
        }

        System.out.println("Ingrese su tipo de visa");
        String Visa = input.nextLine();


        System.out.println("Ingrese cuantos años de experiencia tiene en el puesto");
        int experiencia = input.nextInt();

        if (Visa.equalsIgnoreCase("trabajo")) {
            if (experiencia > 5) {
                System.out.println("Usted es elegible para un empleo calificado");
            }if (experiencia < 5) {
                    System.out.println("Usted es elegible para un empleo no calificado");
                }

        }else {
            System.out.println("Error.Ingrese una visa valida");}
       /*

        //ejercico Dos
        Scanner input = new Scanner(System.in);

        System.out.println("Pais de residencia");
        String residencia = input.nextLine();
        System.out.println("Ingrese su codigo postal");
        String postal = input.nextLine();
        System.out.println("¿Ya ha hecho compras antes?");
        String respuesta = input.nextLine();

        int longitudPostal = postal.length();

        if (residencia.equalsIgnoreCase("usa")) {

             if (postal.startsWith("9")) {
                if (respuesta.equalsIgnoreCase("si"))
                {
                    System.out.println("Usted puede pagar con PayPal");
                }
               else if (respuesta.equalsIgnoreCase("no")) {
                    System.out.println("Usted debe verificar su dirección");
                }
            } else{
                    System.out.println("Pague con tarjeta de credito");
                }
            }
        if (residencia.equalsIgnoreCase("europa")){
            System.out.println("::::::::::::::entre europa:::::::::::::.");
            if (longitudPostal == 5){
                System.out.println("::::::::::::::es 5:::::::::::::.");

                if (respuesta.equalsIgnoreCase("si")){

                    System.out.println("Usted puede pagar con Trasnferencia bancaria");

                }else if (respuesta.equalsIgnoreCase("no")){
                    System.out.println("Usted debe hacer una verificacion bancaria");
                }

            }
            else if (longitudPostal != 5){
            System.out.println("Error.codigo postal invalido");
         }
         }else {
            System.out.println("Verifique su identidad");
        }
        */



        //ejercicio 3
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuantas personas seran?");
        int nP = input.nextInt();

        System.out.println("¿Qué tipo de habitacion?");
        String habitacion = input.next();



        boolean habitacionEdisponible = true;
        boolean habitacionSdisponible = true;

        boolean habitacionEnodisponible = false;
        boolean habitacionSnodisponible = false;


        System.out.println("¿De cuantas noches sera su estadia?");
        int tiempo = input.nextInt();

        if (nP == 1){
            if (habitacion.equalsIgnoreCase("suite")){
                if (habitacionEdisponible && tiempo > 3){
                    System.out.println("Podria tener un descuento del 10%");
                }else if (habitacionEnodisponible || tiempo <= 3){
                    System.out.println("Solo tenemos habitaciones estandar");
                }

            } else if (habitacion.equalsIgnoreCase("estandar")) {
                System.out.println("Se le a asignado una habitacion");}
        }
        if (nP >= 2){
            if (habitacion.equalsIgnoreCase("suite")){
                if (tiempo > 5){
                    System.out.println("Tendra desayuno incluido");
                }if (tiempo <= 5){
                    System.out.println("Se le a asignado una habitacion");
                }
            }else if (habitacion.equalsIgnoreCase("estandar")){
                System.out.println("se le a asignado una habitacion doble");
            }
        }





    }
}