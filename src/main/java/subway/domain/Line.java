package subway.domain;

public class Line {
    private String name;

    public Line(String name) {
        validateLineName(name);
        this.name = name;
    }

    public void validateLineName(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException("[ERROR] 노선 이름은 두 글자 이상만 입력해 주세요.");
        }
    }

    public String getName() {
        return name;
    }

}
