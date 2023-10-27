package src;

public class Lavavajillas{
    int n;
    public void encender_apagar_Lavavajillas(int n){
        this.n = n;
        if(n == 0){
            System.out.println("Apagando Lavavajillas");
        }else{if(n == 1){
            System.out.println("Encendiendo el lavavajillas");
        }else{
            System.out.println("Pausando el lavavajillas");
        }
        }
    }
}