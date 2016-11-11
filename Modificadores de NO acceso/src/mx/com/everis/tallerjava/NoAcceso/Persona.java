package mx.com.everis.tallerjava.NoAcceso;

public class Persona {
    private String nombre; private String apellidos; private int edad;
    public Persona() {
        nombre = "";
        apellidos = "";
        edad = 0;
    }
    public Persona (String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public String obtenNombre() { return nombre; }
    public String obtenApellidos() { return apellidos; }
    public int obtenEdad() { return edad; }
    
    } 