package me.kwj1270.springboot.cors.restservicecors;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {


    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    // @CrossOrigin(origins = {"1", "2"}, methods = {RequestMethod.GET, RequestMethod.POST}, maxAge = 300 )
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(required = false, defaultValue = "World") String name) {
        System.out.println("==== get greeting ====");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/greeting-javaconfig")
    public Greeting greetingWithJavaconfig(@RequestParam(required = false, defaultValue = "World") String name) {
        System.out.println("==== in greeting ====");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}


