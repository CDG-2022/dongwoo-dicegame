package judge;

import dice.Mode;
import dice.NormalDice;
import dice.FraudDice;
import player.Player;
import recorder.Recorder;

public class Judge {

    private String normalPlayerName, fraudPlayerName;// 심판을 통해 선수등록을 할 수 있습니다.
    private Mode mode;
    private int normalNum = 0, fraudNum = 0;                  //주사위 숫자
    private boolean lose = false, overWhelm = false;          //사기 유저의 승리, 거만 여부

    Recorder recorder = new Recorder();
    NormalDice normaldice = new NormalDice();
    FraudDice fraudDice = new FraudDice();

    private int times = 5;          //주사위를 서로 몇번 던질것인지에 대해 지정할 수 있습니다 주사위는 5번 던지는것으로 하겠습니다.

    public Judge(Player normalPlayer, Player fraudPlayer) {
        this.normalPlayerName = normalPlayerName;
        this.fraudPlayerName = fraudPlayerName;
    }

    public void start() {
        for(int i = 0; i < times; i++){     //주사위는 5번 던지는것으로 하겠습니다.
            mode = fraudPlayer.mode(lose, overWhelm);       //사기주사위 모드 설정
            fraudDice.setMode(mode);                        //사기주사위 모드 주입
            normalNum = normaldice.ThrowDice();                   //일반 주사위 던짐
            fraudNum = fraudDice.ThrowDice();          //사기 주사위 던짐
            normalplayer.calTotal(normalNum);                     //일반 사용자 총 점수 기록
            fraudPlayer.calTotal(fraudNum);                 //사기 사용자 총 점수 기록
            judgement();
            setRecorder();
            recorder.printResult();
        }
        recorder.printWinner();
    }

    public void setRecorder() {                             //recorder 클래스에 값들 set
        recorder.setNormalPlayerName(normalPlayerName);         //일반 사용자 이름 set
        recorder.setFraudPlayerName(fraudPlayerName);           //사기 사용자 이름 set
        recorder.setNormalPlayerScore(normalplayer.getTotal());       //일반 사용자 누적점수 set
        recorder.setFraudPlayerScore(fraudPlayer.getTotal());   //사기 사용자 누적점수 set
        recorder.setMode(mode);                                 //사기 사용자 모드 set
    }

    public void judgement() {               //사기 유저의 승리, 거만 여부 최신화
        if (normalNum > fraudNum){
            lose = true;
        } else if(normalNum < fraudNum){
            lose = false;
        } else{
            lose = true;
        }
        if(fraudNum - normalNum > 5){
            overWhelm = true;
        }else{
            overWhelm = false;
        }
    }
}
