public class ChamadaMetodos {
    public static void main(String [] args){ 

        //chamada do metodo setTipoCabelo da classe HigienePessoal
        //Brenda Beviláqua
        TipoHigienePessoal higiene = TipoHigienePessoal.SHAMPOO;
        TipoCabelo cabelo = TipoCabelo.CACHEADO;
        HigienePessoal pessoa1 = new HigienePessoal(1, "Loreal Paris", higiene);
        pessoa1.setTipoCabelo(cabelo);
        System.out.println(pessoa1.getTipoCabelo());

        //Nayara Amanda
        // chamada do metodo isAoLeite e isMeioAmargo
        Doces chocolate = new Doces(2, "KitKat", 10, false, true);
        chocolate.descricao();
       
    }
}
