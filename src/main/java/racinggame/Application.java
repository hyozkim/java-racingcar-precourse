package racinggame;

import nextstep.controller.RacingGame;
import nextstep.controller.dto.ResponseDto;
import nextstep.model.RacingCars;
import nextstep.view.InputView;
import nextstep.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        RacingCars racingCars = new RacingCars(inputView.createRacingCars());

        RacingGame racingGame = new RacingGame();
        racingGame.start(inputView.createTurns(), racingCars);

        OutputView outputView = new OutputView();
        ResponseDto end = racingGame.end(racingCars);
        outputView.printResult(end);
    }
}
