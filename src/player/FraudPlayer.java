package player;

public class FraudPlayer {

    private String name;    //플레이어는 이름을 정할수 있고, 주사위를 들고있습니다. 또한 본인의 합계득점을 기억합니다.
    private int total;
    private String level;

    public FraudPlayer(String name) {
        this.name = name;
        this.total = 0;
    }

    public void setTotal(int total) {       //또한 본인의 합계득점을 기억합니다.
        this.total += total;
    }

    public int getTotal() {
        return total;
    }

    public String mode(boolean win, boolean overWhelm) {
        if(win == false) {
            level = "strong";   //사기플레이어는 지고있을경우 사기주사위의 얍삽하게도 주사위 레벨을 높입니다(강함모드).
        }
        if(overWhelm == true){
            level = "week";     //6점이상차이로 이기고 있는경우엔 거만해져서 주사위 레벨을 낮춥니다(약함모드).
        }
        else{
            level = "normal";   //위의 경우가 아닌경우엔 일반모드로 플레이합니다.
        }
        return level;
    }
}
