package ru.aston.babin_sa.task10.animal;

public class Cat implements Animal{

    @Override
    public void say() {
        System.out.println("Cat created");
    }

    public void init() throws Exception {
        System.out.println("Cat: init");
    }

    public void destroy() throws Exception {
        System.out.println("Cat: destroy");
    }
}
