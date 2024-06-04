package pl.devmentoring.spring01;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomNumberGenerator {

    public int generateNumber() {
        Random rnd = new Random();
        return rnd.nextInt(10) + 1;
    }
}
