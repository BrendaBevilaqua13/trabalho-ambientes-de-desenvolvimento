public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public Motor motor;
    private int quilometragem;

    Carro(){

    }

    Carro(String marca, String modelo, int ano, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(int quilometragem) {
        if (quilometragem > 0){
        this.quilometragem = quilometragem;
        }else{
            System.out.println("Não pode ser negativo");
        }
    }

    public int rodar(int quilometrosPecorridos){
        if (quilometrosPecorridos > 0){
            this.quilometragem += quilometrosPecorridos;
        }
        return this.quilometragem;
    }

        public void exibirCarroInfo(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
    }

    public void setCarroInfo(String marca ,String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar(){
        System.out.println("Ligando o carro..." + "\nMotor: " + this.motor.tipo + "\nPotência: " + this.motor.potencia);
    }
}
