public class Cliente implements Operaçoes{
    private String nome;
    private int idade;
    private String conta;
    private String agencia;
    private double saldo;
    private Operaçao[] historico;

    public Cliente(String nome, int idade, String conta, String agencia, double saldo, Operaçao[] historico) {
        this.nome = nome;
        this.idade = idade;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.historico = historico;
    }

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

    public Operaçao[] getHistorico() {
        return historico;
    }

    public void setHistorico(Operaçao[] historico) {
        this.historico = historico;
    }
    @Override
    public void depositar(String hora, String data, double valor) {
        Operaçao depo = new Operaçao("Depositar: ", valor, data, hora);
        saldo += valor;
        atualizarHistorico(depo);
    }
    @Override
    public void sacar(String hora, String data, double valor) {
        try{
            Operaçao saque = new Operaçao("Saque: ", valor, data, hora);
            saldo -= valor;
            atualizarHistorico(saque);
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
            }
            for (Operaçao operacao : historico) {
                if (operacao != null) {
                    System.out.println("Tipo de operação: " + operacao.getTipoOperaçao());
                    System.out.println("Valor: " + operacao.getValor());
                    System.out.println("Data: " + operacao.getData());
                    System.out.println("Hora: " + operacao.getHora());
                }
            }
            
}
protected void atualizarHistorico(Operaçao Operaçao) {
    Operaçao[] antigoVetor = historico.clone();
    Operaçao[] vetor = new Operaçao[30];

    for (int i = 0; i < 28; i++) {
        if (antigoVetor[i] == null) {
            break;
        }
        vetor[i + 1] = antigoVetor[i];
    }

    antigoVetor = vetor;
    antigoVetor[0] = new Operaçao("Atualização", Operaçao.getValor(), Operaçao.getData(), Operaçao.getHora());
}
}