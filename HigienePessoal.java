// NAYARA AMANDA
public class HigienePessoal extends Produto {
    private TipoHigienePessoal tipo;
    private boolean rolon;
    private boolean spray;
    private TipoCabelo tipoCabelo;

    public HigienePessoal(int codigo, String nome, TipoHigienePessoal tipo) {
        super(codigo, nome);
        this.tipo = tipo;
    }

    public TipoHigienePessoal getTipo() {
        return tipo;
    }

    public void setTipo(TipoHigienePessoal tipo) {
        this.tipo = tipo;
    }

    public boolean getRolon() {
        return rolon;
    }

    public void setRolon(boolean rolon) {
        this.rolon = rolon;
    }

    public boolean getSpray() {
        return spray;
    }

    public void setSpray(boolean spray) {
        this.spray = spray;
    }
    public TipoCabelo getTipoCabelo() {
        return tipoCabelo;
    }

    public void setTipoCabelo(TipoCabelo tipoCabelo) {
        this.tipoCabelo = tipoCabelo;
    }
}
