package subway.domain;

import java.util.ArrayList;

public class LineNameRepository {
    ArrayList<String> lineName = new ArrayList<>();

    public void addLineName(String name) {
        lineName.add(name);
    }

    public void validateDuplicateLineName(String name) {
        if (lineName.contains(name)) {
            throw new IllegalArgumentException("[ERROR] 중복된 노선 이름을 입력하지 마시오.");
        }
    }
    public void isNotExistLine(String name) {
        if (!lineName.contains(name)) {
            throw new IllegalArgumentException("[ERROR] 중복된 노선 이름을 입력하지 마시오.");
        }
    }

    public ArrayList<String> getLineName() {
        return lineName;
    }
}
