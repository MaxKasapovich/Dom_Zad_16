package com.company;

public class UserBank {

    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo("1234567890","1234567890", 888);
        }catch (AccountException e){
            System.out.println("Error with bank details. It is possible that the card number of the sender and the recipient are the same.");
        }catch (MoneyValueExeption e){
            System.out.println("Error with the amount sent. The amount must be greater than 0. The amount must not exceed the limit of 100000.00");
        }
    }
}
