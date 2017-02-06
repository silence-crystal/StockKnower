package com.example.czz.stockknower.bean;

/**
 * Created by czz on 2017/1/16.
 */

public class Market {

    /**
     * error_code : 0
     * reason : SUCCESSED!
     * result : {"dealNum":"222129562","dealPri":"225951847969","highPri":"3104.4924","increPer":"-0.57","increase":"-17.8435","lowpri":"3044.2912","name":"上证指数","nowpri":"3094.9209","openPri":"3104.4924","time":"2017-01-16 14:42:44","yesPri":"3112.7644"}
     */

    private int error_code;
    private String reason;
    /**
     * dealNum : 222129562
     * dealPri : 225951847969
     * highPri : 3104.4924
     * increPer : -0.57
     * increase : -17.8435
     * lowpri : 3044.2912
     * name : 上证指数
     * nowpri : 3094.9209
     * openPri : 3104.4924
     * time : 2017-01-16 14:42:44
     * yesPri : 3112.7644
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
        private String dealNum;
        private String dealPri;
        private String highPri;
        private String increPer;
        private String increase;
        private String lowpri;
        private String name;
        private String nowpri;
        private String openPri;
        private String time;
        private String yesPri;

        public String getDealNum() {
            return dealNum;
        }

        public void setDealNum(String dealNum) {
            this.dealNum = dealNum;
        }

        public String getDealPri() {
            return dealPri;
        }

        public void setDealPri(String dealPri) {
            this.dealPri = dealPri;
        }

        public String getHighPri() {
            return highPri;
        }

        public void setHighPri(String highPri) {
            this.highPri = highPri;
        }

        public String getIncrePer() {
            return increPer;
        }

        public void setIncrePer(String increPer) {
            this.increPer = increPer;
        }

        public String getIncrease() {
            return increase;
        }

        public void setIncrease(String increase) {
            this.increase = increase;
        }

        public String getLowpri() {
            return lowpri;
        }

        public void setLowpri(String lowpri) {
            this.lowpri = lowpri;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNowpri() {
            return nowpri;
        }

        public void setNowpri(String nowpri) {
            this.nowpri = nowpri;
        }

        public String getOpenPri() {
            return openPri;
        }

        public void setOpenPri(String openPri) {
            this.openPri = openPri;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getYesPri() {
            return yesPri;
        }

        public void setYesPri(String yesPri) {
            this.yesPri = yesPri;
        }
    }
}
