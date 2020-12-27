package ua.vvp.Furmanov.utils;

import ua.vvp.Furmanov.entities.Human;

import java.util.Arrays;

public class HumanList {

    private Human humans1 [] = new Human [0];

    public void add (Human human){
        humans1 = Arrays.copyOf(humans1,humans1.length+1);
        humans1[humans1.length-1] = human;
    }

    public void remove (int index){
        humans1 = Arrays.copyOf(humans1, humans1.length -1);

    }

    public Human get(int index) {
        return humans1[index];
    }

    public void set(int index, Human value){
        humans1[index]=value;
    }

    public int size(){
        return humans1.length;
    }

}


