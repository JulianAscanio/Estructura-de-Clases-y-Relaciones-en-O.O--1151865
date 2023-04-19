
package modelo;

import javax.swing.JOptionPane;

public class Docente {
    private int codigo;
    private String nombre, apellidos, profesión;
    private double salario, estatura,peso;

    public Docente() {
    }

    public Docente(int codigo, String nombre, String apellidos, String profesión, double salario, double estatura, double peso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.profesión = profesión;
        this.salario = salario;
        this.estatura = estatura;
        this.peso = peso;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getProfesión() {
        return profesión;
    }

    public void setProfesión(String profesión) {
        this.profesión = profesión;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double calcularIMC( ){
        return  peso/(estatura * estatura); 
         
        /* if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, " Su peso es inferior al normal");
        }else if ((imc >= 18.5) && (imc < 24.9)) {
            JOptionPane.showMessageDialog(null," Su peso es normal");
        }else if ((imc >= 25.0) && (imc < 29.9)) {
            JOptionPane.showMessageDialog(null," Su peso es superior al normal");
        }else if (imc > 30.0) {
            JOptionPane.showMessageDialog(null," Obesidad");
        }*/
    }
}
