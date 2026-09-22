package kmg.sn.sn001.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import kmg.sn.sn001.dbflute.allcommon.*;
import kmg.sn.sn001.dbflute.cbean.*;
import kmg.sn.sn001.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of diary.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsDiaryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsDiaryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "diary";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @param diaryId The value of diaryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiaryId_Equal(Long diaryId) {
        doSetDiaryId_Equal(diaryId);
    }

    protected void doSetDiaryId_Equal(Long diaryId) {
        regDiaryId(CK_EQ, diaryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @param diaryId The value of diaryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiaryId_NotEqual(Long diaryId) {
        doSetDiaryId_NotEqual(diaryId);
    }

    protected void doSetDiaryId_NotEqual(Long diaryId) {
        regDiaryId(CK_NES, diaryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @param diaryId The value of diaryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiaryId_GreaterThan(Long diaryId) {
        regDiaryId(CK_GT, diaryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @param diaryId The value of diaryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiaryId_LessThan(Long diaryId) {
        regDiaryId(CK_LT, diaryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @param diaryId The value of diaryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiaryId_GreaterEqual(Long diaryId) {
        regDiaryId(CK_GE, diaryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @param diaryId The value of diaryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiaryId_LessEqual(Long diaryId) {
        regDiaryId(CK_LE, diaryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of diaryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of diaryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDiaryId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDiaryId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of diaryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of diaryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDiaryId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDiaryId(), "diary_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @param diaryIdList The collection of diaryId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiaryId_InScope(Collection<Long> diaryIdList) {
        doSetDiaryId_InScope(diaryIdList);
    }

    protected void doSetDiaryId_InScope(Collection<Long> diaryIdList) {
        regINS(CK_INS, cTL(diaryIdList), xgetCValueDiaryId(), "diary_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @param diaryIdList The collection of diaryId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiaryId_NotInScope(Collection<Long> diaryIdList) {
        doSetDiaryId_NotInScope(diaryIdList);
    }

    protected void doSetDiaryId_NotInScope(Collection<Long> diaryIdList) {
        regINS(CK_NINS, cTL(diaryIdList), xgetCValueDiaryId(), "diary_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setDiaryId_IsNull() { regDiaryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setDiaryId_IsNotNull() { regDiaryId(CK_ISNN, DOBJ); }

    protected void regDiaryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDiaryId(), "diary_id"); }
    protected abstract ConditionValue xgetCValueDiaryId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * run_date: {NotNull, date(13)}
     * @param runDate The value of runDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRunDate_Equal(java.time.LocalDate runDate) {
        regRunDate(CK_EQ,  runDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * run_date: {NotNull, date(13)}
     * @param runDate The value of runDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRunDate_GreaterThan(java.time.LocalDate runDate) {
        regRunDate(CK_GT,  runDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * run_date: {NotNull, date(13)}
     * @param runDate The value of runDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRunDate_LessThan(java.time.LocalDate runDate) {
        regRunDate(CK_LT,  runDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * run_date: {NotNull, date(13)}
     * @param runDate The value of runDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRunDate_GreaterEqual(java.time.LocalDate runDate) {
        regRunDate(CK_GE,  runDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * run_date: {NotNull, date(13)}
     * @param runDate The value of runDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRunDate_LessEqual(java.time.LocalDate runDate) {
        regRunDate(CK_LE, runDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * run_date: {NotNull, date(13)}
     * <pre>e.g. setRunDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of runDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of runDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRunDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRunDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * run_date: {NotNull, date(13)}
     * <pre>e.g. setRunDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of runDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of runDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRunDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "run_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRunDate(), nm, op);
    }

    protected void regRunDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRunDate(), "run_date"); }
    protected abstract ConditionValue xgetCValueRunDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * distance_km: {NotNull, numeric(5, 2)}
     * @param distanceKm The value of distanceKm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDistanceKm_Equal(java.math.BigDecimal distanceKm) {
        doSetDistanceKm_Equal(distanceKm);
    }

    protected void doSetDistanceKm_Equal(java.math.BigDecimal distanceKm) {
        regDistanceKm(CK_EQ, distanceKm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * distance_km: {NotNull, numeric(5, 2)}
     * @param distanceKm The value of distanceKm as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDistanceKm_NotEqual(java.math.BigDecimal distanceKm) {
        doSetDistanceKm_NotEqual(distanceKm);
    }

    protected void doSetDistanceKm_NotEqual(java.math.BigDecimal distanceKm) {
        regDistanceKm(CK_NES, distanceKm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * distance_km: {NotNull, numeric(5, 2)}
     * @param distanceKm The value of distanceKm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDistanceKm_GreaterThan(java.math.BigDecimal distanceKm) {
        regDistanceKm(CK_GT, distanceKm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * distance_km: {NotNull, numeric(5, 2)}
     * @param distanceKm The value of distanceKm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDistanceKm_LessThan(java.math.BigDecimal distanceKm) {
        regDistanceKm(CK_LT, distanceKm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * distance_km: {NotNull, numeric(5, 2)}
     * @param distanceKm The value of distanceKm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDistanceKm_GreaterEqual(java.math.BigDecimal distanceKm) {
        regDistanceKm(CK_GE, distanceKm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * distance_km: {NotNull, numeric(5, 2)}
     * @param distanceKm The value of distanceKm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDistanceKm_LessEqual(java.math.BigDecimal distanceKm) {
        regDistanceKm(CK_LE, distanceKm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * distance_km: {NotNull, numeric(5, 2)}
     * @param minNumber The min number of distanceKm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of distanceKm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDistanceKm_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDistanceKm_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * distance_km: {NotNull, numeric(5, 2)}
     * @param minNumber The min number of distanceKm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of distanceKm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDistanceKm_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDistanceKm(), "distance_km", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * distance_km: {NotNull, numeric(5, 2)}
     * @param distanceKmList The collection of distanceKm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistanceKm_InScope(Collection<java.math.BigDecimal> distanceKmList) {
        doSetDistanceKm_InScope(distanceKmList);
    }

    protected void doSetDistanceKm_InScope(Collection<java.math.BigDecimal> distanceKmList) {
        regINS(CK_INS, cTL(distanceKmList), xgetCValueDistanceKm(), "distance_km");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * distance_km: {NotNull, numeric(5, 2)}
     * @param distanceKmList The collection of distanceKm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistanceKm_NotInScope(Collection<java.math.BigDecimal> distanceKmList) {
        doSetDistanceKm_NotInScope(distanceKmList);
    }

    protected void doSetDistanceKm_NotInScope(Collection<java.math.BigDecimal> distanceKmList) {
        regINS(CK_NINS, cTL(distanceKmList), xgetCValueDistanceKm(), "distance_km");
    }

    protected void regDistanceKm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistanceKm(), "distance_km"); }
    protected abstract ConditionValue xgetCValueDistanceKm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * memo: {varchar(200)}
     * @param memo The value of memo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_Equal(String memo) {
        doSetMemo_Equal(fRES(memo));
    }

    protected void doSetMemo_Equal(String memo) {
        regMemo(CK_EQ, memo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * memo: {varchar(200)}
     * @param memo The value of memo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_NotEqual(String memo) {
        doSetMemo_NotEqual(fRES(memo));
    }

    protected void doSetMemo_NotEqual(String memo) {
        regMemo(CK_NES, memo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * memo: {varchar(200)}
     * @param memo The value of memo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_GreaterThan(String memo) {
        regMemo(CK_GT, fRES(memo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * memo: {varchar(200)}
     * @param memo The value of memo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_LessThan(String memo) {
        regMemo(CK_LT, fRES(memo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * memo: {varchar(200)}
     * @param memo The value of memo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_GreaterEqual(String memo) {
        regMemo(CK_GE, fRES(memo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * memo: {varchar(200)}
     * @param memo The value of memo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_LessEqual(String memo) {
        regMemo(CK_LE, fRES(memo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * memo: {varchar(200)}
     * @param memoList The collection of memo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_InScope(Collection<String> memoList) {
        doSetMemo_InScope(memoList);
    }

    protected void doSetMemo_InScope(Collection<String> memoList) {
        regINS(CK_INS, cTL(memoList), xgetCValueMemo(), "memo");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * memo: {varchar(200)}
     * @param memoList The collection of memo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMemo_NotInScope(Collection<String> memoList) {
        doSetMemo_NotInScope(memoList);
    }

    protected void doSetMemo_NotInScope(Collection<String> memoList) {
        regINS(CK_NINS, cTL(memoList), xgetCValueMemo(), "memo");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * memo: {varchar(200)} <br>
     * <pre>e.g. setMemo_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param memo The value of memo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemo_LikeSearch(String memo, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemo_LikeSearch(memo, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * memo: {varchar(200)} <br>
     * <pre>e.g. setMemo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memo The value of memo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setMemo_LikeSearch(String memo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memo), xgetCValueMemo(), "memo", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * memo: {varchar(200)}
     * @param memo The value of memo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setMemo_NotLikeSearch(String memo, ConditionOptionCall<LikeSearchOption> opLambda) {
        setMemo_NotLikeSearch(memo, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * memo: {varchar(200)}
     * @param memo The value of memo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setMemo_NotLikeSearch(String memo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memo), xgetCValueMemo(), "memo", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * memo: {varchar(200)}
     */
    public void setMemo_IsNull() { regMemo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * memo: {varchar(200)}
     */
    public void setMemo_IsNullOrEmpty() { regMemo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * memo: {varchar(200)}
     */
    public void setMemo_IsNotNull() { regMemo(CK_ISNN, DOBJ); }

    protected void regMemo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemo(), "memo"); }
    protected abstract ConditionValue xgetCValueMemo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param createdAt The value of createdAt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_Equal(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_EQ,  createdAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param createdAt The value of createdAt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_GreaterThan(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_GT,  createdAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param createdAt The value of createdAt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_LessThan(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_LT,  createdAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param createdAt The value of createdAt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_GreaterEqual(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_GE,  createdAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @param createdAt The value of createdAt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_LessEqual(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_LE, createdAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setCreatedAt_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCreatedAt_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setCreatedAt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "created_at"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCreatedAt(), nm, op);
    }

    protected void regCreatedAt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedAt(), "created_at"); }
    protected abstract ConditionValue xgetCValueCreatedAt();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DiaryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, DiaryCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DiaryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, DiaryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DiaryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, DiaryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DiaryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, DiaryCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DiaryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, DiaryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DiaryCB&gt;() {
     *     public void query(DiaryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<DiaryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, DiaryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        DiaryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(DiaryCQ sq);

    protected DiaryCB xcreateScalarConditionCB() {
        DiaryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected DiaryCB xcreateScalarConditionPartitionByCB() {
        DiaryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<DiaryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DiaryCB cb = new DiaryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "diary_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(DiaryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DiaryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(DiaryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        DiaryCB cb = new DiaryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "diary_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(DiaryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<DiaryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        DiaryCB cb = new DiaryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(DiaryCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected DiaryCB newMyCB() {
        return new DiaryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return DiaryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
