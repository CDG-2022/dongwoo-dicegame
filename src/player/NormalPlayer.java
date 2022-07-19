package player;

public class NormalPlayer implements Player{

    private String name;
    private int total = 0;

    public NormalPlayer(String name) {
        this.name = name;
    }

    @Override
    public void calTotal(int total) {
        this.total += total;
    }

    @Override
    public int getTotal() {
        return total;
    }

}
