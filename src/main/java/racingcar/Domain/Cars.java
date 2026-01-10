package racingcar.Domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import racingcar.Util.Parser;

public class Cars {
    private final List<Car> cars;

    public Cars(String input) {
        ArrayList<Car> cars = new ArrayList<>();
        List<String> carNames = Parser.parseCarNames(input);
        for (String car : carNames) {
            car = car.trim();
            cars.add(new Car(car));
        }
        this.cars = cars;
    }

    public void stage() {
        cars.stream()
                .filter((car) -> canMove())
                .forEach(Car::move);
    }

    private boolean canMove() {
        return (Randoms.pickNumberInRange(0, 9) >= 4);
    }

    public String getStageState() {
        String message = "\n";
        for (Car car : cars) {
            message += car.getStateMessage();
        }
        return message;
    }

    public List<String> getWinner() {
        Car winner = findWinner();
        return cars.stream()
                .filter((car) -> car.compareState(winner) == 0)
                .map(Car::getName)
                .toList();

    }

    private Car findWinner() {
        return cars.stream()
                .max(Car::compareState)
                .orElseThrow(() -> new IllegalArgumentException("참가자가 없습니다."));
    }
}
