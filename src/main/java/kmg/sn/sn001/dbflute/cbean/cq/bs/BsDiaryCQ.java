package kmg.sn.sn001.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import kmg.sn.sn001.dbflute.cbean.cq.ciq.*;
import kmg.sn.sn001.dbflute.cbean.*;
import kmg.sn.sn001.dbflute.cbean.cq.*;

/**
 * The base condition-query of diary.
 * @author DBFlute(AutoGenerator)
 */
public class BsDiaryCQ extends AbstractBsDiaryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DiaryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsDiaryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from diary) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DiaryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DiaryCIQ xcreateCIQ() {
        DiaryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DiaryCIQ xnewCIQ() {
        return new DiaryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join diary on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DiaryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DiaryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _diaryId;
    public ConditionValue xdfgetDiaryId()
    { if (_diaryId == null) { _diaryId = nCV(); }
      return _diaryId; }
    protected ConditionValue xgetCValueDiaryId() { return xdfgetDiaryId(); }

    /**
     * Add order-by as ascend. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsDiaryCQ addOrderBy_DiaryId_Asc() { regOBA("diary_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * diary_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsDiaryCQ addOrderBy_DiaryId_Desc() { regOBD("diary_id"); return this; }

    protected ConditionValue _runDate;
    public ConditionValue xdfgetRunDate()
    { if (_runDate == null) { _runDate = nCV(); }
      return _runDate; }
    protected ConditionValue xgetCValueRunDate() { return xdfgetRunDate(); }

    /**
     * Add order-by as ascend. <br>
     * run_date: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsDiaryCQ addOrderBy_RunDate_Asc() { regOBA("run_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * run_date: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsDiaryCQ addOrderBy_RunDate_Desc() { regOBD("run_date"); return this; }

    protected ConditionValue _distanceKm;
    public ConditionValue xdfgetDistanceKm()
    { if (_distanceKm == null) { _distanceKm = nCV(); }
      return _distanceKm; }
    protected ConditionValue xgetCValueDistanceKm() { return xdfgetDistanceKm(); }

    /**
     * Add order-by as ascend. <br>
     * distance_km: {NotNull, numeric(5, 2)}
     * @return this. (NotNull)
     */
    public BsDiaryCQ addOrderBy_DistanceKm_Asc() { regOBA("distance_km"); return this; }

    /**
     * Add order-by as descend. <br>
     * distance_km: {NotNull, numeric(5, 2)}
     * @return this. (NotNull)
     */
    public BsDiaryCQ addOrderBy_DistanceKm_Desc() { regOBD("distance_km"); return this; }

    protected ConditionValue _memo;
    public ConditionValue xdfgetMemo()
    { if (_memo == null) { _memo = nCV(); }
      return _memo; }
    protected ConditionValue xgetCValueMemo() { return xdfgetMemo(); }

    /**
     * Add order-by as ascend. <br>
     * memo: {varchar(200)}
     * @return this. (NotNull)
     */
    public BsDiaryCQ addOrderBy_Memo_Asc() { regOBA("memo"); return this; }

    /**
     * Add order-by as descend. <br>
     * memo: {varchar(200)}
     * @return this. (NotNull)
     */
    public BsDiaryCQ addOrderBy_Memo_Desc() { regOBD("memo"); return this; }

    protected ConditionValue _createdAt;
    public ConditionValue xdfgetCreatedAt()
    { if (_createdAt == null) { _createdAt = nCV(); }
      return _createdAt; }
    protected ConditionValue xgetCValueCreatedAt() { return xdfgetCreatedAt(); }

    /**
     * Add order-by as ascend. <br>
     * created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsDiaryCQ addOrderBy_CreatedAt_Asc() { regOBA("created_at"); return this; }

    /**
     * Add order-by as descend. <br>
     * created_at: {NotNull, timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsDiaryCQ addOrderBy_CreatedAt_Desc() { regOBD("created_at"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsDiaryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsDiaryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, DiaryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(DiaryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, DiaryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(DiaryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, DiaryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(DiaryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, DiaryCQ> _myselfExistsMap;
    public Map<String, DiaryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(DiaryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, DiaryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(DiaryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DiaryCB.class.getName(); }
    protected String xCQ() { return DiaryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
