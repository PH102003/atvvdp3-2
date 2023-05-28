public class Investimento extends Produto {

    public Investimento(double valor, String data, String hora) {
        super(valor, data, hora);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void rendimento() {
        // TODO Auto-generated method stub
        setValor(getValor() * 0.03);
    }
    
}
