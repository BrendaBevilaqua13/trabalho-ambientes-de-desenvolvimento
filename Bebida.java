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
}
