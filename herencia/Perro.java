public class Perro extends Animal {

    public Perro()
    {
    }

    public void hacerSonido()
    {
        // Un perro hace "Guau" o similar.
        System.out.println("Proceso de sonido del perro......");
    }
    public void incremetarPeso(int p)
    {
        super.incremetarPeso(p + 1)
        super.mostrarPeso()
    }
}