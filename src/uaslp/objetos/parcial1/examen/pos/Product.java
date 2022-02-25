package uaslp.objetos.parcial1.examen.pos;

public class Product {
    private String name;
    private double amount;

    public Product(String name, double amount){
        this.name = name;
        this.amount = amount;
    }
    public String getName(){
        return this.name;
    }
    public double getAmount(){
        return this.amount;
    }
}
