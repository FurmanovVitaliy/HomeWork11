package ua.vvp.Furmanov;

import ua.vvp.Furmanov.entities.Human;
import ua.vvp.Furmanov.humanService.HumanService;
import ua.vvp.Furmanov.utils.HumanList;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  String sc= "Вася";
        //  String a= "1";
        //  HumanService humanService = new HumanService();
        //  for (int i = 0; i <5 ; i++) {
        //      String s=sc;
        //      String c=a;
        //      Human human = new Human(s,s,c);
        //      humanService.addHuman(human);
        //  }
        //  HumanList result = humanService.getHumansByName();

        //   for (int i = 0; i < result.size(); i++) {
        //       Human human = result.get(i);
        //       System.out.println(human.getPatronymic()+" "+ human.getName());

        HumanService humanService = new HumanService();

        Human h1 = new Human("Danil", "Petrov", "Ivanovich");
        Human h2 = new Human("Ivan", "Saigo", "Vahtangovich");
        Human h3 = new Human("Suliman", "Petrov", "Jakovich");
        Human h4 = new Human("Ursula", "Kolska", "Jurivna");
        Human h5 = new Human("Ursula", "Kolska", "Jurivna");
        Human h6 = new Human("Ursula", "Kolska", "Jurivna");
        humanService.addHuman(h1);
        humanService.addHuman(h2);
        humanService.addHuman(h3);
        humanService.addHuman(h4);
        humanService.addHuman(h5);
        humanService.addHuman(h6);

        HumanList result = humanService.getHumanList();
        for (int i = 0; i < result.size(); i++) {
            Human human = result.get(i);
            System.out.println(human.getPatronymic() + " " + human.getName());
        }


        }
    }