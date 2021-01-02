package ua.vvp.Furmanov.humanService;
import ua.vvp.Furmanov.entities.Human;
import ua.vvp.Furmanov.utils.HumanList;

public class HumanService {

    public HumanList searchByName(String name,HumanList humanList){

      HumanList resultOfSearchByName = new HumanList();

        for (int i = 0; i <humanList.size(); i++) {
          Human human= humanList.get(i);
          if(human.getName().equals(name)){
             resultOfSearchByName.add((human));
          }
      }
        return resultOfSearchByName;
    }

    public HumanList searchBySurname(String surname,HumanList humanList){
        HumanList resultOfSearchBySurname = new HumanList();
        for (int i = 0; i <humanList.size(); i++) {
            Human human= humanList.get(i);
            if(human.getSurname().equals(surname)){
                resultOfSearchBySurname.add((human));
            }
        }
        return resultOfSearchBySurname;
    }
}


