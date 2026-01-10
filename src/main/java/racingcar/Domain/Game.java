package racingcar.Domain;

import java.util.List;

public class Game {
    private final Cars cars;

    public Game(Cars cars) {
        this.cars = cars;
    }

    public String stage() {
        cars.stage();
        return cars.getStageState();
    }

    public List<String> getWinner() {
        return cars.getWinner();
    } // 우승한 차 이름들 리스트로
}
