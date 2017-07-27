package com.company;

/**
 * Created by U_M0WJG on 27.07.2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Calc  (InputStreamReader isr) {
        in = new BufferedReader(isr);
private static BufferedReader console() {
        return new BufferedReader(new InputStreamReader(System.in));
        }

private static String read() throws IOException {
        return console().readLine();
        }
public void ParsingAndCalculate(string str){
        StringBuilder intemed  = new StringBuilder();
        double argum1=0; //накопительная переменная для результата
        char sign=' '; //знак
//        int state=0;  //  режим, 0 - чтение первого числа, 1 - чтение знака, 2 - чтение второго числа
        int i=0;
        string str=" ";

        for (int i=0; str.lenght(), i++){
            while(str[i]not in {'+','-','*','/'} // пока не встретим арифм. знак операции, не знаю, как синтаксически пишется
            {intermed.append(intermed); // добавляем  в конец строки  intermed следующую цифру
            i++;
            }
            sign=str[i]; // записываем в sign текущий символ
            switch (sign) {
                case "+":
                return argum1=argum1 + intermed;
                case "-":
                return argum1=argum1 - intermed;
                case "*":
                return argum1=argum1 * intermed;
                case "/":
                if (intermed != 0) {
                    return argum1=argum1 / intermed;
                }
                else {
                    System.out.println("Деление на ноль невозможно!");
                  break;
                }



            break;
            }argum1=intermed; // записываем в argum1 промежуточное значение intermed
            intermed=0; //обнуляем intermed
            }
        System.out.println(


        }


        }