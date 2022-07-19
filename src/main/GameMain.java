package main;

import judge.Judge;
import player.FraudPlayer;
import player.NormalPlayer;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {    //메인메소드가 존재하며 여기서 프로그램이 실행됩니다.
        String normalPlayerName, fraudPlayerName;

        Scanner scanner = new Scanner(System.in);
        System.out.println("일반 플레이어의 이름을 입력하시오: ");
        normalPlayerName = scanner.nextLine();                      //플레이어의 이름을 정할 수 있습니다.
        System.out.println("사기 플레이어의 이름을 입력하시오: ");
        fraudPlayerName = scanner.nextLine();

        Judge judge = new Judge(normalPlayerName, fraudPlayerName);                      //심판을 통해 선수등록을 할 수 있습니다.
        judge.start();
    }
}
