// Generated code, any edits will be eventually lost.
package com.funnyhatsoftware.spacedock.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class SetBase extends Base {
    String mExternalId;
    public String getExternalId() { return mExternalId; }
    public SetBase setExternalId(String v) { mExternalId = v; return this;}
    boolean mInclude;
    public boolean getInclude() { return mInclude; }
    public SetBase setInclude(boolean v) { mInclude = v; return this;}
    String mName;
    public String getName() { return mName; }
    public SetBase setName(String v) { mName = v; return this;}
    String mProductName;
    public String getProductName() { return mProductName; }
    public SetBase setProductName(String v) { mProductName = v; return this;}
    Date mReleaseDate;
    public Date getReleaseDate() { return mReleaseDate; }
    public SetBase setReleaseDate(Date v) { mReleaseDate = v; return this;}
    String mWave;
    public String getWave() { return mWave; }
    public SetBase setWave(String v) { mWave = v; return this;}
    ArrayList<SetItem> mItems = new ArrayList<SetItem>();
    @SuppressWarnings("unchecked")
    public ArrayList<SetItem> getItems() { return (ArrayList<SetItem>)mItems.clone(); }
    @SuppressWarnings("unchecked")
    public SetBase setItems(ArrayList<SetItem> v) { mItems = (ArrayList<SetItem>)v.clone(); return this;}

    public void update(Map<String,Object> data) {
        mExternalId = DataUtils.stringValue((String)data.get("id"), "");
        mInclude = DataUtils.booleanValue((String)data.get("Include"));
        mName = DataUtils.stringValue((String)data.get("Name"), "");
        mProductName = DataUtils.stringValue((String)data.get("ProductName"), "");
        mReleaseDate = DataUtils.dateValue((String)data.get("ReleaseDate"));
        mWave = DataUtils.stringValue((String)data.get("overallSetName"), "");
    }

}
