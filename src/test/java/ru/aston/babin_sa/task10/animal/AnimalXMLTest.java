package ru.aston.babin_sa.task10.animal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalXMLTest {

    @Test
    public void shouldGetAnimal() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal animalDog1 = context.getBean("dog", Dog.class);
        Animal animalDog2 = context.getBean("dog", Dog.class);
        Animal animalCat1 = context.getBean("cat", Cat.class);
        Animal animalCat2 = context.getBean("cat", Cat.class);
        animalDog1.say();
        animalDog2.say();
        animalCat1.say();
        animalCat2.say();

        context.close();

        Assertions.assertEquals(animalDog1, animalDog2);
        Assertions.assertEquals(animalCat1, animalCat2);
    }

    @Test
    public void shouldGetAnimalPrototype() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal animalRabbit1 = context.getBean("rabbit", Rabbit.class);
        Animal animalRabbit2 = context.getBean("rabbit", Rabbit.class);
        animalRabbit1.say();
        animalRabbit2.say();

        context.close();

        Assertions.assertNotEquals(animalRabbit1, animalRabbit2);
    }
}
