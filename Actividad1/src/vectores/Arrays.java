package vectores;
import javax.swing.*;
public class Arrays {
	
	int[] matriz;
    
    public Arrays(int numero) {
        
        matriz=new int[numero];
        
        for(int i=0;i<numero;i++){
            
            int valor=Integer.parseInt(JOptionPane.showInputDialog("Introduce valor"));
            matriz[i]=valor;
        }
    }
    
    public void getDatosArray() {
        
        System.out.println("Los valores de la matriz son: ");
        
        for(int j=0;j<matriz.length;j++){
            
            System.out.print(matriz[j] + "; ");
        }
    
    }
}
