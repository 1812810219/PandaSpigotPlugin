package com.panda.pandaplugin.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class Gui implements CommandExecutor {
    Plugin plugin = com.panda.pandaplugin.PandaPlugin.getPlugin(com.panda.pandaplugin.PandaPlugin.class);
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player)commandSender;
        Inventory gui = Bukkit.createInventory(null, 27, plugin.getConfig().getString("defaultgui")); //数字9的倍数  //标题

        ItemStack item = new ItemStack(Material.BED, 1);

        gui.setItem(14, item);
        player.openInventory(gui);
        return false;
    }
}
