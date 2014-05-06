package me.kobini.derpcraft.chatfilter;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

@SuppressWarnings("deprecation")
public class Filter implements Listener {

	String derpbot = ChatColor.DARK_GREEN + "<===|- [DerpBot] ";
	String links = "dc.cf.links";
	String swearing = "dc.cf.swear";
	String caps = "dc.cf.caps";
	
	public String DerpBot(){
		return derpbot;
	}
	
	@EventHandler
	public void Links(PlayerChatEvent e){
		Player p = e.getPlayer();
		String name = p.getName();
		
		if (e.getMessage().toLowerCase().contains(".com")){
			if(!p.hasPermission(links)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " No links!");
			}
		}if (e.getMessage().toLowerCase().contains(".nl")){
			if(!p.hasPermission(links)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " No links!");
			}
		}if (e.getMessage().toLowerCase().contains(".be")){
			if(!p.hasPermission(links)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " No links!");
			}
		}if (e.getMessage().toLowerCase().contains("www.")){
			if(!p.hasPermission(links)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " No links!");
			}
		}if (e.getMessage().toLowerCase().contains("http://")){
			if(!p.hasPermission(links)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " No links!");
			}
		}if (e.getMessage().toLowerCase().contains("(dot)")){
			if(!p.hasPermission(links)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " No links!");
			}
		}if (e.getMessage().toLowerCase().contains("dot")){
			if(!p.hasPermission(links)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " No links!");
			}
		}if (e.getMessage().toLowerCase().contains("(.)")){
			if(!p.hasPermission(links)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " No links!");
			}
		}
	}
	@EventHandler
	public void Swearing(PlayerChatEvent e){
		Player p = e.getPlayer();
		String name = p.getName();
		
		if (e.getMessage().toLowerCase().contains("Fuck")){
			if(!p.hasPermission(swearing)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " Do not swear!");
			}else{
				e.setCancelled(true);
			}
		}if (e.getMessage().toLowerCase().contains("Fock")){
			if(!p.hasPermission(swearing)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " Do not swear!");
			}
		}if (e.getMessage().toLowerCase().contains("fu")){
			if(!p.hasPermission(swearing)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " Do not swear!");
			}else{
				e.setCancelled(true);
			}
		}if (e.getMessage().toLowerCase().contains("hoer")){
			if(!p.hasPermission(swearing)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " Do not swear!");
			}else{
				e.setCancelled(true);
			}
		}if (e.getMessage().toLowerCase().contains("bitch")){
			if(!p.hasPermission(swearing)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " Do not swear!");
			}else{
				e.setCancelled(true);
			}
		}if (e.getMessage().toLowerCase().contains("kanker")){
			if(!p.hasPermission(swearing)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " Do not swear!");
			}else{
				e.setCancelled(true);
			}
		}if (e.getMessage().toLowerCase().contains("kk")){
			if(!p.hasPermission(swearing)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " Do not swear!");
			}else{
				e.setCancelled(true);
			}
		}
	}
	public void Caps(PlayerChatEvent e){
		Player p = e.getPlayer();
		String name = p.getName();
		String m = e.getMessage();
		
		if (m.toUpperCase().equals(m)){
			if(!p.hasPermission(caps)){
				e.setCancelled(true);
				Bukkit.broadcastMessage(DerpBot() + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + name + " I don't like full caps!");
			}
		}
	}
}
