/* 
esta clase va a tener relacion con la principal
en esta se va a encargar de realizar metodos necesarios para reaolver lo siguiente
*/

import java.util.Scanner;

public class operaciones{
    //objeto para manipular datos
    Scanner entrada = new Scanner(System.in);

    //menu
    public void menu(){
        char op;
        System.out.println("Ejemplo de un menu que se encarga de: ");
        System.out.println("a. calculadora ");
        System.out.println("b. coversor de unidades ");
        System.out.println("c. creacion de cuadros: ");
        System.out.println("d. movimiento de cuadro: ");

        op = entrada.next().charAt(0);

        //crear switch

        switch(op){
            case 'a':
            //crear metodo
            Calculadora();
            break;

            case 'b':
            //crear metodo
            ConversorUnidades();
            break;

            case 'c':
            //crear metodo
            CreaCuadro();
            break;

            case 'd':
            //crear metodo
            MoviCuadro();
            break;
        }
    }

    //metodo calculadora

    public void Calculadora(){

        //variables
        double numero = 0.00, suma = 0.00, multi = 1.00;
        char operacion, p;

        System.out.println("seleccione opcion deseada: ");
        System.out.println("a. suma y resta");
        System.out.println("b. multiplicacion");
        System.out.println("division");

        operacion = entrada.next().charAt(0);

        switch(operacion){

            case 'a':
            do{
                System.out.println("para dejar de sumar ingrese 0");
                System.out.println(" Ingrese el valor sumar");
                numero = entrada.nextDouble();

                suma += numero;
            }while(numero!=0);
            System.out.println("la suma total es de: "+ suma);
            break;

            case 'b':
            do{
                System.out.println("para dejar de sumar multiplicar 0");
                System.out.println(" Ingrese el valor a multiplicar");
                numero = entrada.nextDouble();

                if(numero >0){
                    multi*= numero;
                }else{
                    System.out.println("Ingresa solo positivo");
                }
            }while(numero!=0);
            System.out.println("la suma total es de: "+ suma);
            break;

            case 'c':
            break;

            case 'd':
            break;

            
        }


    }


    public void ConversorUnidades(){
        /*
        van a tener que realixar conversions de 

        metro a cm
        metro a pulgada
        kilogramo a libra
        kilogramo a onza
        */


    }

    public void CreaCuadro(){
        int n, m= 0;


        do{
            System.out.println("Ingrese el numero de asteriscos por cuadro");
            n= entrada.nextInt();

            if((n<0) || (n>1000)){
                System.out.println("no se aceptan numeros menor a 0 ni mayor a 1000");
            

            }else{
                for(int i=0; i<=n; i++){
                    System.out.print("*");
            
                }
                System.out.println("\n");

                   for(int i=0; i<n-2; i++){
                       System.out.print("*");

                       for(int j =0; j<n-2;j++){
                         System.out.print("");



                       }
                       System.out.print("*");

                       

                   }

                   for(int k =0; k<=n; k++){
                    System.out.print("*");

                }
            
            }
        }while(m!=1);

    }

   }

    public void MoviCuadro(){
        
         }
