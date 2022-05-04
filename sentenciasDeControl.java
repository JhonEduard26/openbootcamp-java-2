class Exercises {
    /**@author Jhon Eduard Bocanegra Ortiz*/
    public static void main(String[ ] args) {
        /*Ejercicio 1*/
        int numeroIf = -3;
        String respuesta = "";

        if (numeroIf > 0) {
            respuesta = "positiva";
        } else if (numeroIf < 0) {
            respuesta = "negativa";
        } else {
            respuesta = "igual a 0";
        }

        System.out.println("La variable numeroIf es " + respuesta);
        /*Fin ejercicio 1*/

        /*Ejercicio 2*/
        while(numeroIf < 3) {
            numeroIf += 1;
            System.out.println("While " + numeroIf);
        }
        /*Fin ejercicio 2*/

        /*Ejercicio 3*/
        do {
            numeroIf += 1;
            System.out.println("Do while: " + numeroIf);
        } while(false);
        /*Fin ejercicio 3*/

        /*Ejercicio 4*/
        int numeroFor = 0;

        for(int i = 0; i <= 3; i++) {
            numeroFor += 1;
            System.out.println("numeroFor: " + numeroFor);
        }
        /*Fin ejercicio 4*/

        /*Ejercicio 5*/
        String estacion = "otono";

        switch(estacion) {
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otono":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("Error, el valor de la variable no es una estacion");
        }
        /*Fin ejercicio 5*/

    }
}