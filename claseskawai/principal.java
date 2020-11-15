/*
clase principal para poder realizar instancea de otra clase
que se va a encargar de una calculadora 
coversion de unidades
creacion de cuadros
movimiento de cuadro
*/

public class principal{

    //el metodo principal
    public static void main(String[]args){
        //llamaer metodo
        //invocacion a partir del objeto
        operaciones obj = new operaciones();
        obj.menu();
    }
}