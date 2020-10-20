/* 
como hemos visto en otras sesiones es posiblesm 
captar la entrada de datos a partir de readLine que es un me
*/


//libreria
import java.util.Scanner;  // solo lo que ocupas
import java.util.*; // toda la libreria


class EntradaDeDatosUsuarios{

    //metodo principal

    public static void main(String[] args){

        // a nuestro objeto o vaos a crear una instancea
        //invocacion del objto
        //nombre de la clase onj
        Scanner entrada = new Scanner(System.in);

        //variables
        String nombre;
        int edad;
        float altura;
        
        System.out.println("Escribe tu nombre");
        nombre = entrada.nextLine();
        System.out.println("escribe tu edad: ");
        edad = entrada.nextInt();
        System.out.println("Escribe tu estatura");
        altura = entrada.nextFloat();
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu altura es: "+altura);
    }
}