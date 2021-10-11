package nextstep.model;

import java.util.List;
import java.util.NoSuchElementException;

import static nextstep.common.Constant.*;

public class RacingCars {
    final private List<RacingCar> racingCarList;

    public RacingCars(List<RacingCar> racingCarList) {
        checkTotalSize(racingCarList.size());
        for( RacingCar rc : racingCarList ) {
            checkNameLength(rc.getName());
        }
        this.racingCarList = racingCarList;
    }

    public void checkTotalSize(int length) {
        if( length < MIN_INPUT_COUNT ) {
            systemOutPrint(ERROR_MESSAGE_MIN_LENGTH_REQUIRED);
            throw new IllegalArgumentException(ERROR_MESSAGE_MIN_LENGTH_REQUIRED);
        }
    }

    public void checkNameLength(String name) {
        if( name != null && name.length() > MAX_NAME_LENGTH ) {
            systemOutPrint(ERROR_MESSAGE_LESS_THAN_5_DIGIT);
            throw new NoSuchElementException(ERROR_MESSAGE_LESS_THAN_5_DIGIT);
        }
    }

    public List<RacingCar> getRacingCarList() {
        return racingCarList;
    }
}
