package me.modmuss50.optifabric.util;

import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class FileUtils {
    private final static Logger THE_LOGGER = LogManager.getLogger();

    /**
     * Fabric mods folder
     *
     * @return the path to the mod folder
     */
    public static File getModsFolder() {
        String fabricMods = System.getProperty("fabric.addMods");

        if (fabricMods != null) {
            return new File(fabricMods);
        }

        return new File(FabricLoader.getInstance().getGameDir().toFile(), "mods");
    }

    public static void print(String kind, String str) {
        print(kind + " > " + str);
    }

    public static void print(String str) {
        THE_LOGGER.info("OptiFabric | " + str);
    }

}
