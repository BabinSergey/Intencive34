package ru.aston.babin_sa.task10.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.aston.babin_sa.task10.birds.Birds;

public class Man implements Human{

    private Birds birds;

    public Man() {
        System.out.println("Man created");
    }

    @Override
    public void eat() {
        System.out.println("eat Man");
    }

    public void manBirds() {
        System.out.println("Birds Man say");
        birds.say();
    }


    @Qualifier("crowBean")
    public void setBirds(Birds birds) {
        System.out.println("set birds");
        this.birds = birds;
    }
}
