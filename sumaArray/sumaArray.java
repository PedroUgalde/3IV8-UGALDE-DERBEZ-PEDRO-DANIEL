import java.util.Scanner;
import javax.swing.JOptionPane;

/*
programa que se encarga de crear un array que almacene 100
poscisiones y sume los numeros del 1 al 100 y pbtenga la media
*/

public class sumaArray{
     public static void main(String[ ] args){
         /*

        int[] numeros = new int[100];
        int suma = 0;
        double media = 0.00;

        for(int i =0; i<numeros.length; i++){
            numeros[i]=i+1;

            //sumar numeros
            suma+=numeros[i];


        }

        System.out.println("la suma de los numero es de; "+suma);

        media = (double)suma/numeros.length;
        System.out.println("la media es: "+media);
    

    */


       //multiplicacion


       String texto = JOptionPane.showInputDialog("introduce el tamaño del arreglo");


       int tamanio = Integer.parseInt(texto);

       //creamos array

       int array1[]=new int [tamanio];
       int array2[];

       //rellenar array con metodo

       rellenarNumAleatoriosArray(array1, 10, 100);

       //apuntar el array2 al array1
       array2 = array1;


       //crear nuevo array usando el array1 que tendra una nueva direccion
       array1=new int[tamanio];

       //lo velvemos a rrellenar
       rellenarNumAleatoriosArray(array1, 10, 100);

        //contiene con el array con el resultado de multiplicar los valores del array
        int array3[]=multiplicador(array1, array2);

        System.out.println("Arreglo1: ");

        mostrarArray(array1);

        System.out.println("Arreglo2: ");

        mostrarArray(array2);
        System.out.println("Arreglo3: ");

        mostrarArray(array3);








   }

   //metodo de relleno

   public static void rellenarNumAleatoriosArray(int lista[], int a, int b){
       for(int i =0; i<lista.length; i++){
           //asignar numeros al azar
           //libreria math.random de 10 a 100
           //catear el entero
           lista[i] = ((int)Math.floor(Math.random()*(a-b)+b));
       }
   }

   public static void mostrarArray(int lista[]){
       for(int i=0; i<lista.length; i++){
           System.out.println("EN el indice "+i+" esta el valor: "+lista[i]);
       }
   }


   //multiplicacion de arreglos

   public static int[] multiplicador(int array1[], int array2[]){

    int array3[] =new int[array1.length];
    //multiplicar filas por filas

    for(int i=0; i<array1.length; i++){

        array2[i]=array1[i]*array2[i];
    }
    return array3;
   }

    


}