package modelo;

public class Estudiante {

    private int código;
    private String nombre;
    private String apellidos;
    private String carrera;
    private int semestre;
    private int numCreditos;
    private boolean matricular = false;

    public Estudiante() {
    }

    public Estudiante(int código, String nombre, String apellidos, String carrera, int semestre, int numCreditos) {
        this.código = código;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.semestre = semestre;
        this.numCreditos = numCreditos;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    public boolean Matricular() {
        return matricular;
    }

    public void setAdmision(boolean matricular) {
        this.matricular = matricular;
    }

    public double matricular() {
        double porcentajeCreditos = ((double) numCreditos / cantidadCreditosCarrera()) * 100;

        if (porcentajeCreditos >= 90) {
                       matricular = true;
        }
        return porcentajeCreditos;
    }

    public int cantidadCreditosCarrera() {
        int credCarrera = 0;
        switch (carrera) {
            case "Ingenieria de Sistemas" ->
                credCarrera = 164;
            case "Ingenieria Civil" ->
                credCarrera = 176;
            case "Ingenieria Mecanica" ->
                credCarrera = 168;
        }
        return credCarrera;
    }
}
