package com.example.czz.stockknower.bean;

import java.util.List;

/**
 * Created by czz on 2017/2/6.
 */

public class HkStockInfo {

    /**
     * resultcode : 200
     * reason : SUCCESSED!
     * result : [{"data":{"gid":"hk00001","ename":"CKH HOLDINGS","name":"长和","openpri":"91.900","formpri":"91.750","maxpri":"92.050","minpri":"91.350","lastestpri":"91.850","uppic":"0.100","limit":"0.109","inpic":"91.850","outpic":"91.900","traAmount":"154636402.828","traNumber":"1684108","priearn":"11.201","max52":"103.900","min52":"80.600","date":"2017/02/06","time":"14:02:54"},"gopicture":{"minurl":"http://image.sinajs.cn/newchart/hk_stock/min/00001.gif","dayurl":"http://image.sinajs.cn/newchart/hk_stock/daily/00001.gif","weekurl":"http://image.sinajs.cn/newchart/hk_stock/weekly/00001.gif","monthurl":"http://image.sinajs.cn/newchart/hk_stock/monthly/00001.gif"},"hengsheng_data":{"date":"2017/02/06","formpri":"23129.209","lastestpri":"23271.801","limit":"0.620","max52":"24364.000","maxpri":"23321.680","min52":"18278.801","minpri":"23149.699","openpri":"23239.289","time":"14:03:04","traAmount":"46576766.931000","uppic":"142.590"}}]
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private int error_code;
    /**
     * data : {"gid":"hk00001","ename":"CKH HOLDINGS","name":"长和","openpri":"91.900","formpri":"91.750","maxpri":"92.050","minpri":"91.350","lastestpri":"91.850","uppic":"0.100","limit":"0.109","inpic":"91.850","outpic":"91.900","traAmount":"154636402.828","traNumber":"1684108","priearn":"11.201","max52":"103.900","min52":"80.600","date":"2017/02/06","time":"14:02:54"}
     * gopicture : {"minurl":"http://image.sinajs.cn/newchart/hk_stock/min/00001.gif","dayurl":"http://image.sinajs.cn/newchart/hk_stock/daily/00001.gif","weekurl":"http://image.sinajs.cn/newchart/hk_stock/weekly/00001.gif","monthurl":"http://image.sinajs.cn/newchart/hk_stock/monthly/00001.gif"}
     * hengsheng_data : {"date":"2017/02/06","formpri":"23129.209","lastestpri":"23271.801","limit":"0.620","max52":"24364.000","maxpri":"23321.680","min52":"18278.801","minpri":"23149.699","openpri":"23239.289","time":"14:03:04","traAmount":"46576766.931000","uppic":"142.590"}
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
         * gid : hk00001
         * ename : CKH HOLDINGS
         * name : 长和
         * openpri : 91.900
         * formpri : 91.750
         * maxpri : 92.050
         * minpri : 91.350
         * lastestpri : 91.850
         * uppic : 0.100
         * limit : 0.109
         * inpic : 91.850
         * outpic : 91.900
         * traAmount : 154636402.828
         * traNumber : 1684108
         * priearn : 11.201
         * max52 : 103.900
         * min52 : 80.600
         * date : 2017/02/06
         * time : 14:02:54
         */

        private DataBean data;
        /**
         * minurl : http://image.sinajs.cn/newchart/hk_stock/min/00001.gif
         * dayurl : http://image.sinajs.cn/newchart/hk_stock/daily/00001.gif
         * weekurl : http://image.sinajs.cn/newchart/hk_stock/weekly/00001.gif
         * monthurl : http://image.sinajs.cn/newchart/hk_stock/monthly/00001.gif
         */

        private GopictureBean gopicture;
        /**
         * date : 2017/02/06
         * formpri : 23129.209
         * lastestpri : 23271.801
         * limit : 0.620
         * max52 : 24364.000
         * maxpri : 23321.680
         * min52 : 18278.801
         * minpri : 23149.699
         * openpri : 23239.289
         * time : 14:03:04
         * traAmount : 46576766.931000
         * uppic : 142.590
         */

        private HengshengDataBean hengsheng_data;

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

        public HengshengDataBean getHengsheng_data() {
            return hengsheng_data;
        }

        public void setHengsheng_data(HengshengDataBean hengsheng_data) {
            this.hengsheng_data = hengsheng_data;
        }

        public static class DataBean {
            private String gid;
            private String ename;
            private String name;
            private String openpri;
            private String formpri;
            private String maxpri;
            private String minpri;
            private String lastestpri;
            private String uppic;
            private String limit;
            private String inpic;
            private String outpic;
            private String traAmount;
            private String traNumber;
            private String priearn;
            private String max52;
            private String min52;
            private String date;
            private String time;

            public String getGid() {
                return gid;
            }

            public void setGid(String gid) {
                this.gid = gid;
            }

            public String getEname() {
                return ename;
            }

            public void setEname(String ename) {
                this.ename = ename;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
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

            public String getLastestpri() {
                return lastestpri;
            }

            public void setLastestpri(String lastestpri) {
                this.lastestpri = lastestpri;
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

            public String getInpic() {
                return inpic;
            }

            public void setInpic(String inpic) {
                this.inpic = inpic;
            }

            public String getOutpic() {
                return outpic;
            }

            public void setOutpic(String outpic) {
                this.outpic = outpic;
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

            public String getPriearn() {
                return priearn;
            }

            public void setPriearn(String priearn) {
                this.priearn = priearn;
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

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
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

        public static class HengshengDataBean {
            private String date;
            private String formpri;
            private String lastestpri;
            private String limit;
            private String max52;
            private String maxpri;
            private String min52;
            private String minpri;
            private String openpri;
            private String time;
            private String traAmount;
            private String uppic;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getFormpri() {
                return formpri;
            }

            public void setFormpri(String formpri) {
                this.formpri = formpri;
            }

            public String getLastestpri() {
                return lastestpri;
            }

            public void setLastestpri(String lastestpri) {
                this.lastestpri = lastestpri;
            }

            public String getLimit() {
                return limit;
            }

            public void setLimit(String limit) {
                this.limit = limit;
            }

            public String getMax52() {
                return max52;
            }

            public void setMax52(String max52) {
                this.max52 = max52;
            }

            public String getMaxpri() {
                return maxpri;
            }

            public void setMaxpri(String maxpri) {
                this.maxpri = maxpri;
            }

            public String getMin52() {
                return min52;
            }

            public void setMin52(String min52) {
                this.min52 = min52;
            }

            public String getMinpri() {
                return minpri;
            }

            public void setMinpri(String minpri) {
                this.minpri = minpri;
            }

            public String getOpenpri() {
                return openpri;
            }

            public void setOpenpri(String openpri) {
                this.openpri = openpri;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTraAmount() {
                return traAmount;
            }

            public void setTraAmount(String traAmount) {
                this.traAmount = traAmount;
            }

            public String getUppic() {
                return uppic;
            }

            public void setUppic(String uppic) {
                this.uppic = uppic;
            }
        }
    }
}
