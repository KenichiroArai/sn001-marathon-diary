package kmg.sn.sn001.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import kmg.sn.sn001.dbflute.allcommon.DBMetaInstanceHandler;
import kmg.sn.sn001.dbflute.exentity.*;

/**
 * The entity of diary as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsDiary extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** diary_id: {PK, ID, NotNull, bigserial(19)} */
    protected Long _diaryId;

    /** run_date: {NotNull, date(13)} */
    protected java.time.LocalDate _runDate;

    /** distance_km: {NotNull, numeric(5, 2)} */
    protected java.math.BigDecimal _distanceKm;

    /** memo: {varchar(200)} */
    protected String _memo;

    /** created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _createdAt;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "diary";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_diaryId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsDiary) {
            BsDiary other = (BsDiary)obj;
            if (!xSV(_diaryId, other._diaryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _diaryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_diaryId));
        sb.append(dm).append(xfND(_runDate));
        sb.append(dm).append(xfND(_distanceKm));
        sb.append(dm).append(xfND(_memo));
        sb.append(dm).append(xfND(_createdAt));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public Diary clone() {
        return (Diary)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] diary_id: {PK, ID, NotNull, bigserial(19)} <br>
     * @return The value of the column 'diary_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getDiaryId() {
        checkSpecifiedProperty("diaryId");
        return _diaryId;
    }

    /**
     * [set] diary_id: {PK, ID, NotNull, bigserial(19)} <br>
     * @param diaryId The value of the column 'diary_id'. (basically NotNull if update: for the constraint)
     */
    public void setDiaryId(Long diaryId) {
        registerModifiedProperty("diaryId");
        _diaryId = diaryId;
    }

    /**
     * [get] run_date: {NotNull, date(13)} <br>
     * @return The value of the column 'run_date'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getRunDate() {
        checkSpecifiedProperty("runDate");
        return _runDate;
    }

    /**
     * [set] run_date: {NotNull, date(13)} <br>
     * @param runDate The value of the column 'run_date'. (basically NotNull if update: for the constraint)
     */
    public void setRunDate(java.time.LocalDate runDate) {
        registerModifiedProperty("runDate");
        _runDate = runDate;
    }

    /**
     * [get] distance_km: {NotNull, numeric(5, 2)} <br>
     * @return The value of the column 'distance_km'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getDistanceKm() {
        checkSpecifiedProperty("distanceKm");
        return _distanceKm;
    }

    /**
     * [set] distance_km: {NotNull, numeric(5, 2)} <br>
     * @param distanceKm The value of the column 'distance_km'. (basically NotNull if update: for the constraint)
     */
    public void setDistanceKm(java.math.BigDecimal distanceKm) {
        registerModifiedProperty("distanceKm");
        _distanceKm = distanceKm;
    }

    /**
     * [get] memo: {varchar(200)} <br>
     * @return The value of the column 'memo'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemo() {
        checkSpecifiedProperty("memo");
        return _memo;
    }

    /**
     * [set] memo: {varchar(200)} <br>
     * @param memo The value of the column 'memo'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemo(String memo) {
        registerModifiedProperty("memo");
        _memo = memo;
    }

    /**
     * [get] created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]} <br>
     * @return The value of the column 'created_at'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getCreatedAt() {
        checkSpecifiedProperty("createdAt");
        return _createdAt;
    }

    /**
     * [set] created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]} <br>
     * @param createdAt The value of the column 'created_at'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedAt(java.time.LocalDateTime createdAt) {
        registerModifiedProperty("createdAt");
        _createdAt = createdAt;
    }
}
