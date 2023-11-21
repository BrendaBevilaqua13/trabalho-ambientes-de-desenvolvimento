public class Bebida extends Produto {

    private String tipo;
    private boolean gaseificada;

    public Bebida(int codigo, String nome, String tipo, boolean gaseificada) {
        super(codigo, nome);
        this.tipo = tipo;
        this.gaseificada = gaseificada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isGaseificada() {
        return gaseificada;
    }

    public void setGaseificada(boolean gaseificada) {
        this.gaseificada = gaseificada;
    }

    @Override
    public double getValorUnitario() {
        return super.getValorUnitario();
    }

    // metodo 
    // criado pela Brenda Beviláqua
    public void detalhe(Bebida bebida) {
        if (bebida.isGaseificada()){
            System.out.println("A bebida que definiu contém gás, cuidado com exageros!!!");
        } else{
            System.out.println("A bebida que definiu não contém gás, pode aproveitar!!!");
        }
    }
}
