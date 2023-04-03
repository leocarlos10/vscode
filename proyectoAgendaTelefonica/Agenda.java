import javax.swing.JOptionPane;

public class Agenda{

    private Contacto agenda[]=new Contacto[10];  

    

    public void registar_cont(Contacto contacto[],int d){

        for(int i=0;i<d;i++){

            agenda[i]=contacto[i];

        }
    }


     public void listar_contactos(){

       for(int i=0;i<agenda.length && agenda[i] != null;i++){

        System.out.println("Nombre: "+agenda[i].getNombre()+" Numero: "+agenda[i].getNumero()); 

       }
    }


    public void Busqueda_cont (String n, int d){

        Long num=0l;
  
        for(int i=0; i<d; i++){
            if(agenda[i].getNombre().equals(n)){

             num=agenda[i].getNumero();
            }
         } 
         
         JOptionPane.showMessageDialog(null,"El numero del contacto solicitado es: "+num);
       }

    
    public void Disponible(int d){

       int  disponibles=10-d;
        
        JOptionPane.showMessageDialog(null,"Espacios Disponibles: "+disponibles);
        
    }  
}
