import java.util.Scanner;

class figuritas{
    //primero hay que establecer las variables :)
    //la primera va a ser pal menu
    private static int opcion;
    public static int getOpcion(){
        return opcion;
    }
   
    public static void setOpcion(int op){
        opcion=op;
    }

    //ahora unas variables double que van a ser bases alturas y radios
    private static double base;
    public static double getBase(){
        return base;
    }
   
    public static void setBase(double b){
        base=b;
    }
    private static double altura;
    public static double getAltura(){
        return altura;
    }
   
    public static void setAltura(double aa){
        altura=aa;
    }
    //tambien variables pa la base y la altura
    private static double area;
    public static double getArea(){
        return area;
    }
   
    public static void setArea(double are){
        area=are;
    }

    private static double peri;
    public static double getPeri(){
        return peri;
    }
   
    public static void setPeri(double pepe){
        peri=pepe;
    }

    //por ultimo el viejo bueno del char
    public static char re;
    public static char getRe(){
        return re;
    }
   
    public static void setRe(char res){
        re=res;
    }

    

    //crear el menu de las figuritas
    public void mefigu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("que figura desea saber su área?");
        System.out.println("1. circulo");
        System.out.println("2. cuadrado");
        System.out.println("3.triangulo");
        System.out.println("4.rectangulo");

        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
            leerCirculo();
            break;

            case 2:
            leerCuadrado();
            break;

            case 3:
            leerTriangulo();
            break;

            case 4:
            leerRectangulo();
            break;
        }
    }

    //metodo para leer y ejecutar formas
    public void leerCirculo(){
        Scanner entrada = new Scanner(System.in);
        do{
        System.out.println("pon el radio del circulo que quieras: ");
        base = entrada.nextDouble();

        area = calcuarCir(base);
        peri = calcupeCir(base);

        System.out.println("el area del circulo es de: "+ area);
        System.out.println("el perimetro del circulo es de: "+peri);
        System.out.println("si desea repetir el progra presione s");
        re=entrada.next().charAt(0);
        }while(re=='s');


    }
    //metodos para ejecutar la operacion
    public double calcuarCir(double v1){
        double m;
        m=v1*v1*3.14;
        return m;

    }
    public double calcupeCir(double v1){
        double m;
        m=v1*3.14*2;
        return m;
    }

    //metodo para leer y ejecutar formas
    public void leerCuadrado(){
        Scanner entrada = new Scanner(System.in);
        do{
        System.out.println("pon el lado del cuadrado que quieras: ");
        base = entrada.nextDouble();

        area = calcuarCuad(base);
        peri = calcupeCuad(base);

        System.out.println("el area del cuadrado es de: "+ area);
        System.out.println("el perimetro del cuadrado es de: "+peri);
        System.out.println("si desea repetir el progra presione s");
        re=entrada.next().charAt(0);
        }while(re=='s');


    }
    //metodos para ejecutar la operacion
    public double calcuarCuad(double v1){
        double m;
        m=v1*v1;
        return m;

    }
    public double calcupeCuad(double v1){
        double m;
        m=v1*4;
        return m;
    }

    //metodo para leer y ejecutar formas
    public void leerTriangulo(){
        Scanner entrada = new Scanner(System.in);
        do{
        System.out.println("pon la base y la altura respectivamente del triangulo que quieras: ");
        base = entrada.nextDouble();
        altura = entrada.nextDouble();

        area = calcuarTrian(base, altura);
        peri = calcupeTrian(base, altura);

        System.out.println("el area del triangulo es de: "+ area);
        System.out.println("el perimetro del triangulo es de: "+peri);
        System.out.println("si desea repetir el progra presione s");
        re=entrada.next().charAt(0);
        }while(re=='s');


    }
    //metodos para ejecutar la operacion
    public double calcuarTrian(double v1, double v2){
        double m;
        m=(v1*v2)/2;
        return m;

    }
    public double calcupeTrian(double v1, double v2){
        double m;
        m=v1*3;
        return m;
    }

    //metodo para leer y ejecutar formas
    public void leerRectangulo(){
        Scanner entrada = new Scanner(System.in);
        do{
        System.out.println("pon la base y altura respectivamente del rectangulo que quieras: ");
        base = entrada.nextDouble();
        altura = entrada.nextDouble();

        area = calcuarRec(base, altura);
        peri = calcupeRec(base, altura);

        System.out.println("el area del rectangulo es de: "+ area);
        System.out.println("el perimetro del rectangulo es de: "+peri);
        System.out.println("si desea repetir el progra presione s");
        re=entrada.next().charAt(0);
        }while(re=='s');


    }
    //metodos para ejecutar la operacion
    public double calcuarRec(double v1, double v2){
        double m;
        m=v1*v2;
        return m;

    }
    public double calcupeRec(double v1, double v2){
        double m;
        m=(v1*2)+(v2*2);
        return m;
    }




   
   
   
   
}