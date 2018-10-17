/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Sintongs
 */
public class DiscountItem extends Item{
       private float discount;

    public DiscountItem(String name, float price, int amount) {
        super(name, price, amount);
    }
    
    public float getDiscount(){
        return (amount*price)*discount/100;
    }
    
    public float getTotalPrice(){
        return (amount*price)-getDiscount()
    }
    
    public String getString(){
        return"|"+name+"\t\t"+"|"+price+"\t"+"|"+amount+"\t\t"+"|"+getTotalPrice()+"\t"+"\n|-Disc"+"\t\t"+"|"+discount+"%\t\t|\t\t|\t\t|";
        }
}
