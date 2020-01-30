import javax.swing.plaf.nimbus.State;
import java.util.ArrayDeque;
import java.util.Deque;

public class SquareSumAux {
    private int nbFois;

    public SquareSumAux (int n) {
        this.nbFois = n;
    }

    public int squareNoRecTerm () {
        int x1 = this.nbFois;
        int x2 = 1;

        if (x1 == 0) {
            System.out.println(0);
            return 0;
        }

        while (x1 != 1) {
            x2 = (x1 * x1) + x2;
            x1 = x1 - 1;
            System.out.println(x2);
        }
        return x2;
    }

    public int squareNoRec () {
        Deque<Action> myQueue = new ArrayDeque();
        int result = 0;

        if (this.nbFois == 0) return 0;

        myQueue.push(new Action(this.nbFois,1, Action.States.DEBUT));
        while (!myQueue.isEmpty()) {
            Action action = myQueue.pop();
            if (action.getState() == Action.States.DEBUT) {
                if (action.getX() != 1) {
                    myQueue.push(new Action(action.getX(), action.getY(), Action.States.FIN));
                    myQueue.push(new Action(action.getX()-1, action.getY(), Action.States.DEBUT));
                }
            }
            if ( action.getState() == Action.States.FIN) {
                result = squareNoRecTerm();
            }
        }
        return result;
    }
}
