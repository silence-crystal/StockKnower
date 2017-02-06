package com.example.czz.stockknower.bean;

import java.util.List;

/**
 * Created by czz on 2017/2/2.
 */

public class StockInfo {

    /**
     * resultcode : 200
     * reason : SUCCESSED!
     * result : [{"data":{"buyFive":"41383","buyFivePri":"16.720","buyFour":"2000","buyFourPri":"16.730","buyOne":"4000","buyOnePri":"16.770","buyThree":"14420","buyThreePri":"16.750","buyTwo":"4800","buyTwoPri":"16.760","competitivePri":"16.770","date":"2017-01-26","gid":"sh600000","increPer":"0.30","increase":"0.050","name":"浦发银行","nowPri":"16.740","reservePri":"16.780","sellFive":"160425","sellFivePri":"16.820","sellFour":"64740","sellFourPri":"16.810","sellOne":"69500","sellOnePri":"16.780","sellThree":"703120","sellThreePri":"16.800","sellTwo":"114190","sellTwoPri":"16.790","time":"15:00:00","todayMax":"16.840","todayMin":"16.610","todayStartPri":"16.690","traAmount":"144343272.000","traNumber":"86029","yestodEndPri":"16.690"},"dapandata":{"dot":"16.740","name":"浦发银行","nowPic":"0.050","rate":"0.30","traAmount":"14434","traNumber":"86029"},"gopicture":{"minurl":"http://image.sinajs.cn/newchart/min/n/sh600000.gif","dayurl":"http://image.sinajs.cn/newchart/daily/n/sh600000.gif","weekurl":"http://image.sinajs.cn/newchart/weekly/n/sh600000.gif","monthurl":"http://image.sinajs.cn/newchart/monthly/n/sh600000.gif"}}]
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private int error_code;
    /**
     * data : {"buyFive":"41383","buyFivePri":"16.720","buyFour":"2000","buyFourPri":"16.730","buyOne":"4000","buyOnePri":"16.770","buyThree":"14420","buyThreePri":"16.750","buyTwo":"4800","buyTwoPri":"16.760","competitivePri":"16.770","date":"2017-01-26","gid":"sh600000","increPer":"0.30","increase":"0.050","name":"浦发银行","nowPri":"16.740","reservePri":"16.780","sellFive":"160425","sellFivePri":"16.820","sellFour":"64740","sellFourPri":"16.810","sellOne":"69500","sellOnePri":"16.780","sellThree":"703120","sellThreePri":"16.800","sellTwo":"114190","sellTwoPri":"16.790","time":"15:00:00","todayMax":"16.840","todayMin":"16.610","todayStartPri":"16.690","traAmount":"144343272.000","traNumber":"86029","yestodEndPri":"16.690"}
     * dapandata : {"dot":"16.740","name":"浦发银行","nowPic":"0.050","rate":"0.30","traAmount":"14434","traNumber":"86029"}
     * gopicture : {"minurl":"http://image.sinajs.cn/newchart/min/n/sh600000.gif","dayurl":"http://image.sinajs.cn/newchart/daily/n/sh600000.gif","weekurl":"http://image.sinajs.cn/newchart/weekly/n/sh600000.gif","monthurl":"http://image.sinajs.cn/newchart/monthly/n/sh600000.gif"}
     */

    private List<ResultBean> result;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * buyFive : 41383
         * buyFivePri : 16.720
         * buyFour : 2000
         * buyFourPri : 16.730
         * buyOne : 4000
         * buyOnePri : 16.770
         * buyThree : 14420
         * buyThreePri : 16.750
         * buyTwo : 4800
         * buyTwoPri : 16.760
         * competitivePri : 16.770
         * date : 2017-01-26
         * gid : sh600000
         * increPer : 0.30
         * increase : 0.050
         * name : 浦发银行
         * nowPri : 16.740
         * reservePri : 16.780
         * sellFive : 160425
         * sellFivePri : 16.820
         * sellFour : 64740
         * sellFourPri : 16.810
         * sellOne : 69500
         * sellOnePri : 16.780
         * sellThree : 703120
         * sellThreePri : 16.800
         * sellTwo : 114190
         * sellTwoPri : 16.790
         * time : 15:00:00
         * todayMax : 16.840
         * todayMin : 16.610
         * todayStartPri : 16.690
         * traAmount : 144343272.000
         * traNumber : 86029
         * yestodEndPri : 16.690
         */

        private DataBean data;
        /**
         * dot : 16.740
         * name : 浦发银行
         * nowPic : 0.050
         * rate : 0.30
         * traAmount : 14434
         * traNumber : 86029
         */

        private DapandataBean dapandata;
        /**
         * minurl : http://image.sinajs.cn/newchart/min/n/sh600000.gif
         * dayurl : http://image.sinajs.cn/newchart/daily/n/sh600000.gif
         * weekurl : http://image.sinajs.cn/newchart/weekly/n/sh600000.gif
         * monthurl : http://image.sinajs.cn/newchart/monthly/n/sh600000.gif
         */

        private GopictureBean gopicture;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public DapandataBean getDapandata() {
            return dapandata;
        }

        public void setDapandata(DapandataBean dapandata) {
            this.dapandata = dapandata;
        }

        public GopictureBean getGopicture() {
            return gopicture;
        }

        public void setGopicture(GopictureBean gopicture) {
            this.gopicture = gopicture;
        }

        public static class DataBean {
            private String buyFive;
            private String buyFivePri;
            private String buyFour;
            private String buyFourPri;
            private String buyOne;
            private String buyOnePri;
            private String buyThree;
            private String buyThreePri;
            private String buyTwo;
            private String buyTwoPri;
            private String competitivePri;
            private String date;
            private String gid;
            private String increPer;
            private String increase;
            private String name;
            private String nowPri;
            private String reservePri;
            private String sellFive;
            private String sellFivePri;
            private String sellFour;
            private String sellFourPri;
            private String sellOne;
            private String sellOnePri;
            private String sellThree;
            private String sellThreePri;
            private String sellTwo;
            private String sellTwoPri;
            private String time;
            private String todayMax;
            private String todayMin;
            private String todayStartPri;
            private String traAmount;
            private String traNumber;
            private String yestodEndPri;

            public String getBuyFive() {
                return buyFive;
            }

            public void setBuyFive(String buyFive) {
                this.buyFive = buyFive;
            }

            public String getBuyFivePri() {
                return buyFivePri;
            }

            public void setBuyFivePri(String buyFivePri) {
                this.buyFivePri = buyFivePri;
            }

            public String getBuyFour() {
                return buyFour;
            }

            public void setBuyFour(String buyFour) {
                this.buyFour = buyFour;
            }

            public String getBuyFourPri() {
                return buyFourPri;
            }

            public void setBuyFourPri(String buyFourPri) {
                this.buyFourPri = buyFourPri;
            }

            public String getBuyOne() {
                return buyOne;
            }

            public void setBuyOne(String buyOne) {
                this.buyOne = buyOne;
            }

            public String getBuyOnePri() {
                return buyOnePri;
            }

            public void setBuyOnePri(String buyOnePri) {
                this.buyOnePri = buyOnePri;
            }

            public String getBuyThree() {
                return buyThree;
            }

            public void setBuyThree(String buyThree) {
                this.buyThree = buyThree;
            }

            public String getBuyThreePri() {
                return buyThreePri;
            }

            public void setBuyThreePri(String buyThreePri) {
                this.buyThreePri = buyThreePri;
            }

            public String getBuyTwo() {
                return buyTwo;
            }

            public void setBuyTwo(String buyTwo) {
                this.buyTwo = buyTwo;
            }

            public String getBuyTwoPri() {
                return buyTwoPri;
            }

            public void setBuyTwoPri(String buyTwoPri) {
                this.buyTwoPri = buyTwoPri;
            }

            public String getCompetitivePri() {
                return competitivePri;
            }

            public void setCompetitivePri(String competitivePri) {
                this.competitivePri = competitivePri;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getGid() {
                return gid;
            }

            public void setGid(String gid) {
                this.gid = gid;
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

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNowPri() {
                return nowPri;
            }

            public void setNowPri(String nowPri) {
                this.nowPri = nowPri;
            }

            public String getReservePri() {
                return reservePri;
            }

            public void setReservePri(String reservePri) {
                this.reservePri = reservePri;
            }

            public String getSellFive() {
                return sellFive;
            }

            public void setSellFive(String sellFive) {
                this.sellFive = sellFive;
            }

            public String getSellFivePri() {
                return sellFivePri;
            }

            public void setSellFivePri(String sellFivePri) {
                this.sellFivePri = sellFivePri;
            }

            public String getSellFour() {
                return sellFour;
            }

            public void setSellFour(String sellFour) {
                this.sellFour = sellFour;
            }

            public String getSellFourPri() {
                return sellFourPri;
            }

            public void setSellFourPri(String sellFourPri) {
                this.sellFourPri = sellFourPri;
            }

            public String getSellOne() {
                return sellOne;
            }

            public void setSellOne(String sellOne) {
                this.sellOne = sellOne;
            }

            public String getSellOnePri() {
                return sellOnePri;
            }

            public void setSellOnePri(String sellOnePri) {
                this.sellOnePri = sellOnePri;
            }

            public String getSellThree() {
                return sellThree;
            }

            public void setSellThree(String sellThree) {
                this.sellThree = sellThree;
            }

            public String getSellThreePri() {
                return sellThreePri;
            }

            public void setSellThreePri(String sellThreePri) {
                this.sellThreePri = sellThreePri;
            }

            public String getSellTwo() {
                return sellTwo;
            }

            public void setSellTwo(String sellTwo) {
                this.sellTwo = sellTwo;
            }

            public String getSellTwoPri() {
                return sellTwoPri;
            }

            public void setSellTwoPri(String sellTwoPri) {
                this.sellTwoPri = sellTwoPri;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTodayMax() {
                return todayMax;
            }

            public void setTodayMax(String todayMax) {
                this.todayMax = todayMax;
            }

            public String getTodayMin() {
                return todayMin;
            }

            public void setTodayMin(String todayMin) {
                this.todayMin = todayMin;
            }

            public String getTodayStartPri() {
                return todayStartPri;
            }

            public void setTodayStartPri(String todayStartPri) {
                this.todayStartPri = todayStartPri;
            }

            public String getTraAmount() {
                return traAmount;
            }

            public void setTraAmount(String traAmount) {
                this.traAmount = traAmount;
            }

            public String getTraNumber() {
                return traNumber;
            }

            public void setTraNumber(String traNumber) {
                this.traNumber = traNumber;
            }

            public String getYestodEndPri() {
                return yestodEndPri;
            }

            public void setYestodEndPri(String yestodEndPri) {
                this.yestodEndPri = yestodEndPri;
            }
        }

        public static class DapandataBean {
            private String dot;
            private String name;
            private String nowPic;
            private String rate;
            private String traAmount;
            private String traNumber;

            public String getDot() {
                return dot;
            }

            public void setDot(String dot) {
                this.dot = dot;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNowPic() {
                return nowPic;
            }

            public void setNowPic(String nowPic) {
                this.nowPic = nowPic;
            }

            public String getRate() {
                return rate;
            }

            public void setRate(String rate) {
                this.rate = rate;
            }

            public String getTraAmount() {
                return traAmount;
            }

            public void setTraAmount(String traAmount) {
                this.traAmount = traAmount;
            }

            public String getTraNumber() {
                return traNumber;
            }

            public void setTraNumber(String traNumber) {
                this.traNumber = traNumber;
            }
        }

        public static class GopictureBean {
            private String minurl;
            private String dayurl;
            private String weekurl;
            private String monthurl;

            public String getMinurl() {
                return minurl;
            }

            public void setMinurl(String minurl) {
                this.minurl = minurl;
            }

            public String getDayurl() {
                return dayurl;
            }

            public void setDayurl(String dayurl) {
                this.dayurl = dayurl;
            }

            public String getWeekurl() {
                return weekurl;
            }

            public void setWeekurl(String weekurl) {
                this.weekurl = weekurl;
            }

            public String getMonthurl() {
                return monthurl;
            }

            public void setMonthurl(String monthurl) {
                this.monthurl = monthurl;
            }
        }
    }
}
