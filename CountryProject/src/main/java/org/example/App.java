package org.example;

import org.example.com.country.Country;
import org.example.com.country.CountryDao;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Country Portal");
            System.out.println("Enter 1 to add Country: ");
            System.out.println("Enter 2 to show All Countries: ");
            System.out.println("Enter 3 to delete Country: ");
            System.out.println("Enter 4 to update Country: ");
            System.out.println("Enter 5 to Exit: ");
            int ch = input.nextInt();

            if(ch==1){
                // create
                System.out.println("enter country name: ");
                String name=input.next();
                System.out.println("Enter country capital: ");
                String capital= input.next();
                System.out.println("Enter country code: ");
                int code= input.nextInt();
                Country c= new Country(name,capital,code);
                CountryDao.addCountry(c);
            }
            if(ch==2){
                //show All
                CountryDao.getAllCountries();
            }
            if(ch==3){
                //delete
                System.out.println("Enter country id to delete: ");
                int cid=input.nextInt();
                CountryDao.deleteCountry(cid);
            }
            if(ch==4){
                //update
                System.out.println("enter country id to update: ");
                int cid=input.nextInt();
                System.out.println("Enter country Name: ");
                String name=input.next();
                System.out.println("Enter country Capital: ");
                String capital=input.next();
                System.out.println("Enter country code: ");
                int code= input.nextInt();
                Country country= new Country(name,capital,code);
                CountryDao.updateCountry(country,cid);
            }
            if(ch==5){
                //exit
                break;
            }else{
                System.out.println("Enter valid choice");
            }
        }
    }
}
