package ru.aston.babin_sa.task10.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.aston.babin_sa.task10.birds.Birds;
import ru.aston.babin_sa.task10.birds.Crow;
import ru.aston.babin_sa.task10.birds.Eagle;
import ru.aston.babin_sa.task10.birds.Pigeon;
import ru.aston.babin_sa.task10.person.Human;
import ru.aston.babin_sa.task10.person.Man;

@Configuration
public class Config {

    @Bean
    public Birds crowBean() {
        return new Crow();
    }

    @Bean
    public Birds eagleBean() {
        return new Eagle();
    }

    @Bean
    @Scope("prototype")
    public Birds pigeonBean() {
        return new Pigeon();
    }

    @Bean
    public Human manBean() {
        return new Man();
    }
}
