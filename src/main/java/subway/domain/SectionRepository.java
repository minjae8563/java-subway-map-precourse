package subway.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class SectionRepository {
    private final LinkedHashMap<String, ArrayList<String>> section = new LinkedHashMap<>();

    public void addStation(String line, String station, int index) {
        section.putIfAbsent(line, new ArrayList<>());
        section.get(line).add(index,station);
    }
    public void validateLength(String line) {
        if (section.get(line).size() <= 2){
            throw new IllegalArgumentException("[ERROR] 해당 노선에 역이 2개 이하로 존재합니다.");
        }
    }

    public void makeSection(String line, String startStation, String endStation) {
        ArrayList<String> stations = new ArrayList<>();
        stations.add(startStation);
        stations.add(endStation);
        section.put(line, stations);
    }

    public void removeStation(String line, String station) {
        if (!section.get(line).contains(station)) {
            throw new IllegalArgumentException("[ERROR] 해당 구간에 역이 존재하지 않습니다.");
        }
        section.get(line).remove(station);
    }

    public HashMap<String, ArrayList<String>> getSection() {
        return section;
    }

}
