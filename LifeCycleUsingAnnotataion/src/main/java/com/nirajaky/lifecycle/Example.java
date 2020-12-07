package com.nirajaky.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        System.out.println("Setting Method");
        this.subject = subject;
    }

    public Example() {
        super();
    }

    public Example(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println("Staring Method with Annotation");
    }
    @PreDestroy
    public void end(){
        System.out.println("Ending Method with Annotation");
    }

}
