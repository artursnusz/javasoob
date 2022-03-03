package pl.javastart.logic;

import pl.javastart.model.Telephone;

public class Charger {
    public void charge(Telephone telephone) {
        int currentCharge = telephone.getChargeLevel();
        telephone.setChargeLevel(currentCharge + 1);
    }
}