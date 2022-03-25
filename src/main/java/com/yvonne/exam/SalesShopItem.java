package com.yvonne.exam;

public class SalesShopItem extends ShopItem{
    int off ;
    public SalesShopItem(String ID, String name,int price ,int off){
        super(ID, name, price);
        this.off = off;
    }

    public void print(){
        int QTY = 1;
        double pay = price*0.8;

        System.out.print(ID+"\t"+name+"\t"+price+"\t"+QTY+"\t"+pay+"\t"+"20% off");
    }
}
