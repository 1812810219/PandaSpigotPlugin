package com.panda.pandaplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PandaHeal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            if (commandSender.hasPermission("pandaplugin.commands.pandaheal")){
                Player player = (Player) commandSender;
                if (player.getHealth() < 20){
                    player.sendMessage(ChatColor.GREEN+"你已经被治疗！");
                    player.setHealth(20);
                }else {
                    player.sendMessage(ChatColor.GREEN+"你不需要治疗！");
                }
            }else {
                commandSender.sendMessage(ChatColor.RED + "你没有使用该指令的权限！");
                return false;
            }
        }else {
            commandSender.sendMessage("该指令只能由玩家执行！");
            return false;
        }
        return false;
    }
}
