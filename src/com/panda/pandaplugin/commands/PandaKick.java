package com.panda.pandaplugin.commands;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;


public class PandaKick implements CommandExecutor {
    Plugin plugin = com.panda.pandaplugin.PandaPlugin.getPlugin(com.panda.pandaplugin.PandaPlugin.class);
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender.hasPermission("pandaplugin.commands.pandakick")){
            if (strings.length == 2){
                String message = strings[1];
                Player player = Bukkit.getServer().getPlayer(strings[0]);
                if (player == null){
                    commandSender.sendMessage(ChatColor.RED +"该玩家不存在！");
                    return false;
                }
                player.kickPlayer(message);
            }else if (strings.length == 1){
                Player player = Bukkit.getServer().getPlayer(strings[0]);
                if (player == null){
                    commandSender.sendMessage(ChatColor.RED +"该玩家不存在！");
                    return false;
                }
                player.kickPlayer(plugin.getConfig().getString("defaultkick"));
            }else {
                commandSender.sendMessage(ChatColor.RED +"您输入的指令不正确");
                commandSender.sendMessage(ChatColor.RED +"正确用法：/PandaKick <玩家名> [踢出内容]");
            }
        }else {
            commandSender.sendMessage(ChatColor.RED +"你没有执行该指令的权限");
        }
        return false;
    }
}
