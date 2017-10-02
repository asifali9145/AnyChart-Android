package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class MMA extends JsObject {

    private String jsBase;

    public MMA() {

    }

    protected MMA(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double period;

    public void setPeriod(Double period) {
        if (jsBase == null) {
            this.period = period;
        } else {
            this.period = period;

            js.append(String.format(Locale.US, jsBase + ".period(%f);", period));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".period(%f);", period));
                js.setLength(0);
            }
        }
    }

    private StockSeriesBase getSeries;

    public StockSeriesBase getSeries() {
        if (getSeries == null)
            getSeries = new StockSeriesBase(jsBase + ".series()");

        return getSeries;
    }

    private StockSeriesType type;
    private String type1;

    public void setSeries(StockSeriesType type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;

            js.append(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".series(%s);", (type != null) ? type.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSeries(String type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;

            js.append(String.format(Locale.US, jsBase + ".series(%s);", type1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".series(%s);", type1));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetSeries() {
        if (getSeries != null) {
            return getSeries.generateJs();
        }
        return "";
    }

    private String generateJSperiod() {
        if (period != null) {
            return String.format(Locale.US, "period: %f,", period);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", (type != null) ? type.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSperiod());
            js.append(generateJStype());
            js.append(generateJStype1());
            js.append("}");
        }
            js.append(generateJSgetSeries());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}