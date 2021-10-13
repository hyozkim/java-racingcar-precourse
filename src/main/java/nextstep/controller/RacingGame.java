package nextstep.controller;

import nextstep.controller.dto.ResponseDto;
import nextstep.model.RacingCars;
import nextstep.service.RacingService;
import nextstep.view.InputView;
import nextstep.view.OutputView;

public class RacingGame {
    private RacingService racingService;

    public RacingGame() {
        this.racingService = new RacingService();
    }

    public void run() {
        // 1. 입력
        RacingCars racingCars = new RacingCars(InputView.createRacingCars());
        int n = InputView.createTurns();

        // 2. 경주 시작
        racingService.race(n, racingCars);

        // 3. 결과 출력
        ResponseDto end = racingService.result(racingCars);
        OutputView.printResult(end);
    }
}
