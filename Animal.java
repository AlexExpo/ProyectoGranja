
public abstract class Animal
{

    protected int puntosDeVida;
    
    protected int peso;
    
    private static final int PUNTOS_DE_VIDA_BASE = 100;
    
    public Animal(int peso)
    {
        this.puntosDeVida = PUNTOS_DE_VIDA_BASE;
        this.peso = peso;
    }

    abstract void comer();
    
    abstract void emitirSonidoCaracteristico();
    
    public int getPeso()
    {
        return peso;
    }
    
    public int getPuntosDeVida()
    {
        return puntosDeVida;
    }
    
}
