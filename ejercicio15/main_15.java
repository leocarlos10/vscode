

import javax.swing.JOptionPane;
/*
 * leer 10 enteros ordenados crecientemente. si el arreglo esta ordenado crecientemente Leer
 * N y buscarlo en la tabla. De lo contrario debemos decirle al usuario 
 * que digite la tabla de forma creciente, se debe mostrar la posicion 
 * en que se encuentra el numero, y si no esta indicarlo
 * con un mensaje.
 */

public class main_15 {

    public static void main (String args[]){

        Busqueda_Numeros obj= new Busqueda_Numeros();

        int arreglo[]=new int [obj.getDimension()]; boolean band=false; int n;

        JOptionPane.showMessageDialog(null, "Digite 10 numeros enteros");

        do{
            for(int i=0;i<arreglo.length;i++){
                arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"+(i+1)));
            }

            for(int j=0;j<9;j++){
                if(arreglo[j+1]>arreglo[j]){
                    band=true;
                }
                else if(arreglo[j+1]<arreglo[j]){
                    band=false;
                    break;
                }
               
            }

            if(band==true){
                 n=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                 obj.setNumero(n);
                 obj.busqueda_Numero(arreglo);
            }
            else{
            JOptionPane.showMessageDialog(null,"Porfavor digite la tabla de forma creciente");
            }
        }while(band==false);

    }
    
}
