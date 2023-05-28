import java.util.Arrays;
public class ClienteEspecial extends Cliente{
    
    private Investimento oInvestimento;
    public ClienteEspecial(String nome, int idade, String conta, String agencia, double saldo, Operaçao[] historico) {
        super(nome, idade, conta, agencia, saldo, historico);
        //TODO Auto-generated constructor stub
    }
    public Investimento getoInvestimento() {
        return oInvestimento;
    }
    public void setoInvestimento(Investimento oInvestimento) {
        this.oInvestimento = oInvestimento;
    }

    public void extrato(){
        for(int i = 0; i < 30; i++){
        

        }
    }
    public void investimento(String data, String hora){
        

    }
    
}
