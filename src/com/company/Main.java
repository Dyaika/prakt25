package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("test.txt");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        fileWriter.write(str);
        fileWriter.close();
    }
}
