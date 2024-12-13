package subway.service;

import subway.domain.SectionRepository;

public class SectionDefaultSetting {
    public static SectionRepository sectionDefaultSetting() {
        SectionRepository sectionRepository = new SectionRepository();

        sectionRepository.addStation("2호선","교대역",0);
        sectionRepository.addStation("2호선","강남역",1);
        sectionRepository.addStation("2호선","역삼역",2);

        sectionRepository.addStation("3호선","교대역",0);
        sectionRepository.addStation("3호선","남부터미널역",1);
        sectionRepository.addStation("3호선","양재역",2);
        sectionRepository.addStation("3호선","매봉역",3);

        sectionRepository.addStation("신분당선","강남역",0);
        sectionRepository.addStation("신분당선","양재역",1);
        sectionRepository.addStation("신분당선","양재시민의숲역",2);

        return sectionRepository;

    }
}
