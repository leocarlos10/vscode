package ejercicioVehiculos;

import javax.swing.JOptionPane;

public class main_ATS {

    public static int IndiceCocheM_Barato( Vehiculos coche[]){

        float precio; int Indice=0;

        precio=coche[0].getPrecio();
        for(int i=1;i<coche.length;i++){

            if(coche[i].getPrecio()<precio){

              precio=coche[i].getPrecio();
              Indice=i;

            }
            
        }

        return Indice;
    }

    public static void main (String[] args) {

        int indice_barato;
        int c_vehiculos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de vehiculos"));

        Vehiculos coche [] = new Vehiculos[c_vehiculos];

        for(int i=0;i<coche.length;i++){

           JOptionPane.showMessageDialog(null,"Digite las caracteristicas del coche "+(i+1)+":");

          String marca=JOptionPane.showInputDialog("Digite la marca del coche");
          String modelo=JOptionPane.showInputDialog("Digite el modelo del coche");
          float precio=Integer.parseInt(JOptionPane.showInputDialog("Digite l precio del coche"));

           coche[i]= new Vehiculos(marca,modelo,precio);

        }


       indice_barato=IndiceCocheM_Barato(coche);
       JOptionPane.showMessageDialog(null,"El coche mas barato es\n:"+coche[indice_barato].mostrarDatos());
        
    }


}