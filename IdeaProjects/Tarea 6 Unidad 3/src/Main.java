public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = input.nextLine();

        System.out.println("Ingrese su edad");
        int edad = input.nextInt();
        input.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Ingrese su Pais de residencia");
        String pais = input.nextLine();

        System.out.println("Estado civil");
        String estadoCivil = input.nextLine();

        System.out.println("Ingrese su ingreso anual");
        double ingresoAnual = input.nextDouble();
        input.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("¿Tiene hijos?(si o no)");
        String hijos = input.nextLine();

        // Validaciones iniciales
        if (nombre.matches(".*\\d.*")) {
            System.out.println("Error: El nombre de usuario no puede contener números.");
            return;
        }

        if (edad < 25) {
            System.out.println("Error: La edad debe ser mayor que 25.");
            return;
        }

        double precioBase = 500;
        double descuento = 0;

        // Lógica para México
        if (pais.equalsIgnoreCase("mexico")) {
            if (estadoCivil.equalsIgnoreCase("casado")) {
                if (ingresoAnual < 300000) {
                    descuento = hijos.equalsIgnoreCase("si") ? 0.10 : 0.05;
                }
            } else {
                if (ingresoAnual < 400000) {
                    descuento = 0.08;
                }
            }
        }
        // Lógica para USA
        else if (pais.equalsIgnoreCase("usa")) {
            if (estadoCivil.equalsIgnoreCase("soltero")) {
                if (ingresoAnual < 200000) {
                    descuento = 0.07;
                    if (hijos.equalsIgnoreCase("si")) {
                        descuento += 0.03;
                    }
                } else if (ingresoAnual < 500000) {
                    // Nuevo caso para solteros con ingreso entre 200000 y 500000
                    descuento = 0.07;
                    if (hijos.equalsIgnoreCase("si")) {
                        descuento += 0.03;
                    }
                }
            } else if (estadoCivil.equalsIgnoreCase("casado")) {
                if (ingresoAnual < 500000) {
                    descuento = 0.12;
                    if (hijos.equalsIgnoreCase("si")) {
                        descuento += 0.03;
                    }
                }
            }
        }
        // Lógica para otros países
        else {
            if (estadoCivil.equalsIgnoreCase("casado")) {
                descuento = 0.05;
                if (ingresoAnual < 200000) {
                    descuento += 0.02;
                }
            } else {
                descuento = 0.03;
                if (ingresoAnual < 200000) {
                    descuento += 0.02;
                }
            }
        }

        double precioFinal = precioBase * (1 - descuento);

        if (descuento > 0) {
            System.out.printf("Estimado %s, puede reclamar un descuento del %.0f%% en su seguro%n",
                    nombre, descuento * 100);
            System.out.printf("Precio final: $%.2f%n", precioFinal);
        } else {
            System.out.println("Usted no califica para recibir beneficios");
        }

        input.close();
    }
}




       /*System.out.println("ingrese su nombre completo");
        String nombreCompleto = input.nextLine();

        System.out.println("Ingrese su ID");
        String id = input.nextLine();

        System.out.println("Ingresesu promedio general");
        double promedio = input.nextDouble();

        System.out.println("Ingrese el numero de  materias que desea ");
        int materias = input.nextInt();

       int longName= nombreCompleto.length();
       int longID = id.length();

       if (promedio < 7){
           System.out.println("Error.no cumple con el promedio necesario");
           System.exit(0);
       } else if (promedio >= 7 && promedio < 8.5){
            if (materias < 3){
                System.out.println("Te puedes inscribir");
            } else{
                System.out.println("Error.son demasiadas materias");
            }
        } else if (promedio >= 8.5) {
            if (longName > 25){
                System.out.println("Error.son demasiados caracteres.intente de nuevo");
            } else if (longID < 8) {
                System.out.println("Error.formato de ID incorrecto");
            } else{
                if (materias == 5){
                    System.out.println("Puedes inscribirte");
                }else if (materias > 5){
                    System.out.println("¿Cuantas materias a aprobado el semestre anterior?");
                    int materiasAp = input.nextInt();
                    if (materiasAp > 3){
                        System.out.println("puedes inscribir hasta 6 materias este semsestre");
                    }else {
                        System.out.println("Solo puedes inscribir 5 materias este semsestre");
                    }
                }
            }
        }

       //::::::::::::::::::::EJERCICIO 2::::::::::::::::::::::::::::::::::::::::::::
         /*
        System.out.println("¿Con que tipo de membersia cuenta? (Premium, Estándar o Básica)");
        String membersia = input.nextLine();


        System.out.println("¿Cuantos años tiene?");
        int edad= input.nextInt();
        input.nextLine();
        String texto = input.nextLine();

        System.out.println("¿Desea asistira un evento nacional o Internacional?");
        String evento = input.nextLine();

        if (membersia.equalsIgnoreCase("premium")){
            if (edad < 18){
                System.out.println("Error.no cuenta con la edad necesaria");
            } else if (edad < 25) {
                if (evento.equalsIgnoreCase("internacional")){
                    System.out.println("Para este evento usted cuenta con un 20% de descuento");
                }else  {
                    System.out.println("Para este evento usted cuenta con un 10% de descuento");
                }
            } else {
               if (evento.equalsIgnoreCase("internacional")){
                   System.out.println("Para este evento usted cuenta con un 25% de descuento");
               }else {
                   System.out.println("Para este evento usted cuenta con un 15% de descuento");
               }
            }
        } else if (membersia.equalsIgnoreCase("estandar")) {|
            if (edad < 18){
                System.out.println("Error.no cuenta con la edad necesaria");
            }else {
                if(evento.equalsIgnoreCase("internacional")) {
                    System.out.println("Para eventos internacionales no cuenta con ningun descuento");
                }else {
                    System.out.println("Para eventos nacionales cuenta con un 5% de descuento");
                }
            }
        }else {
            System.out.println("Usted solamente puede comprar boletos nacionales");
    }

    // :::::::::::::::::::::::::::::::::::::Ejercicio3:::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/