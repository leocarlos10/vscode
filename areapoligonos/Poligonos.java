package areapoligonos;

public abstract class Poligonos {

    protected int numero_lados;

    public Poligonos(int n_l){
        numero_lados=n_l;
    }
   
  @Override     // este metodo se esta sobre escribiendo la clase object 
    public String toString(){

        return "El numero de lados del Poligono es: "+numero_lados;
    }

     public abstract double area();

    
    
    
}
