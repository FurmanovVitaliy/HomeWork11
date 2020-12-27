package ua.vvp.Furmanov.humanService;


import ua.vvp.Furmanov.entities.Human;
import ua.vvp.Furmanov.utils.HumanList;

import java.util.Scanner;

public class HumanService {

    Scanner sc =new Scanner(System.in);
    String nameSearch = sc.nextLine();

    private HumanList humans = new HumanList();

   public void addHuman(Human human){
       humans.add(human);
   }

    public HumanList getHumanList() {
       HumanList humanList= new HumanList();
       for (int i = 0; i <humans.size() ; i++) {
                humanList.add(humans.get(i));
           }
        return humans;
    }
}


