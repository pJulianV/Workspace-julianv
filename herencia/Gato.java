public class Gato extends Animal {

    public Gato()
    {
    }

    public void hacerSonido()
    {
        System.out.println("Proceso de sonido del gato......");
    }
    public void incremetarPeso(int p)
    {
        this.peso  = this.peso + p;
    }
}