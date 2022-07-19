package dice;

import java.util.Random;

public class NormalDice implements Dice{                 //주사위는 아무 특징이 없는 일반 '주사위' 가 있습니다.
    private Random random = new Random();
    private int num = 0;

    @Override
    public int ThrowDice() {
        num = random.nextInt(6) + 1;    //주사위를 던지면 1~6 사이의 정수가 랜덤하게 나옵니다.
        return num;
    }
}
