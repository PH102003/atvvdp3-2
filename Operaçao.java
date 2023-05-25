public class Operaçao {
    private String tipoOperaçao;
    private double valor;
    private String data;
    private String hora;
    public Operaçao(String tipoOperaçao, double valor, String data, String hora) {
        this.tipoOperaçao = tipoOperaçao;
        this.valor = valor;
        this.data = data;
        this.hora = hora;
    }
    public String getTipoOperaçao() {
        return tipoOperaçao;
    }
    public void setTipoOperaçao(String tipoOperaçao) {
        this.tipoOperaçao = tipoOperaçao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
}
