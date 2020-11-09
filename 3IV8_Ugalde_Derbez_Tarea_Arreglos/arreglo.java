import java.util.Scanner;

public class arreglo{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String letra;
        
        arreglo maymen = new arreglo();

        do{
            maymen.menu();
            System.out.println("Deseas repetir?");
            letra = entrada.nextLine();
        }while(letra!="s");
    }

    public void menu(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int val;
        //variables
        System.out.println("Seleccione la opcion que desee ejecutar");
        System.out.println("1. promedio de valores positivos y negativos");
        System.out.println("2. promedio de poscisiones pares del array");
        System.out.println("3. programa de calificaciones");

        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
            val = uno()
            break;
            

        }
        

    }
    
    public void uno(){
        Scanner entrada = new Scanner(System.in);

        //variables
        int num[] = new int[10];
        int sum;

        for(int i=0; i<num.length; i++){
            if(num[i]>0){
                sum=num[i]/10;
            }


            
        }

    }

    
}