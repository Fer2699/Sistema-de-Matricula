package examen.sistemadematricula;

import javax.swing.JOptionPane;

public class Cursos {//cursos 

    private String consulta;
    private char opcion;
    private byte matematicas1 = 28;//campos disponibles- codigo MC001 curso Matematicas 1
    private byte matematicas2 =15;//codigo MC002 -curso 2 Matematicas 2
    private byte ciencias = 27;//codigo CC003 -curso 3 Ciencias
    private byte ingles =10;//codigo IC004 -curso 4 Ingles
    private byte frances = 20;//codigo FC005 -Curso 5 Francés

    public void CursoDisponible() {//Consulta si esta disponible el curso
        int camposDisponibles;
        do {//se agrega un do while en caso de quere matricular mas de 1 curso.
            consulta = JOptionPane.showInputDialog(null, "Ingrese el codigo del curso: ", "Cursos", 1);
            switch (consulta) {
                case "MC001":
                    JOptionPane.showMessageDialog(null, "Campos Disponibles: " +matematicas1);
                    opcion = JOptionPane.showInputDialog(null, "¿Desea matricular el curso Matematicas 1?\nIndique con si o no", "Matrícula", 1).charAt(0);
                    if (opcion == 's') {
                        matematicas1-= 1;
                        //llamar al metodo que contiene los horarios?
                    } else {
                        break;
                    }
                    break;

                case "MC002":
                    JOptionPane.showMessageDialog(null, "Campos Disponibles: " +matematicas2);
                    opcion = JOptionPane.showInputDialog(null, "¿Desea matricular el curso Matematicas 2?\nIndique con si o no", "Matrícula", 1).charAt(0);
                    if (opcion == 's') {
                        matematicas2-= 1;
                        //llamar al metodo que contiene los horarios?
                    } else {
                        break;
                    }
                    break;

                case "CC003":
                    JOptionPane.showMessageDialog(null, "Campos Disponibles: " +ciencias);
                    opcion = JOptionPane.showInputDialog(null, "¿Desea matricular el curso de Ciencias?\nIndique con si o no", "Matrícula", 1).charAt(0);
                    if (opcion == 's') {
                        ciencias-= 1;
                        //llamar al metodo que contiene los horarios?
                    } else {
                        break;
                    }
                    break;

                case "IC004":
                    JOptionPane.showMessageDialog(null, "Campos Disponibles: " +ingles);
                    opcion = JOptionPane.showInputDialog(null, "¿Desea matricular para el curso de Inglés?\nIndique con si o no", "Matrícula", 1).charAt(0);
                    if (opcion == 's') {
                        ingles-= 1;
                        //llamar al metodo que contiene los horarios?
                    } else {
                        break;
                    }
                    break;

                case "FC005":
                    JOptionPane.showMessageDialog(null, "Campos Disponibles: " +frances);
                    opcion = JOptionPane.showInputDialog(null, "¿Desea matricular para el curso Francés 1?\nIndique con si o no", "Matrícula", 1).charAt(0);
                    if (opcion == 's') {
                        frances-= 1;
                        //llamar al metodo que contiene los horarios?
                    } else {
                        break;
                    }
                    break;
            }
            opcion = JOptionPane.showInputDialog(null, "¿Desea seguir con el proceso?\nIndicar si o no", "Matricula de Cursos", 1).charAt(0);
        } while (opcion == 's');
    }
}
