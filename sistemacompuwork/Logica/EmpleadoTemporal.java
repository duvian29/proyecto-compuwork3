/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacompuwork.Logica;

/**
 *
 * @author duvia
 */
public class EmpleadoTemporal extends Empleado{
    private String fechainicioContrato;
    private String fechafincontrato;

    public EmpleadoTemporal(String fechainicioContrato, String fechafincontrato, int id, String nombre, String apellido, String fechaNacimiento, String telefono, String correo, String direccion, String tipoEmpleado, String fechaContratacion) {
        super(id, nombre, apellido, fechaNacimiento, telefono, correo, direccion, tipoEmpleado, fechaContratacion);
        this.fechainicioContrato = fechainicioContrato;
        this.fechafincontrato = fechafincontrato;
    }

    public String getFechainicioContrato() {
        return fechainicioContrato;
    }

    public void setFechainicioContrato(String fechainicioContrato) {
        this.fechainicioContrato = fechainicioContrato;
    }

    public String getFechafincontrato() {
        return fechafincontrato;
    }

    public void setFechafincontrato(String fechafincontrato) {
        this.fechafincontrato = fechafincontrato;
    }
    
}
