public class Doces extends Produto {

    // Atributos

    private int quantidade;
    private boolean meioAmargo;
    private boolean aoLeite;
    
    public Doces (int codigo, String nome, int quantidade, boolean meioAmargo, boolean aoLeite){
         super(codigo, nome);
        this.quantidade = quantidade;
        this.meioAmargo = meioAmargo;
        this.aoLeite = aoLeite;
    }

    //METODOS

    public boolean isMeioAmargo() {
        return meioAmargo;
    }

    public void setMeioAmargo(boolean meioAmargo){
        this.meioAmargo = meioAmargo;

    }

    public boolean isAoLeite() {
        return aoLeite;
    }

    public void setAoLeite(boolean aoLeite) {
        this.aoLeite = aoLeite;
    }

}

	


