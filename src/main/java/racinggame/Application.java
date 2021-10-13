package racinggame;

import nextstep.controller.RacingGame;
import nextstep.controller.dto.ResponseDto;
import nextstep.model.RacingCars;
import nextstep.view.InputView;
import nextstep.view.OutputView;

public class Application {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        racingGame.run();
    }
}
