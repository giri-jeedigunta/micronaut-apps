package com.micronautapps.giri;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller
public class HelloWorldController {

    // WE CAN AVOID THIS APPROCACH BY Simply using @inject
//    private final HelloWorldService service;
//
//    public HelloWorldController(HelloWorldService service) {
//        this.service = service;
//    }

    @Inject
    private HelloWorldService service;

    @Get("/")
    public String index() {
        return service.getMessage();
    }
}
