package net.masterzach32.spacefighters.ui;

import net.masterzach32.spacefighters.assets.AssetManager;

import java.awt.*;

public class Label extends UIObject {

    private String text;
    private int size;
    private Font font;
    private Color outline, fill;

    public Label(int x, int y, int width, int height, String text, int size) {
        super(x, y, width, height);
        this.text = text;
        this.size = size;
        this.font = AssetManager.getInstance().getDefaultFont();
        this.outline = Color.BLACK;
        this.fill = Color.BLACK;
    }

    public Label(int x, int y, int width, int height, String text, int size, Font font) {
        super(x, y, width, height);
        this.text = text;
        this.size = size;
        this.font = font;
        this.outline = Color.BLACK;
        this.fill = Color.BLACK;
    }

    public Label(int x, int y, int width, int height, String text, int size, Color outline, Color fill) {
        super(x, y, width, height);
        this.text = text;
        this.size = size;
        this.font = AssetManager.getInstance().getDefaultFont();
        this.outline = outline;
        this.fill = fill;
    }

    public Label(int x, int y, int width, int height, String text, int size, Font font, Color outline, Color fill) {
        super(x, y, width, height);
        this.text = text;
        this.size = size;
        this.font = font;
        this.outline = outline;
        this.fill = fill;
    }

    public void render(Graphics g) {

    }
}
