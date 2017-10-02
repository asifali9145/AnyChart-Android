package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// chart class
public class Sparkline extends Chart {

    public Sparkline() {
        js.append("chart = anychart.sparkline();");
    }

    
    private Animation getAnimation;

    public Animation getAnimation() {
        if (getAnimation == null)
            getAnimation = new Animation("chart.animation()");

        return getAnimation;
    }

    private Boolean animation;
    private String animation1;

    public void setAnimation(Boolean animation) {
        this.animation = animation;

        js.append(String.format(Locale.US, "chart.animation(%b);", animation));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.animation(%b);", animation));
            js.setLength(0);
        }
    }


    public void setAnimation(String animation1) {
        this.animation1 = animation1;

        js.append(String.format(Locale.US, "chart.animation(%s);", animation1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.animation(%s);", animation1));
            js.setLength(0);
        }
    }

    private Boolean enabled;
    private Double duration;

    public void setAnimation(Boolean enabled, Double duration) {
        this.enabled = enabled;
        this.duration = duration;

        js.append(String.format(Locale.US, "chart.animation(%b, %f);", enabled, duration));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.animation(%b, %f);", enabled, duration));
            js.setLength(0);
        }
    }

    private UiBackground getBackground;

    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground("chart.background()");

        return getBackground;
    }

    private String background;

    public void setBackground(String background) {
        this.background = background;

        js.append(String.format(Locale.US, "chart.background(%s);", background));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.background(%s);", background));
            js.setLength(0);
        }
    }

    private Double bottom;
    private String bottom1;

    public void setBottom(Double bottom) {
        this.bottom = bottom;

        js.append(String.format(Locale.US, "chart.bottom(%f);", bottom));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bottom(%f);", bottom));
            js.setLength(0);
        }
    }


    public void setBottom(String bottom1) {
        this.bottom1 = bottom1;

        js.append(String.format(Locale.US, "chart.bottom(%s);", bottom1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bottom(%s);", bottom1));
            js.setLength(0);
        }
    }

    private Bounds getBounds;

    public Bounds getBounds() {
        if (getBounds == null)
            getBounds = new Bounds("chart.bounds()");

        return getBounds;
    }

    private RectObj bounds;
    private AnychartMathRect bounds1;
    private Bounds bounds2;

    public void setBounds(RectObj bounds) {
        this.bounds = bounds;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBounds(AnychartMathRect bounds1) {
        this.bounds1 = bounds1;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBounds(Bounds bounds2) {
        this.bounds2 = bounds2;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double x;
    private String x1;
    private Double y;
    private String y1;
    private Double width;
    private String width1;
    private Double height;
    private String height1;

    public void setBounds(Double x, Double y, Double width, Double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %f, %f);", x, y, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %f, %f);", x, y, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, Double y, Double width, String height1) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %f, %s);", x, y, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %f, %s);", x, y, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, Double y, String width1, Double height) {
        this.x = x;
        this.y = y;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %s, %f);", x, y, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %s, %f);", x, y, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, Double y, String width1, String height1) {
        this.x = x;
        this.y = y;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %s, %s);", x, y, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %s, %s);", x, y, width1, height1));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, Double width, Double height) {
        this.x = x;
        this.y1 = y1;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %f, %f);", x, y1, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %f, %f);", x, y1, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, Double width, String height1) {
        this.x = x;
        this.y1 = y1;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %f, %s);", x, y1, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %f, %s);", x, y1, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, String width1, Double height) {
        this.x = x;
        this.y1 = y1;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %s, %f);", x, y1, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %s, %f);", x, y1, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, String width1, String height1) {
        this.x = x;
        this.y1 = y1;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %s, %s);", x, y1, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %s, %s);", x, y1, width1, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, Double width, Double height) {
        this.x1 = x1;
        this.y = y;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %f, %f);", x1, y, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %f, %f);", x1, y, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, Double width, String height1) {
        this.x1 = x1;
        this.y = y;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %f, %s);", x1, y, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %f, %s);", x1, y, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, String width1, Double height) {
        this.x1 = x1;
        this.y = y;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %s, %f);", x1, y, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %s, %f);", x1, y, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, String width1, String height1) {
        this.x1 = x1;
        this.y = y;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %s, %s);", x1, y, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %s, %s);", x1, y, width1, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, Double width, Double height) {
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %f, %f);", x1, y1, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %f, %f);", x1, y1, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, Double width, String height1) {
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %f, %s);", x1, y1, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %f, %s);", x1, y1, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, String width1, Double height) {
        this.x1 = x1;
        this.y1 = y1;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %s, %f);", x1, y1, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %s, %f);", x1, y1, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, String width1, String height1) {
        this.x1 = x1;
        this.y1 = y1;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %s, %s);", x1, y1, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %s, %s);", x1, y1, width1, height1));
            js.setLength(0);
        }
    }

    private AnychartMathRect getClip;

    public AnychartMathRect getClip() {
        if (getClip == null)
            getClip = new AnychartMathRect("chart.clip()");

        return getClip;
    }

    private AnychartMathRect clip;

    public void setClip(AnychartMathRect clip) {
        this.clip = clip;

        js.append(String.format(Locale.US, "chart.clip(%s);", (clip != null) ? clip.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.clip(%s);", (clip != null) ? clip.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean connectMissingPoints;

    public void setConnectmissingpoints(Boolean connectMissingPoints) {
        this.connectMissingPoints = connectMissingPoints;

        js.append(String.format(Locale.US, "chart.connectMissingPoints(%b);", connectMissingPoints));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connectMissingPoints(%b);", connectMissingPoints));
            js.setLength(0);
        }
    }

    private Layer getContainer;

    public Layer getContainer() {
        if (getContainer == null)
            getContainer = new Layer("chart.container()");

        return getContainer;
    }

    private Layer container;
    private Stage container1;
    private String container2;
    private Element container3;

    public void setContainer(Layer container) {
        this.container = container;

        js.append(String.format(Locale.US, "chart.container(%s);", (container != null) ? container.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", (container != null) ? container.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setContainer(Stage container1) {
        this.container1 = container1;

        js.append(String.format(Locale.US, "chart.container(%s);", (container1 != null) ? container1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", (container1 != null) ? container1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setContainer(String container2) {
        this.container2 = container2;

        js.append(String.format(Locale.US, "chart.container(%s);", container2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", container2));
            js.setLength(0);
        }
    }


    public void setContainer(Element container3) {
        this.container3 = container3;

        js.append(String.format(Locale.US, "chart.container(%s);", (container3 != null) ? container3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", (container3 != null) ? container3.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private ContextMenu getContextMenu;

    public ContextMenu getContextMenu() {
        if (getContextMenu == null)
            getContextMenu = new ContextMenu("chart.contextMenu()");

        return getContextMenu;
    }

    private String contextMenu;
    private Boolean contextMenu1;

    public void setContextmenu(String contextMenu) {
        this.contextMenu = contextMenu;

        js.append(String.format(Locale.US, "chart.contextMenu(%s);", contextMenu));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.contextMenu(%s);", contextMenu));
            js.setLength(0);
        }
    }


    public void setContextmenu(Boolean contextMenu1) {
        this.contextMenu1 = contextMenu1;

        js.append(String.format(Locale.US, "chart.contextMenu(%b);", contextMenu1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.contextMenu(%b);", contextMenu1));
            js.setLength(0);
        }
    }

    private View getData;

    public View getData() {
        if (getData == null)
            getData = new View("chart.data()");

        return getData;
    }

    private View data;
    private Set data1;
    private String[] data2;
    private String data3;
    private TextParsingMode csvSettings;
    private TextParsingSettings csvSettings1;

    public void setData(View data, TextParsingMode csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(View data, TextParsingSettings csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(Set data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(Set data1, TextParsingSettings csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String[] data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String[] data2, TextParsingSettings csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String data3, TextParsingSettings csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean async;

    public void setDraw(Boolean async) {
        this.async = async;

        js.append(String.format(Locale.US, "chart.draw(%b);", async));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.draw(%b);", async));
            js.setLength(0);
        }
    }

    private Fill fill;

    public void setFill(Fill fill) {
        this.fill = fill;

        js.append(String.format(Locale.US, "chart.fill(%s);", (fill != null) ? fill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s);", (fill != null) ? fill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color;
    private Double opacity;

    public void setFill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "chart.fill(%s, %f);", color, opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %f);", color, opacity));
            js.setLength(0);
        }
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    public void setFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
    }


    public void setFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
    }


    public void setFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
            js.setLength(0);
        }
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }


    public void setFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }

    private Fill imageSettings;
    private Fill firstFill;

    public void setFirstfill(Fill firstFill) {
        this.firstFill = firstFill;

        js.append(String.format(Locale.US, "chart.firstFill(%s);", (firstFill != null) ? firstFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstFill(%s);", (firstFill != null) ? firstFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color1;
    private Double opacity3;

    public void setFirstfill(String color1, Double opacity3) {
        this.color1 = color1;
        this.opacity3 = opacity3;

        js.append(String.format(Locale.US, "chart.firstFill(%s, %f);", color1, opacity3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstFill(%s, %f);", color1, opacity3));
            js.setLength(0);
        }
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Double opacity4;

    public void setFirstfill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode4 = mode4;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.firstFill(%s, %b, %f, %f);", arrayToString(keys4), mode4, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstFill(%s, %b, %f, %f);", arrayToString(keys4), mode4, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setFirstfill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode5 = mode5;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.firstFill(%s, %s, %f, %f);", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstFill(%s, %s, %f, %f);", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setFirstfill(GradientKey[] keys4, String mode6, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode6 = mode6;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.firstFill(%s, %s, %f, %f);", arrayToString(keys4), mode6, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstFill(%s, %s, %f, %f);", arrayToString(keys4), mode6, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setFirstfill(String[] keys5, Boolean mode4, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode4 = mode4;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.firstFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode4, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode4, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setFirstfill(String[] keys5, VectorRect mode5, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode5 = mode5;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.firstFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setFirstfill(String[] keys5, String mode6, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode6 = mode6;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.firstFill(%s, %s, %f, %f);", Arrays.toString(keys5), mode6, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstFill(%s, %s, %f, %f);", Arrays.toString(keys5), mode6, angle1, opacity4));
            js.setLength(0);
        }
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private GraphicsMathRect mode7;
    private Double opacity5;
    private Double fx1;
    private Double fy1;

    public void setFirstfill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        this.keys6 = keys6;
        this.cx1 = cx1;
        this.cy1 = cy1;
        this.mode7 = mode7;
        this.opacity5 = opacity5;
        this.fx1 = fx1;
        this.fy1 = fy1;

        js.append(String.format(Locale.US, "chart.firstFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));
            js.setLength(0);
        }
    }


    public void setFirstfill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        this.keys7 = keys7;
        this.cx1 = cx1;
        this.cy1 = cy1;
        this.mode7 = mode7;
        this.opacity5 = opacity5;
        this.fx1 = fx1;
        this.fy1 = fy1;

        js.append(String.format(Locale.US, "chart.firstFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));
            js.setLength(0);
        }
    }

    private Fill imageSettings1;
    private PatternFill getFirstHatchFill;

    public PatternFill getFirstHatchFill() {
        if (getFirstHatchFill == null)
            getFirstHatchFill = new PatternFill("chart.firstHatchFill()");

        return getFirstHatchFill;
    }

    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private String color2;
    private Double thickness;
    private Double size;

    public void setFirsthatchfill(PatternFill patternFillOrType, String color2, Double thickness, Double size) {
        this.patternFillOrType = patternFillOrType;
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;

        js.append(String.format(Locale.US, "chart.firstHatchFill(%s, %s, %f, %f);", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color2, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstHatchFill(%s, %s, %f, %f);", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color2, thickness, size));
            js.setLength(0);
        }
    }


    public void setFirsthatchfill(HatchFill patternFillOrType1, String color2, Double thickness, Double size) {
        this.patternFillOrType1 = patternFillOrType1;
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;

        js.append(String.format(Locale.US, "chart.firstHatchFill(%s, %s, %f, %f);", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color2, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstHatchFill(%s, %s, %f, %f);", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color2, thickness, size));
            js.setLength(0);
        }
    }


    public void setFirsthatchfill(HatchFillType patternFillOrType2, String color2, Double thickness, Double size) {
        this.patternFillOrType2 = patternFillOrType2;
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;

        js.append(String.format(Locale.US, "chart.firstHatchFill(%s, %s, %f, %f);", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color2, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstHatchFill(%s, %s, %f, %f);", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color2, thickness, size));
            js.setLength(0);
        }
    }


    public void setFirsthatchfill(String patternFillOrType3, String color2, Double thickness, Double size) {
        this.patternFillOrType3 = patternFillOrType3;
        this.color2 = color2;
        this.thickness = thickness;
        this.size = size;

        js.append(String.format(Locale.US, "chart.firstHatchFill(%s, %s, %f, %f);", patternFillOrType3, color2, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstHatchFill(%s, %s, %f, %f);", patternFillOrType3, color2, thickness, size));
            js.setLength(0);
        }
    }

    private LabelsfactoryLabel getFirstLabels;

    public LabelsfactoryLabel getFirstLabels() {
        if (getFirstLabels == null)
            getFirstLabels = new LabelsfactoryLabel("chart.firstLabels()");

        return getFirstLabels;
    }

    private String firstLabels;
    private Boolean firstLabels1;

    public void setFirstlabels(String firstLabels) {
        this.firstLabels = firstLabels;

        js.append(String.format(Locale.US, "chart.firstLabels(%s);", firstLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstLabels(%s);", firstLabels));
            js.setLength(0);
        }
    }


    public void setFirstlabels(Boolean firstLabels1) {
        this.firstLabels1 = firstLabels1;

        js.append(String.format(Locale.US, "chart.firstLabels(%b);", firstLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstLabels(%b);", firstLabels1));
            js.setLength(0);
        }
    }

    private UiMarkersfactoryMarker getFirstMarkers;

    public UiMarkersfactoryMarker getFirstMarkers() {
        if (getFirstMarkers == null)
            getFirstMarkers = new UiMarkersfactoryMarker("chart.firstMarkers()");

        return getFirstMarkers;
    }

    private String firstMarkers;
    private Boolean firstMarkers1;

    public void setFirstmarkers(String firstMarkers) {
        this.firstMarkers = firstMarkers;

        js.append(String.format(Locale.US, "chart.firstMarkers(%s);", firstMarkers));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstMarkers(%s);", firstMarkers));
            js.setLength(0);
        }
    }


    public void setFirstmarkers(Boolean firstMarkers1) {
        this.firstMarkers1 = firstMarkers1;

        js.append(String.format(Locale.US, "chart.firstMarkers(%b);", firstMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.firstMarkers(%b);", firstMarkers1));
            js.setLength(0);
        }
    }

    private Double xCoord;
    private Double yCoord;

    public void setGlobaltolocal(Double xCoord, Double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;

        js.append(String.format(Locale.US, "chart.globalToLocal(%f, %f);", xCoord, yCoord));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.globalToLocal(%f, %f);", xCoord, yCoord));
            js.setLength(0);
        }
    }

    private PatternFill getHatchFill;

    public PatternFill getHatchFill() {
        if (getHatchFill == null)
            getHatchFill = new PatternFill("chart.hatchFill()");

        return getHatchFill;
    }

    private PatternFill patternFillOrType4;
    private HatchFill patternFillOrType5;
    private HatchFillType patternFillOrType6;
    private String patternFillOrType7;
    private String color3;
    private Double thickness1;
    private Double size1;

    public void setHatchfill(PatternFill patternFillOrType4, String color3, Double thickness1, Double size1) {
        this.patternFillOrType4 = patternFillOrType4;
        this.color3 = color3;
        this.thickness1 = thickness1;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType4 != null) ? patternFillOrType4.generateJs() : "null", color3, thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType4 != null) ? patternFillOrType4.generateJs() : "null", color3, thickness1, size1));
            js.setLength(0);
        }
    }


    public void setHatchfill(HatchFill patternFillOrType5, String color3, Double thickness1, Double size1) {
        this.patternFillOrType5 = patternFillOrType5;
        this.color3 = color3;
        this.thickness1 = thickness1;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null", color3, thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null", color3, thickness1, size1));
            js.setLength(0);
        }
    }


    public void setHatchfill(HatchFillType patternFillOrType6, String color3, Double thickness1, Double size1) {
        this.patternFillOrType6 = patternFillOrType6;
        this.color3 = color3;
        this.thickness1 = thickness1;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null", color3, thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null", color3, thickness1, size1));
            js.setLength(0);
        }
    }


    public void setHatchfill(String patternFillOrType7, String color3, Double thickness1, Double size1) {
        this.patternFillOrType7 = patternFillOrType7;
        this.color3 = color3;
        this.thickness1 = thickness1;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", patternFillOrType7, color3, thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", patternFillOrType7, color3, thickness1, size1));
            js.setLength(0);
        }
    }

    private Double height2;
    private String height3;

    public void setHeight(Double height2) {
        this.height2 = height2;

        js.append(String.format(Locale.US, "chart.height(%f);", height2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.height(%f);", height2));
            js.setLength(0);
        }
    }


    public void setHeight(String height3) {
        this.height3 = height3;

        js.append(String.format(Locale.US, "chart.height(%s);", height3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.height(%s);", height3));
            js.setLength(0);
        }
    }

    private UiLabel getLabel;

    public UiLabel getLabel() {
        if (getLabel == null)
            getLabel = new UiLabel("chart.label()");

        return getLabel;
    }

    private Boolean label;
    private String label1;
    private String label2;

    public void setLabel(Boolean label) {
        this.label = label;

        js.append(String.format(Locale.US, "chart.label(%b);", label));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%b);", label));
            js.setLength(0);
        }
    }


    public void setLabel(String label1) {
        this.label1 = label1;

        js.append(String.format(Locale.US, "chart.label(%s);", label1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s);", label1));
            js.setLength(0);
        }
    }

    private String index;
    private Double index1;
    private Boolean label3;
    private String label4;
    private String label5;

    public void setLabel(String index, Boolean label3) {
        this.index = index;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%s, %b);", index, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %b);", index, label3));
            js.setLength(0);
        }
    }


    public void setLabel(String index, String label4) {
        this.index = index;
        this.label4 = label4;

        js.append(String.format(Locale.US, "chart.label(%s, %s);", index, label4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %s);", index, label4));
            js.setLength(0);
        }
    }


    public void setLabel(Double index1, Boolean label3) {
        this.index1 = index1;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%f, %b);", index1, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %b);", index1, label3));
            js.setLength(0);
        }
    }


    public void setLabel(Double index1, String label4) {
        this.index1 = index1;
        this.label4 = label4;

        js.append(String.format(Locale.US, "chart.label(%f, %s);", index1, label4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %s);", index1, label4));
            js.setLength(0);
        }
    }

    private LabelsfactoryLabel getLabels;

    public LabelsfactoryLabel getLabels() {
        if (getLabels == null)
            getLabels = new LabelsfactoryLabel("chart.labels()");

        return getLabels;
    }

    private String labels;
    private Boolean labels1;

    public void setLabels(String labels) {
        this.labels = labels;

        js.append(String.format(Locale.US, "chart.labels(%s);", labels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.labels(%s);", labels));
            js.setLength(0);
        }
    }


    public void setLabels(Boolean labels1) {
        this.labels1 = labels1;

        js.append(String.format(Locale.US, "chart.labels(%b);", labels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.labels(%b);", labels1));
            js.setLength(0);
        }
    }

    private Fill lastFill;

    public void setLastfill(Fill lastFill) {
        this.lastFill = lastFill;

        js.append(String.format(Locale.US, "chart.lastFill(%s);", (lastFill != null) ? lastFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastFill(%s);", (lastFill != null) ? lastFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color4;
    private Double opacity6;

    public void setLastfill(String color4, Double opacity6) {
        this.color4 = color4;
        this.opacity6 = opacity6;

        js.append(String.format(Locale.US, "chart.lastFill(%s, %f);", color4, opacity6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastFill(%s, %f);", color4, opacity6));
            js.setLength(0);
        }
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode8;
    private VectorRect mode9;
    private String mode10;
    private Double opacity7;

    public void setLastfill(GradientKey[] keys8, Boolean mode8, Double angle2, Double opacity7) {
        this.keys8 = keys8;
        this.mode8 = mode8;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.lastFill(%s, %b, %f, %f);", arrayToString(keys8), mode8, angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastFill(%s, %b, %f, %f);", arrayToString(keys8), mode8, angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setLastfill(GradientKey[] keys8, VectorRect mode9, Double angle2, Double opacity7) {
        this.keys8 = keys8;
        this.mode9 = mode9;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.lastFill(%s, %s, %f, %f);", arrayToString(keys8), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastFill(%s, %s, %f, %f);", arrayToString(keys8), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setLastfill(GradientKey[] keys8, String mode10, Double angle2, Double opacity7) {
        this.keys8 = keys8;
        this.mode10 = mode10;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.lastFill(%s, %s, %f, %f);", arrayToString(keys8), mode10, angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastFill(%s, %s, %f, %f);", arrayToString(keys8), mode10, angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setLastfill(String[] keys9, Boolean mode8, Double angle2, Double opacity7) {
        this.keys9 = keys9;
        this.mode8 = mode8;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.lastFill(%s, %b, %f, %f);", Arrays.toString(keys9), mode8, angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastFill(%s, %b, %f, %f);", Arrays.toString(keys9), mode8, angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setLastfill(String[] keys9, VectorRect mode9, Double angle2, Double opacity7) {
        this.keys9 = keys9;
        this.mode9 = mode9;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.lastFill(%s, %s, %f, %f);", Arrays.toString(keys9), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastFill(%s, %s, %f, %f);", Arrays.toString(keys9), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setLastfill(String[] keys9, String mode10, Double angle2, Double opacity7) {
        this.keys9 = keys9;
        this.mode10 = mode10;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.lastFill(%s, %s, %f, %f);", Arrays.toString(keys9), mode10, angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastFill(%s, %s, %f, %f);", Arrays.toString(keys9), mode10, angle2, opacity7));
            js.setLength(0);
        }
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private GraphicsMathRect mode11;
    private Double opacity8;
    private Double fx2;
    private Double fy2;

    public void setLastfill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
        this.keys10 = keys10;
        this.cx2 = cx2;
        this.cy2 = cy2;
        this.mode11 = mode11;
        this.opacity8 = opacity8;
        this.fx2 = fx2;
        this.fy2 = fy2;

        js.append(String.format(Locale.US, "chart.lastFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys10), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys10), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));
            js.setLength(0);
        }
    }


    public void setLastfill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
        this.keys11 = keys11;
        this.cx2 = cx2;
        this.cy2 = cy2;
        this.mode11 = mode11;
        this.opacity8 = opacity8;
        this.fx2 = fx2;
        this.fy2 = fy2;

        js.append(String.format(Locale.US, "chart.lastFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys11), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys11), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));
            js.setLength(0);
        }
    }

    private Fill imageSettings2;
    private PatternFill getLastHatchFill;

    public PatternFill getLastHatchFill() {
        if (getLastHatchFill == null)
            getLastHatchFill = new PatternFill("chart.lastHatchFill()");

        return getLastHatchFill;
    }

    private PatternFill patternFillOrType8;
    private HatchFill patternFillOrType9;
    private HatchFillType patternFillOrType10;
    private String patternFillOrType11;
    private String color5;
    private Double thickness2;
    private Double size2;

    public void setLasthatchfill(PatternFill patternFillOrType8, String color5, Double thickness2, Double size2) {
        this.patternFillOrType8 = patternFillOrType8;
        this.color5 = color5;
        this.thickness2 = thickness2;
        this.size2 = size2;

        js.append(String.format(Locale.US, "chart.lastHatchFill(%s, %s, %f, %f);", (patternFillOrType8 != null) ? patternFillOrType8.generateJs() : "null", color5, thickness2, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastHatchFill(%s, %s, %f, %f);", (patternFillOrType8 != null) ? patternFillOrType8.generateJs() : "null", color5, thickness2, size2));
            js.setLength(0);
        }
    }


    public void setLasthatchfill(HatchFill patternFillOrType9, String color5, Double thickness2, Double size2) {
        this.patternFillOrType9 = patternFillOrType9;
        this.color5 = color5;
        this.thickness2 = thickness2;
        this.size2 = size2;

        js.append(String.format(Locale.US, "chart.lastHatchFill(%s, %s, %f, %f);", (patternFillOrType9 != null) ? patternFillOrType9.generateJs() : "null", color5, thickness2, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastHatchFill(%s, %s, %f, %f);", (patternFillOrType9 != null) ? patternFillOrType9.generateJs() : "null", color5, thickness2, size2));
            js.setLength(0);
        }
    }


    public void setLasthatchfill(HatchFillType patternFillOrType10, String color5, Double thickness2, Double size2) {
        this.patternFillOrType10 = patternFillOrType10;
        this.color5 = color5;
        this.thickness2 = thickness2;
        this.size2 = size2;

        js.append(String.format(Locale.US, "chart.lastHatchFill(%s, %s, %f, %f);", (patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null", color5, thickness2, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastHatchFill(%s, %s, %f, %f);", (patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null", color5, thickness2, size2));
            js.setLength(0);
        }
    }


    public void setLasthatchfill(String patternFillOrType11, String color5, Double thickness2, Double size2) {
        this.patternFillOrType11 = patternFillOrType11;
        this.color5 = color5;
        this.thickness2 = thickness2;
        this.size2 = size2;

        js.append(String.format(Locale.US, "chart.lastHatchFill(%s, %s, %f, %f);", patternFillOrType11, color5, thickness2, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastHatchFill(%s, %s, %f, %f);", patternFillOrType11, color5, thickness2, size2));
            js.setLength(0);
        }
    }

    private LabelsfactoryLabel getLastLabels;

    public LabelsfactoryLabel getLastLabels() {
        if (getLastLabels == null)
            getLastLabels = new LabelsfactoryLabel("chart.lastLabels()");

        return getLastLabels;
    }

    private String lastLabels;
    private Boolean lastLabels1;

    public void setLastlabels(String lastLabels) {
        this.lastLabels = lastLabels;

        js.append(String.format(Locale.US, "chart.lastLabels(%s);", lastLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastLabels(%s);", lastLabels));
            js.setLength(0);
        }
    }


    public void setLastlabels(Boolean lastLabels1) {
        this.lastLabels1 = lastLabels1;

        js.append(String.format(Locale.US, "chart.lastLabels(%b);", lastLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastLabels(%b);", lastLabels1));
            js.setLength(0);
        }
    }

    private UiMarkersfactoryMarker getLastMarkers;

    public UiMarkersfactoryMarker getLastMarkers() {
        if (getLastMarkers == null)
            getLastMarkers = new UiMarkersfactoryMarker("chart.lastMarkers()");

        return getLastMarkers;
    }

    private String lastMarkers;
    private Boolean lastMarkers1;

    public void setLastmarkers(String lastMarkers) {
        this.lastMarkers = lastMarkers;

        js.append(String.format(Locale.US, "chart.lastMarkers(%s);", lastMarkers));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastMarkers(%s);", lastMarkers));
            js.setLength(0);
        }
    }


    public void setLastmarkers(Boolean lastMarkers1) {
        this.lastMarkers1 = lastMarkers1;

        js.append(String.format(Locale.US, "chart.lastMarkers(%b);", lastMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lastMarkers(%b);", lastMarkers1));
            js.setLength(0);
        }
    }

    private Double left;
    private String left1;

    public void setLeft(Double left) {
        this.left = left;

        js.append(String.format(Locale.US, "chart.left(%f);", left));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.left(%f);", left));
            js.setLength(0);
        }
    }


    public void setLeft(String left1) {
        this.left1 = left1;

        js.append(String.format(Locale.US, "chart.left(%s);", left1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.left(%s);", left1));
            js.setLength(0);
        }
    }

    private CoreAxismarkersLine getLineMarker;

    public CoreAxismarkersLine getLineMarker() {
        if (getLineMarker == null)
            getLineMarker = new CoreAxismarkersLine("chart.lineMarker()");

        return getLineMarker;
    }

    private String lineMarker;
    private Boolean lineMarker1;

    public void setLinemarker(String lineMarker) {
        this.lineMarker = lineMarker;

        js.append(String.format(Locale.US, "chart.lineMarker(%s);", lineMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%s);", lineMarker));
            js.setLength(0);
        }
    }


    public void setLinemarker(Boolean lineMarker1) {
        this.lineMarker1 = lineMarker1;

        js.append(String.format(Locale.US, "chart.lineMarker(%b);", lineMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%b);", lineMarker1));
            js.setLength(0);
        }
    }

    private Double index2;
    private String lineMarker2;
    private Boolean lineMarker3;

    public void setLinemarker(String lineMarker2, Double index2) {
        this.lineMarker2 = lineMarker2;
        this.index2 = index2;

        js.append(String.format(Locale.US, "chart.lineMarker(%s, %f);", lineMarker2, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%s, %f);", lineMarker2, index2));
            js.setLength(0);
        }
    }


    public void setLinemarker(Boolean lineMarker3, Double index2) {
        this.lineMarker3 = lineMarker3;
        this.index2 = index2;

        js.append(String.format(Locale.US, "chart.lineMarker(%b, %f);", lineMarker3, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%b, %f);", lineMarker3, index2));
            js.setLength(0);
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        this.type = type;
        this.useCapture = useCapture;
        this.listenerScope = listenerScope;

        js.append(String.format(Locale.US, "chart.listen(%s, %b, %s);", type, useCapture, listenerScope));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.listen(%s, %b, %s);", type, useCapture, listenerScope));
            js.setLength(0);
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        this.type1 = type1;
        this.useCapture1 = useCapture1;
        this.listenerScope1 = listenerScope1;

        js.append(String.format(Locale.US, "chart.listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
            js.setLength(0);
        }
    }

    private Double xCoord1;
    private Double yCoord1;

    public void setLocaltoglobal(Double xCoord1, Double yCoord1) {
        this.xCoord1 = xCoord1;
        this.yCoord1 = yCoord1;

        js.append(String.format(Locale.US, "chart.localToGlobal(%f, %f);", xCoord1, yCoord1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.localToGlobal(%f, %f);", xCoord1, yCoord1));
            js.setLength(0);
        }
    }

    private Margin getMargin;

    public Margin getMargin() {
        if (getMargin == null)
            getMargin = new Margin("chart.margin()");

        return getMargin;
    }

    private Double[] margin;
    private String[] margin1;
    private String margin2;

    public void setMargin(Double[] margin) {
        this.margin = margin;

        js.append(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin)));
            js.setLength(0);
        }
    }


    public void setMargin(String[] margin1) {
        this.margin1 = margin1;

        js.append(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin1)));
            js.setLength(0);
        }
    }


    public void setMargin(String margin2) {
        this.margin2 = margin2;

        js.append(String.format(Locale.US, "chart.margin(%s);", margin2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s);", margin2));
            js.setLength(0);
        }
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    public void setMargin(String value, String value2, String value4, String value6) {
        this.value = value;
        this.value2 = value2;
        this.value4 = value4;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%s, %s, %s, %s);", value, value2, value4, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %s, %s, %s);", value, value2, value4, value6));
            js.setLength(0);
        }
    }


    public void setMargin(String value, String value2, String value4, Double value7) {
        this.value = value;
        this.value2 = value2;
        this.value4 = value4;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%s, %s, %s, %f);", value, value2, value4, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %s, %s, %f);", value, value2, value4, value7));
            js.setLength(0);
        }
    }


    public void setMargin(String value, String value2, Double value5, String value6) {
        this.value = value;
        this.value2 = value2;
        this.value5 = value5;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%s, %s, %f, %s);", value, value2, value5, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %s, %f, %s);", value, value2, value5, value6));
            js.setLength(0);
        }
    }


    public void setMargin(String value, String value2, Double value5, Double value7) {
        this.value = value;
        this.value2 = value2;
        this.value5 = value5;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%s, %s, %f, %f);", value, value2, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %s, %f, %f);", value, value2, value5, value7));
            js.setLength(0);
        }
    }


    public void setMargin(String value, Double value3, String value4, String value6) {
        this.value = value;
        this.value3 = value3;
        this.value4 = value4;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%s, %f, %s, %s);", value, value3, value4, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %f, %s, %s);", value, value3, value4, value6));
            js.setLength(0);
        }
    }


    public void setMargin(String value, Double value3, String value4, Double value7) {
        this.value = value;
        this.value3 = value3;
        this.value4 = value4;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%s, %f, %s, %f);", value, value3, value4, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %f, %s, %f);", value, value3, value4, value7));
            js.setLength(0);
        }
    }


    public void setMargin(String value, Double value3, Double value5, String value6) {
        this.value = value;
        this.value3 = value3;
        this.value5 = value5;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%s, %f, %f, %s);", value, value3, value5, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %f, %f, %s);", value, value3, value5, value6));
            js.setLength(0);
        }
    }


    public void setMargin(String value, Double value3, Double value5, Double value7) {
        this.value = value;
        this.value3 = value3;
        this.value5 = value5;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%s, %f, %f, %f);", value, value3, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %f, %f, %f);", value, value3, value5, value7));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, String value2, String value4, String value6) {
        this.value1 = value1;
        this.value2 = value2;
        this.value4 = value4;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%f, %s, %s, %s);", value1, value2, value4, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %s, %s, %s);", value1, value2, value4, value6));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, String value2, String value4, Double value7) {
        this.value1 = value1;
        this.value2 = value2;
        this.value4 = value4;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%f, %s, %s, %f);", value1, value2, value4, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %s, %s, %f);", value1, value2, value4, value7));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, String value2, Double value5, String value6) {
        this.value1 = value1;
        this.value2 = value2;
        this.value5 = value5;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%f, %s, %f, %s);", value1, value2, value5, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %s, %f, %s);", value1, value2, value5, value6));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, String value2, Double value5, Double value7) {
        this.value1 = value1;
        this.value2 = value2;
        this.value5 = value5;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%f, %s, %f, %f);", value1, value2, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %s, %f, %f);", value1, value2, value5, value7));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, Double value3, String value4, String value6) {
        this.value1 = value1;
        this.value3 = value3;
        this.value4 = value4;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%f, %f, %s, %s);", value1, value3, value4, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %f, %s, %s);", value1, value3, value4, value6));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, Double value3, String value4, Double value7) {
        this.value1 = value1;
        this.value3 = value3;
        this.value4 = value4;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%f, %f, %s, %f);", value1, value3, value4, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %f, %s, %f);", value1, value3, value4, value7));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, Double value3, Double value5, String value6) {
        this.value1 = value1;
        this.value3 = value3;
        this.value5 = value5;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%f, %f, %f, %s);", value1, value3, value5, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %f, %f, %s);", value1, value3, value5, value6));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, Double value3, Double value5, Double value7) {
        this.value1 = value1;
        this.value3 = value3;
        this.value5 = value5;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%f, %f, %f, %f);", value1, value3, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %f, %f, %f);", value1, value3, value5, value7));
            js.setLength(0);
        }
    }

    private UiMarkersfactoryMarker getMarkers;

    public UiMarkersfactoryMarker getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersfactoryMarker("chart.markers()");

        return getMarkers;
    }

    private String markers;
    private Boolean markers1;

    public void setMarkers(String markers) {
        this.markers = markers;

        js.append(String.format(Locale.US, "chart.markers(%s);", markers));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markers(%s);", markers));
            js.setLength(0);
        }
    }


    public void setMarkers(Boolean markers1) {
        this.markers1 = markers1;

        js.append(String.format(Locale.US, "chart.markers(%b);", markers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markers(%b);", markers1));
            js.setLength(0);
        }
    }

    private Fill maxFill;

    public void setMaxfill(Fill maxFill) {
        this.maxFill = maxFill;

        js.append(String.format(Locale.US, "chart.maxFill(%s);", (maxFill != null) ? maxFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxFill(%s);", (maxFill != null) ? maxFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color6;
    private Double opacity9;

    public void setMaxfill(String color6, Double opacity9) {
        this.color6 = color6;
        this.opacity9 = opacity9;

        js.append(String.format(Locale.US, "chart.maxFill(%s, %f);", color6, opacity9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxFill(%s, %f);", color6, opacity9));
            js.setLength(0);
        }
    }

    private GradientKey[] keys12;
    private String[] keys13;
    private Double angle3;
    private Boolean mode12;
    private VectorRect mode13;
    private String mode14;
    private Double opacity10;

    public void setMaxfill(GradientKey[] keys12, Boolean mode12, Double angle3, Double opacity10) {
        this.keys12 = keys12;
        this.mode12 = mode12;
        this.angle3 = angle3;
        this.opacity10 = opacity10;

        js.append(String.format(Locale.US, "chart.maxFill(%s, %b, %f, %f);", arrayToString(keys12), mode12, angle3, opacity10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxFill(%s, %b, %f, %f);", arrayToString(keys12), mode12, angle3, opacity10));
            js.setLength(0);
        }
    }


    public void setMaxfill(GradientKey[] keys12, VectorRect mode13, Double angle3, Double opacity10) {
        this.keys12 = keys12;
        this.mode13 = mode13;
        this.angle3 = angle3;
        this.opacity10 = opacity10;

        js.append(String.format(Locale.US, "chart.maxFill(%s, %s, %f, %f);", arrayToString(keys12), (mode13 != null) ? mode13.generateJs() : "null", angle3, opacity10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxFill(%s, %s, %f, %f);", arrayToString(keys12), (mode13 != null) ? mode13.generateJs() : "null", angle3, opacity10));
            js.setLength(0);
        }
    }


    public void setMaxfill(GradientKey[] keys12, String mode14, Double angle3, Double opacity10) {
        this.keys12 = keys12;
        this.mode14 = mode14;
        this.angle3 = angle3;
        this.opacity10 = opacity10;

        js.append(String.format(Locale.US, "chart.maxFill(%s, %s, %f, %f);", arrayToString(keys12), mode14, angle3, opacity10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxFill(%s, %s, %f, %f);", arrayToString(keys12), mode14, angle3, opacity10));
            js.setLength(0);
        }
    }


    public void setMaxfill(String[] keys13, Boolean mode12, Double angle3, Double opacity10) {
        this.keys13 = keys13;
        this.mode12 = mode12;
        this.angle3 = angle3;
        this.opacity10 = opacity10;

        js.append(String.format(Locale.US, "chart.maxFill(%s, %b, %f, %f);", Arrays.toString(keys13), mode12, angle3, opacity10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxFill(%s, %b, %f, %f);", Arrays.toString(keys13), mode12, angle3, opacity10));
            js.setLength(0);
        }
    }


    public void setMaxfill(String[] keys13, VectorRect mode13, Double angle3, Double opacity10) {
        this.keys13 = keys13;
        this.mode13 = mode13;
        this.angle3 = angle3;
        this.opacity10 = opacity10;

        js.append(String.format(Locale.US, "chart.maxFill(%s, %s, %f, %f);", Arrays.toString(keys13), (mode13 != null) ? mode13.generateJs() : "null", angle3, opacity10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxFill(%s, %s, %f, %f);", Arrays.toString(keys13), (mode13 != null) ? mode13.generateJs() : "null", angle3, opacity10));
            js.setLength(0);
        }
    }


    public void setMaxfill(String[] keys13, String mode14, Double angle3, Double opacity10) {
        this.keys13 = keys13;
        this.mode14 = mode14;
        this.angle3 = angle3;
        this.opacity10 = opacity10;

        js.append(String.format(Locale.US, "chart.maxFill(%s, %s, %f, %f);", Arrays.toString(keys13), mode14, angle3, opacity10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxFill(%s, %s, %f, %f);", Arrays.toString(keys13), mode14, angle3, opacity10));
            js.setLength(0);
        }
    }

    private GradientKey[] keys14;
    private String[] keys15;
    private Double cx3;
    private Double cy3;
    private GraphicsMathRect mode15;
    private Double opacity11;
    private Double fx3;
    private Double fy3;

    public void setMaxfill(GradientKey[] keys14, Double cx3, Double cy3, GraphicsMathRect mode15, Double opacity11, Double fx3, Double fy3) {
        this.keys14 = keys14;
        this.cx3 = cx3;
        this.cy3 = cy3;
        this.mode15 = mode15;
        this.opacity11 = opacity11;
        this.fx3 = fx3;
        this.fy3 = fy3;

        js.append(String.format(Locale.US, "chart.maxFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys14), cx3, cy3, (mode15 != null) ? mode15.generateJs() : "null", opacity11, fx3, fy3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys14), cx3, cy3, (mode15 != null) ? mode15.generateJs() : "null", opacity11, fx3, fy3));
            js.setLength(0);
        }
    }


    public void setMaxfill(String[] keys15, Double cx3, Double cy3, GraphicsMathRect mode15, Double opacity11, Double fx3, Double fy3) {
        this.keys15 = keys15;
        this.cx3 = cx3;
        this.cy3 = cy3;
        this.mode15 = mode15;
        this.opacity11 = opacity11;
        this.fx3 = fx3;
        this.fy3 = fy3;

        js.append(String.format(Locale.US, "chart.maxFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys15), cx3, cy3, (mode15 != null) ? mode15.generateJs() : "null", opacity11, fx3, fy3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys15), cx3, cy3, (mode15 != null) ? mode15.generateJs() : "null", opacity11, fx3, fy3));
            js.setLength(0);
        }
    }

    private Fill imageSettings3;
    private PatternFill getMaxHatchFill;

    public PatternFill getMaxHatchFill() {
        if (getMaxHatchFill == null)
            getMaxHatchFill = new PatternFill("chart.maxHatchFill()");

        return getMaxHatchFill;
    }

    private PatternFill patternFillOrType12;
    private HatchFill patternFillOrType13;
    private HatchFillType patternFillOrType14;
    private String patternFillOrType15;
    private String color7;
    private Double thickness3;
    private Double size3;

    public void setMaxhatchfill(PatternFill patternFillOrType12, String color7, Double thickness3, Double size3) {
        this.patternFillOrType12 = patternFillOrType12;
        this.color7 = color7;
        this.thickness3 = thickness3;
        this.size3 = size3;

        js.append(String.format(Locale.US, "chart.maxHatchFill(%s, %s, %f, %f);", (patternFillOrType12 != null) ? patternFillOrType12.generateJs() : "null", color7, thickness3, size3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxHatchFill(%s, %s, %f, %f);", (patternFillOrType12 != null) ? patternFillOrType12.generateJs() : "null", color7, thickness3, size3));
            js.setLength(0);
        }
    }


    public void setMaxhatchfill(HatchFill patternFillOrType13, String color7, Double thickness3, Double size3) {
        this.patternFillOrType13 = patternFillOrType13;
        this.color7 = color7;
        this.thickness3 = thickness3;
        this.size3 = size3;

        js.append(String.format(Locale.US, "chart.maxHatchFill(%s, %s, %f, %f);", (patternFillOrType13 != null) ? patternFillOrType13.generateJs() : "null", color7, thickness3, size3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxHatchFill(%s, %s, %f, %f);", (patternFillOrType13 != null) ? patternFillOrType13.generateJs() : "null", color7, thickness3, size3));
            js.setLength(0);
        }
    }


    public void setMaxhatchfill(HatchFillType patternFillOrType14, String color7, Double thickness3, Double size3) {
        this.patternFillOrType14 = patternFillOrType14;
        this.color7 = color7;
        this.thickness3 = thickness3;
        this.size3 = size3;

        js.append(String.format(Locale.US, "chart.maxHatchFill(%s, %s, %f, %f);", (patternFillOrType14 != null) ? patternFillOrType14.generateJs() : "null", color7, thickness3, size3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxHatchFill(%s, %s, %f, %f);", (patternFillOrType14 != null) ? patternFillOrType14.generateJs() : "null", color7, thickness3, size3));
            js.setLength(0);
        }
    }


    public void setMaxhatchfill(String patternFillOrType15, String color7, Double thickness3, Double size3) {
        this.patternFillOrType15 = patternFillOrType15;
        this.color7 = color7;
        this.thickness3 = thickness3;
        this.size3 = size3;

        js.append(String.format(Locale.US, "chart.maxHatchFill(%s, %s, %f, %f);", patternFillOrType15, color7, thickness3, size3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxHatchFill(%s, %s, %f, %f);", patternFillOrType15, color7, thickness3, size3));
            js.setLength(0);
        }
    }

    private Double maxHeight;
    private String maxHeight1;

    public void setMaxheight(Double maxHeight) {
        this.maxHeight = maxHeight;

        js.append(String.format(Locale.US, "chart.maxHeight(%f);", maxHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxHeight(%f);", maxHeight));
            js.setLength(0);
        }
    }


    public void setMaxheight(String maxHeight1) {
        this.maxHeight1 = maxHeight1;

        js.append(String.format(Locale.US, "chart.maxHeight(%s);", maxHeight1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxHeight(%s);", maxHeight1));
            js.setLength(0);
        }
    }

    private LabelsfactoryLabel getMaxLabels;

    public LabelsfactoryLabel getMaxLabels() {
        if (getMaxLabels == null)
            getMaxLabels = new LabelsfactoryLabel("chart.maxLabels()");

        return getMaxLabels;
    }

    private String maxLabels;
    private Boolean maxLabels1;

    public void setMaxlabels(String maxLabels) {
        this.maxLabels = maxLabels;

        js.append(String.format(Locale.US, "chart.maxLabels(%s);", maxLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxLabels(%s);", maxLabels));
            js.setLength(0);
        }
    }


    public void setMaxlabels(Boolean maxLabels1) {
        this.maxLabels1 = maxLabels1;

        js.append(String.format(Locale.US, "chart.maxLabels(%b);", maxLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxLabels(%b);", maxLabels1));
            js.setLength(0);
        }
    }

    private UiMarkersfactoryMarker getMaxMarkers;

    public UiMarkersfactoryMarker getMaxMarkers() {
        if (getMaxMarkers == null)
            getMaxMarkers = new UiMarkersfactoryMarker("chart.maxMarkers()");

        return getMaxMarkers;
    }

    private String maxMarkers;
    private Boolean maxMarkers1;

    public void setMaxmarkers(String maxMarkers) {
        this.maxMarkers = maxMarkers;

        js.append(String.format(Locale.US, "chart.maxMarkers(%s);", maxMarkers));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxMarkers(%s);", maxMarkers));
            js.setLength(0);
        }
    }


    public void setMaxmarkers(Boolean maxMarkers1) {
        this.maxMarkers1 = maxMarkers1;

        js.append(String.format(Locale.US, "chart.maxMarkers(%b);", maxMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxMarkers(%b);", maxMarkers1));
            js.setLength(0);
        }
    }

    private Double maxWidth;
    private String maxWidth1;

    public void setMaxwidth(Double maxWidth) {
        this.maxWidth = maxWidth;

        js.append(String.format(Locale.US, "chart.maxWidth(%f);", maxWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxWidth(%f);", maxWidth));
            js.setLength(0);
        }
    }


    public void setMaxwidth(String maxWidth1) {
        this.maxWidth1 = maxWidth1;

        js.append(String.format(Locale.US, "chart.maxWidth(%s);", maxWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxWidth(%s);", maxWidth1));
            js.setLength(0);
        }
    }

    private Fill minFill;

    public void setMinfill(Fill minFill) {
        this.minFill = minFill;

        js.append(String.format(Locale.US, "chart.minFill(%s);", (minFill != null) ? minFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minFill(%s);", (minFill != null) ? minFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color8;
    private Double opacity12;

    public void setMinfill(String color8, Double opacity12) {
        this.color8 = color8;
        this.opacity12 = opacity12;

        js.append(String.format(Locale.US, "chart.minFill(%s, %f);", color8, opacity12));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minFill(%s, %f);", color8, opacity12));
            js.setLength(0);
        }
    }

    private GradientKey[] keys16;
    private String[] keys17;
    private Double angle4;
    private Boolean mode16;
    private VectorRect mode17;
    private String mode18;
    private Double opacity13;

    public void setMinfill(GradientKey[] keys16, Boolean mode16, Double angle4, Double opacity13) {
        this.keys16 = keys16;
        this.mode16 = mode16;
        this.angle4 = angle4;
        this.opacity13 = opacity13;

        js.append(String.format(Locale.US, "chart.minFill(%s, %b, %f, %f);", arrayToString(keys16), mode16, angle4, opacity13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minFill(%s, %b, %f, %f);", arrayToString(keys16), mode16, angle4, opacity13));
            js.setLength(0);
        }
    }


    public void setMinfill(GradientKey[] keys16, VectorRect mode17, Double angle4, Double opacity13) {
        this.keys16 = keys16;
        this.mode17 = mode17;
        this.angle4 = angle4;
        this.opacity13 = opacity13;

        js.append(String.format(Locale.US, "chart.minFill(%s, %s, %f, %f);", arrayToString(keys16), (mode17 != null) ? mode17.generateJs() : "null", angle4, opacity13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minFill(%s, %s, %f, %f);", arrayToString(keys16), (mode17 != null) ? mode17.generateJs() : "null", angle4, opacity13));
            js.setLength(0);
        }
    }


    public void setMinfill(GradientKey[] keys16, String mode18, Double angle4, Double opacity13) {
        this.keys16 = keys16;
        this.mode18 = mode18;
        this.angle4 = angle4;
        this.opacity13 = opacity13;

        js.append(String.format(Locale.US, "chart.minFill(%s, %s, %f, %f);", arrayToString(keys16), mode18, angle4, opacity13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minFill(%s, %s, %f, %f);", arrayToString(keys16), mode18, angle4, opacity13));
            js.setLength(0);
        }
    }


    public void setMinfill(String[] keys17, Boolean mode16, Double angle4, Double opacity13) {
        this.keys17 = keys17;
        this.mode16 = mode16;
        this.angle4 = angle4;
        this.opacity13 = opacity13;

        js.append(String.format(Locale.US, "chart.minFill(%s, %b, %f, %f);", Arrays.toString(keys17), mode16, angle4, opacity13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minFill(%s, %b, %f, %f);", Arrays.toString(keys17), mode16, angle4, opacity13));
            js.setLength(0);
        }
    }


    public void setMinfill(String[] keys17, VectorRect mode17, Double angle4, Double opacity13) {
        this.keys17 = keys17;
        this.mode17 = mode17;
        this.angle4 = angle4;
        this.opacity13 = opacity13;

        js.append(String.format(Locale.US, "chart.minFill(%s, %s, %f, %f);", Arrays.toString(keys17), (mode17 != null) ? mode17.generateJs() : "null", angle4, opacity13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minFill(%s, %s, %f, %f);", Arrays.toString(keys17), (mode17 != null) ? mode17.generateJs() : "null", angle4, opacity13));
            js.setLength(0);
        }
    }


    public void setMinfill(String[] keys17, String mode18, Double angle4, Double opacity13) {
        this.keys17 = keys17;
        this.mode18 = mode18;
        this.angle4 = angle4;
        this.opacity13 = opacity13;

        js.append(String.format(Locale.US, "chart.minFill(%s, %s, %f, %f);", Arrays.toString(keys17), mode18, angle4, opacity13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minFill(%s, %s, %f, %f);", Arrays.toString(keys17), mode18, angle4, opacity13));
            js.setLength(0);
        }
    }

    private GradientKey[] keys18;
    private String[] keys19;
    private Double cx4;
    private Double cy4;
    private GraphicsMathRect mode19;
    private Double opacity14;
    private Double fx4;
    private Double fy4;

    public void setMinfill(GradientKey[] keys18, Double cx4, Double cy4, GraphicsMathRect mode19, Double opacity14, Double fx4, Double fy4) {
        this.keys18 = keys18;
        this.cx4 = cx4;
        this.cy4 = cy4;
        this.mode19 = mode19;
        this.opacity14 = opacity14;
        this.fx4 = fx4;
        this.fy4 = fy4;

        js.append(String.format(Locale.US, "chart.minFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys18), cx4, cy4, (mode19 != null) ? mode19.generateJs() : "null", opacity14, fx4, fy4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys18), cx4, cy4, (mode19 != null) ? mode19.generateJs() : "null", opacity14, fx4, fy4));
            js.setLength(0);
        }
    }


    public void setMinfill(String[] keys19, Double cx4, Double cy4, GraphicsMathRect mode19, Double opacity14, Double fx4, Double fy4) {
        this.keys19 = keys19;
        this.cx4 = cx4;
        this.cy4 = cy4;
        this.mode19 = mode19;
        this.opacity14 = opacity14;
        this.fx4 = fx4;
        this.fy4 = fy4;

        js.append(String.format(Locale.US, "chart.minFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys19), cx4, cy4, (mode19 != null) ? mode19.generateJs() : "null", opacity14, fx4, fy4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys19), cx4, cy4, (mode19 != null) ? mode19.generateJs() : "null", opacity14, fx4, fy4));
            js.setLength(0);
        }
    }

    private Fill imageSettings4;
    private PatternFill getMinHatchFill;

    public PatternFill getMinHatchFill() {
        if (getMinHatchFill == null)
            getMinHatchFill = new PatternFill("chart.minHatchFill()");

        return getMinHatchFill;
    }

    private PatternFill patternFillOrType16;
    private HatchFill patternFillOrType17;
    private HatchFillType patternFillOrType18;
    private String patternFillOrType19;
    private String color9;
    private Double thickness4;
    private Double size4;

    public void setMinhatchfill(PatternFill patternFillOrType16, String color9, Double thickness4, Double size4) {
        this.patternFillOrType16 = patternFillOrType16;
        this.color9 = color9;
        this.thickness4 = thickness4;
        this.size4 = size4;

        js.append(String.format(Locale.US, "chart.minHatchFill(%s, %s, %f, %f);", (patternFillOrType16 != null) ? patternFillOrType16.generateJs() : "null", color9, thickness4, size4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minHatchFill(%s, %s, %f, %f);", (patternFillOrType16 != null) ? patternFillOrType16.generateJs() : "null", color9, thickness4, size4));
            js.setLength(0);
        }
    }


    public void setMinhatchfill(HatchFill patternFillOrType17, String color9, Double thickness4, Double size4) {
        this.patternFillOrType17 = patternFillOrType17;
        this.color9 = color9;
        this.thickness4 = thickness4;
        this.size4 = size4;

        js.append(String.format(Locale.US, "chart.minHatchFill(%s, %s, %f, %f);", (patternFillOrType17 != null) ? patternFillOrType17.generateJs() : "null", color9, thickness4, size4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minHatchFill(%s, %s, %f, %f);", (patternFillOrType17 != null) ? patternFillOrType17.generateJs() : "null", color9, thickness4, size4));
            js.setLength(0);
        }
    }


    public void setMinhatchfill(HatchFillType patternFillOrType18, String color9, Double thickness4, Double size4) {
        this.patternFillOrType18 = patternFillOrType18;
        this.color9 = color9;
        this.thickness4 = thickness4;
        this.size4 = size4;

        js.append(String.format(Locale.US, "chart.minHatchFill(%s, %s, %f, %f);", (patternFillOrType18 != null) ? patternFillOrType18.generateJs() : "null", color9, thickness4, size4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minHatchFill(%s, %s, %f, %f);", (patternFillOrType18 != null) ? patternFillOrType18.generateJs() : "null", color9, thickness4, size4));
            js.setLength(0);
        }
    }


    public void setMinhatchfill(String patternFillOrType19, String color9, Double thickness4, Double size4) {
        this.patternFillOrType19 = patternFillOrType19;
        this.color9 = color9;
        this.thickness4 = thickness4;
        this.size4 = size4;

        js.append(String.format(Locale.US, "chart.minHatchFill(%s, %s, %f, %f);", patternFillOrType19, color9, thickness4, size4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minHatchFill(%s, %s, %f, %f);", patternFillOrType19, color9, thickness4, size4));
            js.setLength(0);
        }
    }

    private Double minHeight;
    private String minHeight1;

    public void setMinheight(Double minHeight) {
        this.minHeight = minHeight;

        js.append(String.format(Locale.US, "chart.minHeight(%f);", minHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minHeight(%f);", minHeight));
            js.setLength(0);
        }
    }


    public void setMinheight(String minHeight1) {
        this.minHeight1 = minHeight1;

        js.append(String.format(Locale.US, "chart.minHeight(%s);", minHeight1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minHeight(%s);", minHeight1));
            js.setLength(0);
        }
    }

    private LabelsfactoryLabel getMinLabels;

    public LabelsfactoryLabel getMinLabels() {
        if (getMinLabels == null)
            getMinLabels = new LabelsfactoryLabel("chart.minLabels()");

        return getMinLabels;
    }

    private String minLabels;
    private Boolean minLabels1;

    public void setMinlabels(String minLabels) {
        this.minLabels = minLabels;

        js.append(String.format(Locale.US, "chart.minLabels(%s);", minLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minLabels(%s);", minLabels));
            js.setLength(0);
        }
    }


    public void setMinlabels(Boolean minLabels1) {
        this.minLabels1 = minLabels1;

        js.append(String.format(Locale.US, "chart.minLabels(%b);", minLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minLabels(%b);", minLabels1));
            js.setLength(0);
        }
    }

    private UiMarkersfactoryMarker getMinMarkers;

    public UiMarkersfactoryMarker getMinMarkers() {
        if (getMinMarkers == null)
            getMinMarkers = new UiMarkersfactoryMarker("chart.minMarkers()");

        return getMinMarkers;
    }

    private String minMarkers;
    private Boolean minMarkers1;

    public void setMinmarkers(String minMarkers) {
        this.minMarkers = minMarkers;

        js.append(String.format(Locale.US, "chart.minMarkers(%s);", minMarkers));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minMarkers(%s);", minMarkers));
            js.setLength(0);
        }
    }


    public void setMinmarkers(Boolean minMarkers1) {
        this.minMarkers1 = minMarkers1;

        js.append(String.format(Locale.US, "chart.minMarkers(%b);", minMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minMarkers(%b);", minMarkers1));
            js.setLength(0);
        }
    }

    private Double minWidth;
    private String minWidth1;

    public void setMinwidth(Double minWidth) {
        this.minWidth = minWidth;

        js.append(String.format(Locale.US, "chart.minWidth(%f);", minWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minWidth(%f);", minWidth));
            js.setLength(0);
        }
    }


    public void setMinwidth(String minWidth1) {
        this.minWidth1 = minWidth1;

        js.append(String.format(Locale.US, "chart.minWidth(%s);", minWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minWidth(%s);", minWidth1));
            js.setLength(0);
        }
    }

    private Fill negativeFill;

    public void setNegativefill(Fill negativeFill) {
        this.negativeFill = negativeFill;

        js.append(String.format(Locale.US, "chart.negativeFill(%s);", (negativeFill != null) ? negativeFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeFill(%s);", (negativeFill != null) ? negativeFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color10;
    private Double opacity15;

    public void setNegativefill(String color10, Double opacity15) {
        this.color10 = color10;
        this.opacity15 = opacity15;

        js.append(String.format(Locale.US, "chart.negativeFill(%s, %f);", color10, opacity15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeFill(%s, %f);", color10, opacity15));
            js.setLength(0);
        }
    }

    private GradientKey[] keys20;
    private String[] keys21;
    private Double angle5;
    private Boolean mode20;
    private VectorRect mode21;
    private String mode22;
    private Double opacity16;

    public void setNegativefill(GradientKey[] keys20, Boolean mode20, Double angle5, Double opacity16) {
        this.keys20 = keys20;
        this.mode20 = mode20;
        this.angle5 = angle5;
        this.opacity16 = opacity16;

        js.append(String.format(Locale.US, "chart.negativeFill(%s, %b, %f, %f);", arrayToString(keys20), mode20, angle5, opacity16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeFill(%s, %b, %f, %f);", arrayToString(keys20), mode20, angle5, opacity16));
            js.setLength(0);
        }
    }


    public void setNegativefill(GradientKey[] keys20, VectorRect mode21, Double angle5, Double opacity16) {
        this.keys20 = keys20;
        this.mode21 = mode21;
        this.angle5 = angle5;
        this.opacity16 = opacity16;

        js.append(String.format(Locale.US, "chart.negativeFill(%s, %s, %f, %f);", arrayToString(keys20), (mode21 != null) ? mode21.generateJs() : "null", angle5, opacity16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeFill(%s, %s, %f, %f);", arrayToString(keys20), (mode21 != null) ? mode21.generateJs() : "null", angle5, opacity16));
            js.setLength(0);
        }
    }


    public void setNegativefill(GradientKey[] keys20, String mode22, Double angle5, Double opacity16) {
        this.keys20 = keys20;
        this.mode22 = mode22;
        this.angle5 = angle5;
        this.opacity16 = opacity16;

        js.append(String.format(Locale.US, "chart.negativeFill(%s, %s, %f, %f);", arrayToString(keys20), mode22, angle5, opacity16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeFill(%s, %s, %f, %f);", arrayToString(keys20), mode22, angle5, opacity16));
            js.setLength(0);
        }
    }


    public void setNegativefill(String[] keys21, Boolean mode20, Double angle5, Double opacity16) {
        this.keys21 = keys21;
        this.mode20 = mode20;
        this.angle5 = angle5;
        this.opacity16 = opacity16;

        js.append(String.format(Locale.US, "chart.negativeFill(%s, %b, %f, %f);", Arrays.toString(keys21), mode20, angle5, opacity16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeFill(%s, %b, %f, %f);", Arrays.toString(keys21), mode20, angle5, opacity16));
            js.setLength(0);
        }
    }


    public void setNegativefill(String[] keys21, VectorRect mode21, Double angle5, Double opacity16) {
        this.keys21 = keys21;
        this.mode21 = mode21;
        this.angle5 = angle5;
        this.opacity16 = opacity16;

        js.append(String.format(Locale.US, "chart.negativeFill(%s, %s, %f, %f);", Arrays.toString(keys21), (mode21 != null) ? mode21.generateJs() : "null", angle5, opacity16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeFill(%s, %s, %f, %f);", Arrays.toString(keys21), (mode21 != null) ? mode21.generateJs() : "null", angle5, opacity16));
            js.setLength(0);
        }
    }


    public void setNegativefill(String[] keys21, String mode22, Double angle5, Double opacity16) {
        this.keys21 = keys21;
        this.mode22 = mode22;
        this.angle5 = angle5;
        this.opacity16 = opacity16;

        js.append(String.format(Locale.US, "chart.negativeFill(%s, %s, %f, %f);", Arrays.toString(keys21), mode22, angle5, opacity16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeFill(%s, %s, %f, %f);", Arrays.toString(keys21), mode22, angle5, opacity16));
            js.setLength(0);
        }
    }

    private GradientKey[] keys22;
    private String[] keys23;
    private Double cx5;
    private Double cy5;
    private GraphicsMathRect mode23;
    private Double opacity17;
    private Double fx5;
    private Double fy5;

    public void setNegativefill(GradientKey[] keys22, Double cx5, Double cy5, GraphicsMathRect mode23, Double opacity17, Double fx5, Double fy5) {
        this.keys22 = keys22;
        this.cx5 = cx5;
        this.cy5 = cy5;
        this.mode23 = mode23;
        this.opacity17 = opacity17;
        this.fx5 = fx5;
        this.fy5 = fy5;

        js.append(String.format(Locale.US, "chart.negativeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys22), cx5, cy5, (mode23 != null) ? mode23.generateJs() : "null", opacity17, fx5, fy5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys22), cx5, cy5, (mode23 != null) ? mode23.generateJs() : "null", opacity17, fx5, fy5));
            js.setLength(0);
        }
    }


    public void setNegativefill(String[] keys23, Double cx5, Double cy5, GraphicsMathRect mode23, Double opacity17, Double fx5, Double fy5) {
        this.keys23 = keys23;
        this.cx5 = cx5;
        this.cy5 = cy5;
        this.mode23 = mode23;
        this.opacity17 = opacity17;
        this.fx5 = fx5;
        this.fy5 = fy5;

        js.append(String.format(Locale.US, "chart.negativeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys23), cx5, cy5, (mode23 != null) ? mode23.generateJs() : "null", opacity17, fx5, fy5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys23), cx5, cy5, (mode23 != null) ? mode23.generateJs() : "null", opacity17, fx5, fy5));
            js.setLength(0);
        }
    }

    private Fill imageSettings5;
    private PatternFill getNegativeHatchFill;

    public PatternFill getNegativeHatchFill() {
        if (getNegativeHatchFill == null)
            getNegativeHatchFill = new PatternFill("chart.negativeHatchFill()");

        return getNegativeHatchFill;
    }

    private PatternFill patternFillOrType20;
    private HatchFill patternFillOrType21;
    private HatchFillType patternFillOrType22;
    private String patternFillOrType23;
    private String color11;
    private Double thickness5;
    private Double size5;

    public void setNegativehatchfill(PatternFill patternFillOrType20, String color11, Double thickness5, Double size5) {
        this.patternFillOrType20 = patternFillOrType20;
        this.color11 = color11;
        this.thickness5 = thickness5;
        this.size5 = size5;

        js.append(String.format(Locale.US, "chart.negativeHatchFill(%s, %s, %f, %f);", (patternFillOrType20 != null) ? patternFillOrType20.generateJs() : "null", color11, thickness5, size5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeHatchFill(%s, %s, %f, %f);", (patternFillOrType20 != null) ? patternFillOrType20.generateJs() : "null", color11, thickness5, size5));
            js.setLength(0);
        }
    }


    public void setNegativehatchfill(HatchFill patternFillOrType21, String color11, Double thickness5, Double size5) {
        this.patternFillOrType21 = patternFillOrType21;
        this.color11 = color11;
        this.thickness5 = thickness5;
        this.size5 = size5;

        js.append(String.format(Locale.US, "chart.negativeHatchFill(%s, %s, %f, %f);", (patternFillOrType21 != null) ? patternFillOrType21.generateJs() : "null", color11, thickness5, size5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeHatchFill(%s, %s, %f, %f);", (patternFillOrType21 != null) ? patternFillOrType21.generateJs() : "null", color11, thickness5, size5));
            js.setLength(0);
        }
    }


    public void setNegativehatchfill(HatchFillType patternFillOrType22, String color11, Double thickness5, Double size5) {
        this.patternFillOrType22 = patternFillOrType22;
        this.color11 = color11;
        this.thickness5 = thickness5;
        this.size5 = size5;

        js.append(String.format(Locale.US, "chart.negativeHatchFill(%s, %s, %f, %f);", (patternFillOrType22 != null) ? patternFillOrType22.generateJs() : "null", color11, thickness5, size5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeHatchFill(%s, %s, %f, %f);", (patternFillOrType22 != null) ? patternFillOrType22.generateJs() : "null", color11, thickness5, size5));
            js.setLength(0);
        }
    }


    public void setNegativehatchfill(String patternFillOrType23, String color11, Double thickness5, Double size5) {
        this.patternFillOrType23 = patternFillOrType23;
        this.color11 = color11;
        this.thickness5 = thickness5;
        this.size5 = size5;

        js.append(String.format(Locale.US, "chart.negativeHatchFill(%s, %s, %f, %f);", patternFillOrType23, color11, thickness5, size5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeHatchFill(%s, %s, %f, %f);", patternFillOrType23, color11, thickness5, size5));
            js.setLength(0);
        }
    }

    private LabelsfactoryLabel getNegativeLabels;

    public LabelsfactoryLabel getNegativeLabels() {
        if (getNegativeLabels == null)
            getNegativeLabels = new LabelsfactoryLabel("chart.negativeLabels()");

        return getNegativeLabels;
    }

    private String negativeLabels;
    private Boolean negativeLabels1;

    public void setNegativelabels(String negativeLabels) {
        this.negativeLabels = negativeLabels;

        js.append(String.format(Locale.US, "chart.negativeLabels(%s);", negativeLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeLabels(%s);", negativeLabels));
            js.setLength(0);
        }
    }


    public void setNegativelabels(Boolean negativeLabels1) {
        this.negativeLabels1 = negativeLabels1;

        js.append(String.format(Locale.US, "chart.negativeLabels(%b);", negativeLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeLabels(%b);", negativeLabels1));
            js.setLength(0);
        }
    }

    private UiMarkersfactoryMarker getNegativeMarkers;

    public UiMarkersfactoryMarker getNegativeMarkers() {
        if (getNegativeMarkers == null)
            getNegativeMarkers = new UiMarkersfactoryMarker("chart.negativeMarkers()");

        return getNegativeMarkers;
    }

    private String negativeMarkers;
    private Boolean negativeMarkers1;

    public void setNegativemarkers(String negativeMarkers) {
        this.negativeMarkers = negativeMarkers;

        js.append(String.format(Locale.US, "chart.negativeMarkers(%s);", negativeMarkers));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeMarkers(%s);", negativeMarkers));
            js.setLength(0);
        }
    }


    public void setNegativemarkers(Boolean negativeMarkers1) {
        this.negativeMarkers1 = negativeMarkers1;

        js.append(String.format(Locale.US, "chart.negativeMarkers(%b);", negativeMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.negativeMarkers(%b);", negativeMarkers1));
            js.setLength(0);
        }
    }

    private UtilsPadding getPadding;

    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding("chart.padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;

    public void setPadding(Double[] padding) {
        this.padding = padding;

        js.append(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding)));
            js.setLength(0);
        }
    }


    public void setPadding(String[] padding1) {
        this.padding1 = padding1;

        js.append(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding1)));
            js.setLength(0);
        }
    }


    public void setPadding(String padding2) {
        this.padding2 = padding2;

        js.append(String.format(Locale.US, "chart.padding(%s);", padding2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s);", padding2));
            js.setLength(0);
        }
    }

    private String value8;
    private Double value9;
    private String value10;
    private Double value11;
    private String value12;
    private Double value13;
    private String value14;
    private Double value15;

    public void setPadding(String value8, String value10, String value12, String value14) {
        this.value8 = value8;
        this.value10 = value10;
        this.value12 = value12;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%s, %s, %s, %s);", value8, value10, value12, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %s, %s, %s);", value8, value10, value12, value14));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, String value10, String value12, Double value15) {
        this.value8 = value8;
        this.value10 = value10;
        this.value12 = value12;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%s, %s, %s, %f);", value8, value10, value12, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %s, %s, %f);", value8, value10, value12, value15));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, String value10, Double value13, String value14) {
        this.value8 = value8;
        this.value10 = value10;
        this.value13 = value13;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%s, %s, %f, %s);", value8, value10, value13, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %s, %f, %s);", value8, value10, value13, value14));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, String value10, Double value13, Double value15) {
        this.value8 = value8;
        this.value10 = value10;
        this.value13 = value13;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%s, %s, %f, %f);", value8, value10, value13, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %s, %f, %f);", value8, value10, value13, value15));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, Double value11, String value12, String value14) {
        this.value8 = value8;
        this.value11 = value11;
        this.value12 = value12;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%s, %f, %s, %s);", value8, value11, value12, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %f, %s, %s);", value8, value11, value12, value14));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, Double value11, String value12, Double value15) {
        this.value8 = value8;
        this.value11 = value11;
        this.value12 = value12;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%s, %f, %s, %f);", value8, value11, value12, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %f, %s, %f);", value8, value11, value12, value15));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, Double value11, Double value13, String value14) {
        this.value8 = value8;
        this.value11 = value11;
        this.value13 = value13;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%s, %f, %f, %s);", value8, value11, value13, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %f, %f, %s);", value8, value11, value13, value14));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, Double value11, Double value13, Double value15) {
        this.value8 = value8;
        this.value11 = value11;
        this.value13 = value13;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%s, %f, %f, %f);", value8, value11, value13, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %f, %f, %f);", value8, value11, value13, value15));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, String value10, String value12, String value14) {
        this.value9 = value9;
        this.value10 = value10;
        this.value12 = value12;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%f, %s, %s, %s);", value9, value10, value12, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %s, %s, %s);", value9, value10, value12, value14));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, String value10, String value12, Double value15) {
        this.value9 = value9;
        this.value10 = value10;
        this.value12 = value12;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%f, %s, %s, %f);", value9, value10, value12, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %s, %s, %f);", value9, value10, value12, value15));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, String value10, Double value13, String value14) {
        this.value9 = value9;
        this.value10 = value10;
        this.value13 = value13;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%f, %s, %f, %s);", value9, value10, value13, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %s, %f, %s);", value9, value10, value13, value14));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, String value10, Double value13, Double value15) {
        this.value9 = value9;
        this.value10 = value10;
        this.value13 = value13;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%f, %s, %f, %f);", value9, value10, value13, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %s, %f, %f);", value9, value10, value13, value15));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, Double value11, String value12, String value14) {
        this.value9 = value9;
        this.value11 = value11;
        this.value12 = value12;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%f, %f, %s, %s);", value9, value11, value12, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %f, %s, %s);", value9, value11, value12, value14));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, Double value11, String value12, Double value15) {
        this.value9 = value9;
        this.value11 = value11;
        this.value12 = value12;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%f, %f, %s, %f);", value9, value11, value12, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %f, %s, %f);", value9, value11, value12, value15));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, Double value11, Double value13, String value14) {
        this.value9 = value9;
        this.value11 = value11;
        this.value13 = value13;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%f, %f, %f, %s);", value9, value11, value13, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %f, %f, %s);", value9, value11, value13, value14));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, Double value11, Double value13, Double value15) {
        this.value9 = value9;
        this.value11 = value11;
        this.value13 = value13;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%f, %f, %f, %f);", value9, value11, value13, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %f, %f, %f);", value9, value11, value13, value15));
            js.setLength(0);
        }
    }

    private Double pointWidth;
    private String pointWidth1;

    public void setPointwidth(Double pointWidth) {
        this.pointWidth = pointWidth;

        js.append(String.format(Locale.US, "chart.pointWidth(%f);", pointWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.pointWidth(%f);", pointWidth));
            js.setLength(0);
        }
    }


    public void setPointwidth(String pointWidth1) {
        this.pointWidth1 = pointWidth1;

        js.append(String.format(Locale.US, "chart.pointWidth(%s);", pointWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.pointWidth(%s);", pointWidth1));
            js.setLength(0);
        }
    }

    private PaperSize paperSizeOrOptions;
    private String paperSizeOrOptions1;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        this.paperSizeOrOptions = paperSizeOrOptions;
        this.landscape = landscape;

        js.append(String.format(Locale.US, "chart.print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
            js.setLength(0);
        }
    }


    public void setPrint(String paperSizeOrOptions1, Boolean landscape) {
        this.paperSizeOrOptions1 = paperSizeOrOptions1;
        this.landscape = landscape;

        js.append(String.format(Locale.US, "chart.print(%s, %b);", paperSizeOrOptions1, landscape));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.print(%s, %b);", paperSizeOrOptions1, landscape));
            js.setLength(0);
        }
    }

    private CoreAxismarkersRange getRangeMarker;

    public CoreAxismarkersRange getRangeMarker() {
        if (getRangeMarker == null)
            getRangeMarker = new CoreAxismarkersRange("chart.rangeMarker()");

        return getRangeMarker;
    }

    private String rangeMarker;
    private Boolean rangeMarker1;

    public void setRangemarker(String rangeMarker) {
        this.rangeMarker = rangeMarker;

        js.append(String.format(Locale.US, "chart.rangeMarker(%s);", rangeMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%s);", rangeMarker));
            js.setLength(0);
        }
    }


    public void setRangemarker(Boolean rangeMarker1) {
        this.rangeMarker1 = rangeMarker1;

        js.append(String.format(Locale.US, "chart.rangeMarker(%b);", rangeMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%b);", rangeMarker1));
            js.setLength(0);
        }
    }

    private Double index3;
    private String rangeMarker2;
    private Boolean rangeMarker3;

    public void setRangemarker(String rangeMarker2, Double index3) {
        this.rangeMarker2 = rangeMarker2;
        this.index3 = index3;

        js.append(String.format(Locale.US, "chart.rangeMarker(%s, %f);", rangeMarker2, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%s, %f);", rangeMarker2, index3));
            js.setLength(0);
        }
    }


    public void setRangemarker(Boolean rangeMarker3, Double index3) {
        this.rangeMarker3 = rangeMarker3;
        this.index3 = index3;

        js.append(String.format(Locale.US, "chart.rangeMarker(%b, %f);", rangeMarker3, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%b, %f);", rangeMarker3, index3));
            js.setLength(0);
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type2 = type2;

        js.append(String.format(Locale.US, "chart.removeAllListeners(%s);", type2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeAllListeners(%s);", type2));
            js.setLength(0);
        }
    }

    private Double right;
    private String right1;

    public void setRight(Double right) {
        this.right = right;

        js.append(String.format(Locale.US, "chart.right(%f);", right));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.right(%f);", right));
            js.setLength(0);
        }
    }


    public void setRight(String right1) {
        this.right1 = right1;

        js.append(String.format(Locale.US, "chart.right(%s);", right1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.right(%s);", right1));
            js.setLength(0);
        }
    }

    private String chartDataExportMode;
    private ChartDataExportMode chartDataExportMode1;
    private String csvSettings2;
    private String filename;

    public void setSaveascsv(String chartDataExportMode, String csvSettings2, String filename) {
        this.chartDataExportMode = chartDataExportMode;
        this.csvSettings2 = csvSettings2;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings2, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings2, filename));
            js.setLength(0);
        }
    }


    public void setSaveascsv(ChartDataExportMode chartDataExportMode1, String csvSettings2, String filename) {
        this.chartDataExportMode1 = chartDataExportMode1;
        this.csvSettings2 = csvSettings2;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings2, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings2, filename));
            js.setLength(0);
        }
    }

    private Double width2;
    private String width3;
    private Double height4;
    private Double quality;
    private Boolean forceTransparentWhite;
    private String filename1;

    public void setSaveasjpg(Double width2, Double height4, Double quality, Boolean forceTransparentWhite, String filename1) {
        this.width2 = width2;
        this.height4 = height4;
        this.quality = quality;
        this.forceTransparentWhite = forceTransparentWhite;
        this.filename1 = filename1;

        js.append(String.format(Locale.US, "chart.saveAsJpg(%f, %f, %f, %b, %s);", width2, height4, quality, forceTransparentWhite, filename1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJpg(%f, %f, %f, %b, %s);", width2, height4, quality, forceTransparentWhite, filename1));
            js.setLength(0);
        }
    }


    public void setSaveasjpg(String width3, Double height4, Double quality, Boolean forceTransparentWhite, String filename1) {
        this.width3 = width3;
        this.height4 = height4;
        this.quality = quality;
        this.forceTransparentWhite = forceTransparentWhite;
        this.filename1 = filename1;

        js.append(String.format(Locale.US, "chart.saveAsJpg(%s, %f, %f, %b, %s);", width3, height4, quality, forceTransparentWhite, filename1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJpg(%s, %f, %f, %b, %s);", width3, height4, quality, forceTransparentWhite, filename1));
            js.setLength(0);
        }
    }

    private Boolean includeTheme;
    private String filename2;

    public void setSaveasjson(Boolean includeTheme, String filename2) {
        this.includeTheme = includeTheme;
        this.filename2 = filename2;

        js.append(String.format(Locale.US, "chart.saveAsJson(%b, %s);", includeTheme, filename2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJson(%b, %s);", includeTheme, filename2));
            js.setLength(0);
        }
    }

    private Double paperSizeOrWidthOrOptions;
    private String paperSizeOrWidthOrOptions1;
    private String paperSizeOrWidthOrOptions2;
    private Boolean landscape1;
    private Double x2;
    private Double y2;
    private String filename3;

    public void setSaveaspdf(Double paperSizeOrWidthOrOptions, Boolean landscape1, Double x2, Double y2, String filename3) {
        this.paperSizeOrWidthOrOptions = paperSizeOrWidthOrOptions;
        this.landscape1 = landscape1;
        this.x2 = x2;
        this.y2 = y2;
        this.filename3 = filename3;

        js.append(String.format(Locale.US, "chart.saveAsPdf(%f, %b, %f, %f, %s);", paperSizeOrWidthOrOptions, landscape1, x2, y2, filename3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPdf(%f, %b, %f, %f, %s);", paperSizeOrWidthOrOptions, landscape1, x2, y2, filename3));
            js.setLength(0);
        }
    }


    public void setSaveaspdf(String paperSizeOrWidthOrOptions1, Boolean landscape1, Double x2, Double y2, String filename3) {
        this.paperSizeOrWidthOrOptions1 = paperSizeOrWidthOrOptions1;
        this.landscape1 = landscape1;
        this.x2 = x2;
        this.y2 = y2;
        this.filename3 = filename3;

        js.append(String.format(Locale.US, "chart.saveAsPdf(%s, %b, %f, %f, %s);", paperSizeOrWidthOrOptions1, landscape1, x2, y2, filename3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPdf(%s, %b, %f, %f, %s);", paperSizeOrWidthOrOptions1, landscape1, x2, y2, filename3));
            js.setLength(0);
        }
    }

    private Double width4;
    private String width5;
    private Double height5;
    private Double quality1;
    private String filename4;

    public void setSaveaspng(Double width4, Double height5, Double quality1, String filename4) {
        this.width4 = width4;
        this.height5 = height5;
        this.quality1 = quality1;
        this.filename4 = filename4;

        js.append(String.format(Locale.US, "chart.saveAsPng(%f, %f, %f, %s);", width4, height5, quality1, filename4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPng(%f, %f, %f, %s);", width4, height5, quality1, filename4));
            js.setLength(0);
        }
    }


    public void setSaveaspng(String width5, Double height5, Double quality1, String filename4) {
        this.width5 = width5;
        this.height5 = height5;
        this.quality1 = quality1;
        this.filename4 = filename4;

        js.append(String.format(Locale.US, "chart.saveAsPng(%s, %f, %f, %s);", width5, height5, quality1, filename4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPng(%s, %f, %f, %s);", width5, height5, quality1, filename4));
            js.setLength(0);
        }
    }

    private String paperSize;
    private String paperSize1;
    private Boolean landscape2;
    private String filename5;

    public void setSaveassvg(String paperSize, Boolean landscape2, String filename5) {
        this.paperSize = paperSize;
        this.landscape2 = landscape2;
        this.filename5 = filename5;

        js.append(String.format(Locale.US, "chart.saveAsSvg(%s, %b, %s);", paperSize, landscape2, filename5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsSvg(%s, %b, %s);", paperSize, landscape2, filename5));
            js.setLength(0);
        }
    }

    private Double width6;
    private Double height6;

    public void setSaveassvg(Double width6, Double height6) {
        this.width6 = width6;
        this.height6 = height6;

        js.append(String.format(Locale.US, "chart.saveAsSvg(%f, %f);", width6, height6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsSvg(%f, %f);", width6, height6));
            js.setLength(0);
        }
    }

    private String chartDataExportMode2;
    private ChartDataExportMode chartDataExportMode3;
    private String filename6;

    public void setSaveasxlsx(String chartDataExportMode2, String filename6) {
        this.chartDataExportMode2 = chartDataExportMode2;
        this.filename6 = filename6;

        js.append(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", chartDataExportMode2, filename6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", chartDataExportMode2, filename6));
            js.setLength(0);
        }
    }


    public void setSaveasxlsx(ChartDataExportMode chartDataExportMode3, String filename6) {
        this.chartDataExportMode3 = chartDataExportMode3;
        this.filename6 = filename6;

        js.append(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null", filename6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null", filename6));
            js.setLength(0);
        }
    }

    private Boolean includeTheme1;
    private String filename7;

    public void setSaveasxml(Boolean includeTheme1, String filename7) {
        this.includeTheme1 = includeTheme1;
        this.filename7 = filename7;

        js.append(String.format(Locale.US, "chart.saveAsXml(%b, %s);", includeTheme1, filename7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXml(%b, %s);", includeTheme1, filename7));
            js.setLength(0);
        }
    }

    private Fill selectMarqueeFill;

    public void setSelectmarqueefill(Fill selectMarqueeFill) {
        this.selectMarqueeFill = selectMarqueeFill;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color12;
    private Double opacity18;

    public void setSelectmarqueefill(String color12, Double opacity18) {
        this.color12 = color12;
        this.opacity18 = opacity18;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color12, opacity18));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color12, opacity18));
            js.setLength(0);
        }
    }

    private GradientKey[] keys24;
    private String[] keys25;
    private Double angle6;
    private Boolean mode24;
    private VectorRect mode25;
    private String mode26;
    private Double opacity19;

    public void setSelectmarqueefill(GradientKey[] keys24, Boolean mode24, Double angle6, Double opacity19) {
        this.keys24 = keys24;
        this.mode24 = mode24;
        this.angle6 = angle6;
        this.opacity19 = opacity19;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys24), mode24, angle6, opacity19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys24), mode24, angle6, opacity19));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys24, VectorRect mode25, Double angle6, Double opacity19) {
        this.keys24 = keys24;
        this.mode25 = mode25;
        this.angle6 = angle6;
        this.opacity19 = opacity19;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys24), (mode25 != null) ? mode25.generateJs() : "null", angle6, opacity19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys24), (mode25 != null) ? mode25.generateJs() : "null", angle6, opacity19));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys24, String mode26, Double angle6, Double opacity19) {
        this.keys24 = keys24;
        this.mode26 = mode26;
        this.angle6 = angle6;
        this.opacity19 = opacity19;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys24), mode26, angle6, opacity19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys24), mode26, angle6, opacity19));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys25, Boolean mode24, Double angle6, Double opacity19) {
        this.keys25 = keys25;
        this.mode24 = mode24;
        this.angle6 = angle6;
        this.opacity19 = opacity19;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys25), mode24, angle6, opacity19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys25), mode24, angle6, opacity19));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys25, VectorRect mode25, Double angle6, Double opacity19) {
        this.keys25 = keys25;
        this.mode25 = mode25;
        this.angle6 = angle6;
        this.opacity19 = opacity19;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys25), (mode25 != null) ? mode25.generateJs() : "null", angle6, opacity19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys25), (mode25 != null) ? mode25.generateJs() : "null", angle6, opacity19));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys25, String mode26, Double angle6, Double opacity19) {
        this.keys25 = keys25;
        this.mode26 = mode26;
        this.angle6 = angle6;
        this.opacity19 = opacity19;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys25), mode26, angle6, opacity19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys25), mode26, angle6, opacity19));
            js.setLength(0);
        }
    }

    private GradientKey[] keys26;
    private String[] keys27;
    private Double cx6;
    private Double cy6;
    private GraphicsMathRect mode27;
    private Double opacity20;
    private Double fx6;
    private Double fy6;

    public void setSelectmarqueefill(GradientKey[] keys26, Double cx6, Double cy6, GraphicsMathRect mode27, Double opacity20, Double fx6, Double fy6) {
        this.keys26 = keys26;
        this.cx6 = cx6;
        this.cy6 = cy6;
        this.mode27 = mode27;
        this.opacity20 = opacity20;
        this.fx6 = fx6;
        this.fy6 = fy6;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys26), cx6, cy6, (mode27 != null) ? mode27.generateJs() : "null", opacity20, fx6, fy6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys26), cx6, cy6, (mode27 != null) ? mode27.generateJs() : "null", opacity20, fx6, fy6));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys27, Double cx6, Double cy6, GraphicsMathRect mode27, Double opacity20, Double fx6, Double fy6) {
        this.keys27 = keys27;
        this.cx6 = cx6;
        this.cy6 = cy6;
        this.mode27 = mode27;
        this.opacity20 = opacity20;
        this.fx6 = fx6;
        this.fy6 = fy6;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys27), cx6, cy6, (mode27 != null) ? mode27.generateJs() : "null", opacity20, fx6, fy6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys27), cx6, cy6, (mode27 != null) ? mode27.generateJs() : "null", opacity20, fx6, fy6));
            js.setLength(0);
        }
    }

    private Fill imageSettings6;
    private Stroke color13;
    private ColoredFill color14;
    private String color15;
    private Double thickness6;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setSelectmarqueestroke(Stroke color13, Double thickness6, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color13 = color13;
        this.thickness6 = thickness6;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color13 != null) ? color13.generateJs() : "null", thickness6, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color13 != null) ? color13.generateJs() : "null", thickness6, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(ColoredFill color14, Double thickness6, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color14 = color14;
        this.thickness6 = thickness6;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color14 != null) ? color14.generateJs() : "null", thickness6, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color14 != null) ? color14.generateJs() : "null", thickness6, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(String color15, Double thickness6, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color15 = color15;
        this.thickness6 = thickness6;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color15, thickness6, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color15, thickness6, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean repeat;

    public void setStartselectmarquee(Boolean repeat) {
        this.repeat = repeat;

        js.append(String.format(Locale.US, "chart.startSelectMarquee(%b);", repeat));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.startSelectMarquee(%b);", repeat));
            js.setLength(0);
        }
    }

    private Stroke color16;
    private ColoredFill color17;
    private String color18;
    private Double thickness7;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setStroke(Stroke color16, Double thickness7, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color16 = color16;
        this.thickness7 = thickness7;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (color16 != null) ? color16.generateJs() : "null", thickness7, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (color16 != null) ? color16.generateJs() : "null", thickness7, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStroke(ColoredFill color17, Double thickness7, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color17 = color17;
        this.thickness7 = thickness7;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (color17 != null) ? color17.generateJs() : "null", thickness7, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (color17 != null) ? color17.generateJs() : "null", thickness7, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStroke(String color18, Double thickness7, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color18 = color18;
        this.thickness7 = thickness7;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", color18, thickness7, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", color18, thickness7, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private CoreAxismarkersText getTextMarker;

    public CoreAxismarkersText getTextMarker() {
        if (getTextMarker == null)
            getTextMarker = new CoreAxismarkersText("chart.textMarker()");

        return getTextMarker;
    }

    private String textMarker;
    private Boolean textMarker1;

    public void setTextmarker(String textMarker) {
        this.textMarker = textMarker;

        js.append(String.format(Locale.US, "chart.textMarker(%s);", textMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%s);", textMarker));
            js.setLength(0);
        }
    }


    public void setTextmarker(Boolean textMarker1) {
        this.textMarker1 = textMarker1;

        js.append(String.format(Locale.US, "chart.textMarker(%b);", textMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%b);", textMarker1));
            js.setLength(0);
        }
    }

    private Double index4;
    private String textMarker2;
    private Boolean textMarker3;

    public void setTextmarker(String textMarker2, Double index4) {
        this.textMarker2 = textMarker2;
        this.index4 = index4;

        js.append(String.format(Locale.US, "chart.textMarker(%s, %f);", textMarker2, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%s, %f);", textMarker2, index4));
            js.setLength(0);
        }
    }


    public void setTextmarker(Boolean textMarker3, Double index4) {
        this.textMarker3 = textMarker3;
        this.index4 = index4;

        js.append(String.format(Locale.US, "chart.textMarker(%b, %f);", textMarker3, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%b, %f);", textMarker3, index4));
            js.setLength(0);
        }
    }

    private UiTitle getTitle;

    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle("chart.title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

    public void setTitle(Boolean title) {
        this.title = title;

        js.append(String.format(Locale.US, "chart.title(%b);", title));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.title(%b);", title));
            js.setLength(0);
        }
    }


    public void setTitle(String title1) {
        this.title1 = title1;

        js.append(String.format(Locale.US, "chart.title(%s);", title1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.title(%s);", title1));
            js.setLength(0);
        }
    }

    private String chartDataExportMode4;
    private ChartDataExportMode chartDataExportMode5;
    private String csvSettings3;

    public void setTocsv(String chartDataExportMode4, String csvSettings3) {
        this.chartDataExportMode4 = chartDataExportMode4;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings3));
            js.setLength(0);
        }
    }


    public void setTocsv(ChartDataExportMode chartDataExportMode5, String csvSettings3) {
        this.chartDataExportMode5 = chartDataExportMode5;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings3));
            js.setLength(0);
        }
    }

    private Boolean stringify;
    private Boolean includeTheme2;

    public void setTojson(Boolean stringify, Boolean includeTheme2) {
        this.stringify = stringify;
        this.includeTheme2 = includeTheme2;

        js.append(String.format(Locale.US, "chart.toJson(%b, %b);", stringify, includeTheme2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toJson(%b, %b);", stringify, includeTheme2));
            js.setLength(0);
        }
    }

    private String paperSize2;
    private String paperSize3;
    private Boolean landscape3;

    public void setTosvg(String paperSize2, Boolean landscape3) {
        this.paperSize2 = paperSize2;
        this.landscape3 = landscape3;

        js.append(String.format(Locale.US, "chart.toSvg(%s, %b);", paperSize2, landscape3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toSvg(%s, %b);", paperSize2, landscape3));
            js.setLength(0);
        }
    }

    private Double width7;
    private Double height7;

    public void setTosvg(Double width7, Double height7) {
        this.width7 = width7;
        this.height7 = height7;

        js.append(String.format(Locale.US, "chart.toSvg(%f, %f);", width7, height7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toSvg(%f, %f);", width7, height7));
            js.setLength(0);
        }
    }

    private Boolean asXmlNode;
    private Boolean includeTheme3;

    public void setToxml(Boolean asXmlNode, Boolean includeTheme3) {
        this.asXmlNode = asXmlNode;
        this.includeTheme3 = includeTheme3;

        js.append(String.format(Locale.US, "chart.toXml(%b, %b);", asXmlNode, includeTheme3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toXml(%b, %b);", asXmlNode, includeTheme3));
            js.setLength(0);
        }
    }

    private Tooltip getTooltip;

    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip("chart.tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;

        js.append(String.format(Locale.US, "chart.tooltip(%s);", tooltip));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.tooltip(%s);", tooltip));
            js.setLength(0);
        }
    }


    public void setTooltip(Boolean tooltip1) {
        this.tooltip1 = tooltip1;

        js.append(String.format(Locale.US, "chart.tooltip(%b);", tooltip1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.tooltip(%b);", tooltip1));
            js.setLength(0);
        }
    }

    private Double top;
    private String top1;

    public void setTop(Double top) {
        this.top = top;

        js.append(String.format(Locale.US, "chart.top(%f);", top));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.top(%f);", top));
            js.setLength(0);
        }
    }


    public void setTop(String top1) {
        this.top1 = top1;

        js.append(String.format(Locale.US, "chart.top(%s);", top1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.top(%s);", top1));
            js.setLength(0);
        }
    }

    private String type3;
    private SparklineSeriesType type4;

    public void setType(String type3) {
        this.type3 = type3;

        js.append(String.format(Locale.US, "chart.type(%s);", type3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.type(%s);", type3));
            js.setLength(0);
        }
    }


    public void setType(SparklineSeriesType type4) {
        this.type4 = type4;

        js.append(String.format(Locale.US, "chart.type(%s);", (type4 != null) ? type4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.type(%s);", (type4 != null) ? type4.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String type5;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type5, Boolean useCapture2, String listenerScope2) {
        this.type5 = type5;
        this.useCapture2 = useCapture2;
        this.listenerScope2 = listenerScope2;

        js.append(String.format(Locale.US, "chart.unlisten(%s, %b, %s);", type5, useCapture2, listenerScope2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unlisten(%s, %b, %s);", type5, useCapture2, listenerScope2));
            js.setLength(0);
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        this.key = key;

        js.append(String.format(Locale.US, "chart.unlistenByKey(%s);", key));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unlistenByKey(%s);", key));
            js.setLength(0);
        }
    }

    private Double width8;
    private String width9;

    public void setWidth(Double width8) {
        this.width8 = width8;

        js.append(String.format(Locale.US, "chart.width(%f);", width8));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.width(%f);", width8));
            js.setLength(0);
        }
    }


    public void setWidth(String width9) {
        this.width9 = width9;

        js.append(String.format(Locale.US, "chart.width(%s);", width9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.width(%s);", width9));
            js.setLength(0);
        }
    }

    private Ordinal getXScale;

    public Ordinal getXScale() {
        if (getXScale == null)
            getXScale = new Ordinal("chart.xScale()");

        return getXScale;
    }

    private ScaleTypes xScale;
    private ScalesBase xScale1;

    public void setXscale(ScaleTypes xScale) {
        this.xScale = xScale;

        js.append(String.format(Locale.US, "chart.xScale(%s);", (xScale != null) ? xScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScale(%s);", (xScale != null) ? xScale.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setXscale(ScalesBase xScale1) {
        this.xScale1 = xScale1;

        js.append(String.format(Locale.US, "chart.xScale(%s);", (xScale1 != null) ? xScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScale(%s);", (xScale1 != null) ? xScale1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private ScalesBase getYScale;

    public ScalesBase getYScale() {
        if (getYScale == null)
            getYScale = new ScalesBase("chart.yScale()");

        return getYScale;
    }

    private ScaleTypes yScale;
    private ScalesBase yScale1;

    public void setYscale(ScaleTypes yScale) {
        this.yScale = yScale;

        js.append(String.format(Locale.US, "chart.yScale(%s);", (yScale != null) ? yScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yScale(%s);", (yScale != null) ? yScale.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setYscale(ScalesBase yScale1) {
        this.yScale1 = yScale1;

        js.append(String.format(Locale.US, "chart.yScale(%s);", (yScale1 != null) ? yScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yScale(%s);", (yScale1 != null) ? yScale1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;

        js.append(String.format(Locale.US, "chart.zIndex(%f);", zIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zIndex(%f);", zIndex));
            js.setLength(0);
        }
    }

    private String generateJSgetAnimation() {
        if (getAnimation != null) {
            return getAnimation.generateJs();
        }
        return "";
    }

    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
        }
        return "";
    }

    private String generateJSgetBounds() {
        if (getBounds != null) {
            return getBounds.generateJs();
        }
        return "";
    }

    private String generateJSgetClip() {
        if (getClip != null) {
            return getClip.generateJs();
        }
        return "";
    }

    private String generateJSgetContainer() {
        if (getContainer != null) {
            return getContainer.generateJs();
        }
        return "";
    }

    private String generateJSgetContextMenu() {
        if (getContextMenu != null) {
            return getContextMenu.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetFirstHatchFill() {
        if (getFirstHatchFill != null) {
            return getFirstHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetFirstLabels() {
        if (getFirstLabels != null) {
            return getFirstLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetFirstMarkers() {
        if (getFirstMarkers != null) {
            return getFirstMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetLabel() {
        if (getLabel != null) {
            return getLabel.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLastHatchFill() {
        if (getLastHatchFill != null) {
            return getLastHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetLastLabels() {
        if (getLastLabels != null) {
            return getLastLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLastMarkers() {
        if (getLastMarkers != null) {
            return getLastMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetLineMarker() {
        if (getLineMarker != null) {
            return getLineMarker.generateJs();
        }
        return "";
    }

    private String generateJSgetMargin() {
        if (getMargin != null) {
            return getMargin.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetMaxHatchFill() {
        if (getMaxHatchFill != null) {
            return getMaxHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetMaxLabels() {
        if (getMaxLabels != null) {
            return getMaxLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMaxMarkers() {
        if (getMaxMarkers != null) {
            return getMaxMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetMinHatchFill() {
        if (getMinHatchFill != null) {
            return getMinHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetMinLabels() {
        if (getMinLabels != null) {
            return getMinLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMinMarkers() {
        if (getMinMarkers != null) {
            return getMinMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetNegativeHatchFill() {
        if (getNegativeHatchFill != null) {
            return getNegativeHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetNegativeLabels() {
        if (getNegativeLabels != null) {
            return getNegativeLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetNegativeMarkers() {
        if (getNegativeMarkers != null) {
            return getNegativeMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }

    private String generateJSgetRangeMarker() {
        if (getRangeMarker != null) {
            return getRangeMarker.generateJs();
        }
        return "";
    }

    private String generateJSgetTextMarker() {
        if (getTextMarker != null) {
            return getTextMarker.generateJs();
        }
        return "";
    }

    private String generateJSgetTitle() {
        if (getTitle != null) {
            return getTitle.generateJs();
        }
        return "";
    }

    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
        }
        return "";
    }

    private String generateJSgetXScale() {
        if (getXScale != null) {
            return getXScale.generateJs();
        }
        return "";
    }

    private String generateJSgetYScale() {
        if (getYScale != null) {
            return getYScale.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append(generateJSgetAnimation());
        js.append(generateJSgetBackground());
        js.append(generateJSgetBounds());
        js.append(generateJSgetClip());
        js.append(generateJSgetContainer());
        js.append(generateJSgetContextMenu());
        js.append(generateJSgetData());
        js.append(generateJSgetFirstHatchFill());
        js.append(generateJSgetFirstLabels());
        js.append(generateJSgetFirstMarkers());
        js.append(generateJSgetHatchFill());
        js.append(generateJSgetLabel());
        js.append(generateJSgetLabels());
        js.append(generateJSgetLastHatchFill());
        js.append(generateJSgetLastLabels());
        js.append(generateJSgetLastMarkers());
        js.append(generateJSgetLineMarker());
        js.append(generateJSgetMargin());
        js.append(generateJSgetMarkers());
        js.append(generateJSgetMaxHatchFill());
        js.append(generateJSgetMaxLabels());
        js.append(generateJSgetMaxMarkers());
        js.append(generateJSgetMinHatchFill());
        js.append(generateJSgetMinLabels());
        js.append(generateJSgetMinMarkers());
        js.append(generateJSgetNegativeHatchFill());
        js.append(generateJSgetNegativeLabels());
        js.append(generateJSgetNegativeMarkers());
        js.append(generateJSgetPadding());
        js.append(generateJSgetRangeMarker());
        js.append(generateJSgetTextMarker());
        js.append(generateJSgetTitle());
        js.append(generateJSgetTooltip());
        js.append(generateJSgetXScale());
        js.append(generateJSgetYScale());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}