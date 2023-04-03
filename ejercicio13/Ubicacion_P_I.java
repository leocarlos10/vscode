package ejercicio13;

public class Ubicacion_P_I {

    private int dimension;

    public Ubicacion_P_I(){
        dimension=10;
    }

    public int getDimension(){
        return dimension;
    }

    public void Ubicar_numeros(int a[],int b[], int c[]){

        int j=0,h=0;

        for(int i=0;i<getDimension();i++){

            if(a[i]%2==0){
                b[j]=a[i];
                j++;
            }
            else {
                c[h]=a[i];
                h++;
            }
        }

        System.out.println("Los numeros pares son:");

        for(int i:b){
            System.out.print(i+",");
        }

        System.out.println("");
        System.out.println("Los numeros impares son:");

        for(int e:c){
            System.out.print(e+",");
        }
    }
}
