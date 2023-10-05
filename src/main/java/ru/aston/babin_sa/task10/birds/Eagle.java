package ru.aston.babin_sa.task10.birds;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Eagle implements Birds, InitializingBean, DisposableBean {
    @Override
    public void say() {
        System.out.println("Eagle created");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Eagle: init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Eagle: destroy");
    }
}
