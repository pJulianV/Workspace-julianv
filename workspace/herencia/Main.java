import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema");

        Animal objAnimal = new Animal();
        Animal objPerro = new Perro();
        Animal objGato = new Gato();

        objAnimal.hacerSonido();
        objPerro.hacerSonido();
        objGato.hacerSonido();
        
        /*
        -crear en animal el atributo peso;
        -crear un metodo en la clase general q reciba un num y lo incremente al peso actual.
        -crear un metado en clase general que imprima el peso.

        */

        // objAnimal.incremetarPeso(10);
        // objAnimal.incremetarPeso(3);
        // objAnimal.mostrarPeso()

        // objPerro.incremetarPeso(10);
        // objPerro.incremetarPeso(3);
        // objPerro.mostrarPeso()
        
        // objGato.incremetarPeso(10);
        // objGato.incremetarPeso(3);
        // objGato.mostrarPeso()

        for( int v=0; v <= 50; v = v + 4 )
        {
            objGato.incremetarPeso(v);
        }
        

        
    }


}