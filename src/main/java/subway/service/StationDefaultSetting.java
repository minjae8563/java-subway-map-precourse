package subway.service;

import subway.domain.Station;
import subway.domain.StationRepository;

public class StationDefaultSetting {
    public static StationRepository stationDefaultSetting() {
        Station station1 = new Station("교대역");
        Station station2 = new Station("강남역");
        Station station3 = new Station("역삼역");
        Station station4 = new Station("남부터미널역");
        Station station5 = new Station("양재역");
        Station station6 = new Station("양재시민의숲역");
        Station station7 = new Station("매봉역");

        StationRepository stationRepository = new StationRepository();

        stationRepository.addStation(station1);
        stationRepository.addStation(station2);
        stationRepository.addStation(station3);
        stationRepository.addStation(station4);
        stationRepository.addStation(station5);
        stationRepository.addStation(station6);
        stationRepository.addStation(station7);

        return stationRepository;

    }
}
