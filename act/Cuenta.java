
public class Cuenta {
    private String codigo;
    private String nombreCompleto;
    private int total;

    public Cuenta() {
    }
    public Cuenta(String codigo, String nombreCompleto, int total) {
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.total = total;
        System.out.println("Cuenta creada: " + codigo + ", " + nombreCompleto + ", Total: " + total);
    }
    
    public void setCodigo(String c) {
        this.codigo = c;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setNombreCompleto(String n) {
        this.nombreCompleto = n;
    }
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setTotal(int t){
        this.total = t;
    }

    
    public int getTotal(){
        return this.total;
    }
    
}

