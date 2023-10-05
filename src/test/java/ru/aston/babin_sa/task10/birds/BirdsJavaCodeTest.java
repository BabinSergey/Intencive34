package ru.aston.babin_sa.task10.birds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.aston.babin_sa.task10.config.Config;

public class BirdsJavaCodeTest {

    @Test
    public void shouldGetBirds() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Birds birdsCrow1 = context.getBean("crowBean", Crow.class);
        Birds birdsCrow2 = context.getBean("crowBean", Crow.class);
        Birds birdsEagle1 = context.getBean("eagleBean", Eagle.class);
        Birds birdsEagle2 = context.getBean("eagleBean", Eagle.class);
        birdsCrow1.say();
        birdsCrow2.say();
        birdsEagle1.say();
        birdsEagle2.say();

        context.close();

        Assertions.assertEquals(birdsCrow1, birdsCrow2);
        Assertions.assertEquals(birdsEagle1, birdsEagle2);

    }

    @Test
    public void shouldGetAnimalPrototype() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Birds birdsPigeon1 = context.getBean("pigeonBean", Pigeon.class);
        Birds birdsPigeon2 = context.getBean("pigeonBean", Pigeon.class);

        context.close();

        Assertions.assertNotEquals(birdsPigeon1, birdsPigeon2);
    }
}
