package tech.marcusvieira;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@Component
@ManagedResource(objectName = "tech.marcusvieira.spring-jmx:name=ExampleMBean")
public class ExampleMBean {

    @ManagedOperation
    public void printHello(String name) {
        System.out.println("Hello " + name);
    }
}

