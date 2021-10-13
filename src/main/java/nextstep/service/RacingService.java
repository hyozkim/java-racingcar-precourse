package nextstep.service;

import nextstep.controller.dto.ResponseDto;
import nextstep.model.RacingCar;
import nextstep.model.RacingCars;
import nextstep.utils.Randoms;

import java.util.List;
import java.util.StringJoiner;

import static nextstep.common.Constant.*;

public class RacingService {
    public RacingService() {
    }

    public void race(int n, RacingCars racingCars) {
        for (int i = 0; i < n; i++) {
            move(racingCars);
        }
    }

    private void move(RacingCars racingCars) {
        for (RacingCar car : racingCars.getRacingCarList()) {
            addDistance(car);
        }
    }

    private void addDistance(RacingCar car) {
        int dist;
        do {
            dist = Randoms.pickNumberInRange(MIN_START_NUMBER,MAX_START_NUMBER);
            car.addDistance(dist);
        } while( dist >= MIN_CONTINUE_VALUE );
    }

    public ResponseDto result(RacingCars racingCars) {
        int maxDistance = getMaxDistance(racingCars.getRacingCarList());
        String winners  = getWinners(racingCars.getRacingCarList(), maxDistance);
        return new ResponseDto.Builder()
                .winners(winners)
                .racingCarList(racingCars)
                .build();
    }

    private int getMaxDistance(List<RacingCar> racingCarList) {
        int maxDistance = Integer.MIN_VALUE;
        for( RacingCar racingCar : racingCarList ) {
            maxDistance = Math.max(maxDistance, racingCar.getDistanceLength());
        }
        return maxDistance;
    }

    private String getWinners(List<RacingCar> racingCarList, int maxDistance) {
        StringJoiner joiner = new StringJoiner(DELIMITER);
        for( RacingCar racingCar : racingCarList ) {
            addWinner(joiner, maxDistance, racingCar);
        }
        return joiner.toString();
    }

    private void addWinner(StringJoiner joiner, int maxDistance, RacingCar racingCar) {
        if( maxDistance == racingCar.getDistanceLength() ) {
            joiner.add(racingCar.getName());
        }
    }
}
