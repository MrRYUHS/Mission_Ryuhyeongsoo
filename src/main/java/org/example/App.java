package org.example;

import java.util.Scanner;

public class App {
    public void run(){
        System.out.println("== 명언 앱 ==");
        while(true){
            System.out.print("명령) ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")){
                break;
            }

            System.out.printf("입력 받은 명령어 : %s/n", cmd);
        }
    }
}