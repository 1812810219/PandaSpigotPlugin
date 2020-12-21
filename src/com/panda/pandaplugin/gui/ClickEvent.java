package com.panda.pandaplugin.gui;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;

public class ClickEvent implements Listener {
    Plugin plugin = com.panda.pandaplugin.PandaPlugin.getPlugin(com.panda.pandaplugin.PandaPlugin.class);
    @EventHandler
    public void ClickGui(InventoryClickEvent clickEvent){
        if (clickEvent.getView().getTitle().equalsIgnoreCase(plugin.getConfig().getString("defaultgui"))){
            clickEvent.setCancelled(true);
        }

    }
}
