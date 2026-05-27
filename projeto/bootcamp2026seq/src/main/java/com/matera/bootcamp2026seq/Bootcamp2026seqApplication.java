package com.matera.bootcamp2026seq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan(basePackages = "com.matera.bootcamp2026seq.estorno")
@SpringBootApplication
public class Bootcamp2026seqApplication implements CommandLineRunner {



    private ApplicationContext applicationContext;

    public Bootcamp2026seqApplication(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
        SpringApplication.run(Bootcamp2026seqApplication.class, args);
    }

    @Override
    public void run(String... args) {

        String[] beans = applicationContext.getBeanDefinitionNames();

        Arrays.sort(beans);

        for (String bean : beans) {
            System.out.println(bean);
        }
    }

}
