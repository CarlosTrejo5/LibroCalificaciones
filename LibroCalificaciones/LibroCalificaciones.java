
/**
 *
 * @author nyyac
 */
public class LibroCalificaciones { // Clase
    private String nombreDelCurso; //Variable o nombre del curso para la clase LibroCalificaciones
    private String nombreDelInstructor; //Nombre del instructor para la clase LibroCalificaciones
    public void establecerNombreDelCurso(String nombre){ //creamos una variable con un parametro de lectura hacia la variable
        nombreDelCurso=nombre;
    }
    public String obtenerNombreDelCurso(){ //esta instancia es para devolver la variable almacenada
        return nombreDelCurso;
    }
    public void establecerNombreDelInstructor(String instructor) {
        nombreDelInstructor=instructor;
    }
    public String obtenerNombreDelInstructor() {
        return nombreDelInstructor;
    }
    public void mostrarMensaje() {
        System.out.printf("Bienvenido al libro de calificacones para\n%s!\n",obtenerNombreDelCurso()); // muestra mensaje en consola la cual tiene el orden de aparecer primero
        System.out.printf("Este curso es presentado por:\n%s!\n", obtenerNombreDelInstructor());
    }
}
