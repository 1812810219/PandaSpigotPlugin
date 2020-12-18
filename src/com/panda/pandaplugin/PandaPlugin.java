package com.panda.pandaplugin;

import com.panda.pandaplugin.commands.*;
import com.panda.pandaplugin.events.PlayerChat;
import com.panda.pandaplugin.events.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class PandaPlugin extends JavaPlugin {

    //插件加载时执行
    @Override
    public void onEnable() {
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null){
            getConfig().options().copyDefaults();
            saveDefaultConfig();
            getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
            getServer().getPluginManager().registerEvents(new PlayerChat(), this);
            getCommand("Panda").setExecutor(new Panda());
            getCommand("PandaPlay").setExecutor(new PandaPlay());
            getCommand("PandaKick").setExecutor(new PandaKick());
            getCommand("PandaHeal").setExecutor(new PandaHeal());
            getCommand("PandaPing").setExecutor(new PandaPing());
            System.out.println("[Panda]插件已加载！");
            System.out.println("[Panda]插件作者:Panda");
            System.out.println("[Panda]作者QQ:1812810219");
        }else {
            //关掉服务器
            Bukkit.shutdown();
            throw new RuntimeException("无法找到PlaceholderAPI，插件无法正常运行！");
        }

    }
    //插件卸载时执行
    @Override
    public void onDisable() {
        System.out.println("[Panda]插件已卸载！");
    }
}
