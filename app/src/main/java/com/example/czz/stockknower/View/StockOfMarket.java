package com.example.czz.stockknower.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/**
 * Created by czz on 2017/1/13.
 */

public class StockOfMarket extends ListView {
    public StockOfMarket(Context context) {
        super(context);
    }

    public StockOfMarket(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StockOfMarket(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec= View.MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>>2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
