package main.demo2;

public class StrategyDemo2 {
    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());

        amexCard2.setNumber("379185883464282");
        amexCard2.setDate("04/2021");
        amexCard2.setCvv("234");

        System.out.println("Is Amex valid: " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4539589763663402");
        visaCard.setDate("04/2024");
        visaCard.setCvv("999");

        System.out.println("Is Amex valid: " + visaCard.isValid());
    }
}
