package kmg.sn.sn001.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import kmg.sn.sn001.dbflute.allcommon.*;
import kmg.sn.sn001.dbflute.exentity.*;

/**
 * The DB meta of diary. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DiaryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DiaryDbm _instance = new DiaryDbm();
    private DiaryDbm() {}
    public static DiaryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Diary)et).getDiaryId(), (et, vl) -> ((Diary)et).setDiaryId(ctl(vl)), "diaryId");
        setupEpg(_epgMap, et -> ((Diary)et).getRunDate(), (et, vl) -> ((Diary)et).setRunDate(ctld(vl)), "runDate");
        setupEpg(_epgMap, et -> ((Diary)et).getDistanceKm(), (et, vl) -> ((Diary)et).setDistanceKm(ctb(vl)), "distanceKm");
        setupEpg(_epgMap, et -> ((Diary)et).getMemo(), (et, vl) -> ((Diary)et).setMemo((String)vl), "memo");
        setupEpg(_epgMap, et -> ((Diary)et).getCreatedAt(), (et, vl) -> ((Diary)et).setCreatedAt(ctldt(vl)), "createdAt");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "diary";
    protected final String _tableDispName = "diary";
    protected final String _tablePropertyName = "diary";
    protected final TableSqlName _tableSqlName = new TableSqlName("diary", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDiaryId = cci("diary_id", "diary_id", null, null, Long.class, "diaryId", null, true, true, true, "bigserial", 19, 0, null, "nextval('diary_diary_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRunDate = cci("run_date", "run_date", null, null, java.time.LocalDate.class, "runDate", null, false, false, true, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDistanceKm = cci("distance_km", "distance_km", null, null, java.math.BigDecimal.class, "distanceKm", null, false, false, true, "numeric", 5, 2, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemo = cci("memo", "memo", null, null, String.class, "memo", null, false, false, false, "varchar", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreatedAt = cci("created_at", "created_at", null, null, java.time.LocalDateTime.class, "createdAt", null, false, false, true, "timestamp", 29, 6, null, "CURRENT_TIMESTAMP", false, null, null, null, null, null, false);

    /**
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDiaryId() { return _columnDiaryId; }
    /**
     * run_date: {NotNull, date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRunDate() { return _columnRunDate; }
    /**
     * distance_km: {NotNull, numeric(5, 2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistanceKm() { return _columnDistanceKm; }
    /**
     * memo: {varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemo() { return _columnMemo; }
    /**
     * created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreatedAt() { return _columnCreatedAt; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDiaryId());
        ls.add(columnRunDate());
        ls.add(columnDistanceKm());
        ls.add(columnMemo());
        ls.add(columnCreatedAt());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnDiaryId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "diary_diary_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "kmg.sn.sn001.dbflute.exentity.Diary"; }
    public String getConditionBeanTypeName() { return "kmg.sn.sn001.dbflute.cbean.DiaryCB"; }
    public String getBehaviorTypeName() { return "kmg.sn.sn001.dbflute.exbhv.DiaryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Diary> getEntityType() { return Diary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Diary newEntity() { return new Diary(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Diary)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Diary)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
