package task08;

import java.util.*;

class CollectionBalls {

    static Set<BallsName> createBallsBad() {
        Set<BallsName> ballsBad = new TreeSet<>(BallsName::compareTo);
        ballsBad.add(new BallsName(2, 15));
        ballsBad.add(new BallsName(7, 15));
        return ballsBad;
    }

    static TreeSet<BallsName> createBallsRight() {
        TreeSet<BallsName> ballsRight = new TreeSet<>(BallsName::compareTo);
        for (int i = 0; i < 20; i++) {

            ballsRight.add(new BallsName(i, 10));
        }
        ballsRight.remove(new BallsName(2, 10));
        ballsRight.remove(new BallsName(7, 10));
        return ballsRight;
    }


}