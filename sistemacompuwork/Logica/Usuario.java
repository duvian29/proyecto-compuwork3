/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacompuwork.Logica;
import java.util.List;
/**
 *
 * @author duvia
 */
public class Usuario {
    private int id;
    private String nombre;
    private String contraseña;

    public Usuario(int id, String nombre, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    // Métodos requeridos
    public void actualizarUsuario(String nuevoNombre){
        this.nombre = nuevoNombre;
        System.out.println("Usuario actualizado: " + nombre);
    }
    public void cambiarContraseña(String nuevaContraseña){
        this.contraseña = nuevaContraseña;
        System.out.println("Contraseña actualizada para el usuario: " + nombre);
    }
    public void crearUsuario(){
        System.out.println("Usuario creado: " + nombre);
    }
     public void eliminarUsuario(List<Usuario> usuarios, int id) {
        try {
            usuarios.removeIf(u->u.getId()==id);
        } catch (NullPointerException e) {
            System.out.println("La lista de usuarios no existe");
        } catch (Exception e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
        }
    }
}
