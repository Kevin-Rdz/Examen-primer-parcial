package uaslp.objetos.parcial1.examen.pos;

import java.awt.*;
import java.util.ArrayList;

public class PointOfSale {
    private static final int DEFAULT_SIZE = 2;
    private int array[];
    private int size;
    private ArrayList<CartItem>;

    public PointOfSale(){
        array = new String[DEFAULT_SIZE];
    }
    public PointOfSale(int size){
        array = new String[size];
    }
    public void addToCart(int quantity, Product product){
        if(size == array.length){
            increaseArraySize();
        }
        array[size] = quantity;
        size++;


    }

    private void increaseArraySize(){
        String []newArray = new String[array.length * 2];
        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        array = newArray;

    }
    public float getTotal(){
        return
    }
    public String getProducts(){
        return array;
    }
    public int getCountByName(){
        return this.array;
    }
}
