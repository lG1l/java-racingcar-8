package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> carList;

    public Cars(String carNames) {
        carList = CarNamesParse.parse(carNames);
    }

    public String raceOnce() {
        String returnComment = "";

        for (Car car : carList) {
            car.move();
            String comment = car.makeComment();
            returnComment = returnComment.concat(comment);
        }

        return returnComment;
    }

    public List<String> findWinner() {
        int maxMove = findMaxMove();

        return carList.stream()
                .filter(car -> car.getMoveCount() == maxMove)
                .map(Car::getCarName)
                .collect(Collectors.toList());

    }

    private int findMaxMove() {
        return carList.stream()
                .mapToInt(Car::getMoveCount)
                .max()
                .orElse(0);
    }
}
