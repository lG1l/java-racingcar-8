package racingcar;

import java.util.List;

public class Controller {
    public void run() {
        Cars cars = new Cars(IOConsole.inputCars());

        int count = IOConsole.inputCount();
        checkCount(count);

        countMove(cars, count);
    }

    private void checkCount(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("수행횟수가 음수입니다.");
        }
    }

    private void countMove(Cars cars, int count) {
        for (int i = 0; i < count; i++) {
            String comment = cars.raceOnce();
            IOConsole.roundResultPrint(comment);
        }
    }
}
