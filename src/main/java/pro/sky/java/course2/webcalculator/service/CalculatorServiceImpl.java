package pro.sky.java.course2.webcalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override

    public String hellocalculator(){
        return "Добро пожаловать в калькулятор";
    }
    @Override
    public String plus(double num1,double num2){
        double result= num1+num2;
        return num1+"+"+num2+"="+result;
    }
    @Override
    public String minus(double num1,double num2){
        double result=num1-num2;
        return num1+"-"+num2+"="+result;
    }
    @Override
    public String multiply(double num1,double num2){
        double result=num1*num2;
      return num1+"x"+num2+"="+result;

    }
    @Override
    public String divide(double num1,double num2){
        double result=num1/num2;
        return num1+":"+num2+"="+result;
    }
}
