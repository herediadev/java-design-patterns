package main.demo2;

public class CreditCard {

    private final ValidationStrategy validationStrategy;

    private String cvv;
    private String date;
    private String number;

    public CreditCard(ValidationStrategy validationStrategy) {

        this.validationStrategy = validationStrategy;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isValid() {
        return validationStrategy.isValid(this);
    }
}
