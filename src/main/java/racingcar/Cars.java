package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(String carNames) {
        ArrayList<Car> cars = CarNamesParse.parse(carNames);
        carList = cars;
    }
}
