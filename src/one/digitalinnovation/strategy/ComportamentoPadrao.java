package one.digitalinnovation.strategy;

public class ComportamentoPadrao implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Parcialmente parado, simulando movimentos inertes humanos.");
    }
}
