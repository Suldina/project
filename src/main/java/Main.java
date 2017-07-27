import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) { // входная точка
        // создаем объект Calc, передаем ему читателя вокруг system.in
        // и тут же запускаем цикл чтения/печати
        new Calc(new InputStreamReader(System.in)).run();
    }
}
