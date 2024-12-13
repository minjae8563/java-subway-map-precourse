package subway.service;

import subway.domain.Line;
import subway.domain.LineRepository;

public class LineDefaultSetting {

    public static LineRepository lineDefaultSetting() {

        LineRepository lineRepository = new LineRepository();

        Line line1 = new Line("2호선");
        Line line2 = new Line("3호선");
        Line line3 = new Line("신분당선");


        lineRepository.addLine(line1);
        lineRepository.addLine(line2);
        lineRepository.addLine(line3);

        return lineRepository;
    }
}
