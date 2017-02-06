package com.example.czz.stockknower.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by czz on 2017/1/16.
 */

public class Stock {

    /**
     * error_code : 0
     * reason : SUCCESSED!
     * result : {"totalCount":"1193","page":"1","num":"20","data":[{"symbol":"sh600000","name":"浦发银行","trade":"16.270","pricechange":"0.000","changepercent":"0.000","buy":"16.270","sell":"16.270","settlement":"16.270","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600000","ticktime":"09:18:00"},{"symbol":"sh600004","name":"白云机场","trade":"14.130","pricechange":"0.000","changepercent":"0.000","buy":"14.120","sell":"14.120","settlement":"14.130","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600004","ticktime":"09:17:42"},{"symbol":"sh600005","name":"武钢股份","trade":"3.570","pricechange":"0.000","changepercent":"0.000","buy":"3.660","sell":"3.660","settlement":"3.570","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600005","ticktime":"09:17:57"},{"symbol":"sh600006","name":"东风汽车","trade":"6.820","pricechange":"0.000","changepercent":"0.000","buy":"6.860","sell":"6.860","settlement":"6.820","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600006","ticktime":"09:17:42"},{"symbol":"sh600007","name":"中国国贸","trade":"18.060","pricechange":"0.000","changepercent":"0.000","buy":"0.000","sell":"0.000","settlement":"18.060","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600007","ticktime":"09:17:57"},{"symbol":"sh600008","name":"首创股份","trade":"4.120","pricechange":"0.000","changepercent":"0.000","buy":"4.110","sell":"4.110","settlement":"4.120","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600008","ticktime":"09:17:45"},{"symbol":"sh600009","name":"上海机场","trade":"26.750","pricechange":"0.000","changepercent":"0.000","buy":"26.650","sell":"26.650","settlement":"26.750","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600009","ticktime":"09:17:45"},{"symbol":"sh600010","name":"包钢股份","trade":"2.850","pricechange":"0.000","changepercent":"0.000","buy":"2.850","sell":"2.850","settlement":"2.850","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600010","ticktime":"09:18:06"},{"symbol":"sh600011","name":"华能国际","trade":"7.230","pricechange":"0.000","changepercent":"0.000","buy":"7.170","sell":"7.170","settlement":"7.230","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600011","ticktime":"09:18:00"},{"symbol":"sh600012","name":"皖通高速","trade":"13.810","pricechange":"0.000","changepercent":"0.000","buy":"13.830","sell":"13.830","settlement":"13.810","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600012","ticktime":"09:17:57"},{"symbol":"sh600015","name":"华夏银行","trade":"10.950","pricechange":"0.000","changepercent":"0.000","buy":"10.950","sell":"10.950","settlement":"10.950","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600015","ticktime":"09:17:51"},{"symbol":"sh600016","name":"民生银行","trade":"9.080","pricechange":"0.000","changepercent":"0.000","buy":"9.080","sell":"9.080","settlement":"9.080","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600016","ticktime":"09:18:00"},{"symbol":"sh600017","name":"日照港","trade":"4.020","pricechange":"0.000","changepercent":"0.000","buy":"4.020","sell":"4.020","settlement":"4.020","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600017","ticktime":"09:18:06"},{"symbol":"sh600018","name":"上港集团","trade":"5.290","pricechange":"0.000","changepercent":"0.000","buy":"5.300","sell":"5.300","settlement":"5.290","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600018","ticktime":"09:18:00"},{"symbol":"sh600019","name":"宝钢股份","trade":"6.840","pricechange":"0.000","changepercent":"0.000","buy":"6.930","sell":"6.930","settlement":"6.840","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600019","ticktime":"09:18:06"},{"symbol":"sh600020","name":"中原高速","trade":"4.580","pricechange":"0.000","changepercent":"0.000","buy":"4.580","sell":"4.580","settlement":"4.580","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600020","ticktime":"09:17:51"},{"symbol":"sh600021","name":"上海电力","trade":"13.160","pricechange":"0.000","changepercent":"0.000","buy":"13.340","sell":"13.340","settlement":"13.160","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600021","ticktime":"09:18:00"},{"symbol":"sh600022","name":"山东钢铁","trade":"2.560","pricechange":"0.000","changepercent":"0.000","buy":"2.570","sell":"2.570","settlement":"2.560","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600022","ticktime":"09:18:00"},{"symbol":"sh600023","name":"浙能电力","trade":"5.630","pricechange":"0.000","changepercent":"0.000","buy":"5.640","sell":"5.640","settlement":"5.630","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600023","ticktime":"09:17:51"},{"symbol":"sh600026","name":"中远海能","trade":"6.950","pricechange":"0.000","changepercent":"0.000","buy":"6.960","sell":"6.960","settlement":"6.950","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600026","ticktime":"09:17:36"}]}
     */

    private int error_code;
    private String reason;
    /**
     * totalCount : 1193
     * page : 1
     * num : 20
     * data : [{"symbol":"sh600000","name":"浦发银行","trade":"16.270","pricechange":"0.000","changepercent":"0.000","buy":"16.270","sell":"16.270","settlement":"16.270","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600000","ticktime":"09:18:00"},{"symbol":"sh600004","name":"白云机场","trade":"14.130","pricechange":"0.000","changepercent":"0.000","buy":"14.120","sell":"14.120","settlement":"14.130","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600004","ticktime":"09:17:42"},{"symbol":"sh600005","name":"武钢股份","trade":"3.570","pricechange":"0.000","changepercent":"0.000","buy":"3.660","sell":"3.660","settlement":"3.570","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600005","ticktime":"09:17:57"},{"symbol":"sh600006","name":"东风汽车","trade":"6.820","pricechange":"0.000","changepercent":"0.000","buy":"6.860","sell":"6.860","settlement":"6.820","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600006","ticktime":"09:17:42"},{"symbol":"sh600007","name":"中国国贸","trade":"18.060","pricechange":"0.000","changepercent":"0.000","buy":"0.000","sell":"0.000","settlement":"18.060","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600007","ticktime":"09:17:57"},{"symbol":"sh600008","name":"首创股份","trade":"4.120","pricechange":"0.000","changepercent":"0.000","buy":"4.110","sell":"4.110","settlement":"4.120","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600008","ticktime":"09:17:45"},{"symbol":"sh600009","name":"上海机场","trade":"26.750","pricechange":"0.000","changepercent":"0.000","buy":"26.650","sell":"26.650","settlement":"26.750","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600009","ticktime":"09:17:45"},{"symbol":"sh600010","name":"包钢股份","trade":"2.850","pricechange":"0.000","changepercent":"0.000","buy":"2.850","sell":"2.850","settlement":"2.850","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600010","ticktime":"09:18:06"},{"symbol":"sh600011","name":"华能国际","trade":"7.230","pricechange":"0.000","changepercent":"0.000","buy":"7.170","sell":"7.170","settlement":"7.230","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600011","ticktime":"09:18:00"},{"symbol":"sh600012","name":"皖通高速","trade":"13.810","pricechange":"0.000","changepercent":"0.000","buy":"13.830","sell":"13.830","settlement":"13.810","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600012","ticktime":"09:17:57"},{"symbol":"sh600015","name":"华夏银行","trade":"10.950","pricechange":"0.000","changepercent":"0.000","buy":"10.950","sell":"10.950","settlement":"10.950","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600015","ticktime":"09:17:51"},{"symbol":"sh600016","name":"民生银行","trade":"9.080","pricechange":"0.000","changepercent":"0.000","buy":"9.080","sell":"9.080","settlement":"9.080","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600016","ticktime":"09:18:00"},{"symbol":"sh600017","name":"日照港","trade":"4.020","pricechange":"0.000","changepercent":"0.000","buy":"4.020","sell":"4.020","settlement":"4.020","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600017","ticktime":"09:18:06"},{"symbol":"sh600018","name":"上港集团","trade":"5.290","pricechange":"0.000","changepercent":"0.000","buy":"5.300","sell":"5.300","settlement":"5.290","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600018","ticktime":"09:18:00"},{"symbol":"sh600019","name":"宝钢股份","trade":"6.840","pricechange":"0.000","changepercent":"0.000","buy":"6.930","sell":"6.930","settlement":"6.840","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600019","ticktime":"09:18:06"},{"symbol":"sh600020","name":"中原高速","trade":"4.580","pricechange":"0.000","changepercent":"0.000","buy":"4.580","sell":"4.580","settlement":"4.580","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600020","ticktime":"09:17:51"},{"symbol":"sh600021","name":"上海电力","trade":"13.160","pricechange":"0.000","changepercent":"0.000","buy":"13.340","sell":"13.340","settlement":"13.160","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600021","ticktime":"09:18:00"},{"symbol":"sh600022","name":"山东钢铁","trade":"2.560","pricechange":"0.000","changepercent":"0.000","buy":"2.570","sell":"2.570","settlement":"2.560","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600022","ticktime":"09:18:00"},{"symbol":"sh600023","name":"浙能电力","trade":"5.630","pricechange":"0.000","changepercent":"0.000","buy":"5.640","sell":"5.640","settlement":"5.630","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600023","ticktime":"09:17:51"},{"symbol":"sh600026","name":"中远海能","trade":"6.950","pricechange":"0.000","changepercent":"0.000","buy":"6.960","sell":"6.960","settlement":"6.950","open":"0.000","high":"0.000","low":"0.000","volume":0,"amount":0,"code":"600026","ticktime":"09:17:36"}]
     */

    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private String totalCount;
        private String page;
        private String num;
        /**
         * symbol : sh600000
         * name : 浦发银行
         * trade : 16.270
         * pricechange : 0.000
         * changepercent : 0.000
         * buy : 16.270
         * sell : 16.270
         * settlement : 16.270
         * open : 0.000
         * high : 0.000
         * low : 0.000
         * volume : 0
         * amount : 0
         * code : 600000
         * ticktime : 09:18:00
         */

        private List<DataBean> data;

        public String getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(String totalCount) {
            this.totalCount = totalCount;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements Serializable{
            private String symbol;
            private String name;
            private String trade;
            private String pricechange;
            private String changepercent;
            private String buy;
            private String sell;
            private String settlement;
            private String open;
            private String high;
            private String low;
            private int volume;
            private int amount;
            private String code;
            private String ticktime;

            public String getSymbol() {
                return symbol;
            }

            public void setSymbol(String symbol) {
                this.symbol = symbol;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTrade() {
                return trade;
            }

            public void setTrade(String trade) {
                this.trade = trade;
            }

            public String getPricechange() {
                return pricechange;
            }

            public void setPricechange(String pricechange) {
                this.pricechange = pricechange;
            }

            public String getChangepercent() {
                return changepercent;
            }

            public void setChangepercent(String changepercent) {
                this.changepercent = changepercent;
            }

            public String getBuy() {
                return buy;
            }

            public void setBuy(String buy) {
                this.buy = buy;
            }

            public String getSell() {
                return sell;
            }

            public void setSell(String sell) {
                this.sell = sell;
            }

            public String getSettlement() {
                return settlement;
            }

            public void setSettlement(String settlement) {
                this.settlement = settlement;
            }

            public String getOpen() {
                return open;
            }

            public void setOpen(String open) {
                this.open = open;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public int getVolume() {
                return volume;
            }

            public void setVolume(int volume) {
                this.volume = volume;
            }

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getTicktime() {
                return ticktime;
            }

            public void setTicktime(String ticktime) {
                this.ticktime = ticktime;
            }
        }
    }
}
