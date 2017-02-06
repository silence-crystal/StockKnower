package com.example.czz.stockknower.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by czz on 2017/1/16.
 */

public class HongKongStock {

    /**
     * error_code : 0
     * reason : SUCCESSED!
     * result : {"totalCount":"315","page":"1","num":"20","data":[{"symbol":"00001","name":"长和","engname":"CHEUNG KONG","tradetype":"EQTY","lasttrade":"90.600","prevclose":"92.050","open":"91.700","high":"91.700","low":"90.000","volume":"3958313","currentvolume":"320000","amount":"357538747","ticktime":"2017-01-16 16:08:50","buy":"90.550","sell":"90.600","high_52week":"103.900","low_52week":"80.600","eps":"8.200","dividend":"2.550","stocks_sum":"3857678500","pricechange":"-1.450","changepercent":"-1.5752309"},{"symbol":"00002","name":"中电控股","engname":"CLP HOLDINGS","tradetype":"EQTY","lasttrade":"75.500","prevclose":"75.300","open":"75.600","high":"75.600","low":"74.850","volume":"1243532","currentvolume":"184500","amount":"93576457","ticktime":"2017-01-16 16:08:52","buy":"75.450","sell":"75.500","high_52week":"84.350","low_52week":"62.350","eps":"6.361","dividend":"2.700","stocks_sum":"2526450570","pricechange":"0.200","changepercent":"0.2656042"},{"symbol":"00003","name":"香港中华煤气","engname":"HK & CHINA GAS","tradetype":"EQTY","lasttrade":"14.480","prevclose":"14.500","open":"14.500","high":"14.600","low":"14.380","volume":"7727362","currentvolume":"520000","amount":"111646885","ticktime":"2017-01-16 16:08:50","buy":"14.460","sell":"14.480","high_52week":"15.620","low_52week":"13.020","eps":"0.585","dividend":"0.350","stocks_sum":"12717042258","pricechange":"-0.020","changepercent":"-0.1379310"},{"symbol":"00004","name":"九龙仓集团","engname":"WHARF HOLDINGS","tradetype":"EQTY","lasttrade":"57.300","prevclose":"58.000","open":"58.150","high":"58.200","low":"57.000","volume":"2325539","currentvolume":"185000","amount":"133328252","ticktime":"2017-01-16 16:08:50","buy":"57.250","sell":"57.300","high_52week":"60.300","low_52week":"34.450","eps":"5.208","dividend":"1.900","stocks_sum":"3032127327","pricechange":"-0.700","changepercent":"-1.2068966"},{"symbol":"00005","name":"汇丰控股","engname":"HSBC HOLDINGS","tradetype":"EQTY","lasttrade":"63.200","prevclose":"64.000","open":"63.700","high":"63.850","low":"63.100","volume":"12472145","currentvolume":"934400","amount":"789807894","ticktime":"2017-01-16 16:08:52","buy":"63.150","sell":"63.200","high_52week":"67.250","low_52week":"44.500","eps":"0.536","dividend":"0.510","stocks_sum":"20190858960","pricechange":"-0.800","changepercent":"-1.2500000"},{"symbol":"00006","name":"电能实业","engname":"POWER ASSETS","tradetype":"EQTY","lasttrade":"72.500","prevclose":"70.550","open":"72.150","high":"73.350","low":"72.000","volume":"5705540","currentvolume":"391500","amount":"415486727","ticktime":"2017-01-16 16:08:50","buy":"72.500","sell":"72.550","high_52week":"81.000","low_52week":"66.100","eps":"3.735","dividend":"2.700","stocks_sum":"2134261654","pricechange":"1.950","changepercent":"2.7639972"},{"symbol":"00008","name":"电讯盈科","engname":"PCCW","tradetype":"EQTY","lasttrade":"4.580","prevclose":"4.390","open":"4.460","high":"4.610","low":"4.450","volume":"28874904","currentvolume":"475000","amount":"131497265","ticktime":"2017-01-16 16:08:52","buy":"4.570","sell":"4.580","high_52week":"5.770","low_52week":"4.150","eps":"0.271","dividend":"0.250","stocks_sum":"7719638249","pricechange":"0.190","changepercent":"4.3280182"},{"symbol":"00010","name":"恒隆集团","engname":"HANG LUNG GROUP","tradetype":"EQTY","lasttrade":"27.850","prevclose":"28.300","open":"28.000","high":"28.000","low":"27.600","volume":"596000","currentvolume":"26000","amount":"16666512","ticktime":"2017-01-16 16:08:52","buy":"27.800","sell":"27.850","high_52week":"32.350","low_52week":"19.460","eps":"2.366","dividend":"0.800","stocks_sum":"1361618242","pricechange":"-0.450","changepercent":"-1.5901060"},{"symbol":"00011","name":"恒生银行","engname":"HANG SENG BANK","tradetype":"EQTY","lasttrade":"149.900","prevclose":"150.000","open":"150.000","high":"150.000","low":"149.100","volume":"552088","currentvolume":"64400","amount":"82601697","ticktime":"2017-01-16 16:08:50","buy":"149.800","sell":"149.900","high_52week":"150.000","low_52week":"121.100","eps":"8.082","dividend":"8.700","stocks_sum":"1911842736","pricechange":"-0.100","changepercent":"-0.0666667"},{"symbol":"00012","name":"恒基地产","engname":"HENDERSON LAND","tradetype":"EQTY","lasttrade":"42.900","prevclose":"43.600","open":"43.700","high":"43.700","low":"42.750","volume":"1399254","currentvolume":"65000","amount":"60141720","ticktime":"2017-01-16 16:08:52","buy":"42.850","sell":"42.900","high_52week":"50.950","low_52week":"37.400","eps":"5.523","dividend":"1.450","stocks_sum":"3637405713","pricechange":"-0.700","changepercent":"-1.6055046"},{"symbol":"00014","name":"希慎兴业","engname":"HYSAN DEV","tradetype":"EQTY","lasttrade":"35.150","prevclose":"35.450","open":"35.550","high":"35.550","low":"34.650","volume":"515049","currentvolume":"30000","amount":"17982566","ticktime":"2017-01-16 16:08:50","buy":"35.100","sell":"35.150","high_52week":"38.700","low_52week":"28.800","eps":"1.447","dividend":"1.320","stocks_sum":"1045275359","pricechange":"-0.300","changepercent":"-0.8462623"},{"symbol":"00016","name":"新鸿基地产","engname":"SHK PPT","tradetype":"EQTY","lasttrade":"105.700","prevclose":"106.700","open":"106.400","high":"106.400","low":"105.000","volume":"2238028","currentvolume":"144000","amount":"236111350","ticktime":"2017-01-16 16:08:50","buy":"105.700","sell":"105.800","high_52week":"123.300","low_52week":"79.000","eps":"5.632","dividend":"1.050","stocks_sum":"2895457274","pricechange":"-1.000","changepercent":"-0.9372071"},{"symbol":"00017","name":"新世界发展","engname":"NEW WORLD DEV","tradetype":"EQTY","lasttrade":"8.910","prevclose":"9.000","open":"9.000","high":"9.040","low":"8.850","volume":"9341417","currentvolume":"608000","amount":"83072660","ticktime":"2017-01-16 16:08:52","buy":"8.900","sell":"8.910","high_52week":"10.460","low_52week":"5.870","eps":"-0.761","dividend":"0.130","stocks_sum":"9394551478","pricechange":"-0.090","changepercent":"-1.0000000"},{"symbol":"00019","name":"太古A","engname":"SWIRE PACIFIC A","tradetype":"EQTY","lasttrade":"78.150","prevclose":"78.550","open":"78.500","high":"78.700","low":"77.800","volume":"655330","currentvolume":"25500","amount":"51267446","ticktime":"2017-01-16 16:08:52","buy":"78.150","sell":"78.200","high_52week":"94.400","low_52week":"70.150","eps":"11.614","dividend":"3.900","stocks_sum":"905206000","pricechange":"-0.400","changepercent":"-0.5092298"},{"symbol":"00020","name":"会德丰","engname":"WHEELOCK","tradetype":"EQTY","lasttrade":"46.000","prevclose":"46.200","open":"46.500","high":"46.500","low":"45.750","volume":"691623","currentvolume":"79000","amount":"31760028","ticktime":"2017-01-16 16:08:52","buy":"45.900","sell":"46.000","high_52week":"49.400","low_52week":"27.350","eps":"5.843","dividend":"1.150","stocks_sum":"2034699287","pricechange":"-0.200","changepercent":"-0.4329004"},{"symbol":"00023","name":"东亚银行","engname":"BANK OF E ASIA","tradetype":"EQTY","lasttrade":"31.550","prevclose":"31.700","open":"31.650","high":"31.800","low":"31.500","volume":"524344","currentvolume":"82400","amount":"16589286","ticktime":"2017-01-16 16:08:52","buy":"31.550","sell":"31.600","high_52week":"34.350","low_52week":"20.950","eps":"1.577","dividend":"0.880","stocks_sum":"2702741329","pricechange":"-0.150","changepercent":"-0.4731861"},{"symbol":"00027","name":"银河娱乐","engname":"GALAXY ENT","tradetype":"EQTY","lasttrade":"35.350","prevclose":"35.500","open":"35.500","high":"35.750","low":"35.050","volume":"5278120","currentvolume":"395000","amount":"186693989","ticktime":"2017-01-16 16:08:50","buy":"35.350","sell":"35.400","high_52week":"39.200","low_52week":"19.920","eps":"1.098","dividend":"0.570","stocks_sum":"4270970615","pricechange":"-0.150","changepercent":"-0.4225352"},{"symbol":"00038","name":"第一拖拉机股份","engname":"FIRST TRACTOR","tradetype":"EQTY","lasttrade":"4.400","prevclose":"4.530","open":"4.520","high":"4.530","low":"4.390","volume":"1689000","currentvolume":"10000","amount":"7495860","ticktime":"2017-01-16 16:08:52","buy":"4.400","sell":"4.420","high_52week":"4.670","low_52week":"3.760","eps":"0.174","dividend":"0.041","stocks_sum":"401990000","pricechange":"-0.130","changepercent":"-2.8697572"},{"symbol":"00041","name":"鹰君","engname":"GREAT EAGLE H","tradetype":"EQTY","lasttrade":"36.450","prevclose":"36.100","open":"35.800","high":"36.500","low":"35.800","volume":"159000","currentvolume":"3000","amount":"5758550","ticktime":"2017-01-16 16:08:50","buy":"36.300","sell":"36.450","high_52week":"38.050","low_52week":"20.250","eps":"4.929","dividend":"2.740","stocks_sum":"677350835","pricechange":"0.350","changepercent":"0.9695291"},{"symbol":"00066","name":"港铁公司","engname":"MTR CORPORATION","tradetype":"EQTY","lasttrade":"38.650","prevclose":"38.800","open":"38.700","high":"38.900","low":"38.450","volume":"1896392","currentvolume":"143000","amount":"73251607","ticktime":"2017-01-16 16:08:50","buy":"38.650","sell":"38.700","high_52week":"44.500","low_52week":"34.200","eps":"1.681","dividend":"1.060","stocks_sum":"5904032065","pricechange":"-0.150","changepercent":"-0.3865979"}]}
     */

    private int error_code;
    private String reason;
    /**
     * totalCount : 315
     * page : 1
     * num : 20
     * data : [{"symbol":"00001","name":"长和","engname":"CHEUNG KONG","tradetype":"EQTY","lasttrade":"90.600","prevclose":"92.050","open":"91.700","high":"91.700","low":"90.000","volume":"3958313","currentvolume":"320000","amount":"357538747","ticktime":"2017-01-16 16:08:50","buy":"90.550","sell":"90.600","high_52week":"103.900","low_52week":"80.600","eps":"8.200","dividend":"2.550","stocks_sum":"3857678500","pricechange":"-1.450","changepercent":"-1.5752309"},{"symbol":"00002","name":"中电控股","engname":"CLP HOLDINGS","tradetype":"EQTY","lasttrade":"75.500","prevclose":"75.300","open":"75.600","high":"75.600","low":"74.850","volume":"1243532","currentvolume":"184500","amount":"93576457","ticktime":"2017-01-16 16:08:52","buy":"75.450","sell":"75.500","high_52week":"84.350","low_52week":"62.350","eps":"6.361","dividend":"2.700","stocks_sum":"2526450570","pricechange":"0.200","changepercent":"0.2656042"},{"symbol":"00003","name":"香港中华煤气","engname":"HK & CHINA GAS","tradetype":"EQTY","lasttrade":"14.480","prevclose":"14.500","open":"14.500","high":"14.600","low":"14.380","volume":"7727362","currentvolume":"520000","amount":"111646885","ticktime":"2017-01-16 16:08:50","buy":"14.460","sell":"14.480","high_52week":"15.620","low_52week":"13.020","eps":"0.585","dividend":"0.350","stocks_sum":"12717042258","pricechange":"-0.020","changepercent":"-0.1379310"},{"symbol":"00004","name":"九龙仓集团","engname":"WHARF HOLDINGS","tradetype":"EQTY","lasttrade":"57.300","prevclose":"58.000","open":"58.150","high":"58.200","low":"57.000","volume":"2325539","currentvolume":"185000","amount":"133328252","ticktime":"2017-01-16 16:08:50","buy":"57.250","sell":"57.300","high_52week":"60.300","low_52week":"34.450","eps":"5.208","dividend":"1.900","stocks_sum":"3032127327","pricechange":"-0.700","changepercent":"-1.2068966"},{"symbol":"00005","name":"汇丰控股","engname":"HSBC HOLDINGS","tradetype":"EQTY","lasttrade":"63.200","prevclose":"64.000","open":"63.700","high":"63.850","low":"63.100","volume":"12472145","currentvolume":"934400","amount":"789807894","ticktime":"2017-01-16 16:08:52","buy":"63.150","sell":"63.200","high_52week":"67.250","low_52week":"44.500","eps":"0.536","dividend":"0.510","stocks_sum":"20190858960","pricechange":"-0.800","changepercent":"-1.2500000"},{"symbol":"00006","name":"电能实业","engname":"POWER ASSETS","tradetype":"EQTY","lasttrade":"72.500","prevclose":"70.550","open":"72.150","high":"73.350","low":"72.000","volume":"5705540","currentvolume":"391500","amount":"415486727","ticktime":"2017-01-16 16:08:50","buy":"72.500","sell":"72.550","high_52week":"81.000","low_52week":"66.100","eps":"3.735","dividend":"2.700","stocks_sum":"2134261654","pricechange":"1.950","changepercent":"2.7639972"},{"symbol":"00008","name":"电讯盈科","engname":"PCCW","tradetype":"EQTY","lasttrade":"4.580","prevclose":"4.390","open":"4.460","high":"4.610","low":"4.450","volume":"28874904","currentvolume":"475000","amount":"131497265","ticktime":"2017-01-16 16:08:52","buy":"4.570","sell":"4.580","high_52week":"5.770","low_52week":"4.150","eps":"0.271","dividend":"0.250","stocks_sum":"7719638249","pricechange":"0.190","changepercent":"4.3280182"},{"symbol":"00010","name":"恒隆集团","engname":"HANG LUNG GROUP","tradetype":"EQTY","lasttrade":"27.850","prevclose":"28.300","open":"28.000","high":"28.000","low":"27.600","volume":"596000","currentvolume":"26000","amount":"16666512","ticktime":"2017-01-16 16:08:52","buy":"27.800","sell":"27.850","high_52week":"32.350","low_52week":"19.460","eps":"2.366","dividend":"0.800","stocks_sum":"1361618242","pricechange":"-0.450","changepercent":"-1.5901060"},{"symbol":"00011","name":"恒生银行","engname":"HANG SENG BANK","tradetype":"EQTY","lasttrade":"149.900","prevclose":"150.000","open":"150.000","high":"150.000","low":"149.100","volume":"552088","currentvolume":"64400","amount":"82601697","ticktime":"2017-01-16 16:08:50","buy":"149.800","sell":"149.900","high_52week":"150.000","low_52week":"121.100","eps":"8.082","dividend":"8.700","stocks_sum":"1911842736","pricechange":"-0.100","changepercent":"-0.0666667"},{"symbol":"00012","name":"恒基地产","engname":"HENDERSON LAND","tradetype":"EQTY","lasttrade":"42.900","prevclose":"43.600","open":"43.700","high":"43.700","low":"42.750","volume":"1399254","currentvolume":"65000","amount":"60141720","ticktime":"2017-01-16 16:08:52","buy":"42.850","sell":"42.900","high_52week":"50.950","low_52week":"37.400","eps":"5.523","dividend":"1.450","stocks_sum":"3637405713","pricechange":"-0.700","changepercent":"-1.6055046"},{"symbol":"00014","name":"希慎兴业","engname":"HYSAN DEV","tradetype":"EQTY","lasttrade":"35.150","prevclose":"35.450","open":"35.550","high":"35.550","low":"34.650","volume":"515049","currentvolume":"30000","amount":"17982566","ticktime":"2017-01-16 16:08:50","buy":"35.100","sell":"35.150","high_52week":"38.700","low_52week":"28.800","eps":"1.447","dividend":"1.320","stocks_sum":"1045275359","pricechange":"-0.300","changepercent":"-0.8462623"},{"symbol":"00016","name":"新鸿基地产","engname":"SHK PPT","tradetype":"EQTY","lasttrade":"105.700","prevclose":"106.700","open":"106.400","high":"106.400","low":"105.000","volume":"2238028","currentvolume":"144000","amount":"236111350","ticktime":"2017-01-16 16:08:50","buy":"105.700","sell":"105.800","high_52week":"123.300","low_52week":"79.000","eps":"5.632","dividend":"1.050","stocks_sum":"2895457274","pricechange":"-1.000","changepercent":"-0.9372071"},{"symbol":"00017","name":"新世界发展","engname":"NEW WORLD DEV","tradetype":"EQTY","lasttrade":"8.910","prevclose":"9.000","open":"9.000","high":"9.040","low":"8.850","volume":"9341417","currentvolume":"608000","amount":"83072660","ticktime":"2017-01-16 16:08:52","buy":"8.900","sell":"8.910","high_52week":"10.460","low_52week":"5.870","eps":"-0.761","dividend":"0.130","stocks_sum":"9394551478","pricechange":"-0.090","changepercent":"-1.0000000"},{"symbol":"00019","name":"太古A","engname":"SWIRE PACIFIC A","tradetype":"EQTY","lasttrade":"78.150","prevclose":"78.550","open":"78.500","high":"78.700","low":"77.800","volume":"655330","currentvolume":"25500","amount":"51267446","ticktime":"2017-01-16 16:08:52","buy":"78.150","sell":"78.200","high_52week":"94.400","low_52week":"70.150","eps":"11.614","dividend":"3.900","stocks_sum":"905206000","pricechange":"-0.400","changepercent":"-0.5092298"},{"symbol":"00020","name":"会德丰","engname":"WHEELOCK","tradetype":"EQTY","lasttrade":"46.000","prevclose":"46.200","open":"46.500","high":"46.500","low":"45.750","volume":"691623","currentvolume":"79000","amount":"31760028","ticktime":"2017-01-16 16:08:52","buy":"45.900","sell":"46.000","high_52week":"49.400","low_52week":"27.350","eps":"5.843","dividend":"1.150","stocks_sum":"2034699287","pricechange":"-0.200","changepercent":"-0.4329004"},{"symbol":"00023","name":"东亚银行","engname":"BANK OF E ASIA","tradetype":"EQTY","lasttrade":"31.550","prevclose":"31.700","open":"31.650","high":"31.800","low":"31.500","volume":"524344","currentvolume":"82400","amount":"16589286","ticktime":"2017-01-16 16:08:52","buy":"31.550","sell":"31.600","high_52week":"34.350","low_52week":"20.950","eps":"1.577","dividend":"0.880","stocks_sum":"2702741329","pricechange":"-0.150","changepercent":"-0.4731861"},{"symbol":"00027","name":"银河娱乐","engname":"GALAXY ENT","tradetype":"EQTY","lasttrade":"35.350","prevclose":"35.500","open":"35.500","high":"35.750","low":"35.050","volume":"5278120","currentvolume":"395000","amount":"186693989","ticktime":"2017-01-16 16:08:50","buy":"35.350","sell":"35.400","high_52week":"39.200","low_52week":"19.920","eps":"1.098","dividend":"0.570","stocks_sum":"4270970615","pricechange":"-0.150","changepercent":"-0.4225352"},{"symbol":"00038","name":"第一拖拉机股份","engname":"FIRST TRACTOR","tradetype":"EQTY","lasttrade":"4.400","prevclose":"4.530","open":"4.520","high":"4.530","low":"4.390","volume":"1689000","currentvolume":"10000","amount":"7495860","ticktime":"2017-01-16 16:08:52","buy":"4.400","sell":"4.420","high_52week":"4.670","low_52week":"3.760","eps":"0.174","dividend":"0.041","stocks_sum":"401990000","pricechange":"-0.130","changepercent":"-2.8697572"},{"symbol":"00041","name":"鹰君","engname":"GREAT EAGLE H","tradetype":"EQTY","lasttrade":"36.450","prevclose":"36.100","open":"35.800","high":"36.500","low":"35.800","volume":"159000","currentvolume":"3000","amount":"5758550","ticktime":"2017-01-16 16:08:50","buy":"36.300","sell":"36.450","high_52week":"38.050","low_52week":"20.250","eps":"4.929","dividend":"2.740","stocks_sum":"677350835","pricechange":"0.350","changepercent":"0.9695291"},{"symbol":"00066","name":"港铁公司","engname":"MTR CORPORATION","tradetype":"EQTY","lasttrade":"38.650","prevclose":"38.800","open":"38.700","high":"38.900","low":"38.450","volume":"1896392","currentvolume":"143000","amount":"73251607","ticktime":"2017-01-16 16:08:50","buy":"38.650","sell":"38.700","high_52week":"44.500","low_52week":"34.200","eps":"1.681","dividend":"1.060","stocks_sum":"5904032065","pricechange":"-0.150","changepercent":"-0.3865979"}]
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
         * symbol : 00001
         * name : 长和
         * engname : CHEUNG KONG
         * tradetype : EQTY
         * lasttrade : 90.600
         * prevclose : 92.050
         * open : 91.700
         * high : 91.700
         * low : 90.000
         * volume : 3958313
         * currentvolume : 320000
         * amount : 357538747
         * ticktime : 2017-01-16 16:08:50
         * buy : 90.550
         * sell : 90.600
         * high_52week : 103.900
         * low_52week : 80.600
         * eps : 8.200
         * dividend : 2.550
         * stocks_sum : 3857678500
         * pricechange : -1.450
         * changepercent : -1.5752309
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
            private String engname;
            private String tradetype;
            private String lasttrade;
            private String prevclose;
            private String open;
            private String high;
            private String low;
            private String volume;
            private String currentvolume;
            private String amount;
            private String ticktime;
            private String buy;
            private String sell;
            private String high_52week;
            private String low_52week;
            private String eps;
            private String dividend;
            private String stocks_sum;
            private String pricechange;
            private String changepercent;

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

            public String getEngname() {
                return engname;
            }

            public void setEngname(String engname) {
                this.engname = engname;
            }

            public String getTradetype() {
                return tradetype;
            }

            public void setTradetype(String tradetype) {
                this.tradetype = tradetype;
            }

            public String getLasttrade() {
                return lasttrade;
            }

            public void setLasttrade(String lasttrade) {
                this.lasttrade = lasttrade;
            }

            public String getPrevclose() {
                return prevclose;
            }

            public void setPrevclose(String prevclose) {
                this.prevclose = prevclose;
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

            public String getVolume() {
                return volume;
            }

            public void setVolume(String volume) {
                this.volume = volume;
            }

            public String getCurrentvolume() {
                return currentvolume;
            }

            public void setCurrentvolume(String currentvolume) {
                this.currentvolume = currentvolume;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getTicktime() {
                return ticktime;
            }

            public void setTicktime(String ticktime) {
                this.ticktime = ticktime;
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

            public String getHigh_52week() {
                return high_52week;
            }

            public void setHigh_52week(String high_52week) {
                this.high_52week = high_52week;
            }

            public String getLow_52week() {
                return low_52week;
            }

            public void setLow_52week(String low_52week) {
                this.low_52week = low_52week;
            }

            public String getEps() {
                return eps;
            }

            public void setEps(String eps) {
                this.eps = eps;
            }

            public String getDividend() {
                return dividend;
            }

            public void setDividend(String dividend) {
                this.dividend = dividend;
            }

            public String getStocks_sum() {
                return stocks_sum;
            }

            public void setStocks_sum(String stocks_sum) {
                this.stocks_sum = stocks_sum;
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
        }
    }
}
