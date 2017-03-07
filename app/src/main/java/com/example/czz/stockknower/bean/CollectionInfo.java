package com.example.czz.stockknower.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by czz on 2017/3/5.
 */

public class CollectionInfo extends BmobObject {
    private String type;
    private String stockID;
    private String stockName;
    private String userID;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStockID() {
        return stockID;
    }

    public void setStockID(String stockID) {
        this.stockID = stockID;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
