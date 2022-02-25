package uaslp.objetos.parcial1.examen.pos;

import javax.print.attribute.standard.PrinterURI;

public class CartItem {
    private int quantity;
    private Product product;

    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public Product getProductName(){
        return this.product;
    }
    public void setProduct(Product product){
        this.product = product;
    }
}
