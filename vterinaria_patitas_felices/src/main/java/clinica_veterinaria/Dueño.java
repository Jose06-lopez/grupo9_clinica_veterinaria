package clinica_veterinaria;
public class Dueño {
    String nombre;
    int edad;
    int numeroDocumento;

    void mostrarInfo(){
        System.out.println("El dueño llamado "+ nombre + " registrado con numero de identidad " + numeroDocumento + " con edad de " + edad + " años, fue registrado con !EXITO!");
    }

    public dueño(String nombre, int edad, int numeroDocumento){
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDocumento = numeroDocumento;
    }
}