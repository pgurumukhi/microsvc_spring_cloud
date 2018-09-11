package com.pankajg.lab5word;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Controller {

    private final Random random = new Random();

    @Value("${words}")
    String[] words;

    @GetMapping("/")
    public String getWord(){
        return words[random.nextInt(words.length)];
    }
}
