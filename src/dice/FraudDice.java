package dice;

import player.FraudPlayer;

import java.util.Random;

public class FraudDice {        //주사위는 '사기주사위 '가 있습니다.
    private Random random = new Random();
    private int num = 0;
    private Mode mode;

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public int ThrowDice() {

        if(mode == Mode.STRONG){
            num = random.nextInt(4) + 3;
        }

        else if(mode == Mode.WEEK){
            num = random.nextInt(4) + 1;
        }

        else{
            num = random.nextInt(6) + 1;
        }
        return num;
    }
}
