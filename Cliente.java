public class Cliente implements Operaçoes{
    private String nome;
    private int idade;
    private String conta;
    private String agencia;
    private double saldo;
    private Operaçoes [] historico = new Operaçoes[30];
    
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Operaçoes[] getHistorico() {
        return historico;
    }
    public void setHistorico(Operaçoes[] historico) {
        this.historico = historico;
    }
    @Override
    public double depositar(String hora, String data, double valor) {
        // TODO Auto-generated method stub
        return saldo += valor;
        
    }
    @Override
    public void sacar(String hora, String data, double valor) {
        try{
            saldo -= valor;
        }
        catch(Exception e){
            if(valor > saldo){
                System.out.println(e.getMessage());
            }
            
        }
    }
    @Override
    public void extrato() {
        for(int i = 0; i < 10; i++){
            if(historico[i] == null)
                break;
            System.out.println(historico[i]);
        }
    
    
    
    
}
