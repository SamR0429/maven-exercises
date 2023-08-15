import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something");
        String userInput = scanner.next();


        StringUtils.swapCase(userInput);
        System.out.println(swapCase(userInput));

        StringUtils.reverse(userInput);
        System.out.println(reverse(userInput));

        StringUtils.isNumeric(userInput);
        System.out.println(isNumeric(userInput));

    }

}
