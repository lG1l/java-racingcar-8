package racingcar.View;

import java.util.List;
import racingcar.Constant.OutputMessage;

public class OutputView {
    public static void printGameStart() {
        System.out.print(OutputMessage.GAME_START.getMessage());
    }

    public static void printStage(String message){
        System.out.println(" " + message);
    }

    public static void printWinner(List<String> winners) {
        String message = OutputMessage.WINNER.getMessage();
        for (String winner : winners) {
            message = message.concat(" " + winner + ",");
        }

        System.out.println(message.substring(0, message.length() - 1));
    }
}
