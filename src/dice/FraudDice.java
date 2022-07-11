package dice;

import player.FraudPlayer;

import java.util.Random;

public class FraudDice {        //주사위는 '사기주사위 '가 있습니다.
    Random random = new Random();
    private int num = 0;
    private String mode;

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int ThrowFraudDice() {
        switch(mode) {
            case "strong":
                num = random.nextInt(4) + 3;
                break;
            case "week":
                num = random.nextInt(4) + 1;
                break;
            default:
                num = random.nextInt(6) + 1;
        }
        return num;
    }
}
