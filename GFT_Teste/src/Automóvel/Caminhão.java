package Automóvel;

public class Caminhão extends Automovel{
    private static String Diesel;
    static String combustivel = Diesel;
    
    public Caminhão(String combustivel) {
        super(combustivel);
        this.combustivel = Diesel;
    }
}
