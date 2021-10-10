package nextstep.service;

import nextstep.controller.dto.ResponseDto;
import nextstep.model.RacingCar;
import nextstep.utils.Randoms;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static nextstep.common.Constant.*;

public class RacingService {
    public RacingService() {}

    public void play(int n, List<RacingCar> racingCarList) {
        for (int i = 0; i < n; i++) {
            move(racingCarList);
        }
    }

    public void move(List<RacingCar> racingCarList) {
        for (RacingCar car : racingCarList) {
            addDistance(car);
        }
    }

    public void addDistance(RacingCar car) {
        int dist = Randoms.pickNumberInRange(MIN_START_NUMBER,MAX_START_NUMBER);
        do {
            car.addDistance(dist);
            dist = Randoms.pickNumberInRange(MIN_START_NUMBER,MAX_START_NUMBER);
        } while( dist >= MIN_CONTINUE_VALUE );
    }

    public ResponseDto result(List<RacingCar> racingCarList) {
        int maxDistance = getMaxDistance(racingCarList);
        String winners = getWinners(racingCarList, maxDistance);

        return new ResponseDto.Builder()
                .success(true)
                .message(winners)
                .racingCarList(racingCarList)
                .build();
    }

    private int getMaxDistance(List<RacingCar> racingCarList) {
        return racingCarList
                .stream()
                .max(Comparator.comparing(RacingCar::getDistance))
                .map(RacingCar::getDistance)
                .get();
    }

    private String getWinners(List<RacingCar> racingCarList, int maxDistance) {
        return  racingCarList
                .stream()
                .filter(car -> maxDistance == car.getDistance())
                .map(RacingCar::getName)
                .collect(Collectors.joining(","));
    }
}
