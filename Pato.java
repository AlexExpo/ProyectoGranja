
public class Pato extends Animal
{

    private static final int PESO_BASE_PATOS = 2;
    
    private static final int INCREMENTO_PESO_PATOS = 1;
    
    private static final int DISMINUCION_VIDA_PATOS = 10;
    
    public Pato()
    {
        super(PESO_BASE_PATOS);
    }

    public void comer()
    {
        peso = peso + INCREMENTO_PESO_PATOS;
        puntosDeVida = puntosDeVida - DISMINUCION_VIDA_PATOS;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Cua, cua");
    }
    
}
