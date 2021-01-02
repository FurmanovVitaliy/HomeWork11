package ua.vvp.Furmanov;

import ua.vvp.Furmanov.entities.Human;
import ua.vvp.Furmanov.humanService.HumanService;
import ua.vvp.Furmanov.ui.HumanUI;
import ua.vvp.Furmanov.utils.HumanList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        HumanUI ui = new HumanUI(sc,num);
        HumanList humanList = new HumanList();
        HumanService humanService = new HumanService();

        while (true){
            System.out.println("-----Press one of the next--------");
            System.out.println("1.To add person");
            System.out.println("2.To remove person");
            System.out.println("3.Search by name");
            System.out.println("4.Search by surname");
            System.out.println("5.Show list of people");
            System.out.println("6.Exit");
            System.out.println("----------------------------------");
            System.out.print("Enter the num: ");
            int menu = num.nextInt();

            if (menu == 1)ui.addHumans(humanList);
            else if (menu == 2)ui.remove(humanList);
            else if (menu == 3)ui.searchByName(humanService,humanList);
            else if (menu == 4)ui.searchBySurname(humanService,humanList);
            else if (menu == 5)ui.showList(humanList);
            else if (menu == 6) break;

        }


        }
    }