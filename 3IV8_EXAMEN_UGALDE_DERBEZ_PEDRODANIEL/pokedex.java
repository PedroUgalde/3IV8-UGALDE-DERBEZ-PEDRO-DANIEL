import java.util.Scanner;

class pokedex{
    /*realizae menu que haga area o perimetro de las siguientes figuras
    cuadrado triangulo o circulo*/


    /* ahora quiero que se repita el programa para volver a calcular otra área*/

    public static void main(String[] args){

        //instancea del objeto
        Scanner entrada = new Scanner(System.in);

        int opcion, prin, com, uno, vs; 
        Double atk, def, sec;
        Double vid=1.0;
        //variables
        System.out.println("Examen Ugalde Derbez Pedro daniel 3IV8");
        System.out.println("pokedex, eliga el numero del pokemon que quiera llevar a combate");
        System.out.println("1.bulbasaur");
        System.out.println("2. squirtle");
        System.out.println("3. charmander");
        
        System.out.println("4. combatir");

        opcion = entrada.nextInt();

        switch(opcion){

            case 1:
            System.out.println("NO.1 bulbasaur, 10atk 20def 300vid latigo sepa pot2   tackleada pot1 ");
            
            break;
    

            case 2:
            System.out.println("NO.2 squirtle, 20atk 10def 300vid pistola de agua pot2   cabezaso pot1 ");
            
            
            break;

           
    
            case 3:
            System.out.println("NO.3 charmander, 30atk 10def 100vid fuego pot2   arañazo pot1 ");
            
            System.out.println("1=volver al menu");
            opcion = entrada.nextInt();
            break;

            case 4:
             System.out.println("eliga con su respectivo numero al pokemon con el que quiera pelear");
             System.out.println("1.bulbasaur");
             System.out.println("2. squirtle");
             System.out.println("3. charmander"); 
             prin = entrada.nextInt();
             

             switch(prin){

                case 1:
                  int op = (int)(Math.random()*1+1);
                   if (op==1){
                  System.out.println("su oponente es squirtle");


                  }else{System.out.println("su oponente es charmander");
                   }

                 System.out.println("a combatir");
                 System.out.println("eliga uno de sus dos ataques disponibles picando 1 o 2");
                 vs= entrada.nextInt();
                  switch(vs){
                      case 1:
                         
                      System.out.println("latigo");
                      uno = (10*20*2)/3;
                      vid = vid-uno;
                      while(vid == 0){
                      System.out.println("el oponente a recibido: "+vid+" de daño");
                      
                     }  
                     System.out.println("has ganado"); 
                     break;

                     case 2:
                     System.out.println("cabezaso");
                      uno = (10*20)/3;
                      vid = vid-uno;
                      while(vid == 0){
                      System.out.println("el oponente a recibido: "+vid+" de daño");
                      
                     }  
                     System.out.println("has ganado");
                     break;
                    }



         }


                

                
                
               
                
             



            



        }

    }            
 }

        

