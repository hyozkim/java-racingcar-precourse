package nextstep.model;

import java.util.StringJoiner;

public class RacingCar {
    private String name;
    private Distance distance;

    public RacingCar(String name, Distance distance) {
        this.name = name;
        this.distance = distance;
    }

    public void addDistance(int distance) {
        this.distance.increaseDistance(distance);
    }

    public String getName() {
        return name;
    }

    public String getDistance() {
        return distance.getDistance();
    }
    public int getDistanceLength() {
        return distance.getDistanceLength();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RacingCar.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("distance=" + distance)
                .toString();
    }
}
