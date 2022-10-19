package pro.sky.java.course2.webcalculator.controller;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private String hello="Добро пожаловать в калькулятор";
    private String Error_missing_parameters="Введите цифры!";
    private String Error_division_by_zero="На 0 делить нельзя!";

    @Override

    public String hellocalculator(){
        return hello;
    }
    @Override
    public String plus(Integer num1,Integer num2){

        if (num1==0 || num2==0){
            return Error_missing_parameters;
        }
        double result=num1+num2;
        return num1+"+"+num2+"="+result;
    }
    @Override
    public String minus(Integer num1,Integer num2){
        if (num1==0 || num2==0) {
            return Error_missing_parameters;
        }
        double result=num1-num2;
        return num1+"-"+num2+"="+result;
    }
    @Override
    public String multiply(Integer num1,Integer num2){
        if (num1==0 || num2==0) {
            return Error_missing_parameters;
        }
        double result=num1*num2;
      return num1+"x"+num2+"="+result;

    }
    @Override
    public String divide(Integer num1,Integer num2){
        if (num1==0 || num2==0) {
            return Error_missing_parameters;
        }
        double result=num1/num2;
        return num1+":"+num2+"="+result;
    }
}
