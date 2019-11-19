package pl.krakow.uek.pp5.jkan.creditcardapp.model;

import pl.krakow.uek.pp5.KacperMo.creditcardapp.model.CreditCardStorage;

import java.util.HashMap;

public class InMemoryCCStorage implements CreditCardStorage {
    private HashMap<String, CreditCard> cards;
    InMemoryCCStorage() {
        cards = new HashMap<String, CreditCard>();
    }
    public void add(CreditCard card) {
        cards.put(card.cardNumber, card);
    }

    public CreditCard load(String creditCardNumber) {
        return cards.get(creditCardNumber);
    }
}