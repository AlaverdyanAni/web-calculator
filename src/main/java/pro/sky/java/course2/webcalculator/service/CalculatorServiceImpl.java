package pro.sky.java.course2.webcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override

    public String hellocalculator(){
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public double plus(double num1,double num2){
        return num1+num2;
    }
    @Override
    public double minus(double num1,double num2){
        return num1-num2;
    }
    @Override
    public double multiply(double num1,double num2){
        return num1*num2;

    }
    @Override
    public double divide(double num1,double num2){
        return num1/num2;
    }
}
