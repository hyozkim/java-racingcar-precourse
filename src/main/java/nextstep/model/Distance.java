package nextstep.model;

import static nextstep.common.Constant.HYPHEN;

public class Distance {

    private StringBuilder distance;

    public Distance() {
        this.distance = new StringBuilder();
    }

    public void increaseDistance(int dist) {
        for (int i = 0; i < dist; i++) {
            distance.append(HYPHEN);
        }
    }

    public String getDistance() {
        return distance.toString();
    }

    public int getDistanceLength() {
        return distance.length();
    }
}
