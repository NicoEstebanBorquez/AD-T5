package empleadosbdoo;

public class Empleados {

    private int codEmpleado;
    private String Nombre;
    private String Apellidos;
    private String Departamento;
    private float Salario;

    public Empleados(int codEmpleado, String Nombre, String Apellidos, String Departamento, float Salario) {
        this.codEmpleado = codEmpleado;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Departamento = Departamento;
        this.Salario = Salario;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    
}
