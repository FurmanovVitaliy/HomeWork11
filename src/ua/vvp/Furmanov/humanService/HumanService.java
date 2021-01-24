package ua.vvp.Furmanov.humanService;

import ua.vvp.Furmanov.entities.Human;

import java.util.List;


public interface HumanService {


    void add(Human human);

    void remove(int index);

    List<Human> getHumanList();

    List<Human> searchByName(String name);

}
