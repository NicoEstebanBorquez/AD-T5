package empleadosbdoo;

import java.io.File;
import org.neodatis.odb.*;

public class crearBDOO {

    /*
    Implementar una clase denominada "crearBDOO.java" y cuyo cometido sea crear una 
    base de datos orientada a objetos denominada "gestionLaboral2122". En dicha base de 
    datos se deben almacenar 5 objetos que tendrán los valores que aparecen en la siguiente tabla en cada uno de sus atributos.
     */
    public static void main(String[] args) {

        //Ruta hacia el Escritorio
        String desktop = System.getProperty("user.home") + File.separator + "Desktop";
        
        //Apertura de la base de datos
        ODB odb = ODBFactory.open(desktop + File.pathSeparator + "gestionLaboral2122");
        
        //Creación de los 5 empleados de la BD
        Empleados emp1 = new Empleados(1, "Nicolás", "Esteban Bórquez", "Desarrollador", 1750f);
        Empleados emp2 = new Empleados(2, "Manuel", "Martínez", "Contable", 1200f);
        Empleados emp3 = new Empleados(3, "Silvia", "Marzo", "Desarrollador", 1600f);
        Empleados emp4 = new Empleados(4, "Miguel", "Cerezo", "Analista", 1500f);
        Empleados emp5 = new Empleados(5, "Sara", "Toro", "Gerente", 1800f);

    }

}
