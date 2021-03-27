package lab9_danielsagastume;
public class Jugador {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;
    private String sexo;
    private int balones_oro;
    private int cant_medallas;
    private String isAtleta;

    public Jugador(String nombre, String apellido, String nacionalidad, int edad, String sexo, int balones_oro, int cant_medallas, String isAtleta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.sexo = sexo;
        this.balones_oro = balones_oro;
        this.cant_medallas = cant_medallas;
        this.isAtleta = isAtleta;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getBalones_oro() {
        return balones_oro;
    }

    public void setBalones_oro(int balones_oro) {
        this.balones_oro = balones_oro;
    }

    public int getCant_medallas() {
        return cant_medallas;
    }

    public void setCant_medallas(int cant_medallas) {
        this.cant_medallas = cant_medallas;
    }

    public String getIsAtleta() {
        return isAtleta;
    }

    public void setIsAtleta(String isAtleta) {
        this.isAtleta = isAtleta;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
