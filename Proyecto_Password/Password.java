package Proyecto_Password;


public class Password {

    private int longitud;
         String password;

         public Password(){
            longitud=10;
         }

         public Password(int l){
         
            longitud=l;
         }

// en este metodo genero las claves con la ayuda de la tabla ASCII 
// esta es un atabla que te ayuda a convertir numeros a letras ya sea minusculas o mayusculas.

         public String generar(){

            String password="";
    
            for(int i=0;i<longitud;i++){

                int opcion=(int) (Math.random()*3+1);

            switch(opcion){

                case 1: char minusculas= (char) ((int) (Math.random()*(122-97)+97));
                           password+=minusculas;
                           break;
                case 2: char mayusculas= (char) ((int) (Math.random()*(90-65)+65));
                         password+=mayusculas;
                         break;
                default: char numeros=(char) ((int) (Math.random()*(57-48)+48));
                         password+=numeros;
                         break;
            }

        }
        this.password=password;
        return password;

        }
/*
 * el length ayuda a recorrer todos los caracteres del atributo 
 * y el charAt(convierte la cadena en un arreglo para poder recorrer cada caracter )
 * y poder decir si es mayuscula, min, o numero 
 */
        public void validar(){
           int minusculas=0,mayusculas=0,numeros=0;
          

           for(int i=0;i<password.length();i++){

             if(password.charAt(i)>=97 && password.charAt(i)<=122 ){
                minusculas++;

             }
             else if(password.charAt(i)>=65 && password.charAt(i)<=90) {
                mayusculas++;
             } 
             else{
                numeros++;
             }
             
           }

            if(numeros>=5 && minusculas>=1 && mayusculas>=2){

                System.out.println("Este es una clave segura "+generar());
                

            }

         }

        }
