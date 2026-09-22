package kmg.sn.sn001.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import kmg.sn.sn001.dbflute.exbhv.*;
import kmg.sn.sn001.dbflute.exentity.*;

/**
 * The referrer loader of diary as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfDiary {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Diary> _selectedList;
    protected BehaviorSelector _selector;
    protected DiaryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfDiary ready(List<Diary> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DiaryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DiaryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Diary> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
