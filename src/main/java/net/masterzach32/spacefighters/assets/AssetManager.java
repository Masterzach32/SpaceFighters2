package net.masterzach32.spacefighters.assets;

import java.awt.*;
import java.util.HashMap;

public class AssetManager {

    private static AssetManager instance;

    private HashMap<String, String> assets;

    private AssetManager() {

    }

    public Font getDefaultFont() {
        return null;
    }

    public static AssetManager getInstance() {
        return instance;
    }

    public class Asset {

    }
}
