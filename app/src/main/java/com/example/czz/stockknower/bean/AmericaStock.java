package com.example.czz.stockknower.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by czz on 2017/1/16.
 */

public class AmericaStock {

    /**
     * error_code : 0
     * reason : SUCCESSED!
     * result : {"totalCount":"7850","page":"1","num":"20","data":[{"cname":"苹果公司","category":"计算机","symbol":"AAPL","price":"119.04","diff":"-0.21","chg":"-0.18","preclose":"119.25","open":"119.11","high":"119.62","low":"118.81","amplitude":"0.68%","volume":"26111948","mktcap":"634483204880","market":"NASDAQ"},{"cname":"CHS Inc - Class B Cumulative Redeemable Preferred Stock, Series ","category":null,"symbol":"CHSCL","price":"27.79","diff":"0.01","chg":"0.04","preclose":"27.78","open":"27.81","high":"28.11","low":"27.62","amplitude":"1.76%","volume":"18797","mktcap":"575253018951","market":"NASDAQ"},{"cname":"谷歌A","category":"媒体内容","symbol":"GOOGL","price":"830.94","diff":"1.41","chg":"0.17","preclose":"829.53","open":"831.00","high":"834.65","low":"829.52","amplitude":"0.62%","volume":"1290182","mktcap":"570490168076","market":"NASDAQ"},{"cname":"谷歌","category":"互联网","symbol":"GOOG","price":"807.88","diff":"1.52","chg":"0.19","preclose":"806.36","open":"807.48","high":"811.22","low":"806.69","amplitude":"0.56%","volume":"1099215","mktcap":"554658096152","market":"NASDAQ"},{"cname":"CHS Inc - Class B Reset Rate Cumulative Redeemable Preferred Sto","category":null,"symbol":"CHSCM","price":"27.21","diff":"0.04","chg":"0.13","preclose":"27.18","open":"27.03","high":"27.22","low":"27.03","amplitude":"0.70%","volume":"9577","mktcap":"536036981964","market":"NASDAQ"},{"cname":"CHS Inc - Class B Cumulative Redeemable Preferred Stock","category":null,"symbol":"CHSCO","price":"29.30","diff":"0.05","chg":"0.17","preclose":"29.25","open":"29.02","high":"29.49","low":"29.02","amplitude":"1.61%","volume":"3149","mktcap":"529450986214","market":"NASDAQ"},{"cname":"微软公司","category":"软件","symbol":"MSFT","price":"62.70","diff":"0.09","chg":"0.14","preclose":"62.61","open":"62.62","high":"62.87","low":"62.35","amplitude":"0.82%","volume":"19422310","mktcap":"487806005936","market":"NASDAQ"},{"cname":"CHS INC PFD B SRS 2","category":null,"symbol":"CHSCN","price":"27.96","diff":"0.24","chg":"0.87","preclose":"27.72","open":"27.78","high":"28.39","low":"27.70","amplitude":"2.49%","volume":"23980","mktcap":"469727984619","market":"NASDAQ"},{"cname":"Calamos Dynamic Convertible & Income Fund","category":null,"symbol":"CCD","price":"18.14","diff":"0.05","chg":"0.28","preclose":"18.09","open":"18.10","high":"18.18","low":"18.07","amplitude":"0.64%","volume":"50284","mktcap":"442253185120","market":"NASDAQ"},{"cname":"伯克希尔-哈撒韦B","category":"保险","symbol":"BRK.B","price":"161.90","diff":"0.49","chg":"0.30","preclose":"161.41","open":"161.81","high":"163.13","low":"161.51","amplitude":"1.00%","volume":"3081644","mktcap":"401511984863","market":"NYSE"},{"cname":"伯克希尔-哈撒韦","category":"保险","symbol":"BRK.A","price":"242500.00","diff":"-350.00","chg":"-0.14","preclose":"242850.00","open":"242165.00","high":"244690.00","low":"242165.00","amplitude":"1.04%","volume":"367","mktcap":"397700000000","market":"NYSE"},{"cname":"亚马逊公司","category":"互联网","symbol":"AMZN","price":"817.14","diff":"3.50","chg":"0.43","preclose":"813.64","open":"814.32","high":"821.65","low":"811.40","amplitude":"1.26%","volume":"3791945","mktcap":"385549538832","market":"NASDAQ"},{"cname":"Facebook","category":"媒体内容","symbol":"FB","price":"128.34","diff":"1.72","chg":"1.36","preclose":"126.62","open":"127.49","high":"129.27","low":"127.37","amplitude":"1.50%","volume":"24884325","mktcap":"367090891525","market":"NASDAQ"},{"cname":"埃克森美孚公司","category":"","symbol":"XOM","price":"86.35","diff":"0.01","chg":"0.01","preclose":"86.34","open":"86.27","high":"86.68","low":"86.17","amplitude":"0.59%","volume":"8415603","mktcap":"358352493668","market":"NYSE"},{"cname":"强生公司","category":"制药","symbol":"JNJ","price":"114.60","diff":"-0.02","chg":"-0.02","preclose":"114.62","open":"114.94","high":"115.02","low":"114.44","amplitude":"0.51%","volume":"4935188","mktcap":"311711995850","market":"NYSE"},{"cname":"摩根大通公司","category":"","symbol":"JPM","price":"86.70","diff":"0.46","chg":"0.53","preclose":"86.24","open":"87.11","high":"88.17","low":"86.10","amplitude":"2.40%","volume":"28295985","mktcap":"310385989075","market":"NYSE"},{"cname":"Nuveen High Income December 2018 Target Term Fund","category":null,"symbol":"JHA","price":"10.22","diff":"0.06","chg":"0.59","preclose":"10.16","open":"10.20","high":"10.24","low":"10.18","amplitude":"0.59%","volume":"43798","mktcap":"299650407829","market":"NYSE"},{"cname":"富国银行","category":"银行","symbol":"WFC","price":"55.31","diff":"0.81","chg":"1.49","preclose":"54.50","open":"55.11","high":"56.20","low":"54.65","amplitude":"2.84%","volume":"37231593","mktcap":"277656206894","market":"NYSE"},{"cname":"通用电气公司","category":"多元化制造商","symbol":"GE","price":"31.36","diff":"-0.03","chg":"-0.10","preclose":"31.39","open":"31.36","high":"31.45","low":"31.25","amplitude":"0.64%","volume":"24323767","mktcap":"277536005402","market":"NYSE"},{"cname":"帝亚吉欧公司","category":"饮料","symbol":"DEO","price":"107.73","diff":"0.36","chg":"0.34","preclose":"107.37","open":"107.05","high":"108.10","low":"106.90","amplitude":"1.12%","volume":"574041","mktcap":"270402308426","market":"NYSE"}]}
     */

    private int error_code;
    private String reason;
    /**
     * totalCount : 7850
     * page : 1
     * num : 20
     * data : [{"cname":"苹果公司","category":"计算机","symbol":"AAPL","price":"119.04","diff":"-0.21","chg":"-0.18","preclose":"119.25","open":"119.11","high":"119.62","low":"118.81","amplitude":"0.68%","volume":"26111948","mktcap":"634483204880","market":"NASDAQ"},{"cname":"CHS Inc - Class B Cumulative Redeemable Preferred Stock, Series ","category":null,"symbol":"CHSCL","price":"27.79","diff":"0.01","chg":"0.04","preclose":"27.78","open":"27.81","high":"28.11","low":"27.62","amplitude":"1.76%","volume":"18797","mktcap":"575253018951","market":"NASDAQ"},{"cname":"谷歌A","category":"媒体内容","symbol":"GOOGL","price":"830.94","diff":"1.41","chg":"0.17","preclose":"829.53","open":"831.00","high":"834.65","low":"829.52","amplitude":"0.62%","volume":"1290182","mktcap":"570490168076","market":"NASDAQ"},{"cname":"谷歌","category":"互联网","symbol":"GOOG","price":"807.88","diff":"1.52","chg":"0.19","preclose":"806.36","open":"807.48","high":"811.22","low":"806.69","amplitude":"0.56%","volume":"1099215","mktcap":"554658096152","market":"NASDAQ"},{"cname":"CHS Inc - Class B Reset Rate Cumulative Redeemable Preferred Sto","category":null,"symbol":"CHSCM","price":"27.21","diff":"0.04","chg":"0.13","preclose":"27.18","open":"27.03","high":"27.22","low":"27.03","amplitude":"0.70%","volume":"9577","mktcap":"536036981964","market":"NASDAQ"},{"cname":"CHS Inc - Class B Cumulative Redeemable Preferred Stock","category":null,"symbol":"CHSCO","price":"29.30","diff":"0.05","chg":"0.17","preclose":"29.25","open":"29.02","high":"29.49","low":"29.02","amplitude":"1.61%","volume":"3149","mktcap":"529450986214","market":"NASDAQ"},{"cname":"微软公司","category":"软件","symbol":"MSFT","price":"62.70","diff":"0.09","chg":"0.14","preclose":"62.61","open":"62.62","high":"62.87","low":"62.35","amplitude":"0.82%","volume":"19422310","mktcap":"487806005936","market":"NASDAQ"},{"cname":"CHS INC PFD B SRS 2","category":null,"symbol":"CHSCN","price":"27.96","diff":"0.24","chg":"0.87","preclose":"27.72","open":"27.78","high":"28.39","low":"27.70","amplitude":"2.49%","volume":"23980","mktcap":"469727984619","market":"NASDAQ"},{"cname":"Calamos Dynamic Convertible & Income Fund","category":null,"symbol":"CCD","price":"18.14","diff":"0.05","chg":"0.28","preclose":"18.09","open":"18.10","high":"18.18","low":"18.07","amplitude":"0.64%","volume":"50284","mktcap":"442253185120","market":"NASDAQ"},{"cname":"伯克希尔-哈撒韦B","category":"保险","symbol":"BRK.B","price":"161.90","diff":"0.49","chg":"0.30","preclose":"161.41","open":"161.81","high":"163.13","low":"161.51","amplitude":"1.00%","volume":"3081644","mktcap":"401511984863","market":"NYSE"},{"cname":"伯克希尔-哈撒韦","category":"保险","symbol":"BRK.A","price":"242500.00","diff":"-350.00","chg":"-0.14","preclose":"242850.00","open":"242165.00","high":"244690.00","low":"242165.00","amplitude":"1.04%","volume":"367","mktcap":"397700000000","market":"NYSE"},{"cname":"亚马逊公司","category":"互联网","symbol":"AMZN","price":"817.14","diff":"3.50","chg":"0.43","preclose":"813.64","open":"814.32","high":"821.65","low":"811.40","amplitude":"1.26%","volume":"3791945","mktcap":"385549538832","market":"NASDAQ"},{"cname":"Facebook","category":"媒体内容","symbol":"FB","price":"128.34","diff":"1.72","chg":"1.36","preclose":"126.62","open":"127.49","high":"129.27","low":"127.37","amplitude":"1.50%","volume":"24884325","mktcap":"367090891525","market":"NASDAQ"},{"cname":"埃克森美孚公司","category":"","symbol":"XOM","price":"86.35","diff":"0.01","chg":"0.01","preclose":"86.34","open":"86.27","high":"86.68","low":"86.17","amplitude":"0.59%","volume":"8415603","mktcap":"358352493668","market":"NYSE"},{"cname":"强生公司","category":"制药","symbol":"JNJ","price":"114.60","diff":"-0.02","chg":"-0.02","preclose":"114.62","open":"114.94","high":"115.02","low":"114.44","amplitude":"0.51%","volume":"4935188","mktcap":"311711995850","market":"NYSE"},{"cname":"摩根大通公司","category":"","symbol":"JPM","price":"86.70","diff":"0.46","chg":"0.53","preclose":"86.24","open":"87.11","high":"88.17","low":"86.10","amplitude":"2.40%","volume":"28295985","mktcap":"310385989075","market":"NYSE"},{"cname":"Nuveen High Income December 2018 Target Term Fund","category":null,"symbol":"JHA","price":"10.22","diff":"0.06","chg":"0.59","preclose":"10.16","open":"10.20","high":"10.24","low":"10.18","amplitude":"0.59%","volume":"43798","mktcap":"299650407829","market":"NYSE"},{"cname":"富国银行","category":"银行","symbol":"WFC","price":"55.31","diff":"0.81","chg":"1.49","preclose":"54.50","open":"55.11","high":"56.20","low":"54.65","amplitude":"2.84%","volume":"37231593","mktcap":"277656206894","market":"NYSE"},{"cname":"通用电气公司","category":"多元化制造商","symbol":"GE","price":"31.36","diff":"-0.03","chg":"-0.10","preclose":"31.39","open":"31.36","high":"31.45","low":"31.25","amplitude":"0.64%","volume":"24323767","mktcap":"277536005402","market":"NYSE"},{"cname":"帝亚吉欧公司","category":"饮料","symbol":"DEO","price":"107.73","diff":"0.36","chg":"0.34","preclose":"107.37","open":"107.05","high":"108.10","low":"106.90","amplitude":"1.12%","volume":"574041","mktcap":"270402308426","market":"NYSE"}]
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
         * cname : 苹果公司
         * category : 计算机
         * symbol : AAPL
         * price : 119.04
         * diff : -0.21
         * chg : -0.18
         * preclose : 119.25
         * open : 119.11
         * high : 119.62
         * low : 118.81
         * amplitude : 0.68%
         * volume : 26111948
         * mktcap : 634483204880
         * market : NASDAQ
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
            private String cname;
            private String category;
            private String symbol;
            private String price;
            private String diff;
            private String chg;
            private String preclose;
            private String open;
            private String high;
            private String low;
            private String amplitude;
            private String volume;
            private String mktcap;
            private String market;

            public String getCname() {
                return cname;
            }

            public void setCname(String cname) {
                this.cname = cname;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getSymbol() {
                return symbol;
            }

            public void setSymbol(String symbol) {
                this.symbol = symbol;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getDiff() {
                return diff;
            }

            public void setDiff(String diff) {
                this.diff = diff;
            }

            public String getChg() {
                return chg;
            }

            public void setChg(String chg) {
                this.chg = chg;
            }

            public String getPreclose() {
                return preclose;
            }

            public void setPreclose(String preclose) {
                this.preclose = preclose;
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

            public String getAmplitude() {
                return amplitude;
            }

            public void setAmplitude(String amplitude) {
                this.amplitude = amplitude;
            }

            public String getVolume() {
                return volume;
            }

            public void setVolume(String volume) {
                this.volume = volume;
            }

            public String getMktcap() {
                return mktcap;
            }

            public void setMktcap(String mktcap) {
                this.mktcap = mktcap;
            }

            public String getMarket() {
                return market;
            }

            public void setMarket(String market) {
                this.market = market;
            }
        }
    }
}
