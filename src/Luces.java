package src;

public class Luces{
    int n;
    public void encender_apagar_Luces(int n){
        this.n = n;
        if(n == 0){
            System.out.println("Apagando las luces");
        }else{if(n == 1){
            System.out.println("Encendiendo las luces");
            
        }else{
            System.out.println("Cambiando la intensidad de las luces"); 
        }
        }
        
    }

}
