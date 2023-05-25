public interface Operaçoes {
    public double depositar(String hora, String data, double valor);
    
    public void sacar(String hora, String data, double valor);

    public void extrato();
}