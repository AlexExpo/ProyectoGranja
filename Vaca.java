

public class Vaca extends Animal implements Vacuna
{

    private static final int PESO_BASE_VACAS = 25;
    
    private static final int INCREMENTO_VIDA_VACUNA_VACAS = 30;
    
    private static final int INCREMENTO_PESO_VACAS = 2;
    
    private static final int DISMINUCION_VIDA_VACAS = 10;
    
    public Vaca()
    {
        super(PESO_BASE_VACAS);
    }

    public void comer()
    {
        peso = peso + INCREMENTO_PESO_VACAS;
        puntosDeVida = puntosDeVida - DISMINUCION_VIDA_VACAS;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Muuuu, muuuu");
    }
    
    public void vacunar()
    {
        puntosDeVida = puntosDeVida + INCREMENTO_VIDA_VACUNA_VACAS;
    }
    
}
