public class JugadorFutbol {

    private String nombreCompleto;
    private int numero;
    private String posicion;
    private String equipo; 
    private int estaturaCentimetros; 
    private double pesoKilogramos;

    public JugadorFutbol(String nombreCompleto, int numero, String posicion, String equipo, int estaturaCentimetros, double pesoKilogramos) {
        this.nombreCompleto = nombreCompleto;
        this.numero = numero;
        this.posicion = posicion;
        this.equipo = equipo; 
        this.estaturaCentimetros = estaturaCentimetros;
        this.pesoKilogramos = pesoKilogramos;
    }
 
    public String correr() {
        return this.nombreCompleto + " acelera en el campo.";
    }
    public String patearAlArco() {
        return this.nombreCompleto + " remata a portería, buscando el gol";
    }
    public String pase() {
        return this.nombreCompleto + " realiza un pase.";
    }
    
    public String recuperarBalon() {
        return this.nombreCompleto + " recupera el balon.";
    }

    public String cabecear() {
        if (this.estaturaCentimetros < 180) {
            return this.nombreCompleto + " cabecea apenas el balon para recuperar posecion.";
        } else {
            return this.nombreCompleto + " cabecea el balon con precision, para asegurar un posicion favorable para el gol.";
        }
    }

    public void mostrarDatos() {
    System.out.println("--- INFO JUGADOR " + nombreCompleto+ " ---");
    
    System.out.println("Equipo: " + this.equipo + " No. " + this.numero + " Con posición: " + this.posicion);
    System.out.println("Físico: " + this.estaturaCentimetros + " cm y " + this.pesoKilogramos + " kg.");
    System.out.println("--------------------");
    }
}
    