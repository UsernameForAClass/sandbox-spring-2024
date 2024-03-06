package org.example.sandbox.fluentapi;

public class Widget {

    private double length;
    private double width;
    private double height;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Widget{");
        sb.append("length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    public static WidgetBuilder aWidget() {
        return new WidgetBuilder();
    }

    public static final class WidgetBuilder {


       private final Widget widget;

        private WidgetBuilder() {
            widget = new Widget();
        }

        public WidgetBuilder withLength(double length) {
            this.widget.length = length;
            return this;
        }

        public WidgetBuilder withWidth(double width) {
            this.widget.width = width;
            return this;
        }

        public WidgetBuilder withHeight(double height) {
            this.widget.height = height;
            return this;
        }

        public Widget build() {
            return widget;
        }
    }
}
