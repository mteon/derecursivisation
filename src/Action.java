import java.util.ArrayList;
import java.util.List;

public class Action {
    public enum States {
        DEBUT, FIN
    }
    private int x;
    int y;
    private States state;

    public Action(int x, int y, States state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public States getState() {
        return this.state;
    }
}
