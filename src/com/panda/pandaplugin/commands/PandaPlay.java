package com.panda.pandaplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PandaPlay implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 1){
            String message = strings[0];
            commandSender.sendMessage(message);
        }else {
            commandSender.sendMessage(ChatColor.RED + "你输入的指令有误！");
        }
        return false;
    }
}
