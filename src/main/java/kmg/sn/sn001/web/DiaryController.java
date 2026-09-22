package kmg.sn.sn001.web;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kmg.sn.sn001.dbflute.exbhv.DiaryBhv;
import kmg.sn.sn001.dbflute.exentity.Diary;

@RestController
@RequestMapping("/api/diaries")
public class DiaryController {

    private final DiaryBhv diaryBhv;

    public DiaryController(DiaryBhv diaryBhv) {
        this.diaryBhv = diaryBhv;
    }

    @GetMapping
    public List<DiaryResponse> list() {
        List<Diary> diaries = diaryBhv.selectList(cb -> {
            cb.query().addOrderBy_RunDate_Desc();
            cb.query().addOrderBy_DiaryId_Desc();
        });
        return diaries.stream().map(DiaryResponse::from).toList();
    }

    public record DiaryResponse(
            Long diaryId,
            LocalDate runDate,
            BigDecimal distanceKm,
            String memo,
            LocalDateTime createdAt) {

        static DiaryResponse from(Diary diary) {
            return new DiaryResponse(
                    diary.getDiaryId(),
                    diary.getRunDate(),
                    diary.getDistanceKm(),
                    diary.getMemo(),
                    diary.getCreatedAt());
        }
    }
}
