// '''
// Un animal es un ser vivo que puede desplazarse de un lugar a otro. Este tipo de organismo se
// caracteriza además por diversas características que son compartidas por la mayoría de los animales.
// Los animales ingieren alimentos, desarrollan una reproducción de tipo sexual (mayoría de los casos)
// y absorben oxígeno a través de la respiración. Sin embargo, los animales también tienen
// características que los hace diferentes entre sí.
// Existe una variedad de grupos y clasificación de los animales. En este caso, para nuestro ejercicio
// académico, nos centraremos en la clasificación de animales domésticos y salvajes. Los animales
// domésticos son aquellos que los humanos hemos habituado a vivir con nosotros. Quizás tu tengas
// uno de estos en casa, normalmente hay un perro o un gato en nuestras casas bogotanas, pero
// también los cerdos, toros, patos y entre otros son considerados animales domésticos. Por otra
// parte, los animales salvajes no son domesticables ya que nos consideran una especie peligrosa o
// una presa. Estos animales, en su ambiente natural consiguen su propia alimentación y buscan su
// propio hogar. Algunos ejemplos de estos animales son la Jirafa, el hipopótamo, el cocodrilo, etc.
// Tomando como referencia la introducción anterior, esta actividad consistirá en crear la solución
// orientada a objetos usando el principio de herencia para formular y crear un modelo de los animales
// domésticos y salvajes. Por lo tanto, el estudiante realizará los siguientes pasos

// 1. TODO Listar un conjunto de características y comportamientos que tengan en común todos los
// animales.
// - nutrirse  
// - crecer
// - moverse
// - responder a estimulos externos
// - subir o bajar peso
// - respirar (branquias pulmones, etc)

// 2. Crear la clase Superclase de dicho objeto del mundo real con sus propiedades y métodos.

// 3. Listar un conjunto de características y comportamientos que tengan en común los animales
// domésticos y los animales salvajes.
// - dormir
// - reproduccion
// - regular temperatura
// - sociales

// 4. Crear las clases Subclase de dichos objetos del mundo real con sus propiedades y métodos.
// 5. Crear 3 Subclases de cada una de las clases de animal doméstico y salvaje con sus
// propiedades y métodos.
// 6. Añadir uno de los tipos de polimorfismo en un método de la Superclase Animal y sus
// Subclases (a elección del estudiante).
// 7. Crear el diagrama de clases de dicha estructura jerárquica.
// 8. Plantear una solución que incluya el concepto de interfaz (ya que la herencia de Java no
// permite que sea múltiple) e implementar en código dicha solución.

// '''

public class Animal {

    private double peso;
    private int edad;
    private boolean salud;


    public Animal()
    {
        this.peso = 0;
        this.edad = 0;
        this.salud = true;
    }

    // Método que se hereda y se sobrescribe.
    // Proporciona un comportamiento base por defecto.

    // Sonido
    public void hacerSonido()
    {
        System.out.println("Proceso de sonido de Animal genérico......");
    }

    // respirar
    public void respirar()
    {
        System.out.println("Proceso de intercambio de gases para obtener (oxigeno)");
    }

    // Crecer
    public void crecer()
    {
        System.out.println("Proceso de crecimiento generico para conseguir mayor posibilidades de supervivencia");
    }

    // Mofificar peso
    public void disminuirPeso(int p)
    {
        this.peso  = this.peso - p;
    }

    public void incremetarPeso(int p)
    {
        this.peso  = this.peso + p;
    }

    public void mostrarPeso()
    {
        System.out.println(" El peso es " + this.peso);
    }

    // Edad
    public void actualizarEdad (int e)
    {
        this.edad = e;
    }

    // salud

    public void actualizarSalud (boolean s)
    {
        this.salud= s;
    }

    // mostrar todo
    public void mostrarTodo ()
    {
        System.out.println(" El peso es " + this.peso);
        System.out.println(" La edad  es " + this.edad);
        if (this.salud == true)
            System.out.println(" La salud del animal esta bien" );
        else if (this.salud == false)
            System.out.println("La salud del animal es mala");
        
    }

    public void moverse()
    {
        System.out.println("Movimiento generico de animal");
    }

    public void comer()
    {
        System.out.println("Alimentacion generica de animal");
    }
}