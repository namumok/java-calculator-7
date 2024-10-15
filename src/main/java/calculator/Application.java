package calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        InputHandler inputHandler = new InputHandler();
        Calculator cal = new Calculator(inputHandler.getUserInput());
        cal.extractNumbers();


    }
}
