package ejercicio5POO;

import javax.swing.JOptionPane;

public class main_5 {

    public static void main (String args[]){

        int cantidad_Tr=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de triangulos que va a ingresar"));
        
        Triangulo_Isoceles triangulo[] = new Triangulo_Isoceles[cantidad_Tr];

        for(int i=0;i<triangulo.length;i++){

         JOptionPane.showMessageDialog(null,"Digite las caracteristicas del triangulo "+(i+1));

        double l=Double.parseDouble(JOptionPane.showInputDialog("Digite un lado del triangulo isoceles"));
        double b=Double.parseDouble(JOptionPane.showInputDialog("Digite la base del triangulo isoceles"));
             
             triangulo[i]= new Triangulo_Isoceles(b,l);

             JOptionPane.showMessageDialog(null, "El Perimitro del triangulo es: "+triangulo[i].calcPerimetro());
             JOptionPane.showMessageDialog(null, "El area del triangulo es: "+triangulo[i].calcArea());
        }
           
        
        JOptionPane.showMessageDialog(null,"El triangulo con mayor superficie es de \n"+Triangulo_M_Superficie(triangulo));
        
       
    }

    public static double Triangulo_M_Superficie( Triangulo_Isoceles triangulo[]){
         
                double area; 

                area=triangulo[0].calcArea();

            for(int i=1;i<triangulo.length;i++){

                if(triangulo[i].calcArea()>area){

                    area=triangulo[i].calcArea();
                   
                }

            }

            return area;

    }
    
}
