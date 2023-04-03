package ejercicio13;
/*
 * programa realizado con exito
 */

import javax.swing.JOptionPane;

public class main_1 {

    public static void main(String args[]){

        Ubicacion_P_I obj = new Ubicacion_P_I();

        int arreglo[] = new int [obj.getDimension()],contador_p=0, contador_i=0;

        JOptionPane.showMessageDialog(null,"Digite 10 numeros enteros");

        for(int i=0;i<arreglo.length;i++){

            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"+(i+1)));

            if(arreglo[i]%2==0){
                contador_p++;
            }
             else {
                contador_i++;
             }
        }

        int b[] = new int [contador_p];
        int c[] = new int [contador_i];
        
        obj.Ubicar_numeros(arreglo, b, c);
    }
}
