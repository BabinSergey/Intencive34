package ru.aston.babin_sa.task10.person;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.aston.babin_sa.task10.config.Config;

public class HumanTest {

    @Test
    public void shouldGetMan() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Human man1 = context.getBean("manBean", Man.class);
        man1.eat();

        context.close();

    }

}
