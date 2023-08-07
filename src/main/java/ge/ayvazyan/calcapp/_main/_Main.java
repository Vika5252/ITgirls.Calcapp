package ge.ayvazyan.calcapp._main;


import ge.ayvazyan.calcapp.service.ResultWriterService;
import ge.ayvazyan.calcapp.until.Calculator;

public class _Main {
    public static void main(String[] args) {
        int num1 = 156;
        int num2 = 20;
        int sumResult = Calculator.sum(num1,num2);
        int difResult = Calculator.difference(num1,num2);
        int prodResult = Calculator.product(num1,num2);

        ResultWriterService.printResult(num1,num2,sumResult, "Сумма");
        ResultWriterService.printResult(num1,num2,difResult,"Разность");
        ResultWriterService.printResult(num1,num2,prodResult,"Произведение");
    }
}