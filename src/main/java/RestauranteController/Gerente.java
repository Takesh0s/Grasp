package RestauranteController;

public class Gerente {
    private Garcom garcom = new Garcom();
    private Cozinheiro cozinheiro = new Cozinheiro();
    private Caixa caixa = new Caixa();

    public void coordenarRestaurante() {
        garcom.anotarPedido();
        cozinheiro.prepararPrato();
        caixa.cobrarConta();
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.coordenarRestaurante();
    }
}