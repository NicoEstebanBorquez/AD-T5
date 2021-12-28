package empleadosbdoo;

import java.io.File;
import org.neodatis.odb.*;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

public class actualizarBDOO {

    public static void main(String[] args) {
        //Ruta hacia el Escritorio
        String desktop = System.getProperty("user.home") + File.separator + "Desktop";

        //Apertura de la base de datos
        ODB odb = ODBFactory.open(desktop + File.separator + "gestionLaboral2122.obj");

        //Consulta de los empleados con salario < 1600
        IQuery query = new CriteriaQuery(Empleados.class, Where.lt("Salario", 1600));
        Objects<Empleados> lista = odb.getObjects(query);

        Empleados emp = null;
        System.out.println("[ ACTUALIZACIÓN DE SALARIOS: ]");
        while (lista.hasNext()) {
            emp = lista.next();
            emp.setSalario(emp.getSalario() + 200);
            odb.store(emp);
            System.out.println("Se ha aumentado en 200 el sueldo del empleado "
                               + emp.getNombre() + " "
                               + emp.getApellidos());
        }

        //Cierre
        odb.close();
    }
}
