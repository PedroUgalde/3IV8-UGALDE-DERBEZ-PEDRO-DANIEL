import java.util.Scanner;
// crear la clase donde va a estar todo el pozole
//no se enoje por la variable ano porjaaa
//esque java no me dejo usar ñ y no queria reescribir el codigo

public class edad{
    Scanner entrada = new Scanner (System.in);
    //variable privada y su get y set :)

    private static int ano;
    public static int getAno(){
        return ano;
    }
   
    public static void setAno(int a){
        ano=a;
    }
    //variable del año actual
    private static int oi;

    public static int getOi(){
        return oi;
    }
   
    public static void setOi(int hoy){
        oi=hoy;
    }
   
  //un char que va a ser pa repetir la cosa
    private static char repetir;
    public static char getRepetir(){
        return repetir;
    }
   
    public static void setRepetir(char r){
        repetir=r;
    }
  //variable para parametros
  private static int paloe;
  

  public static int getPaloe(){
    return paloe;
    }

    public static void setPaloe(int pa){
    paloe=pa;
    }
   
    public void leerEdad(){
        do{
        System.out.println("Escriba en que año nacio master");
        ano = entrada.nextInt();
        System.out.println("ponga el año actual<3");
        oi = entrada.nextInt();
        //parametros
        paloe = calcuEdad(ano, oi);

        System.out.println("su edad es: "+ paloe);
        System.out.println("desea repetir, presione s");
        repetir = entrada.next().charAt(0);
        }while(repetir=='s');



    }

    public int calcuEdad(int v1, int v2){
        int m;
        
        m=v2-v1;

        return m;
    }

    
   
   

}