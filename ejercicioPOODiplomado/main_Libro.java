package ejercicioPOODiplomado;

import javax.swing.JOptionPane;

public class main_Libro {
 
// este metodo compara las paginas de todos los objetos de tipo libro y returna el titulo del libro con 
// mayor paginas 
    public static String Comparar_libro(Libro libro[], int d){

       int libro_mayor_paginas=libro[0].getPaginas();
       String titulo="";
       for(int i=1;i<d;i++){

            if(libro_mayor_paginas<libro[i].getPaginas()){
                
                 titulo=libro[i].getTitulo();
            }
        }
        
        return titulo;
    }

    public static void main(String args[]){

        int dimension=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos libros desea ingresar"));

        Libro libro[]=new Libro[dimension];

        for(int i=0;i<libro.length;i++){
            JOptionPane.showMessageDialog(null,"Digite las caracteristicas del libro "+(i+1));

            String autor =JOptionPane.showInputDialog("Digite el autor del libro "+(i+1));
            String titulo= JOptionPane.showInputDialog("Digite el titulo del libro "+(i+1));
            int paginas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de paginas que tiene el libro "+(i+1)));

            libro[i]=new Libro(autor, titulo, paginas);

            JOptionPane.showMessageDialog(null, " las caracteristicas del libro "+(i+1)+" "+libro[i].mostrar());
            
        }

        JOptionPane.showMessageDialog(null,"El titulo del libro con mayor paginas es: "+Comparar_libro(libro,dimension));

    }
    
}
