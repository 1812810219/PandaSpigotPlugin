package com.panda.pandaplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Panda implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player){
            Player player = ((Player) commandSender).getPlayer();
            String playerName = player.getName();
            player.sendMessage("欢迎"+playerName +"使用[Panda]插件");
            player.sendMessage("[Panda] /PandaPlay 测试输入");
            player.sendMessage("[Panda] /PandaKick 踢出玩家，可自定义踢出内容");
            player.sendMessage("[Panda] /PandaHeal 治疗自身");

        } else {
            System.out.println("[Error]该指令只能由玩家执行！");
        }
        return false;
    }
}
