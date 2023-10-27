package src;

public class Calefaccion {
    
    int l;
    public void encender_apagar_subir_bajar_temperatura(int l){
        this.l = l;
        if(l == 1){
            System.out.println("Enciediendo la calefacción");
        } else if(l == 0){
            System.out.println("Apagando la calefacción");
        } else if(l == 2){
            System.out.println("Subiendo la temperatura de la calefacción");
        } else{
            System.out.println("Bajando la temperatura de la calefacción");
        }
    }

}
