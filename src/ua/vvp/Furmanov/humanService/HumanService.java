package ua.vvp.Furmanov.humanService;
import ua.vvp.Furmanov.entities.Human;
import ua.vvp.Furmanov.utils.HumanList;

import java.util.ArrayList;
import java.util.List;

public class HumanService {

    public List<Human> searchByName(String name, List<Human> humanList){
        List <Human> resultOfSearchByName = new ArrayList<>();
        for (int i = 0; i <humanList.size(); i++) {
          Human human= humanList.get(i);
          if(human.getName().equals(name) || human.getSurname().equals(name) ){
             resultOfSearchByName.add((human));
          }
      }
        return resultOfSearchByName;
    }
}


