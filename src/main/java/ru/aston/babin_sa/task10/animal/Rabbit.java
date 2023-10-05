package ru.aston.babin_sa.task10.animal;

public class Rabbit implements Animal{
    @Override
    public void say() {
        System.out.println("Rabbit created");
    }

    public void init() throws Exception {
        System.out.println("Rabbit: init");
    }

    public void destroy() throws Exception {
        System.out.println("Rabbit: destroy");
    }
}
