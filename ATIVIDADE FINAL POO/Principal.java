public class Principal{
public static void main(String[] args) {
    
System.out.println("--- Questão 01 ---");
    Carro meuCarro = new Carro();
    meuCarro.setCarroInfo("ford", "camaro", 2023);
    meuCarro.exibirCarroInfo();
   
System.out.println("\n--- Questão 02 ---");
    meuCarro.rodar(100);
    meuCarro.rodar(-101);
    System.out.println(meuCarro.getQuilometragem());

System.out.println("\n--- Questão 03 ---");
    CarroEsportivo meuCarroEsportivo = new CarroEsportivo();
    meuCarroEsportivo.setCarroInfo("chevrolet", "civic" , 1996);
    meuCarroEsportivo.setVelocidadeMaxima(120);
    meuCarroEsportivo.acelerar();
    System.out.println(meuCarroEsportivo);
    meuCarroEsportivo.setVelocidadeMaxima(80);
    System.out.println(meuCarroEsportivo);

    System.out.println("\n--- Questão 04 ---");
    Motor motorCarro = new Motor("v8", 500);
    Carro meuCarroComMotor = new Carro("chevrolet", "civic" , 1996, motorCarro);
    meuCarroComMotor.ligar();
   
}
}
