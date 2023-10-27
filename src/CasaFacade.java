package src;

public class CasaFacade {
    private static Lavavajillas lav = new Lavavajillas();
    private static Lavadora dora = new Lavadora();
    private static Luces luz = new Luces();
    private static Calefaccion cal = new Calefaccion();

    public void start()  {
        System.out.println("Encendiendo la casa...");
        cal.encender_apagar_subir_bajar_temperatura(1);
        lav.encender_apagar_Lavavajillas(1);
        luz.encender_apagar_Luces(1);
        dora.encender_apagar_pausar_lavadora(1);
        System.out.println("Pausando / cambiando electrodomésticos, subiendo/bajando temperatura y luces (intensidad) en la casa...");
        luz.encender_apagar_Luces(2);
        lav.encender_apagar_Lavavajillas(2);
        cal.encender_apagar_subir_bajar_temperatura(2);
        cal.encender_apagar_subir_bajar_temperatura(3);
        dora.encender_apagar_pausar_lavadora(2);
        System.out.println("Apagando la casa...");
        luz.encender_apagar_Luces(0);
        lav.encender_apagar_Lavavajillas(0);
        cal.encender_apagar_subir_bajar_temperatura(0);
        dora.encender_apagar_pausar_lavadora(0);
        System.out.println("Todo funciona estupendamente");

    }
}
