package subway.domain;

import java.util.ArrayList;

public class StationNameRepository {
    private ArrayList<String> stationName = new ArrayList<>();

    public void addStationName(String name) {
        validateDuplicateStationName(name);
        stationName.add(name);
    }

    private void validateDuplicateStationName(String name) {
        if (stationName.contains(name)) {
            throw  new IllegalArgumentException("[ERROR] 중복된 역 이름을 입력하지 마시오.");
        }
    }

    public void isNotExistStation(String name) {
        if (!stationName.contains(name)) {
            throw  new IllegalArgumentException("[ERROR] 존재하지 않는 역 이름입니다.");
        }
    }

    public ArrayList<String> getStationName() {
        return stationName;
    }
}
