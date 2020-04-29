
package tp8;


public class Matriz {
    
    
    public void armar(){
        int arreglo[][] = new int[4][];
        
        arreglo[0] = new int [4];
        arreglo[1] = new int [3];
        arreglo[2] = new int [5];
        arreglo[3] = new int [2];
        
        int numero = 0;
        
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo[i].length; j++){
                numero+= 3;
                arreglo[i][j] = numero;
            }
        }
        
        
        
           for(int i = 0; i < arreglo.length; i++){
               System.out.print("Para la fila " + i + " los valores pares son: ");
            for(int j = 0; j < arreglo[i].length; j++){
                if(arreglo[i][j] % 2 == 0){
                    System.out.print(arreglo[i][j] + " ");
                }
            }
               System.out.println("");
        }
    }
    
    
    
}
