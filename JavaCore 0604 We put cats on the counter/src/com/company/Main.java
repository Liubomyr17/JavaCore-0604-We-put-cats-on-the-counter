package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

0604 Ставим котов на счётчик

В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.

Требования:
1. Добавь в класс Cat конструктор без параметров public Cat().
2. Конструктор класса должен на 1 увеличивать значение переменной catCount.
3. Добавь в класс Cat метод finalize.
4. Метод finalize ничего не должен возвращать (тип возвращаемого значения void).
5. Метод finalize должен уменьшать переменную catCount на 1.

*/

// public class Cat
public class Main {
public static int catCount = 0;
public Main() {
    catCount++;
}
protected void finalize() throws Throwable {
    catCount--;
}
    public static void main(String[] args) {
    }
}









