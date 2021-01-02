package ua.vvp.Furmanov.utils;

import ua.vvp.Furmanov.entities.Human;

import java.util.Arrays;

public class HumanList {
    private Human[] humans = new Human[0];

    public void add(Human humanToAdd) {
        for (int i = 0; i < humans.length; i++) {
            if (humanToAdd.equals(humans[i])) System.out.println("!!! Human " + humanToAdd + " is duplicate, please delete human whith index " + i);
        }
        humans = Arrays.copyOf(humans, humans.length + 1);
        humans[humans.length - 1] = humanToAdd;

    }

    public void remove(int index) {
        Human[] humansFix = new Human[humans.length - 1];
        for (int i = 0; i < humansFix.length; i++) {
            if (i < index) {
                humansFix[i] = humans[i];
            } else {
                humansFix[i] = humans[i + 1];
            }
        }
        humans = null;
        humans = humansFix;

    }

    public void set(int index, Human h) {
        humans[index] = h;
    }

    public Human get(int index) {
        return humans[index];
    }

    public int size() {
        return humans.length;
    }

}



