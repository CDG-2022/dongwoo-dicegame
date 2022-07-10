package player;

public class Player {

    private String name;
    private int total;

    public Player(String name) {
        this.name = name;
        this.total = 0;
    }

    public void setTotal(int total) {
        this.total += total;
    }

    public int getTotal() {
        return total;
    }

}
