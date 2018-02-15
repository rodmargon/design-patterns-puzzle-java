package com.rodmargon.abstracfactory;

public class App 
{
    public static void main( String[] args )
    {
        CarFactory.setLocation(Location.INDIA);
        CarFactory.buildCar(CarType.LUXURY);
        CarFactory.buildCar(CarType.MINI);
        CarFactory.buildCar(CarType.MICRO);
    }
}
