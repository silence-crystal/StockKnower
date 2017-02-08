package com.example.czz.stockknower.bean;

import java.util.List;

/**
 * Created by czz on 2017/2/6.
 */

public class UsaStockInfo {

    /**
     * resultcode : 200
     * reason : SUCCESSED!
     * result : [{"data":{"gid":"aapl","name":"苹果","lastestpri":"129.08","openpri":"128.31","formpri":"128.53","maxpri":"129.19","minpri":"128.16","uppic":"0.55","limit":"0.43","traAmount":"24507301","avgTraNumber":"36402607","markValue":"678960800000","max52":"130.49","min52":"89.47","EPS":"8.31","priearn":"15.53","beta":"1.44","divident":"2.23","ROR":"1.70","capital":"5260000000","afterpic":"129.19","afterlimit":"0.09","afteruppic":"0.11","aftertime":"Feb 03 08:00PM EST","ustime":"Feb 03 04:00PM EST","chtime":"2017-02-04 09:19:16"},"gopicture":{"minurl":"http://image.sinajs.cn/newchartv5/usstock/min/aapl.gif","min_weekpic":"http://image.sinajs.cn/newchartv5/usstock/min_week/aapl.gif","dayurl":"http://image.sinajs.cn/newchartv5/usstock/daily/aapl.gif","weekurl":"http://image.sinajs.cn/newchartv5/usstock/weekly/aapl.gif","monthurl":"http://image.sinajs.cn/newchartv5/usstock/monthly/aapl.gif"}}]
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private int error_code;
    /**
     * data : {"gid":"aapl","name":"苹果","lastestpri":"129.08","openpri":"128.31","formpri":"128.53","maxpri":"129.19","minpri":"128.16","uppic":"0.55","limit":"0.43","traAmount":"24507301","avgTraNumber":"36402607","markValue":"678960800000","max52":"130.49","min52":"89.47","EPS":"8.31","priearn":"15.53","beta":"1.44","divident":"2.23","ROR":"1.70","capital":"5260000000","afterpic":"129.19","afterlimit":"0.09","afteruppic":"0.11","aftertime":"Feb 03 08:00PM EST","ustime":"Feb 03 04:00PM EST","chtime":"2017-02-04 09:19:16"}
     * gopicture : {"minurl":"http://image.sinajs.cn/newchartv5/usstock/min/aapl.gif","min_weekpic":"http://image.sinajs.cn/newchartv5/usstock/min_week/aapl.gif","dayurl":"http://image.sinajs.cn/newchartv5/usstock/daily/aapl.gif","weekurl":"http://image.sinajs.cn/newchartv5/usstock/weekly/aapl.gif","monthurl":"http://image.sinajs.cn/newchartv5/usstock/monthly/aapl.gif"}
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
         * gid : aapl
         * name : 苹果
         * lastestpri : 129.08
         * openpri : 128.31
         * formpri : 128.53
         * maxpri : 129.19
         * minpri : 128.16
         * uppic : 0.55
         * limit : 0.43
         * traAmount : 24507301
         * avgTraNumber : 36402607
         * markValue : 678960800000
         * max52 : 130.49
         * min52 : 89.47
         * EPS : 8.31
         * priearn : 15.53
         * beta : 1.44
         * divident : 2.23
         * ROR : 1.70
         * capital : 5260000000
         * afterpic : 129.19
         * afterlimit : 0.09
         * afteruppic : 0.11
         * aftertime : Feb 03 08:00PM EST
         * ustime : Feb 03 04:00PM EST
         * chtime : 2017-02-04 09:19:16
         */

        private DataBean data;
        /**
         * minurl : http://image.sinajs.cn/newchartv5/usstock/min/aapl.gif
         * min_weekpic : http://image.sinajs.cn/newchartv5/usstock/min_week/aapl.gif
         * dayurl : http://image.sinajs.cn/newchartv5/usstock/daily/aapl.gif
         * weekurl : http://image.sinajs.cn/newchartv5/usstock/weekly/aapl.gif
         * monthurl : http://image.sinajs.cn/newchartv5/usstock/monthly/aapl.gif
         */

        private GopictureBean gopicture;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public GopictureBean getGopicture() {
            return gopicture;
        }

        public void setGopicture(GopictureBean gopicture) {
            this.gopicture = gopicture;
        }

        public static class DataBean {
            private String gid;
            private String name;
            private String lastestpri;
            private String openpri;
            private String formpri;
            private String maxpri;
            private String minpri;
            private String uppic;
            private String limit;
            private String traAmount;
            private String avgTraNumber;
            private String markValue;
            private String max52;
            private String min52;
            private String EPS;
            private String priearn;
            private String beta;
            private String divident;
            private String ROR;
            private String capital;
            private String afterpic;
            private String afterlimit;
            private String afteruppic;
            private String aftertime;
            private String ustime;
            private String chtime;

            public String getGid() {
                return gid;
            }

            public void setGid(String gid) {
                this.gid = gid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLastestpri() {
                return lastestpri;
            }

            public void setLastestpri(String lastestpri) {
                this.lastestpri = lastestpri;
            }

            public String getOpenpri() {
                return openpri;
            }

            public void setOpenpri(String openpri) {
                this.openpri = openpri;
            }

            public String getFormpri() {
                return formpri;
            }

            public void setFormpri(String formpri) {
                this.formpri = formpri;
            }

            public String getMaxpri() {
                return maxpri;
            }

            public void setMaxpri(String maxpri) {
                this.maxpri = maxpri;
            }

            public String getMinpri() {
                return minpri;
            }

            public void setMinpri(String minpri) {
                this.minpri = minpri;
            }

            public String getUppic() {
                return uppic;
            }

            public void setUppic(String uppic) {
                this.uppic = uppic;
            }

            public String getLimit() {
                return limit;
            }

            public void setLimit(String limit) {
                this.limit = limit;
            }

            public String getTraAmount() {
                return traAmount;
            }

            public void setTraAmount(String traAmount) {
                this.traAmount = traAmount;
            }

            public String getAvgTraNumber() {
                return avgTraNumber;
            }

            public void setAvgTraNumber(String avgTraNumber) {
                this.avgTraNumber = avgTraNumber;
            }

            public String getMarkValue() {
                return markValue;
            }

            public void setMarkValue(String markValue) {
                this.markValue = markValue;
            }

            public String getMax52() {
                return max52;
            }

            public void setMax52(String max52) {
                this.max52 = max52;
            }

            public String getMin52() {
                return min52;
            }

            public void setMin52(String min52) {
                this.min52 = min52;
            }

            public String getEPS() {
                return EPS;
            }

            public void setEPS(String EPS) {
                this.EPS = EPS;
            }

            public String getPriearn() {
                return priearn;
            }

            public void setPriearn(String priearn) {
                this.priearn = priearn;
            }

            public String getBeta() {
                return beta;
            }

            public void setBeta(String beta) {
                this.beta = beta;
            }

            public String getDivident() {
                return divident;
            }

            public void setDivident(String divident) {
                this.divident = divident;
            }

            public String getROR() {
                return ROR;
            }

            public void setROR(String ROR) {
                this.ROR = ROR;
            }

            public String getCapital() {
                return capital;
            }

            public void setCapital(String capital) {
                this.capital = capital;
            }

            public String getAfterpic() {
                return afterpic;
            }

            public void setAfterpic(String afterpic) {
                this.afterpic = afterpic;
            }

            public String getAfterlimit() {
                return afterlimit;
            }

            public void setAfterlimit(String afterlimit) {
                this.afterlimit = afterlimit;
            }

            public String getAfteruppic() {
                return afteruppic;
            }

            public void setAfteruppic(String afteruppic) {
                this.afteruppic = afteruppic;
            }

            public String getAftertime() {
                return aftertime;
            }

            public void setAftertime(String aftertime) {
                this.aftertime = aftertime;
            }

            public String getUstime() {
                return ustime;
            }

            public void setUstime(String ustime) {
                this.ustime = ustime;
            }

            public String getChtime() {
                return chtime;
            }

            public void setChtime(String chtime) {
                this.chtime = chtime;
            }
        }

        public static class GopictureBean {
            private String minurl;
            private String min_weekpic;
            private String dayurl;
            private String weekurl;
            private String monthurl;

            public String getMinurl() {
                return minurl;
            }

            public void setMinurl(String minurl) {
                this.minurl = minurl;
            }

            public String getMin_weekpic() {
                return min_weekpic;
            }

            public void setMin_weekpic(String min_weekpic) {
                this.min_weekpic = min_weekpic;
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
