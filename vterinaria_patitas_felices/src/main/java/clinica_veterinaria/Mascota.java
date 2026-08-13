package clinica_veterinaria;
public class Mascota {
    String nombre;
    String raza;
    int edad;
    String animal;

    void mostrarInfo(){
        System.out.println("El "+ animal +" llamado "+ nombre + " de la raza "+ raza + " con edad aproximada de "+ edad + " años, se registro con !EXITO!");

    }

    public Mascota(String nombre, String raza, int edad, String animal){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.animal = animal;
    }

}
