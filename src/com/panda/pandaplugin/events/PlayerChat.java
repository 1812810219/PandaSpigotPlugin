package com.panda.pandaplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener {
    @EventHandler
    public void PlayerChat(AsyncPlayerChatEvent event){
        if (event.getMessage().contains("cnm")){
            String message = event.getMessage();
            event.setMessage("**********");
            Player player = event.getPlayer();
            String playerName = event.getPlayer().getName();
            player.sendMessage(ChatColor.RED + "请注意文明用语！！！");
            System.out.println(playerName+"尝试发送"+message);
        }
        if (event.getMessage().contains("sb")){
            String message = event.getMessage();
            event.setMessage("**********");
            Player player = event.getPlayer();
            String playerName = event.getPlayer().getName();
            player.sendMessage(ChatColor.RED + "请注意文明用语！！！");
            System.out.println(playerName+"尝试发送"+message);
        }
        if (event.getMessage().contains("傻逼")){
            String message = event.getMessage();
            event.setMessage("**********");
            Player player = event.getPlayer();
            String playerName = event.getPlayer().getName();
            player.sendMessage(ChatColor.RED + "请注意文明用语！！！");
            System.out.println(playerName+"尝试发送"+message);
        }
        if (event.getMessage().contains("操你妈")){
            String message = event.getMessage();
            event.setMessage("**********");
            Player player = event.getPlayer();
            String playerName = event.getPlayer().getName();
            player.sendMessage(ChatColor.RED + "请注意文明用语！！！");
            System.out.println(playerName+"尝试发送"+message);
        }
    }
}
