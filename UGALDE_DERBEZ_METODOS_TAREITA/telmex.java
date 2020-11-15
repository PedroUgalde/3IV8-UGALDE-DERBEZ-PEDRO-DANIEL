import java.util.Scanner;

class telmex{

    /*este es el bueno, para empezar vamoh a poner las variables
    que en este caso son las dos obligatorias int numero y saldo, y a eso le vamos a agregar 
    variables para cada uno de los tipos de llamada que hay, mas el obligatoria char para repetir la cosa
    */

    private static int nocel;

 //hacer que la variable se pueda leer

 public static int getNocel(){
     return nocel;
 }

 public static void setNocel(int no){
     nocel=no;
}
 private static int sueldo;
 public static int getSueldo(){
    return sueldo;
 }

 public static void setSueldo(int sue){
    sueldo=sue;
 }



 private static int nacionales;

 //hacer que la variable se pueda leer

 public static int getNacionales(){
     return nacionales;
 }

 public static void setNacionales(int na){
     nacionales=na;
 }
 private static int internacionales;

 //hacer que la variable se pueda leer

 public static int getInternacionales(){
     return internacionales;
 }

 public static void setInternacionales(int in){
     internacionales=in;
 }

 private static int celulares;

 //hacer que la variable se pueda leer

 public static int getCelulares(){
     return celulares;
 }

 public static void setCelulares(int ce){
     celulares=ce;
 }

 // ultimas variables seran de parametros
 private static int pa1;
 public static int getPa1(){
    return pa1;
 }

 public static void setPa1(int pai){
    pa1=pai;
  } 

  private static int pa2;
 public static double getPa2(){
    return pa2;
 }

 public static void setPa2(int pad){
    pa2=pad;
  } 

  private static int pa3;
 public static int getPa3(){
    return pa3;
 }

 public static void setPa3(int paf){
    pa3=paf;
  } 

  private static int pa4;
 public static int getPa4(){
    return pa4;
 }

 public static void setPa4(int paz){
    pa4=paz;
  } 






 /* el primer metodo va a ser para que ingreses las cosas 
 y telemex te de el abjo con sus precios inferiores a movistar*/
 public void meterDatos(){
     Scanner entrada = new Scanner(System.in);
     System.out.println("inserte los 10 digitos de su numero de celular");
     nocel = entrada.nextInt();
     System.out.println("inserte el sueldo de su celular");
     sueldo = entrada.nextInt();
     System.out.println("Inserte el numero de llamadas locales nacionales realizo");
     nacionales = entrada.nextInt();
     System.out.println("Inserte el numero de llamadas locales internacionales que realizo");
     internacionales = entrada.nextInt();
     System.out.println("inserte el numero de llamadas locales celulares realizo");
     celulares = entrada.nextInt();

     //enviar parametros

     pa1 = calcuNacional(sueldo, nacionales);
     pa2 = calcuInternacionales(sueldo, internacionales);
     pa3 = calcuCelular(sueldo, celulares);
     pa4 = calcuTodo(sueldo, nacionales, internacionales, celulares);

     //resultados

     System.out.println("su numero es: "+nocel);
     System.out.println("su sueldo inicial es de: "+sueldo);
     System.out.println("su sueldo tras llamadas nacionales es de: "+pa1);
     System.out.println("su sueldo tras llamadas internacionales es de: "+pa2);
     System.out.println("su sueldo tras llamadas celulares es de : "+pa3);
     System.out.println("su sueldo final es de: "+pa4);
    
    }

    public int calcuNacional(int v1, int v2){
        int m;
        m=v1-((int) v2/2);
        return m;
    }

    public int calcuInternacionales(int v1, int v2){
        int m;
        m=v1-((int)v2*60/100);
        return m;
    }

    public int calcuCelular(int v1, int v2){
        int m;
        m=v1-(v2*(int)20/100);
        return m;
    }

    public int calcuTodo(int v1, int v2, int v3, int v4){
        int m;
        m=v1-((int)v2/2)-(v3*(int)60/100)-(v4*(int)20/100);
        return m;
    }







}