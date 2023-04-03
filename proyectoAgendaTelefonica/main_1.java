

import javax.swing.JOptionPane;

public class main_1 {

    public static void main(String args[]){

        int dimension=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos contactos va a ingresar"));

       Agenda obj=new Agenda();
       Contacto contactos[]=new Contacto[dimension];

       for(int i=0;i<contactos.length;i++){
      
       String nombre=JOptionPane.showInputDialog("digite el nombre del "+(i+1)+" contacto");
       Long numero=Long.parseLong(JOptionPane.showInputDialog("Digite el numero del "+(i+1)+" contacto"));

          contactos[i]=new Contacto(nombre, numero);
       }

       String nombre_b=JOptionPane.showInputDialog("Digite el nombre que desea buscar en la Agenda");
      
      obj.registar_cont(contactos,dimension);
      obj.listar_contactos(); 
      obj.Busqueda_cont(nombre_b,dimension);
      obj.Disponible(dimension);




    }
    
}
