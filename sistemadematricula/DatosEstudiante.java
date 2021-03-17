package examen.sistemadematricula;

import javax.swing.JOptionPane;

public class DatosEstudiante {//En esta clase se va a guardar los datos de los estudiantes que se quieran matricular.

    private String nombre, apellido, correo;
    private int numero;
    private int cedula;

    public String getNombre(String nombre) {//verificaremos que el nombre sea largo
        if (nombre.length() >= 3) {
        } else {
            JOptionPane.showMessageDialog(null, "Datos incompletos.");
        }
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido(String apellido) {//Verificaremos el apellido
        if (apellido.length() >= 3) {
        } else {
            JOptionPane.showMessageDialog(null, "Datos incompletos.");
        }
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo(String correo) {//Verificamos la estructuta del correo @ prueba
        if (correo.indexOf('@') >= 3) {

        } else {
            JOptionPane.showMessageDialog(null, "Correo no valido");
        }
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumero() {//Verificamos el numero de telefono
        if (numero > 8) {
        } else {
            JOptionPane.showMessageDialog(null, "Numero incorrecto");
        }
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public DatosEstudiante(String nombre, String apellido, String correo, int numero, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numero = numero;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        JOptionPane.showMessageDialog(null,
                "DatosEstudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", numero=" + numero + ", cedula=" + cedula + '}');
        return null;
    }

}
