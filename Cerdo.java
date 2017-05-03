

public class Cerdo extends Animal implements Vacuna
{

    private static final int PESO_BASE_CERDOS = 15;
    
    private static final int INCREMENTO_VIDA_VACUNA_CERDOS = 20;
    
    private static final int INCREMENTO_PESO_CERDOS = 2;
    
    private static final int DISMINUCION_VIDA_CERDOS = 10;

    public Cerdo()
    {
        super(PESO_BASE_CERDOS);
    }

    public void comer()
    {
        peso = peso + INCREMENTO_PESO_CERDOS;
        puntosDeVida = puntosDeVida - DISMINUCION_VIDA_CERDOS;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Ñoinq, ñoinq");
    }
    
    public void vacunar()
    {
        puntosDeVida = puntosDeVida + INCREMENTO_VIDA_VACUNA_CERDOS;
    }
    
}
