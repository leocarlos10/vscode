package areapoligonos;

public class Rectangulo extends Poligonos {
    
    private double base,altura;

    public Rectangulo( double b, double a){

         super(2); // ya se sabe el n de lados del rectangulo y solo coloco el valor
         base=b; altura=a;
    }

    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
// implementacion del metodo abstracto para el rectangulo
    public double area(){
     
       return base*altura; /*como el area del rectangulo solo es multiplicar
                              ahorramos codigo con solo retornar la multiplicacion. 
                                 */       
    }

    @Override
    public String toString(){    // con el super.toString le estoy diciendo a java que me imprima tambien el metodo de la super clase Poligono
     return " Rectangulo\n "+super.toString()+"\nLa base del rectangulo es: "+getBase()+"\nLa altura del rectangulo es: "+getAltura()+"\n El area del rectangulo es: "+ area();
    }
}
