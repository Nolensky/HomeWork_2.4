package pro.sky.Homework24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Homework24.service.CalculatorService;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculator() {
        return "Приветствуем вас в программе \"Калькулятор\"";
    }

    @GetMapping("/calculate")
    public String hello() {
        return "Введите арифметическое действие и два числа";
    }

    @GetMapping("/calculate/plus")
    public String plus(
            @RequestParam(value = "num1", required = false) Integer number1,
            @RequestParam(value = "num2", required = false) Integer number2) {
        return calculatorService.plus(number1, number2);
    }

    @GetMapping("/calculate/minus")
    public String minus(
            @RequestParam(value = "num1", required = false) Integer number1,
            @RequestParam(value = "num2", required = false) Integer number2) {
        return calculatorService.minus(number1, number2);
    }

    @GetMapping("/calculate/multiply")
    public String multiply(
            @RequestParam(value = "num1", required = false) Integer number1,
            @RequestParam(value = "num2", required = false) Integer number2) {
        return calculatorService.multiply(number1, number2);
    }

    @GetMapping("/calculate/divide")
    public String divide(
            @RequestParam(value = "num1", required = false) Double number1,
            @RequestParam(value = "num2", required = false) Double number2) {

        return calculatorService.divide(number1, number2);
    }
}

