package pe.egcc.model;

public class Estudiante 
{
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private String email;

    public Estudiante()
    {
        nombre = "jose";
        apellido = "robinson";
        edad = 25;
        casado = true;
        email = "jrobinson@hotmail.com";
    }
    
    /**
     * @param nombre Nombre del Estudiante.
     * @param apellido Apellido del Estudiante.
     * @param edad Edad, debe ser mayor que cero.
     * @param casado Estado civil.
     * @param email Email del Estudiante.
     */

    public Estudiante(String nombre, String apellido, int edad, boolean casado, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
        this.email = email;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the casado
     */
    public boolean isCasado() {
        return casado;
    }

    /**
     * @param casado the casado to set
     */
    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String repo = "";
        repo += "Nombre: " + nombre + "\n";
        repo += "Apellido: " + apellido + "\n";
        repo += "Edad: " + edad + "\n";
        repo += "Email: " + email + "\n";
        repo += "Casado: " + casado + "\n";
        return repo;
    }
    
    
    
    
}
