package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
/*
   Vælger Card_Number, Name, City, Country og Account_Created som instansvariabler til klassen Account
   Vælger at se bort fra det specifikke timestamp-format og lader java's LocalDateTime-bibliotek klare det
  Transaction_date,Product,Price,Payment_Type,Card_Number,Name,City,State,Country,Account_Created,Last_Login,Latitude,Longitude
  1/4/09 13:17,Product1,1200,Mastercard,5287379262968457,Renee Elisabeth,Tel Aviv,Tel Aviv,Israel,1/4/09 13:03,1/4/09 22:10,32.0666667,34.7666667

 */
public class Account {

    int cardNumber;
    String name;
    String city;
    String country;
    LocalDateTime account_Created_LDT;

    public Account(String name, String city,  String country) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.account_Created_LDT = LocalDateTime.now();
    }

    public void setCreditCardNo(int creditCardNo) {
        this.cardNumber = creditCardNo;

        String str = String.valueOf(creditCardNo);
        int sum = 0;
        boolean alternate = false;
        for (int i = str.toCharArray().length - 1; i >= 0 ; i --) {

            int number = Integer.parseInt(str.substring(i,i+1));
            if (alternate) {
                number *= 2;
                if (number > 9) {
                    number = (number % 10) + 1;
                }
            }
            sum += number;
            alternate = !alternate;
        }
        System.out.println(sum % 10 == 0);
        if (alternate) {
            System.out.println("This is an invalid card");
        } else {
            System.out.println("This is a valid card");
        }
    }

    public int  getCreditCardNo() {
        return this.cardNumber;
    }

    public String getAccountCreated() {
        // Det er ok at returnere et "grimt" timestamp som f.eks 2020-03-05T10:50:44.378551
        String retValDate = account_Created_LDT.toString();
        return retValDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardNumber: " + cardNumber +
                ", name: " + name + '\'' +
                ", city: " + city + '\'' +
                ", country: " + country + '\'' +
                ", account_Created_LDT: " + account_Created_LDT +
                '}';
    }
}