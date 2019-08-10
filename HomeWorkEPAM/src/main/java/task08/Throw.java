package task08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Throw {
    List<Float> inputStr() {
        List<Float> data = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Data");
        System.out.println("Strength 0-100, torsion, degree");

        data.add(in.nextFloat());
        data.add(in.nextFloat());
        data.add(in.nextFloat());

        if ((data.get(0) < 0) & ((data.get(0) > 100))) {
            System.out.println("Wrong Input Strength");
        } else if ((data.get(1) < 0) & ((data.get(1) > 100))) {
            System.out.println("Wrong Input torsion");
        } else if ((data.get(2) < 0) & (data.get(2) > 360)) {
            System.out.println("Wrong Input degree");
        }


        return data;

    }

    int deviationBalls(List<Float> input) {

        return 1;
    }


}
