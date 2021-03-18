package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Account> myAccounts = new ArrayList<>();
        myAccounts.add(new Account("Jayas","Copenhagen","Denmark"));
        myAccounts.add(new Account("Tiril","Oslo","Norge"));
        myAccounts.add(new Account("Otto","Copenhagen","Denmark"));
        myAccounts.add(new Account("ItaEow","Copenhagen","Denmark"));


        myAccounts.get(1).setCreditCardNo(79927398);
        System.out.println(myAccounts.get(1).toString());
    }
}
