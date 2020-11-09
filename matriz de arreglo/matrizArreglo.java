import java.util.*;

public class matrizArreglo{

    public static void main(String[] args){
        //objeto
        Scanner entrada = new Scanner(System.in);
        //variables
        //arreglo


        int arreglin[] = new int[5];

        for(int i=0 ; i<arreglin.length; i++){
            System.out.println("los numeros son: "+i);
        }


        int matriz[][] = new int [3][3];

        float sumarFila=0

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.lemgth; j++){
                System.out.println("ingresa el numer de la fila"+ i + "columna" +j+ " : ");
                matriz[i][j] = entrada.nextInt();

               // System.out.println(String.format("Mira: %d", matriz[i][j]));

        
            }
            
        }

        //crear suma
        for(int i = 0; i<matriz.length; i++){
            sumarFila = 0
            for(int j =0; j<matriz.length; j++){
                sumarFila += matriz[i][j]
                System.out.println(String.format("%d", matriz[i][d]));

            }
            System.out.println(String.format("Suma fila : %f, promedio fila: %f", sumarFila, sumarFila/matriz.length)
            

        }
       

    
    }
}