public class main {

    public static void main(String[] args){

    }

    public class Persona {

        private String nombre;
        private int edad;
        private String telefono;

        public Persona(String jeancarlos, int i, String numero) {

        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }

    public class Main {
        public void main(String[] args) {
            Persona persona = new Persona("Jeancarlos", 21, "8293712762");
            System.out.println(persona.getNombre());
            persona.setEdad(21);
            System.out.println(persona.getEdad());
        }
    }
}


