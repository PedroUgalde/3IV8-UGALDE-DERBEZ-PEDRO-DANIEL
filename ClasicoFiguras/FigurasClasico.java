import java.util.Scanner;

class FigurasClasico{
    /*realizae menu que haga area o perimetro de las siguientes figuras
    cuadrado triangulo o circulo*/


    /* ahora quiero que se repita el programa para volver a calcular otra área*/

    public static void main(String[] args){

        //instancea del objeto
        Scanner entrada = new Scanner(System.in);
        //variables

        int base, altura, opcion;
        double resultado, pe;
        char letra;
        
      do{
        //cuerpo
        System.out.println("Eliga la opción deseada: ");
        System.out.println("1.- Calcular area de un cuadrado y perimetro ");
        System.out.println("2.- Calcular area de un triángulo  y su perimetro ");
        System.out.println("3.- Calcular area de un circulo y su perimetro ");
        System.out.println("4.- Calcular area de un rectangulo y su perimetro ");
        System.out.println("5.- Calcular area de un pentagono y su perimetro ");
        System.out.println("6.- Salir ");

        //asignar opción
        opcion = entrada.nextInt();
         //aplicar segun o switch
        switch(opcion){
            case 1:
            //realizar las operaciónes
            System.out.println("Ingresa el valor del lado: ");
            base = entrada.nextInt();
            resultado = base*base;

           System.out.println("El area del cuadrado es:  " + resultado);
            pe = base*4;
            System.out.println("El perimetro del cuadrado es:  " + pe);

            break;


            case 2:


            System.out.println("Ingresa el valor del base: ");
            base = entrada.nextInt();

            System.out.println("Ingresa el valor de la altura: ");
            altura = entrada.nextInt();


            resultado = (base*altura)/2;

            System.out.println("El area del triángulo es:  " + resultado);
            pe = base*3;
            System.out.println("El perimetro del triangulo es:  " + pe);

            break;

            case 3:
            System.out.println("Ingresa el valor del radio: ");
            base = entrada.nextInt();

            resultado = 3.1416*base*base;

            System.out.println("El area del circulo es:  " + resultado);
            pe = base*3.1416*2;
            System.out.println("El perimetro del circulo es:  " + pe);
            break;

            case 4:
            System.out.println("Ingresa el valor de la base : ");
            base = entrada.nextInt();

            System.out.println("Ingresa el valor de la altura : ");
            altura = entrada.nextInt();


            resultado = base*altura;

            System.out.println("El area del rectángulo es:  " + resultado);
            pe = base*2+altura*2;
            System.out.println("El perimetro del rectangulo es:  " + pe);
            break;
            
            case 5:
            System.out.println("Ingresa el valor del lado : ");
            base = entrada.nextInt();

            System.out.println("Ingresa el valor de la apotema : ");
            altura = entrada.nextInt();


            resultado = (5*altura*base)/2;

            System.out.println("El area del pentagono es:  " + resultado);
            pe = base*5;
            System.out.println("El perimetro del pentagono es:  " + pe);
            break;


            default:

            System.out.println("Gracias por participar");

            
        }

        System.out.println("Deseas repetir el programa?, si lo desea escriba s");
     letra = entrada.next().charAt(0);

    }while(letra == 's');
     //system
     
    }
}

