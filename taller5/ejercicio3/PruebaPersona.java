package taller5.ejercicio3;

class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.edad = "30";
        System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.edad);
    }
}