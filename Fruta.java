public class Fruta extends Produto {
    
    //Atributos

    private double peso;
    private boolean madura;
    private String cor;

    public Fruta(int codigo, String nome, double peso, boolean madura, String cor){
        super(codigo, nome);

        this.peso = peso;
        this.madura = madura;
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMadura() {
        return madura;
    }

    public void setMadura(boolean madura) {
        this.madura = madura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;

    //Metodos

    
}
}
