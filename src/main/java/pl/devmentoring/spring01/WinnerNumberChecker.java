package pl.devmentoring.spring01;

import org.springframework.stereotype.Component;

@Component
public class WinnerNumberChecker {

    public String resultChecker(boolean isWining) {
        if (isWining) {
            return "The number is winning";
        } else {
            return "The number is not winning";
        }
    }
}
