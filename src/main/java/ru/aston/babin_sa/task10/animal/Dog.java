package ru.aston.babin_sa.task10.animal;

public class Dog implements Animal{
    @Override
    public void say() {
        System.out.println("Dog created");
    }

    public void init() throws Exception {
        System.out.println("Dog: init");
    }

    public void destroy() throws Exception {
        System.out.println("Dog: destroy");
    }
}
