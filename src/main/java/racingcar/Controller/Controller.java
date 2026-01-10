package racingcar.Controller;

import racingcar.Domain.Cars;
import racingcar.Domain.Game;
import racingcar.View.InputView;
import racingcar.View.OutputView;

public class Controller {
    public void run() {
        Cars cars = new Cars(InputView.askCarName());
        final int count = InputView.askCount();
        Game game = new Game(cars);

        gameStart(game, count);
        OutputView.printWinner(game.getWinner());
    }

    private void gameStart(Game game, final int count) {
        OutputView.printGameStart();

        for (int i = 0; i < count; i++) {
            OutputView.printStage(game.stage());
        }
    }
}
