package com.rodmargon.decorator;

public class App 
{
    public static void main( String[] args )
    {
        Pizza pizza = new ChickenFiesta();
        pizza = new Paneer(pizza);
        pizza = new FreshTomato(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
        		
    }
}
