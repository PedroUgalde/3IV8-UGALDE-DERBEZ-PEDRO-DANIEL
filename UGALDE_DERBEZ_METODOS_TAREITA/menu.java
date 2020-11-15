import java.util.Scanner;
/* Ugalde Derbez Pedro daniel 3IV8 

en esta clase se va a tener el menu que va a realizar cada uno de los prgramas
*/
//primero quice crear el metodo con la variable privada
//que va a dejar que los metodos que la necesiten la lean
public class menu{
    Scanner entrada = new Scanner(System.in);
 private static int opcion;

 //hacer que la variable se pueda leer

 public static int getOpcion(){
     return opcion;
 }

 public static void setOpcion(int op){
     opcion=op;
 }

// crear el metodo principal donde va a estar el menu :3
 public static void main(String[]args){
     // pedir que eligan uno de los problemas
     Scanner entrada = new Scanner(System.in);
     System.out.println("Eliga cual de los tres problemas quiere master");
     System.out.println("1. quiero saber mi edad ");
     System.out.println("2. quiero saber el area y perimetro de una figurita");
     System.out.println("3. quiero saber cuanto le debo a telmex para mejor pasarme a movistar");
     // crear metodo que lea la variable privada de arriba 
     opcion = entrada.nextInt();
     //crear switch pa ya elegir a donde vamos

     switch(opcion){
         //primer caso ir a mi edad 
         case 1:
         //asignar la clase edad
         edad obj = new edad();
         obj.leerEdad();
         
         break;
        
         //segundo sacar areas
         //asignar clase figuritas
         
         case 2:
         figuritas obj1 = new figuritas();
         obj1.mefigu();
        
         break;

         //decidir cambiarme a movistar
         case 3:
         telmex obj2 = new telmex();
         obj2.meterDatos();
        
         break;


     }

     
 }


  
  
}