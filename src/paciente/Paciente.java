package paciente;

import java.net.URL;
import java.sql.Date;

public class Paciente {
    private String nombre, apellido, direccion, telefono, obraSocial;
    private Date fechaNacimiento;
    private URL correo;
    private Tipo tipo;
    private int dni;

    public Paciente(String nombre, String apellido, String direccion, String telefono, String obraSocial,
            Date fechaNacimiento, URL correo, Tipo tipo, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.obraSocial = obraSocial;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.tipo = tipo;
        this.dni = dni;
    }

    public Paciente(String nombre, String apellido, String direccion, String telefono, String obraSocial,
            Date fechaNacimiento, URL correo, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.obraSocial = obraSocial;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.dni = dni;
    }

    public Paciente(String nombre, String apellido, String direccion, String telefono, Date fechaNacimiento, URL correo,
            Tipo tipo, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.tipo = tipo;
        this.dni = dni;
    }

    public Paciente(String nombre, String apellido, String direccion, String telefono, Date fechaNacimiento, URL correo,
            int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public URL getCorreo() {
        return correo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getDni() {
        return dni;
    }

}
