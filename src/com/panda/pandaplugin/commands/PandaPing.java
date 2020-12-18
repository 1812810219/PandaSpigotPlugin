package com.panda.pandaplugin.commands;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PandaPing implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            Player player = (Player)commandSender;
            String ping = "当前延迟 :%player_ping% ms";
            ping = PlaceholderAPI.setPlaceholders(player, ping);
            player.sendMessage(ping);
        } else {
            commandSender.sendMessage(ChatColor.RED +"该指令只能由玩家执行！");
        }
        return false;
    }
}
