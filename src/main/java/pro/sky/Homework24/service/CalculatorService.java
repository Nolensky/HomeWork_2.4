package pro.sky.Homework24.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    private Integer num1;
    private Integer num2;

    public String plus( Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return "Вы ввели неверные данные!!!";
        }
        return number1 + " + " + number2 + " = " + (number1 + number2);
    }

    public String minus(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return "Вы ввели неверные данные!!!";
        }
        return number1 + " - " + number2 + " = " + (number1 - number2);
    }

    public String multiply( Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            return "Вы ввели неверные данные!!!";
        }
        return number1 + " * " + number2 + " = " + (number1 * number2);
    }

    public String divide(Double number1, Double number2) {
        if (number1 == null || number2 == null) {
            return "Вы ввели неверные данные!!!";
        } else if (number2 == 0) {
            return "На ноль делить нельзя!";
        }
        return number1 + " : " + number2 + " = " + (number1 / number2);

    }

}
