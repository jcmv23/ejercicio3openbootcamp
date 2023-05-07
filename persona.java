public class persona {
    private int edad;
    private String nombre;
    private String telefono;

    public persona(int edad,String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;

    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    static persona persona = new persona(21, "jeancarlos", "8293712762");
    public static void main(String args[]) {
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }

    public class Cliente extends persona {
        private double credito;

        public Cliente(int edad, String nombre, String telefono, double credito) {
            super(edad, nombre, telefono);
            this.credito = credito;
        }
        public double getCredito() {
            return credito;
        }
        public void setCredito(double credito) {
            this.credito = credito;

        }
        }
    public class Trabajador {
        private double salario;

        public Trabajador(int edad, String nombre, String telefono, double salario) {
            super();
            this.salario = salario;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }



}

