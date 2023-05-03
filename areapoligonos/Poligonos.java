package areapoligonos;

/*
 * ejemplo de una clase abstracta
 */
public abstract class Poligonos {

    protected int numero_lados;

    public Poligonos(int n_l){
        numero_lados=n_l;
    }
   
  @Override     // este metodo se esta sobre escribiendo la clase object 
    public String toString(){

        return "El numero de lados del Poligono es: "+numero_lados;
    }
/*
 * un poligono esta compuesto por muchas figuras y por si solo no se le puede hallar el area.
 * por lo tanto este es un metodo abstracto significa que no tiene implementacion 
 * ahora cada subclase que herede de esta debera implementar este metodo
 */
     public abstract double area(); 

    
    
    
}
