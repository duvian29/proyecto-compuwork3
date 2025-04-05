/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacompuwork.Logica;

/**
 *
 * @author duvia
 */
public class EmpleadoVinculado extends Empleado {
    private double salario;
    private double prima;
    private String fechaContratacion;

    public EmpleadoVinculado(double salario, double prima, int id, String nombre, String apellido, String fechaNacimiento, String telefono, String correo, String direccion, String tipoEmpleado, String fechaContratacion) {
        super(id, nombre, apellido, fechaNacimiento, telefono, correo, direccion, tipoEmpleado, fechaContratacion);
        this.salario = salario;
        this.prima = prima;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPrima() {
        return prima;
    }

    public void setPrima(double prima) {
        this.prima = prima;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    
}
