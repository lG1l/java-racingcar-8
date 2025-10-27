package racingcar;

import java.util.ArrayList;
import java.util.Arrays;

public class CarNamesParse {
    public static ArrayList<Car> parse(String carNames) {
        ArrayList<String> cars = splitCarNames(carNames);
        isEmpty(cars);

        ArrayList<Car> returnValue = new ArrayList<>();
        for (String car : cars) {
            checkCarNames(car);
            returnValue.add(new Car(car));
        }

        return returnValue;
    }

    private static ArrayList<String> splitCarNames(String carNames) {
        carNames = carNames.replaceAll(" ", "");
        String[] cars = carNames.split(",");
        return new ArrayList<>(Arrays.asList(cars));
    }

    private static void isEmpty(ArrayList<String> cars){
        if(cars.isEmpty()){
            throw new IllegalArgumentException("자동차 이름이 입력되지 않았습니다.");
        }
    }

    private static void checkCarNames(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름이 5글자를 초과합니다.");
        }
    }
}
