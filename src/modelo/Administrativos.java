
package modelo;

import java.time.LocalDate;
import java.time.Period;

public class Administrativos {
    private int codigo;
    private String nombre;
    private String apellido;
    private int anioIngreso; 

    public Administrativos() {
    }

    public Administrativos(int codigo, String nombre, String apellido,int anioIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    
    public int calcularAntiguedad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(LocalDate.of(anioIngreso, 1, 1), fechaActual).getYears();
    }
}
