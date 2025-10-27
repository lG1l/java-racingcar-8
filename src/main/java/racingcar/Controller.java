package racingcar;

import java.util.List;

public class Controller {
    public void run() {

    }

    private void checkCount(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("수행횟수가 음수입니다.");
        }
    }
}
