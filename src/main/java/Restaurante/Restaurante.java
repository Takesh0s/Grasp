package Restaurante;

public class Restaurante {
    public Prato prepararPrato(String nomeDoPrato) {
        return new Prato(nomeDoPrato);
    }

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Prato prato = restaurante.prepararPrato("Lasanha");
        System.out.println("Prato preparado: " + prato.getNome());
    }
}