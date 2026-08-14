package clinica_veterinaria;
public class Veterinario {
    String nombre;
    String especializacion;
    String numDocumento;
    int edad;

    void mostrarInfo(){
        System.out.println("El veterinario " + nombre + "con numero de documento " + numDocumento + "especilizado en " + especializacion + " fue registrado con !EXITO!");
    }       

    public Veterinario(String nombre, String especializacion, String numDocumento, int edad){
        this.nombre = nombre;
        this.especializacion = especializacion;
        this.edad = edad;
        this.numDocumento = numDocumento;
    }
}