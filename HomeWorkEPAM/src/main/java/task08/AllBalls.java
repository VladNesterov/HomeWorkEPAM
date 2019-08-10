package task08;

import java.util.TreeSet;

public class AllBalls {
    TreeSet<BallsName> allBalls() {
        TreeSet<BallsName> collectionBalls = new TreeSet<>(BallsName::compareTo);
        collectionBalls.addAll(task08.CollectionBalls.createBallsBad());
        collectionBalls.addAll(task08.CollectionBalls.createBallsRight());
        System.out.println(collectionBalls);
        collectionBalls.remove(new BallsName(3, 10));
        collectionBalls.remove(new BallsName(17, 10));
        System.out.println(collectionBalls);
        return collectionBalls;
    }
}
