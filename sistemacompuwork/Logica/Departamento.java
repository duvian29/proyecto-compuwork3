/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacompuwork.Logica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duvia
 */
public class Departamento {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private String descripcion;
    private List<Empleado> empleados;

    public Departamento(String codigo, String nombre, String ubicacion,String descripcion, List<Empleado> empleados) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.empleados = empleados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    // Métodos requeridos
    public void crearDepartamento(List<Departamento> departamentos){
        departamentos.add(this);
    }
    public void modificarDepartamento(String nuevoNombre, String nuevaUbicacion){
        this.nombre = nuevoNombre;
        this.ubicacion = nuevaUbicacion;
    }
    public void eliminarDepartamento(List<Departamento> departamentos, String codigo){
        departamentos.removeIf(d -> d.getCodigo().equals(codigo));
    }
}
