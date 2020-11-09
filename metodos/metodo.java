/*
uso de metodos ayuda a organizar codigo de forma que se pueda
dividir en diferentes procesos que se 
encarguen de realizar diferentes acciones o funciones .

LLega un momento en que se pierde el oreden en un codigo de diferentes operaciones o funciones
es importante usar metodos que ayuden a la clase a ser más rapida al momento de ejecutar tareas
*/


import java.util.Scanner;
public class metodo{
    //programa que se encargue de saber numero mayor y menor
    //utilizando metodos para optimizar operacion
   int m;
   


    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      String letra;
        //cuerpo principal
        //aqui se ejecuta
        //tengo que crear un objeto de la clase 
        //para poder llamar metodos

        metodo maymen = new metodo();

        do{
        maymen.cargarValores();
        System.out.println("Desea repetir");
        letra = entrada.nextLine();
        

        }while(letra!="s");
    }


    //vamos a crear metodo que tenga menu de opciones
    //menu de operaciones
    //palabra reservada vacio para metodos
    public void cargarValores(){
        Scanner entrada = new Scanner(System.in);

        //variables
        int val1, val2, val3;
        int menor, mayor;
        System.out.println("ingresa el primer valor");
        val1 = entrada.nextInt();

        System.out.println("ingresa el segundo valor");
        val2 = entrada.nextInt();

        System.out.println("ingresa el tercer valor");
        val3 = entrada.nextInt();

        //enviar parametros
        mayor = calcularMayor(val1, val2, val3);
        menor = calcularMenor(val1, val2, val3);

        System.out.println("el valor mayor es: "+ mayor);
        System.out.println("el valor menor es: "+ menor);



        
    }
    //recibir parametros
    public int calcularMayor(int v1, int v2, int v3){

        //vamos a realizar operaciones
        //para saber el mas grande
        //necesitamos retornar el valor mas grande
        int m;
        if(v1>v2 && v1>v3){
            //asigno v1 a m
            m=v1;
        }else{
            if(v2>v3){
                m=v2;
            }
            else{
                m=v3;
            }
        }
        return m;
    }

    public int calcularMenor(int v1, int v2, int v3){

        //vamos a realizar operaciones
        //para saber el mas grande
        //necesitamos retornar el valor mas grande
        int m;
        if(v1<v2 && v1<v3){
            //asigno v1 a m
            m=v1;
        }else{
            if(v2<v3){
                m=v2;
            }
            else{
                m=v3;
            }
        }
        return m;
    }
}