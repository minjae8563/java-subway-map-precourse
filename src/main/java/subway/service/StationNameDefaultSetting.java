package subway.service;

import java.util.ArrayList;
import subway.domain.StationNameRepository;

public class StationNameDefaultSetting {
    public static StationNameRepository stationNameDefaultSetting() {
        StationNameRepository stationNameRepository = new StationNameRepository();

        stationNameRepository.addStationName("교대역");
        stationNameRepository.addStationName("강남역");
        stationNameRepository.addStationName("역삼역");
        stationNameRepository.addStationName("남부터미널역");
        stationNameRepository.addStationName("양재역");
        stationNameRepository.addStationName("양재시민의숲역");
        stationNameRepository.addStationName("매봉역");

        return stationNameRepository;
    }
}
