package empleadosbdoo;

import java.io.File;
import org.neodatis.odb.*;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

public class consultarBDOO {

    public static void main(String[] args) {
        //Ruta hacia el Escritorio
        String desktop = System.getProperty("user.home") + File.separator + "Desktop";

        //Apertura de la base de datos
        ODB odb = ODBFactory.open(desktop + File.separator + "gestionLaboral2122.obj");

        //Consulta de los datos
        IQuery query = new CriteriaQuery(Empleados.class);
        Objects<Empleados> lista = odb.getObjects(query);

        Empleados emp = null;
        System.out.println("[ LISTA DE EMPLEADOS ]");
        while (lista.hasNext()) {
            emp = lista.next();
            System.out.println("codEmpleado: " + emp.getCodEmpleado() + "\n"
                    + "Nombre: " + emp.getNombre() + "\n"
                    + "Apellidos: " + emp.getApellidos() + "\n"
                    + "Puesto: " + emp.getDepartamento() + "\n"
                    + "Salario: " + emp.getSalario() + "\n");
        }
        //Cierre
        odb.close();
    }
}
