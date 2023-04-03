package ejercicio5POO;

public class Triangulo_Isoceles {
    
    private double base,lado;

    public Triangulo_Isoceles(double b, double l){
        base=b; lado=l; 
    }

    public double getBase(){
        return base;
    }

    public double getLado(){
        return lado;
    }

    public double calcPerimetro(){

        double p=0;

        p=getBase()+(getLado()*2);

        return p;
    }

    public double calcArea(){
        double r=0; double b=0; double a=0;

        r= (Math.pow(getBase(), 2))-(Math.pow(getLado(), 2));
       
        b =  Math.sqrt(r);

        a=(getBase()*b)/2;

        return a;
    }


   

}
