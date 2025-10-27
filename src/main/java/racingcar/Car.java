package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String carName;
    private int moveCount;

    public Car(String carName) {
        this.carName = carName;
        moveCount = 0;
    }
}
