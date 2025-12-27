package enchantedprogress;

import org.bukkit.plugin.java.JavaPlugin;

public final class App extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("EnchantedProgress enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("EnchantedProgress disabled");
    }
}
