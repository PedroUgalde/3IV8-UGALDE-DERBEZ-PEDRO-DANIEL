import java.util.Scanner;
public class DatosGato  extends InfoGato{
    private char[][] gato = new char[3][3];
    private String nom1, nom2;
    private int victoria=0; 
    private int x, y;
    private char ganador;
    private int contador=0;
    //primero un constructor
    InfoGato gat = new InfoGato();

    
    
    Scanner entrada = new Scanner(System.in);
    // aqui es donde se ejecutara todos los metodos


   
    public void jugar(){
        System.out.println("\n\n\n");
        // reiniciar llena el array de gato des espacios en blanco para que el tablero este en blanco
        reiniciar();  
        //pedir nombres de los jugadores
        System.out.println("Para tirar solo escribe las coordenadas (x,y) de la casilla que quieres");      
        System.out.println("(o) Nombre de Jugador 1: ");
        nom1=entrada.nextLine();
        System.out.println("(x) Nombre de Jugador 2: ");
        nom2=entrada.nextLine();
        System.out.println("\n\n\n");
        //imprime el tablero
        tablero(); 
        //deja que los jugadores tiren
        tirar();       
        //confirma victorias o empates 
        if(ganador=='o'){
            System.out.println("\n\n");
            System.out.println("GANA "+ nom1);
            System.out.println("\n\n");
        }
        if(ganador=='x'){
            System.out.println("\n\n");
            System.out.println("GANA "+ nom2);
            System.out.println("\n\n");
        }
        if(contador==9){
            System.out.println("\n\n");
            System.out.println("EMPATE, sean panas "+nom1+" y "+nom2+" :)");
            System.out.println("\n\n");
        }

    }

   
    public void tirar(){
        do{
            // pide las coordenadas donde el jugador 1 va a tirar
            System.out.println("Tira "+ nom1);
            System.out.println("x: ");
            x=entrada.nextInt();
            System.out.println("y: ");
            y=entrada.nextInt();
            
            //este while confirma que la casilla que se seleccione no tenga algo
            while((gato[y-1][x-1]=='o')||(gato[y-1][x-1]=='x')){
                System.out.println("Esa casilla ya esta ocupada");
                System.out.println("x: ");
                x=entrada.nextInt();
                System.out.println("y: ");
                y=entrada.nextInt();
            }

            //una vez que se confirma la casilla vacia aqui se le pone la o
            gato[y-1][x-1]='o'; 
            
            //imprimir tablero para que el jugador vea su tiro
            tablero();
            //revisa que el jugador no haya ganado
            confirmar();
            //contador que si llega a nueve sabra que los jugadores empataron 
            contador++;
            if(contador==9){
                //si llega a nueve se sale del while y por lo tanto del metodo tirar
                break;
            }
            // victoria al ser 1 confirma que alguien ya gano entonces se sale del while y de tirar
            if(victoria==1){
                break;
            }
             // aqui se repite todo lo que pasa el jugador 1 pero con el jugador 2
            System.out.println("Tira "+nom2);
            System.out.println("x: ");
            x=entrada.nextInt();
            System.out.println("y: ");
            y=entrada.nextInt();

            while((gato[y-1][x-1]=='o')||(gato[y-1][x-1]=='x')){
                System.out.println("Esa casilla ya esta ocupada");
                System.out.println("x: ");
                x=entrada.nextInt();
                System.out.println("y: ");
                y=entrada.nextInt();
            }

            gato[y-1][x-1]='x';
            tablero();
            confirmar();
            contador++;

            if(contador==9){
                break;
            }
        }while(victoria!=1);


        
    }

    // metodo para revisar los tipo de victoria que hay, solo hay 8
    public void confirmar(){
        if((gato[0][0]==gato[0][1])&&(gato[0][0]==gato[0][2])&&(gato[0][0]!=' ')){
            //si encuentra alguna victoria la variable ganador agarra el simbolo del ganador 'o' o 'x'
            //para confirmar quien gano
            ganador=gato[0][0];
            //es lo que tomara tirar para salir del while si hay una victoria
            victoria=1;            
            
        }

        if((gato[1][0]==gato[1][1])&&(gato[1][0]==gato[1][2])&&(gato[1][0]!=' ')){
            ganador=gato[1][0];
            victoria=1;
        }

        if((gato[2][0]==gato[2][1])&&(gato[2][0]==gato[2][2])&&(gato[2][0]!=' ')){
            ganador=gato[2][0];
            victoria=1;
        }

        if((gato[0][0]==gato[1][0])&&(gato[0][0]==gato[2][0])&&(gato[0][0]!=' ')){
            ganador=gato[0][0];
            victoria=1;
        }

        if((gato[0][1]==gato[1][1])&&(gato[0][1]==gato[2][1])&&(gato[0][1]!=' ')){
            ganador=gato[0][1];
            victoria=1;
        }

        if((gato[0][2]==gato[1][2])&&(gato[0][2]==gato[2][2])&&(gato[0][2]!=' ')){
            ganador=gato[0][2];
            victoria=1;
        }

        if((gato[0][0]==gato[1][1])&&(gato[0][0]==gato[2][2])&&(gato[0][0]!=' ')){
            ganador=gato[0][0];
            victoria=1;
        }

        if((gato[2][0]==gato[1][1])&&(gato[2][0]==gato[0][2])&&(gato[2][0]!=' ')){
            ganador=gato[2][0];
            victoria=1;
        }
    }
    // metodo que limpia el tablero para que inicie en blanco :)    
    public void reiniciar(){
        for(int i=0; i<3; i++){
            for(int a=0; a<3; a++){
                gato[i][a] = ' ';
            }
        }
    }

    //este metodo imprime el tablero
    public void tablero(){
        System.out.println("           X      ");
        System.out.println("     1     2     3");
        System.out.println("        |     |");
        //imprimir primera fila
        System.out.println("  1  "+gato[0][0]+"  |  "+gato[0][1]+"  |  "+gato[0][2]+"  ");
        System.out.println("   _____|_____|_____");
        System.out.println("        |     |");
        //imprimir segunda fila
        System.out.println("Y 2  "+gato[1][0]+"  |  "+gato[1][1]+"  |  "+gato[1][2]+"  ");
        System.out.println("   _____|_____|_____");
        System.out.println("        |     |");
        //imprimir tercera fila
        System.out.println("  3  "+gato[2][0]+"  |  "+gato[2][1]+"  |  "+gato[2][2]+"  ");
        System.out.println("        |     |");
    }
}