package ua.vvp.Furmanov.humanService;

import ua.vvp.Furmanov.entities.Human;

import java.util.ArrayList;
import java.util.List;

public class LocalHumanService implements HumanService {


    private List<Human> humanList = new ArrayList<>();

    @Override
    public void add(Human human) {
        humanList.add(human);
    }

    @Override
    public void remove(int index) {
        humanList.remove(index);
    }

    @Override
    public List<Human> getHumanList() {
        return humanList;
    }

    @Override
    public List<Human> searchByName(String name) {
        List<Human> resultOfSearchByName = new ArrayList<>();
        for (int i = 0; i < humanList.size(); i++) {
            Human human = humanList.get(i);
            if (human.getName().equals(name) || human.getSurname().equals(name)) {
                resultOfSearchByName.add((human));
            }
        }
        return resultOfSearchByName;
    }
}

