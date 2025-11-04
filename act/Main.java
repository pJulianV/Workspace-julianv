import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("sistema");
        ArrayList<Cuenta> listaCuenta = new ArrayList<>();

        Cuenta objCuenta = new Cuenta();
        objCuenta.setCodigo("20");
        objCuenta.setNombreCompleto("Camila");
        objCuenta.setTotal(12000);
        listaCuenta.add(objCuenta);

        listaCuenta.add(new Cuenta("100", "Pepito", 15000));
        listaCuenta.add(new Cuenta("200", "Luis", 25000));
        listaCuenta.add(new Cuenta("300", "Matias", 50000));

        //cuanto tienen ahorrado todos los clientes ???
        int sumaTotal = 0;
        for (Cuenta c : listaCuenta) {
            sumaTotal += c.getTotal();

        }
        System.out.println("El total ahorrado por todos los clientes es: " + sumaTotal);
      

    }
}
