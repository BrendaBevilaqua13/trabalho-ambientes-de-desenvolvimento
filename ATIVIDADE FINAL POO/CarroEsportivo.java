public class CarroEsportivo extends Carro{
    
    int velocidadeMaxima;
    
    public void acelerar(){
        System.out.println("Acelerando o carro esportivo!");
    }

    public int getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString(){
        return "Modelo: " + super.getModelo() +  ", Marca: " + super.getMarca() + ", Ano: " + super.getAno() + ", Velocidade Máxima: " + this.getVelocidadeMaxima();
    }

    
}
