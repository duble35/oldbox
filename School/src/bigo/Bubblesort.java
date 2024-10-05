package bigo;

public class Bubblesort {
        
    public static void main(String[] args){
        
        int[] numeros = {1,6,7,4,8,10};
        int aux=0;
        int i;
        int j;
        
        for(i = 0; i<numeros.length; i++){
            for(j=0;j<numeros.length-1;j++){
                if(numeros[j]>numeros[j+1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        
        for(i=0;i<numeros.length;i++){
            System.out.print(" "+numeros[i]);
        }
            
    }
    
}
