package subway.domain;

public class Station {
    private String name;

    public Station(String name) {
        validateStationName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void validateStationName(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException("[ERROR] 역 이름은 두 글자 이상만 입력해 주세요.");
        }
    }

}
