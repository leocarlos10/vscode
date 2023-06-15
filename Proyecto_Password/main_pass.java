
package Proyecto_Password;
     
import javax.swing.JOptionPane;

public class main_pass {
    
    public static void main(String args[]){

        int n_claves=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de claves que desea crear"));
        String tamaño_longitud=JOptionPane.showInputDialog("Desea cambiar el tamaño de la clave\n"
                                                            +"si\n"
                                                            +"no"); 
                                                    
        int tamaño_clave=0;                                         
        if(tamaño_longitud.equals("si")){
            tamaño_clave=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de la clave"));
        }                                           
      
        Password clave;

        for(int i=0; i<n_claves;i++){

            if(tamaño_longitud.equals("si")){

                clave= new Password(tamaño_clave);
                clave.generar();
                clave.validar();
               
            }
             else if(tamaño_longitud.equals("no")){
                clave = new Password();
                clave.generar();
                clave.validar();
               
             }  
        } 
    }
}
