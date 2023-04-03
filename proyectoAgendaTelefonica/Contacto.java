

public class Contacto {

    private String nombre;
             Long numero;

   
    public  Contacto(String n, Long nu){

        nombre=n; numero=nu;

    }

    public String getNombre(){
        return nombre;
    }
    
    public Long getNumero(){
        return numero;
    }
    
}
