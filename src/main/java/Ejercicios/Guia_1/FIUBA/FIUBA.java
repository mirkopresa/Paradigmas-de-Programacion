package Ejercicios.Guia_1.FIUBA;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

public class FIUBA {
    private Map<Integer, Alumno> alumnos;
    private final Map<String, Carrera> carreras;

    public FIUBA() {
        this.alumnos = new HashMap<Integer, Alumno>();
        this.carreras = new HashMap<String, Carrera>();
        ArrayList<Materia> obligatoriasInformatica = new ArrayList<>();
        obligatoriasInformatica.add(new Materia(7540, "Algoritmos y Programación", 8));
        obligatoriasInformatica.add(new Materia(6103, "Análisis Matemático II", 8));

        ArrayList<Materia> optativasInformatica = new ArrayList<>();
        optativasInformatica.add(new Materia(7570, "Inteligencia Artificial", 6));

        Carrera informatica = new Carrera("Ingeniería en Informática", obligatoriasInformatica, optativasInformatica, 22);

        ArrayList<Materia> obligatoriasMecanica = new ArrayList<>();
        obligatoriasMecanica.add(new Materia(6201, "Física I", 8));
        obligatoriasMecanica.add(new Materia(6704, "Termodinámica", 6));

        ArrayList<Materia> optativasMecanica = new ArrayList<>();
        optativasMecanica.add(new Materia(6750, "Robótica Industrial", 6));

        Carrera mecanica = new Carrera("Ingeniería Mecánica", obligatoriasMecanica, optativasMecanica, 20);

        carreras.put("Informatica", informatica);
        carreras.put("Mecanica", mecanica);
    }

    public String inscribirAlumno(Scanner scanner) {
        System.out.println("Ingrese un nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese un padron:");
        Integer padron = Integer.valueOf(scanner.nextLine());
        if (alumnos.containsKey(padron)) {
            return "El alumno ya se encontraba inscrito.";
        }
        alumnos.put(padron, new Alumno(nombre, padron));
        return "El alumno fue inscrito correctamente.";
    }

    public String inscribirAlumnoEnCarrera(Scanner scanner) {
        System.out.println("Ingrese un padron:");
        Integer padron = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese una carrera:");
        String carrera = scanner.nextLine();
        if (!existeAlumnoOMateria(padron, carrera)) {
            return "El alumno y/o la carrera no existen.";
        }
        Alumno alumno = alumnos.get(padron);
        Carrera carreraACursar = carreras.get(carrera);
        if (!alumno.inscribirCarrera(carreraACursar)) {
            return "El alumno ya se encuentra inscrito.";
        }
        return "Alumno inscrito correctamente.";
    }

    public String aprobarMateria(Scanner scanner) {
        System.out.println("Ingrese un padron:");
        Integer padron = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese una carrera:");
        String carrera = scanner.nextLine();
        System.out.println("Ingrese una materia:");
        String materia = scanner.nextLine();
        if (!existeAlumnoOMateria(padron, carrera)) {
            return "El alumno y/o la carrera no existen.";
        }
        Alumno alumno = alumnos.get(padron);
        Carrera carreraEnCurso = carreras.get(carrera);
        Materia materiaAAprobar = carreraEnCurso.buscarMateria(materia);
        if (materiaAAprobar == null) {
            return "La materia no existe.";
        }
        if (!alumno.aprobarMateria(carreraEnCurso, materiaAAprobar)) {
            return "La materia no coincide con la carrera o no existe.";
        }
        return "Materia aprobada correctamente.";
    }

    public String consultarEstadoAlumno(Scanner scanner) {
        System.out.println("Ingrese un padron:");
        Integer padron = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese una carrera:");
        String carrera = scanner.nextLine();
        if (!existeAlumnoOMateria(padron, carrera)) {
            return "El alumno y/o la carrera no existen.";
        }
        Alumno alumno = alumnos.get(padron);
        Carrera carreraEnCurso = carreras.get(carrera);
        return alumno.consultarEstado(carreraEnCurso);
    }

    private boolean existeAlumnoOMateria(Integer padron, String carrera) {
        return alumnos.containsKey(padron) && carreras.containsKey(carrera);
    }
    public static void main(String[] args) {
        FIUBA sistema = new FIUBA();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese una de las opciones:");
            System.out.println("1: Inscribir alumno en sistema");
            System.out.println("2: Inscribir alumno en carrera");
            System.out.println("3: Ingresar materia aprobada");
            System.out.println("4: Consultar estado de carrera");
            System.out.println("5: Salir");
            String opcion = scanner.nextLine();
            switch (opcion){
                case "1":
                    System.out.println(sistema.inscribirAlumno(scanner));
                    break;
                case "2":
                    System.out.println(sistema.inscribirAlumnoEnCarrera(scanner));
                    break;
                case "3":
                    System.out.println(sistema.aprobarMateria(scanner));
                    break;
                case "4":
                    System.out.println(sistema.consultarEstadoAlumno(scanner));
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
