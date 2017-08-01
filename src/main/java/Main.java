package com.company
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleCalc {
    Calc calc= new Calc ();
    double frst = 0;
    double scnd = 0;
    String sign = '';
    double res=0;

    BufferedReader reader= new Bufferedreader (new InputStreamReader (System.in));
    try {
        frst =Double.parseDouble(reader.readLine());
        scnd=Double.parseDouble(reader.readLine());
        sign= reader.readLine();
    } catch (NumberFormatException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    switch (sign) {
        case "+":
            res=calc.plus (frst, scnd);
            break;
        case "-":
            res=calc.minus (frst, scnd);
            break;
        case "*":
            res=calc.multiply (frst, scnd);
            break;
        case "/":
            res=calc.div (frst, scnd);
            break;

    }
