package areapoligonos;

import javax.swing.JOptionPane;
/*
utilizando la clase abstracta poligono 
y con la ayuda del polimorfismo pudes instanciar un 
objeto de tipo poligono de la clase rectangulo o de la clase triangulo
*/ 
public class main_po {

    public static void main(String args[]){

        int dimension=Integer.parseInt(JOptionPane.showInputDialog("Cuantas figuras(triangulos o rectangulos) desea ingresar"));
        
            Poligonos figuras[] =new Poligonos[dimension];  // este arreglo es el que va a guardar los rectangulos y los triangulos

        for(int i=0;i<figuras.length;i++){
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

             base =Double.parseDouble(JOptionPane.showInputDialog("Digite el lado1 del triangulo "+(i+1)));
             lado2 =Double.parseDouble(JOptionPane.showInputDialog("Digite el lado 2 del triangulo "+(i+1)));
             lado3 =Double.parseDouble(JOptionPane.showInputDialog("Digite el lado 3 del triangulo "+(i+1)));

             if( base>=0 && lado2>=0 && lado3>=0){
                    band1=true;
             }
               else{
                JOptionPane.showMessageDialog(null,"Porfavor, ingrese solo numeros positivos");
                }
            }while(band1==false);

            figuras[i] = new Triangulo( base, lado2, lado3); // gracias al polimorfismo puedo hacer que este obj sea de tipo triangulo.

          }
          else if(tipo_figura.equalsIgnoreCase("r")){
            boolean band2=false;  double base,altura;
            int j=1; // este j ayuda a saber el numero del rectangulo por el que va.
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

            figuras[i]= new Rectangulo(base, altura); // gracias al polimorfismo puedo hacer que este obj sea de tipo rectangulo.
            j++; // aumento en 1 en caso de que halla mas de 1 rectangulo
         }
       }
// este for recorre el vector mostrando los datos
        for(int i=0;i<figuras.length;i++){

              figuras[i].area();
              JOptionPane.showMessageDialog(null,"Figura"+(i+1)+"\n"+figuras[i].toString());              
        }
    } 
}
