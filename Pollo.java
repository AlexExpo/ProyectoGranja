

public class Pollo extends Animal implements Vacuna
{

    private static final int PESO_BASE_POLLOS = 1;
    
    private static final int INCREMENTO_VIDA_VACUNA_POLLOS = 10;
    
    private static final int INCREMENTO_PESO_POLLOS = 1;
    
    private static final int DISMINUCION_VIDA_POLLOS = 10;
    
    public Pollo()
    {
        super(PESO_BASE_POLLOS);
    }

    public void comer()
    {
        peso = peso + INCREMENTO_PESO_POLLOS;
        puntosDeVida = puntosDeVida - DISMINUCION_VIDA_POLLOS;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Pio, pio");
    }
    
    public void vacunar()
    {
        puntosDeVida = puntosDeVida + INCREMENTO_VIDA_VACUNA_POLLOS;
    }
    
}
