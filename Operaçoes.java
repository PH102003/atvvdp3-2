public interface Operaçoes {
    public void depositar(String hora, String data, double valor);
    
    public void sacar(String hora, String data, double valor);

    public void extrato();
}