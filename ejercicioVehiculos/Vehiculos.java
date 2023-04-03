package ejercicioVehiculos;

public class Vehiculos {
    private String marca,modelo; float precio;

    public Vehiculos( String marca,String modelo,Float precio){
      
        this.marca=marca; this.modelo=modelo; this.precio=precio;

    }

    public float getPrecio(){

        return(precio);

    }


    public String mostrarDatos(){

        return ("Marca"+marca+"\nModelo"+modelo+"\nPrecio"+precio+"\n");

    }

    
}
