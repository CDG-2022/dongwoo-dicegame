package recorder;

import dice.Mode;


public class Recorder {
    private int normalPlayerScore;
    private int fraudPlayerScore;
    private Mode mode;
    private String normalPlayerName, fraudPlayerName;

    public void setNormalPlayerName(String normalPlayerName) {
        this.normalPlayerName = normalPlayerName;
    }

    public void setFraudPlayerName(String fraudPlayerName) {
        this.fraudPlayerName = fraudPlayerName;
    }

    public void setNormalPlayerScore(int normalPlayerScore) {
        this.normalPlayerScore = normalPlayerScore;
    }

    public void setFraudPlayerScore(int fraudPlayerScore) {
        this.fraudPlayerScore = fraudPlayerScore;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void printResult() {
        System.out.println(fraudPlayerName + ": " + fraudPlayerScore + "[" + mode + "] "
                + normalPlayerName +  ": " + normalPlayerScore);
    }

    public void printWinner() {
        System.out.println("승자를 기록합니다");
        if(normalPlayerScore > fraudPlayerScore){
            System.out.println(normalPlayerName + "님이 승리 했습니다");
        } else if(normalPlayerScore < fraudPlayerScore){
            System.out.println(fraudPlayerName + "님이 승리 했습니다");
        } else{
            System.out.println("비겼습니다");
        }
    }

}

