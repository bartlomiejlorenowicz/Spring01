package pl.devmentoring.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "pl.devmentoring")
public class Spring01Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Spring01Application.class, args);

        RandomNumberGenerator numberGenerator = context.getBean(RandomNumberGenerator.class);
        RandomNumberChecker numberChecker = context.getBean(RandomNumberChecker.class);
        WinnerNumberChecker winnerNumberChecker = context.getBean(WinnerNumberChecker.class);

        int number = numberGenerator.generateNumber();
        boolean isWinnerNumber = numberChecker.isWinnerNumber(number);
        System.out.println(winnerNumberChecker.resultChecker(isWinnerNumber));
    }

}
