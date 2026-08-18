public class principal{
    public static void main(String[] args){
        Banco b1 = new Banco ("Raul", "000.000.000-00", 15);
        Banco b2 = new Banco ("","", 0);
        Banco b3 = new Banco ("Carla", "000.000.000-00", 50);

        System.out.println(b3.nome);
        b3.nome = "Mylena";
        System.out.println(b3.nome);

    }
}

