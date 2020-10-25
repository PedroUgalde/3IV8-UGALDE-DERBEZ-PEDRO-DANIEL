import java.util.Scanner;
import java.io.*;
// esta biblioteca la utilize en el segundo problema, para contar los caracteres y comprobar que no haya decimales
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class pedro{
  //disculpe profe no me permite ponerle un nombre tan largo a la clase , el foledr tiene los datos requeridos
  //intente de varias maneras pero solo me dejo poniendo uno de mis nombres
  //disculpe el inconveniente en ese aspecto.
  // espero que disfrute el algoritmo, en algunos tarde mas de 3 horas a lo tonto jaja
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        //variables
        /* debe aceptar numeros reales, positivos
        y acorde a un rango superior o inferior dependiendo del programa
        */
        int opcion, fac, medida, figura, doritos, bolzasa, popin, refresco, r1, r2, r3, r4, rf;
        char miembro;
        String num, bin;
        Long numF;
        char entero='o';
        Double f = 0.0;
        Double resultado = 0.0;
        //inicializar char para que si la lea
        Double area, edad, perimetro, lado, altura, dinero;
        int mult=1;
        int i=1;
        String inp="A";
        int cont=0;
        int elNum=0;
        int pos=0;
        int neg=0;
        char letra;

        do{
            //menu
            System.out.println("Eliga el numero de la opcion que desee ejecutar");
            System.out.println("1.- Averiguar que cantidad de descuento tiene");
            System.out.println("2.- Convertir un numero decimal a binario");
            System.out.println("3.- Conversion de grados Farenheith");
            System.out.println("4.- Contar números positivos y negativos");
            System.out.println("5.- Comprar productos");
            System.out.println("6.- Averiguar area y perimetro, o volumen");
            System.out.println("7.- tabla de valores");
            System.out.println("8.- Factorial de un entero no negativo");
            System.out.println("9 Fuera de servicio");
            System.out.println("10 Fuera de servicio");
            System.out.println("11 Fuera de servicio");
            System.out.println("12 Fuera de servicio");
            System.out.println("13.- Calculadora");
            System.out.println("14. Salir");

            //asignar opcion
            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                 System.out.println("Por favor inserte su adeudo: ");
                 dinero = entrada.nextDouble();
                 System.out.println("Por favor inserte su edad: ");
                 edad = entrada.nextDouble();

                 while(edad<0){
                     System.out.println("Porfavor inserte un edad valida");
                     edad = entrada.nextDouble();
                 }
                
                 if (edad > 65){
                    dinero = dinero* .40;
                    System.out.println("Su abono es del 40 porciento, por lo tanto debe pagar: " + dinero);
                 }else{
                    System.out.println("Lo siento no cuenta con descuento");
                 }
                 if (edad < 21 ){
                    
                    System.out.println("Sus padres son Socios joven? s/n " );
                   miembro = entrada.next().charAt(0);
                   if (miembro == 's'){
                       dinero = dinero*.45;
                       System.out.println("Su abono es del 45 porciento, por lo tanto debe pagar: " + dinero);
                   }else{
                       dinero = dinero*.25;
                       System.out.println("Su abono es del 25 porciento, por lo tanto debe pagar: " + dinero);
                   }
                 }
                 break;

                 case 2:
                 System.out.println("Inserte un numero entero en sistema decimal");
                 num=entrada.nextLine();

                  //esto es para ver si hay un punto en el numero
                  //Alfin encontre como evitar que pongan numeros >:)
                 while(entero!='s'){
                   for(int l=0; i<num.length(); i++){
                      if((num.charAt(i)!='1')||(num.charAt(i)!='2')||(num.charAt(i)!='3')||(num.charAt(i)!='4')||(num.charAt(i)!='5')||(num.charAt(i)!='6')||(num.charAt(i)!='7')||(num.charAt(i)!='8')||(num.charAt(i)!='9')||(num.charAt(i)!='0')){
                          entero='n';
                          System.out.println("Caracter invalido, inserte un numero entero en sistema decimal");
                          num=entrada.nextLine();
                        }else{
                               entero='s';
                            }
                        }

                    }

                     //cuando confirma que no hay punto, lo convierte a binario
                     numF=Long.parseLong(num);
                     bin=Long.toBinaryString(numF);

                      System.out.println(bin);
             
                 break;

                 case 3:
                 System.out.println("Por favor inserte los grados Farenheith que quiciera transformar");
                 f = entrada.nextDouble();
                 System.out.println("Ahora Escribe el numero de a cual de las siguientes unidades lo quiere transformar");
                 System.out.println("1. Grados celcius");
                 System.out.println("2. Grados Kelvin");
                 System.out.println("3. Grados Rankine");
             
                 medida = entrada.nextInt();
             
                 
             
             
                 switch(medida){
                     case 1:
                     resultado = (f-32)*(5/9);
                     System.out.println("Tendria :" + resultado + "Grados celcius");
                     break;
             
                     case 2:
                     resultado =(f-32)*(5/9)+273.15;
                     System.out.println("Tendria :" + resultado + "Grados Kelvin");
                     break;
             
                     case 3:
                     resultado = f+459.67;
                     System.out.println("Tendria :" + resultado + "Grados Rankie");
                     break;
             
                     default:
                     System.out.println("Gracias por participar");
                        
             
                     }
                 break;

                 case 4:
                 ArrayList<String> numeros = new ArrayList<String>();
                 //array list es como una cajita sin fondo hasta que uno lo quiera
                 //la array list se llama numeros 
                 System.out.println("Ingrese los numeros que quiera, cuando desee parar ponga s");
                 
             
                 while(!(inp.equals("s"))){
                     numeros.add(entrada.nextLine());
                     inp=numeros.get(cont);
                     cont++;
                 }
             
                 numeros.remove(numeros.size()-1);
             
                 for(int j=0; i<numeros.size(); i++){
             
                     elNum=Integer.parseInt(numeros.get(i));
             
                     if(elNum<0){
                         neg++;
                     }
             
                     if(elNum>=0){
                         pos++;
                     }
                 }
             
                 System.out.println("POSITIVOS: "+pos);
                 System.out.println("NEGATIVOS: "+neg);
             
                 break;

                 case 5:
                  System.out.println("Bienvenido a miscelanias tres papas y un refresco, donde somos famosos por vender tres tipos de papas y un refresco");
                  System.out.println("A continuación le presentamos las tres papas y un refresco que la tienda vende");
                  System.out.println("Rancheritos con un valor de 10 pesos");
                  System.out.println("Bolzasa de papitas a 15 pesos");
                  System.out.println("Doritos gamer a 10 pesos");
                  System.out.println("Refresco de color que no describe el sabor a 12 pesos");

                  System.out.println("Por favor a continuacion escriba cuantas bolsas de rancheritos desea llevar");
                    popin = entrada.nextInt();

                 System.out.println("Por favor a continuacion escriba cuantas bolzasas desea llevar");
                 bolzasa = entrada.nextInt();

                 System.out.println("Por favor a continuacion escriba cuantas bolsas de doritos gAmer desea llevar");
                 doritos = entrada.nextInt();

                 System.out.println("Por favor a continuacion escriba cuantas botellas de refresco con color que no describe su sabor desea llevar");
                 refresco = entrada.nextInt();

                 r1= popin*10;
                 System.out.println("El total a pagar de los rancheritos es: "+r1);
    
                    r2 = bolzasa*15;
                   System.out.println("El total a pagar de la bolzasa es: "+r2);

                     r3 = doritos*10;
                     System.out.println("El total a pagar de los doritos es: "+r3);

                      r4 = refresco*12;
                     System.out.println("El total a pagar de los refrescos es: "+r4);

                     rf=r1+r2+r3+r4; 
                     System.out.println("El total a pagar de todos los productos es"+rf); 
                 break;

                 case 6:
                  
               
                   System.out.println("1.- Area y perimetro de un cuadrado");
                   System.out.println("2.- Area y perimetro de un rectángulo");
                   System.out.println("3.- Volumen de una esfera");
                   System.out.println("4.- volumen de un cilindro");
               
                   figura = entrada.nextInt();
               
                   switch (figura){
               
                       case 1:
                       System.out.println("Porfavor inserte el lado del cuadrado");
                       lado = entrada.nextDouble();
               
                       area = lado*lado;
                       System.out.println("El area del cuadrado es de: "+ area);
                       perimetro= lado*4;
                       System.out.println("El perimetro es de "+ perimetro);
                       break;
               
                       case 2:
                       System.out.println("Por favor inserte la base y la altura del triangulo");
                       lado = entrada.nextDouble();
                       altura= entrada.nextDouble();
               
                       area = (lado*altura)/2;
                       System.out.println("El area de su triangulo es: "+area);
                       perimetro = lado*3;
                       System.out.println("El perimetro de su triangulo es de: "+ perimetro);
                       break;
               
                       case 3:
                       System.out.println("Por favor inserte el radio de su esfera");
                       lado = entrada.nextDouble();
                       area = (4/3)*3.14*lado*lado*lado;
                       System.out.println("El volumen de su cilindro es de: "+ area);
                       break;
               
                       case 4:
                       System.out.println("Por favor inserte el valor de el radio y la altura del cilindro");
                       lado = entrada.nextDouble();
                       altura = entrada.nextDouble();
               
                       area = lado*lado*3.14*altura;
                       System.out.println("El volumen de su cilindro es de: "+area);
                       break;
               
                       default:
                       System.out.println("Gracias por participar");
                    }
                  
                 break;

                 case 7:System.out.println("No encontr como hacer la tabla x,d porfi intente otro");
                 opcion = entrada.nextInt();


                 break;

                 case 8:
                 System.out.println("Por favor inserte el número del cual quiera saber su factorial");
                 fac = entrada.nextInt();

                  while(fac<0){
                     System.out.println("porfavor ingrese un valor entero y positivo");
                        fac = entrada.nextInt();
                   }
                  while((fac%2)==0){
                            System.out.println("porfavor ingrese un valor entero y positivo");
                         fac = entrada.nextInt();  

                         }

                      for(i=1;  i<=fac;  i++){

                        mult = mult*i;

        
      
      

                           }
                          System.out.println("El factorial de"+" "+fac+" "+" es: "+" "+mult);

                 break;

                 case 9:
                  System.out.println("En construccion eliga otro");
                 opcion = entrada.nextInt();

                 break;

                 case 10:System.out.println("En construccion eliga otro");
                  opcion = entrada.nextInt();

                 break;

                 case 11:System.out.println("En construccion eliga otro");
                 opcion = entrada.nextInt();

                 break;

                 case 12:System.out.println("En construccion eliga otro");
                 opcion = entrada.nextInt();
                 
                 break;
                 case 13:

                 //CREAR FRAME
                 JFrame frame = new JFrame("CALCULADORA PEDRO");
                 frame.setSize(500,600);
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame.setVisible(true);
                  frame.setLayout(null);
                  //CREAR LABELS
                  JLabel L1 = new JLabel("Primer Numero");
                 L1.setBounds(50,50,130,50);
                 frame.add(L1);

                  JLabel L2 = new JLabel("Segundo Numero");
                  L2.setBounds(50,100,130,50);
                 frame.add(L2);
                    //CREAR CAMPOS DE TEXTO
                  JTextField T1 = new JTextField("");
                    T1.setBounds(150,60,80,30);
                   T1.setVisible(true);
                 frame.add(T1);

                  JTextField T2 = new JTextField("");
                   T2.setBounds(150,110,80,30);
                 T2.setVisible(true);
                  frame.add(T2);

                  JTextField res = new JTextField("");
                   res.setBounds(500,200,80,30);
                   res.setVisible(true);
                    frame.add(res);
    

                  //BOTONES
                   JButton suma = new JButton("SUMAR");
                       suma.setBounds(50,200,80,50);
                   suma.setVisible(true);
                   frame.add(suma);

                    JButton multiplicacion = new JButton("MULT");
                   multiplicacion.setBounds(150,200,80,50);
                     multiplicacion.setVisible(true);
                    frame.add(multiplicacion);

                   JButton division = new JButton("DIVISION");
                   division.setBounds(150,290,80,50);
                   division.setVisible(true);
                   frame.add(division);

                     JButton restar = new JButton("RESTAR");
                   restar.setBounds(50,290,80,50);
                   restar.setVisible(true);
                      frame.add(restar);

                   JButton borrar = new JButton("BORRAR");
                   borrar.setBounds(300,290,80,50);
                   borrar.setVisible(true);
                     frame.add(borrar);

        
                    //ACTION LISTENER
                  suma.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                  String N1T,N2T;
                  Float N1,N2, RES;
                 N1T=T1.getText();
                 N2T=T2.getText();

                 N1=Float.parseFloat(N1T);
                 N2=Float.parseFloat(N2T);

                 RES=N1+N2;

                 res.setText(String.valueOf(RES));
                 }
                 });

                   restar.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                  String N1T,N2T;
                  Float N1,N2, RES;
                 N1T=T1.getText();
                 N2T=T2.getText();

                 N1=Float.parseFloat(N1T);
                 N2=Float.parseFloat(N2T);

                 RES=N1-N2;

                 res.setText(String.valueOf(RES));
                 }
                  });

                  multiplicacion.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                 String N1T,N2T;
                 Float N1,N2, RES;
                 N1T=T1.getText();
                 N2T=T2.getText();

                 N1=Float.parseFloat(N1T);
                 N2=Float.parseFloat(N2T);

                 RES=N1*N2;

                 res.setText(String.valueOf(RES));
                  } 
                  });

                  division.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                 String N1T,N2T;
                 Float N1,N2, RES;
                 N1T=T1.getText();
                 N2T=T2.getText();

                 N1=Float.parseFloat(N1T);
                 N2=Float.parseFloat(N2T);
 
                 RES=N1/N2;

                 res.setText(String.valueOf(RES));
                  }
                 });

                  borrar.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                 T1.setText("");
                 T2.setText("");
                 res.setText("");
                     } 
                 });
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