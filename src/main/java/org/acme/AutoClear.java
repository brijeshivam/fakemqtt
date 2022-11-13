package org.acme;

import io.quarkus.scheduler.Scheduled;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AutoClear {
    @Scheduled(every="24h")
    void autoClear() {
            System.out.println("cleared");
            ExampleResource.data.clear();
            System.out.println(ExampleResource.data);

    }
}
