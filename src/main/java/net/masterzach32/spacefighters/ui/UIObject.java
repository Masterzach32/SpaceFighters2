package net.masterzach32.spacefighters.ui;

import java.awt.*;

public abstract class UIObject {

    protected int x, y, width, height;
    protected boolean isSelected, isHovered, isEnabled;

    public UIObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        isSelected = false;
        isHovered = false;
        isEnabled = true;
    }

    public abstract void render(Graphics g);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
    
    public boolean isSelected() {
        return isSelected;
    }

    protected void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isHovered() {
        return isHovered;
    }

    protected void setHovered(boolean hovered) {
        isHovered = hovered;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        this.isEnabled = enabled;
    }
}
