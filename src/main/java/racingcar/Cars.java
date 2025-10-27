package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(String carNames) {
        ArrayList<Car> cars = CarNamesParse.parse(carNames);
        carList = cars;
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
}
