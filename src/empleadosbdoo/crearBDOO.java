package empleadosbdoo;

import java.io.File;
import java.util.ArrayList;
import org.neodatis.odb.*;

public class crearBDOO {

    public static void main(String[] args) {
        //Ruta hacia el Escritorio
        String desktop = System.getProperty("user.home") + File.separator + "Desktop";

        //Apertura de la base de datos
        ODB odb = ODBFactory.open(desktop + File.separator + "gestionLaboral2122.obj");

        System.out.println("Se ha creado la base de datos 'gestionLaboral2122'\n");

        ArrayList<Empleados> lista = new ArrayList<>();

        //Creación de los 5 empleados de la BD
        lista.add(new Empleados(1, "Nicolás", "Esteban Bórquez", "Desarrollador", 1750f));
        lista.add(new Empleados(2, "Manuel", "Martínez", "Contable", 1200f));
        lista.add(new Empleados(3, "Silvia", "Marzo", "Desarrollador", 1600f));
        lista.add(new Empleados(4, "Miguel", "Cerezo", "Analista", 1500f));
        lista.add(new Empleados(5, "Sara", "Toro", "Gerente", 1800f));

        //Almacenamiento en la bd
        System.out.println("[ LISTA DE EMPLEADOS ALMACENADOS ]");
        for (Empleados emp : lista) {
            odb.store(emp);
            System.out.println(emp.toString());
        }

        //Cierre
        odb.close();
    }
}
