package ejercicioPOODiplomado;

public class Libro {

    private String autor,titulo;
            int paginas;

    public Libro(String a, String t, int p){
        autor=a; titulo=t;
        paginas=p;
    }

    public String getAutor(){
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getPaginas(){
        return paginas;
    }

    public String mostrar(){
        return "El libro "+titulo+", Del autor "+autor+", tiene "+paginas+" paginas";
    }  
}
