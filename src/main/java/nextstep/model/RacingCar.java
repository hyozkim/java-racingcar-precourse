package nextstep.model;

import java.util.StringJoiner;

public class RacingCar {
    private String name;
    private int distance;

    public RacingCar(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RacingCar.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("distance=" + distance)
                .toString();
    }
}
