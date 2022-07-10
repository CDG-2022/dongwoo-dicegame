package dice;

import java.util.Random;

public class FraudDice {
    private int num = 0;

    public int ThrowFraudDice() {
        Random random = new Random();
        num = random.nextInt(6) + 1;    //주사위를 던지면 1~6 사이의 정수가 랜덤하게 나옵니다.
        return num;
    }



}
