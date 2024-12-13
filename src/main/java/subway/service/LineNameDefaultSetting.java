package subway.service;

import subway.domain.LineNameRepository;

public class LineNameDefaultSetting {
    public static LineNameRepository lineNameDefaultSetting() {
        LineNameRepository lineNameRepository = new LineNameRepository();

        lineNameRepository.addLineName("2호선");
        lineNameRepository.addLineName("3호선");
        lineNameRepository.addLineName("신분당선");

        return lineNameRepository;

    }
}
