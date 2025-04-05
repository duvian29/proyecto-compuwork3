/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacompuwork.Logica;

import sistemacompuwork.Presentacion.Ventana;

/**
 *
 * @author duvia
 */


/**
 *
 * @author duvia
 */
public class ReporteDesempeño {
    private String id;
    private String nombre;
    private String fechaReporte;
    private String valoracion;

    public ReporteDesempeño(String id, String nombre, String fechaReporte, String valoracion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaReporte = fechaReporte;
        this.valoracion = valoracion;
    }

    public ReporteDesempeño(Ventana aThis, boolean b, Ventana aThis0) {
       
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public void setVisible(boolean b) {
       
    }
    
}

