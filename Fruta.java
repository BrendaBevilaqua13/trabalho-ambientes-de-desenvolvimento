public class Fruta extends Produto {
    
    private double peso;
    private boolean madura;
    private boolean citrica;

    public Fruta(int codigo, String nome){
        super(codigo, nome);


        this.peso = peso;
        this.madura = madura;
        this.citrica = citrica;
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
}
