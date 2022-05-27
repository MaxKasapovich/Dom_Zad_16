package com.company;

public class MoneyTransactionUtil {

    private String cardNumSender;
    private String cardNumReceiver;
    private double sum;

    private MoneyTransactionUtil(String cardNumSender, String cardNumReceiver, double sum) {
        this.cardNumSender = cardNumSender;
        this.cardNumReceiver = cardNumReceiver;
        this.sum = sum;
    }

    public String getCardNumSender() {
        return cardNumSender;
    }

    public void setCardNumSender(String cardNumSender) {
        this.cardNumSender = cardNumSender;
    }

    public String getCardNumReceiver() {
        return cardNumReceiver;
    }

    public void setCardNumReceiver(String cardNumReceiver) {
        this.cardNumReceiver = cardNumReceiver;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public static void sendTo(String cardNumSender, String cardNumReceiver, double sum) throws AccountException, MoneyValueExeption {
        if (cardNumSender.equals(cardNumReceiver)){
            throw new AccountException();
        }else if (sum <= 0 || sum > 100000){
            throw new MoneyValueExeption();
        }else{
            System.out.println("Amount: " + sum + " from account " + cardNumSender +" successfully transferred to account " + cardNumReceiver + ".");
        }
    }
}
