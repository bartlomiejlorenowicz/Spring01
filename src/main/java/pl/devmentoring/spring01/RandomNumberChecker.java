package pl.devmentoring.spring01;

import org.springframework.stereotype.Component;

@Component
public class RandomNumberChecker {

    public boolean isWinnerNumber(int number) {
        return number == 7;
    }

}
