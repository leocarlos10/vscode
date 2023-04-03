

import javax.swing.JOptionPane;

public class Busqueda_Numeros {

    private int dimension,numero;

    public Busqueda_Numeros(){
        dimension=10; numero=0;
    }

    public int getDimension(){
        return dimension;
    }

    public void setNumero(int n){
        numero=n;
    }

    public int getNumero(){
        return numero;
    }

    public void busqueda_Numero(int a[]){

        boolean band=false;

        for(int i=0;i<a.length;i++){
            if(a[i]==getNumero()){
                JOptionPane.showMessageDialog(null, "El numero se ha encontrado en la posicion "+i);
                band=true;
            }
        }

        if(band==false){
            JOptionPane.showMessageDialog(null, "El numero que usted a digitado no se encuentra en la tabla");
        }

    }
    
}
