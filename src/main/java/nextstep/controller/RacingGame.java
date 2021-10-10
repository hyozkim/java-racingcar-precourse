package nextstep.controller;

import nextstep.model.RacingCar;
import nextstep.service.RacingService;
import nextstep.view.InputView;

import java.util.List;

public class RacingGame {
    private InputView inputView;
    private RacingService racingService;

    public RacingGame() {
        this.inputView = new InputView();
        this.racingService = new RacingService();
    }

    public void start() {
        try {
            int n  = inputView.inputTurns();

            List<RacingCar> racingCarList = inputView.inputCars();

            // racingService.play(n, racingCarList);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            start();
        }
    }
}
