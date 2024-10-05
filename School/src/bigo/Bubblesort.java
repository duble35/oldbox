package bigo;

public class Bubblesort {
        
    public static void main(String[] args){
        
        int[] numeros = {8,9,3,5,1};
        int aux=0;
        int i;
        int j;
        
        for(i = 0; i<5; i++){
            for(j=0;j<4;j++){
                if(numeros[j]>numeros[j+1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        
        for(i=0;i<5;i++){
            System.out.print(" "+numeros[i]);
        }
            
    }
    
}
