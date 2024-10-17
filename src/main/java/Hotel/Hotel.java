package Hotel;

public class Hotel {
    public static void main(String[] args) {
        Recepcionista recepcionista = new Recepcionista();
        Camareiro camareiro = new Camareiro();
        Gerente gerente = new Gerente();

        recepcionista.fazerCheckIn();
        camareiro.limparQuarto();
        gerente.gerenciarHotel();
    }
}