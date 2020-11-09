import java.util.*;

public class arreglos{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int opcion;
        char letra;

        arreglos promedios = new arreglos();
        arreglos propares = new arreglos();
        arreglos calificaciones = new arreglos();
        

        do{
            System.out.println("Escoja el programa que se utilzara");
            System.out.println("1. calcular el promedio de numeros positivos y negativos");
            System.out.println("2. calcular el promedio de los números pares");
            System.out.println("3. programa de calificaciones ");
            

            opcion = entrada.nextInt();

            switch(opcion){
                case 1: 
                do{
                    promedios.juanelpro();
                    System.out.println("si desea repetir el programa presione s si no presione dos veces v");
                    letra = entrada.next().charAt(0);
                }while(letra =='s');
                break;

                case 2:
                do{
                    propares.paroindefinido();
                    System.out.println("si desea repetir el programa presione s si no presione dos veces v");
                    letra = entrada.next().charAt(0);
                }while(letra =='s');
                break;

                case 3:
                do{
                    calificaciones.sepasasola();
                    System.out.println("si desea repetir el programa presione s si no presione dos veces v");
                    letra = entrada.next().charAt(0);
                }while(letra =='s');
                break;

                


            }
            letra = entrada.next().charAt(0);
        }while(letra=='v');


    }

    public static void juanelpro(){
        Scanner entrada = new Scanner(System.in);

        int juan[] = new int [10];
        int negativo=0;
        int positivo=0;
        double r=0;
        double n=0;
        double promedio1=0;
        double promedio2=0;

        System.out.println("ingrese diez numero enteros positivos o negtivos que quiera");
            

        for(int i=0; i<juan.length; i++){
            
            juan[i] = entrada.nextInt();
        }
        /* ahora distinguir cuales son los positivos y cuales los negativos
        */
        for(int i=0; i<juan.length; i++){
            if(juan[i]>0){
                positivo++;
                r= r+juan[i];

            }else{
                negativo++;
                n= n+juan[i];

                

            }
        }
        promedio1= r/positivo;
        promedio2 = n/negativo;
        System.out.println("el promedio de los numeros positivos que puso es de: "+promedio1);
        System.out.println("El promedio de los numeros negartivos que puso es de: "+promedio2);

    }
    public static void paroindefinido(){
        Scanner entrada = new Scanner(System.in);
        int par[] = new int[10];
        double numerin=0;
        double xd=0;
        System.out.println("meta los numeros que quiera y se van a promediar los que estene en poscisiones pares king");
        
         //primero meter datozzz

        for(int i=0; i<par.length; i++){
            
            par[i] = entrada.nextInt();
        }
        //ahora a decirle que namas nos cuente pares
        for(int i=0; i<par.length; i++){
            if(i%2==0){
                numerin= numerin+par[i];
                
        
            }
        }
        
        System.out.println("El promedio de las posiciones pares es: "+(numerin/5));
        
    }


    public static void sepasasola(){
        Scanner entrada = new Scanner(System.in);
        int numero[]= new int[10];
        int resultados[]=new int[10];
        int rep =0;
        int ap =0;
        int min=0;
        int max=0;
        int pro=0;
        int suma=0;
        int i=0;

        min=max=numero[0];
        System.out.println("ingrese 10 calificaciones");
        for(i=0; i<numero.length;i++){
            System.out.println("la calificacion es"+(i+1)+":");
            numero[i] = entrada.nextInt();

        }

        for( i=0; i<numero.length; i++){
            suma=suma+numero[i];
            if (numero[i]<=5){
                rep++;
            }else{
                ap++;
            }

            if(min>numero[i]){
                min=numero[i];
            }
            if(max<numero[i]){
                max=numero[i];
            }
        }

        for (i=0; i<numero.length; i++){
            resultados[i]=numero[i]*1;
        }

        System.out.println("Calificaciones: ");
        for(i=0; i<numero.length; i++){
        System.out.println(resultados[i]);
        }

        pro=suma/numero.length;
        System.out.println("El promedio del grupo es: " + pro);
        System.out.println("la calificacion mas alta es: "+max);
        System.out.println("la calificacion mas baja es : "+min);
        System.out.println("calificaciones superiores al promedio: ");
        for(i=0; i<numero.length; i++){
            if(numero[i]>pro){
                System.out.println((i+1));
            }
        }
        System.out.println("alumnos que aprobaron: "+ap);
        System.out.println("alumnos que reprobaron: "+rep);



            
            
        
        
    }

   

    


    
}
