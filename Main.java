public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Sebastian Puentes", 18, "Desarrollo de software");
        Profesor profesor1 = new Profesor("Daniel Lara", 25, "Profesor de apps moviles");

        alumno1.mostrarinfo1();
        alumno1.mostrarinfocarrera();

        System.out.println();

        profesor1.mostrarinfo1();
        profesor1.mostrarinfolabor();
    }

    interface carrera {
        void mostrarinfocarrera();
    }

    static class persona1 {
        private String nombre;
        private int edad;

        public persona1(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public int getEdad() {
            return edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void mostrarinfo1() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }
    }

    static class Alumno extends persona1 implements carrera {
        private String asig;

        public Alumno(String nombre, int edad, String asig) {
            super(nombre, edad);
            this.asig = asig;
        }

        public String getAsig() {
            return asig;
        }

        @Override
        public void mostrarinfocarrera() {
            System.out.println("Carrera que estudia: " + asig);
            System.out.println("Cantidad de semestres: 6");
        }
    }

    static class Profesor extends persona1 {
        private String labor1;

        public Profesor(String nombre, int edad, String labor1) {
            super(nombre, edad);
            this.labor1 = labor1;
        }

        public String getLabor1() {
            return labor1;
        }

        public void mostrarinfolabor() {
            System.out.println("Labor: " + labor1);
        }
    }
}


