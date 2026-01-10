package racingcar.Util;

import java.util.Arrays;
import java.util.List;

public class Parser {
    public static List<String> parseCarNames(String input) {
        List<String> cars = Arrays.asList(input.split(",", -1));
        validateCars(cars);
        return cars;
    }

    private static void validateCars(List<String> cars) {
        cars.stream()
                .filter(String::isEmpty)
                .forEach((car) -> {
                    throw new IllegalArgumentException("차량 이름이 빈 문자열");
                });
    }
}
