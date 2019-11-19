package pl.krakow.uek.pp5.KacperMo.creditcardapp.model;

public interface CreditCardStorage {
    void add(CreditCard card);
    CreditCard load(String creditCardNumber);
}
