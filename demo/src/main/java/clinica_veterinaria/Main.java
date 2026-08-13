package clinica_veterinaria;

public class Main {
    public static void main(String[] args) {
        Mascota alan = new Mascota("Alan", "pincher", 12, "Perro");

        alan.mostrarInfo();

        Mascota dakota = new Mascota("Dakota", "bulldog frances", 5, "perro");

        dakota.mostrarInfo();
    }
}