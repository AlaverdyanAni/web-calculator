package pro.sky.java.course2.webcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hellocalculator() {
        return calculatorService.hellocalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam(name = "num1", required = false) Integer num1,
                       @RequestParam(name = "num2", required = false) Integer num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam(name = "num1", required=false) Integer num1,
                       @RequestParam(name = "num2", required = false) Integer num2) {
        return calculatorService.minus(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam(name = "num1", required = false) Integer num1,
                        @RequestParam(name = "num2", required = false) Integer num2) {
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer num1,
                           @RequestParam(name = "num2", required = false) Integer num2) {

        return calculatorService.divide(num1, num2);
    }
}

