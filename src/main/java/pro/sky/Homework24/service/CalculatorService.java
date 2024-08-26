package pro.sky.Homework24.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {

    public Integer plus( Integer number1, Integer number2) {
        return(number1 + number2);
    }

    public Integer minus(Integer number1, Integer number2){
        return (number1 - number2);
    }

    public Integer multiply( Integer number1, Integer number2) {
        return (number1 * number2);
    }

    public Double divide(Double number1, Double number2) {
        return (number1 / number2);

    }

}
