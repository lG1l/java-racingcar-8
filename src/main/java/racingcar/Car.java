package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String carName;
    private int moveCount;

    public Car(String carName) {
        this.carName = carName;
        moveCount = 0;
    }

    public void move() {
        int check = Randoms.pickNumberInRange(0, 9);
        if (check >= 4) {
            moveCount++;
        }
    }

    public String makeComment() {
        String comment = carName + " : ";

        for (int i = 0; i < moveCount; i++) {
            comment = comment.concat("-");
        }

        return comment.concat("\n");
    }

    public int getMoveCount() {
        return moveCount;
    }

    public String getCarName() {
        return carName;
    }
}
