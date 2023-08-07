package ge.ayvazyan.calcapp.service;

public class ResultWriterService {
    public static void printResult(int num1, int num2, int result, String operationName) {
        String myResult = operationName + " " + num1 + " и " + num2 + " равно " + result;
        System.out.println(myResult);

    }
}
