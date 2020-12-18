package com.panda.pandaplugin.events;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class PlayerJoin implements Listener {
    Plugin plugin = com.panda.pandaplugin.PandaPlugin.getPlugin(com.panda.pandaplugin.PandaPlugin.class);
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent joinEvent){
        Player player = joinEvent.getPlayer();
        String msg = plugin.getConfig().getString("defaultjoin");
        msg = PlaceholderAPI.setPlaceholders(player, msg);
        joinEvent.setJoinMessage(msg);
    }
}
