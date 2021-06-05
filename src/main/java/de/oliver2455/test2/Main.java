package de.oliver2455.test2;

import de.oliver2455.test2.commands.HealCommand;
import de.oliver2455.test2.commands.KillCommand;
import de.oliver2455.test2.listeners.JoinListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§3Hallo");
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "hallo");

        onInit(Bukkit.getPluginManager());




    }

    private void onInit(PluginManager manger) {
        manger.registerEvents(new JoinListener(), this);
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("mykill").setExecutor(new KillCommand());
    }

    @Override
    public void onDisable() {

    }
}

