package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   CarService carService = new CarService() ;
   String CAR_TYPE = "";
        Scanner scn = new Scanner(System.in);
   System.out.println("Enter Car Type : ");
        System.out.println("Enter 1 : Hatchback");
        System.out.println("Enter 2 : Sedan");
        System.out.println("Enter 3 : SUV");

        System.out.println("Enter Type below :");
        int CarType = scn.nextInt();
        if(CarType == 1){
            CAR_TYPE = "Hatchback" ;
        } else if (CarType == 2) {
            CAR_TYPE = "Sedan" ;
        }else if (CarType == 3){
            CAR_TYPE = "SUV";
        }


        System.out.println("Enter   BS01 for Basic Servicing");
        System.out.println("Enter   EF01 for Engine Fixing");
        System.out.println("Enter   CF01 for Clutch Fixing");
        System.out.println("Enter   BF01 for Brake Fixing");
        System.out.println("Enter   GF01 for Gear Fixing");

        System.out.print("Enter the service codes (comma-separated): ");
        String serviceCodesInput = scn.next() ;
        List<String> serviceCodes = Arrays.asList(serviceCodesInput.split(","));

        carService.getPrices(CAR_TYPE,serviceCodes );

    }
}