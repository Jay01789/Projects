package org.example;

import java.util.HashMap;
import java.util.List;

public class CarService {

    Integer Total_Price = 0 ;
    private   HashMap<String,Integer> hatchbackPrices ;
    private HashMap<String,Integer> sedanPrices ;
    private HashMap<String,Integer> suvPrices ;

    public CarService(){

        hatchbackPrices = new HashMap<>();
        hatchbackPrices.put("BS01", 2000);
        hatchbackPrices.put("EF01", 5000);
        hatchbackPrices.put("CF01", 2000);
        hatchbackPrices.put("BF01", 1000);
        hatchbackPrices.put("GF01", 3000);

        sedanPrices = new HashMap<>();
        sedanPrices.put("BS01", 4000);
        sedanPrices.put("EF01", 8000);
        sedanPrices.put("CF01", 4000);
        sedanPrices.put("BF01", 1500);
        sedanPrices.put("GF01", 6000);

        suvPrices = new HashMap<>();
        suvPrices.put("BS01", 5000);
        suvPrices.put("EF01", 10000);
        suvPrices.put("CF01", 6000);
        suvPrices.put("BF01", 2500);
        suvPrices.put("GF01", 8000);
    }
    
    public void getPrices(String carType , List<String> serviceCode){

        for(String val:serviceCode  ){
            Integer price = 0  ;
            if(carType.equals("Hatchback")){
               price = hatchbackPrices.get(val);
                
            } else if ( carType.equals("Sedan")) {
                price = sedanPrices.get(val);
                
            } else if (carType.equals("SUV")) {
                price = suvPrices.get(val);
                
            }
            if (price != null) {
                Total_Price = Total_Price + price;
            }            System.out.println("Service Code" + " " + val + " =  " + price );
        }

        System.out.println("Total Price for Services" + ": " + Total_Price);
        if(Total_Price > 10000){
            System.out.println("Complimentary cleaning provided.");
        }
        System.out.println("Thank You , Visit Again");
        
    }

}
