package com.micronautapps.giri;

import javax.inject.Singleton;

@Singleton
public class HelloWorldService {
    public String getMessage() {
        return "Micronaut Controller + Service";
    }
}
