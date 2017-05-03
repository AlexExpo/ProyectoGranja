

public class Granja
{

    public Granja()
    {
    }

    public void alimentar(Animal animalAAlimentar)
    {
        animalAAlimentar.comer();
    }
    
    public void vacunar(Vacuna animalAVacunar)
    {
        animalAVacunar.vacunar();
    }
    
    public void hacerEmitirSonidoCaracterístico(Animal animalParaEscucharSonido)
    {
        animalParaEscucharSonido.emitirSonidoCaracteristico();
    }
    
}
