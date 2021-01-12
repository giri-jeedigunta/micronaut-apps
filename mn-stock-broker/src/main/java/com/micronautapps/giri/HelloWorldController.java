package com.micronautapps.giri;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloWorldController {

    @Get("/")
    public String index() {
        return "Hello from Micronaut";
    }
}
