public class InfoGato{
    
    private String nom1, nom2;
    private int victoria=0; 
    private int x, y;
    private char ganador;
    private int contador=0;
    //primero un constructor
    public InfoGato(){

    }

    //ahora criterios del constructor
    public InfoGato(String nom1, String nom2, int victoria, int x, int y, char ganador, int contador){

        this.nom1 = nom1;
        this.nom2 = nom2;
        this.x = x;
        this.y = y;
        this.victoria= victoria;
        this.ganador = ganador;
        this.contador = contador;
        
        
    }
    // ahoragetters y setters 
    public String getNom1(){
        return nom1;
    }
    
    public void setNom1(String nom1){
        this.nom1 = nom1;


    }

    public String getNom2(){
        return nom2;
    }
    
    public void setNom2(String nom2){
        this.nom2 = nom2;


    }


    public int getVictoria(){
        return victoria;
    }
    
    public void setVictoria(int victoria){
        this.victoria = victoria;


    }

    public int getX(){
        return x;
    }
    
    public void setX(int x){
        this.x = x;


    }

    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y = y;


    }

    public int getContador(){
        return victoria;
    }
    
    public void setContador(int contador){
        this.contador = contador;


    }

    public char getGanador(){
        return ganador;
    }
    
    public void setGanador(char ganador){
        this.ganador = ganador;


    }



    







}