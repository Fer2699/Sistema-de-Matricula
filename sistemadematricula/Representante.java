package examen.sistemadematricula;

import javax.swing.JOptionPane;//faltan clases

public class Representante {//variables a utilizar

    static String nombre;
    static String apellido, correo;
    static int numero;
    static int cedula;
    static String curso;

    public static void main(String[] args) {//Este es el metodo main, donde se hacen llamados a los otros metodos. 

        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre", "Nombre", 1);
        apellido = JOptionPane.showInputDialog(null, "Ingrese los apellidos", "Apellidos", 1);
        correo = JOptionPane.showInputDialog(null, "Ingrese el correo", "Correo Electronico", 1);
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero", "Numero", 1));
        cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificación", "Identificación", 1));

        DatosEstudiante Estudiante = new DatosEstudiante(nombre, apellido, correo, numero, cedula);//se mandan los valores a la clase
        //Se llaman a los metodos get para informar errores en los datos.
        Estudiante.getNombre(nombre);
        Estudiante.getApellido(apellido);
        Estudiante.getCorreo(correo);
        Estudiante.getNumero();

        Cursos MatricularCursos = new Cursos();
        MatricularCursos.CursoDisponible();
        //falta mostrar cursos matriculados
    }
}
