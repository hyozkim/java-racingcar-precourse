package nextstep.controller;

import nextstep.controller.dto.ResponseDto;
import nextstep.model.RacingCars;
import nextstep.service.RacingService;

public class RacingGame {
    private RacingService racingService;

    public RacingGame() {
        this.racingService = new RacingService();
    }

    public void start(int n, RacingCars racingCars) {
        racingService.race(n, racingCars);
    }

    public ResponseDto end(RacingCars racingCars) {
        return racingService.result(racingCars);
    }
}
