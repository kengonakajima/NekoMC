package town._2b2t.nekoMC;

import org.bukkit.plugin.java.JavaPlugin;

public final class NekoMC extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Hello World!!!!");


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Bye World!!!!");

    }
}
