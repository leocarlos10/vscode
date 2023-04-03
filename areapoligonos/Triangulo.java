package areapoligonos;

public class Triangulo extends Poligonos {
    
    private double base,lado2,lado3;

    public Triangulo(  double b, double l2,double l3){
   
        super(3);// ya se sabe el n de lados del triangulo y solo coloco el valor
         base=b; lado2=l2; lado3=l3;  

    }

    public double getBase(){
         return base;
    }

    public double getLado2(){
         return lado2;
    }

    public double getLado3(){
        return lado3;
    }

   
    public double area(){  // utilizo el metodo de heron para hallar el area cuando se coconocen los 3 lados del triangulo

        double p=(base+lado2+lado3) /2;

         return Math.sqrt(p*(p-base)*(p-lado2)*(p-lado3));// aplico lo mismo que en el metodo area de la clase rectangulo.
    }

    @Override
    public String toString(){   // con el super.toString le estoy diciendo a java que me imprima tambien el metodo de la super clase Poligono
        return "Triangulo\n "+super.toString()+"\nlado 1: "+getBase()+"\nLado 2: "+getLado2()+"\nLado 3: "+getLado3()+"\nEl area del triangulo es: "+area(); 
    }

}
