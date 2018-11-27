package com.sample.dependencyinjection;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependecyInjection {

    /**
     * ClassPathXmlApplicationContext -
     * FilePathXmlApplicationContext -
     * WebPathXmlApplicationContext -
     *
     * @param args
     */
    public static void main(final String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        final TemporaryAddress temporaryAddress = (TemporaryAddress)context.getBean("tempAddress");
        System.out.println(temporaryAddress);
/*
        final PermanentAddress pAddress = (PermanentAddress) context.getBean("pAddress");
        System.out.print(pAddress);
*/
    }

}
