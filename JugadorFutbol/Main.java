public class Main {

    public static void main(String[] args) {
        
        
        JugadorFutbol cristiano = new JugadorFutbol(
            "Cristiano Ronaldo", 
            7, 
            "Delantero", 
            "Al-Nassr",
            187, 
            83.0 
        );
        
	    // Mostrar datos de Cristiano 
        cristiano.mostrarDatos(); 

        System.out.println("\n--- Acciones en el Partido ---");
        
        // Metodos de Cristiano
        System.out.println( cristiano.cabecear()); 
        System.out.println(cristiano.pase()); 
        System.out.println(cristiano.correr()); 
        System.out.println(cristiano.recuperarBalon()); 
        System.out.println(cristiano.patearAlArco()); 

        
    }


    
}