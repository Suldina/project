package com.calc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    Calc plus = new Plus();
    Calc minus = new Minus();
    Calc multiply = new Multiply();
    Calc div = new Div();
    double frst = 0;
    double scnd = 0;
    String sign = "";
    double res = 0;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
        System.out.println("Введите первое число");
        frst = Double.parseDouble(reader.readLine());
        System.out.println("Введите знак операции");
        sign = reader.readLine()
        System.out.println("Введите второе число");
        scnd = Double.parseDouble(reader.readLine());

    } catch(
    NumberFormatException e)

    {
        e.printStackTrace();
    } catch(
    IOException e)

    {
        e.printStackTrace();
    }
    switch(sign)

    {
        case "+":
            res = Plus.calculate(frst, scnd);
            break;
        case "-":
            res = Minus.calculate(frst, scnd);
            break;
        case "*":
            res = Multiply.calculate(frst, scnd);
            break;
        case "/":
            res = Div.calculate(frst, scnd);
            break;

    }
}