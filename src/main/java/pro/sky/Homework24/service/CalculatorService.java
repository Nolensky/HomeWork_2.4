package pro.sky.Homework24.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    private Integer num1;
    private Integer num2;

    public String plus(@RequestParam("num1") Integer number1,
                       @RequestParam("num2") Integer number2) {
        if (number1 == null || number2 == null) {
            return "Вы ввели неверные данные!!!";
        }
        return number1 + " + " + number2 + " = " + (number1 + number2);
    }

    public String minus(@RequestParam("num1") Integer number1,
                        @RequestParam("num2") Integer number2) {
        if (number1 == null || number2 == null) {
            return "Вы ввели неверные данные!!!";
        }
        return number1 + " - " + number2 + " = " + (number1 - number2);
    }

    public String multiply(@RequestParam("num1") Integer number1,
                           @RequestParam("num2") Integer number2) {
        if (number1 == null || number2 == null) {
            return "Вы ввели неверные данные!!!";
        }
        return number1 + " * " + number2 + " = " + (number1 * number2);
    }

    public String divide(@RequestParam("num1") Double number1,
                         @RequestParam("num2") Double number2) {
        if (number1 == null || number2 == null) {
            return "Вы ввели неверные данные!!!";
        } else if (number2 == 0) {
            return "На ноль делить нельзя!";
        }
        return number1 + " : " + number2 + " = " + (number1 / number2);

    }

}
