package clase_mejorada_areapoligonos;
import java.util.ArrayList;
import java.util.List;
import areapoligonos.*;
import javax.swing.JOptionPane;
/*
 * esta es un aoptimizacion del proyecto de areapoligonos 
 * en este proyecto utilizo un arrayList para almacenar los objetos y 
 * simplemente utilizo las clases que ya tenia como especie de una mini libreria.
 * 
 */

public class main_p {

    static List<Poligonos> figura = new ArrayList<>();

    public static void carga_datos(int i,int j){

        String tipo_figura; boolean band=false;
        do{
         tipo_figura=JOptionPane.showInputDialog("""
            Ingrese que tipo de figura quiere ingresar
            t: para triangulo.
            r: para rectangulos.
               """);
               if(tipo_figura.equalsIgnoreCase("t") || tipo_figura.equalsIgnoreCase("r") ){
                 band=true;
               }
        }while(band==false );

     if (tipo_figura.equalsIgnoreCase("t")){
        boolean band1=false;  double base,lado2,lado3;
        do{

         base =Double.parseDouble(JOptionPane.showInputDialog("Digite el lado1 del triangulo "+(i)));
         lado2 =Double.parseDouble(JOptionPane.showInputDialog("Digite el lado 2 del triangulo "+(i)));
         lado3 =Double.parseDouble(JOptionPane.showInputDialog("Digite el lado 3 del triangulo "+(i)));

         if( base>=0 && lado2>=0 && lado3>=0){
                band1=true;
         }
           else{
            JOptionPane.showMessageDialog(null,"Porfavor, ingrese solo numeros positivos");
            }
        }while(band1==false);

        figura.add(new Triangulo(base, lado2, lado3));

      }
      else if(tipo_figura.equalsIgnoreCase("r")){
        boolean band2=false;  double base,altura;
        do{
        
         base =Double.parseDouble(JOptionPane.showInputDialog("Digite la base del rectangulo "+(j)));
         altura =Double.parseDouble(JOptionPane.showInputDialog("Digite la altura del rectangulo "+(j)));
         if( base>=0 && altura>=0 ){
            band2=true;
          }
           else{
            JOptionPane.showMessageDialog(null,"Porfavor, ingrese solo numeros positivos");
           }
        }while(band2==false);

        figura.add(new Rectangulo(base, altura));

     }
    }

    public static void main(String[] args) {
    String x=""; int i=1; int j=1;
    do{
        carga_datos(i, j);
        
        x=JOptionPane.showInputDialog( "Desea seguir agregando triangulos ?"+
        """
           digite s:para seguir agregando.
           digite n:para finalizar el proceso.
    """);
    }while(x.equalsIgnoreCase("s"));
 
    for(int h=0;h<figura.size();h++){

        JOptionPane.showMessageDialog(null, "figura"+h+1+"\n"+figura.get(h).toString());
       
        }
    }
}
