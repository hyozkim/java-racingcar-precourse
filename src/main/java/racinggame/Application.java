package racinggame;

import nextstep.controller.RacingGame;
import nextstep.controller.dto.ResponseDto;
import nextstep.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // 자동차경주게임 시작
        RacingGame racingGame = new RacingGame();
        racingGame.start();

        // 자동차경주게임 결과
        new OutputView().printResult(racingGame.getResponseDto());
    }
}
