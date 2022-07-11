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

    public String mode(boolean lose, boolean overWhelm) {
        if(lose == true) {
            level = "strong";
        }else if(overWhelm == true){
            level = "week";
        }else{
            level = "normal";
        }
        return level;
    }
}
