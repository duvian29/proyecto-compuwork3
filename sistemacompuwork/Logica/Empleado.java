/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacompuwork.Logica;

/**
 *
 * @author duvia
 */
public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String telefono;
    private String correo;
    private String direccion;
    private String tipoEmpleado;
    private String fechaContratacion;

    // metodo Constructor
    public Empleado(int id, String nombre, String apellido, String fechaNacimiento, String telefono, String correo, String direccion, String tipoEmpleado, String fechaContratacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.tipoEmpleado = tipoEmpleado;
        this.fechaContratacion = fechaContratacion;
    }
    // los getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    // otros metodos
    public void crearEmpleado(){
         System.out.println("Empleado creado: "+ nombre +" "+ apellido);
    }

    public void actualizarEmpleado(String nuevoNombre, String nuevoApellido){
        this.nombre = nuevoNombre;
        this.apellido = nuevoApellido;
        System.out.println("Empleado actualizado: "+nombre+" "+apellido);
    }

    public void eliminarEmpleado(){
        System.out.println("Empleado eliminado: "+ nombre+" "+apellido);
    }

    public void asignarDepartamento(){
      System.out.println("Departamento asignado al empleado: " +nombre + " " +apellido);
    }
}


