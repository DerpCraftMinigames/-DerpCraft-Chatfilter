package me.kobini.derpcraft.chatfilter;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public final Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		logger.info("[DerpcraftChatFilter] has been enabled");
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new Filter(), this);
	}
	public void onDisable(){
	    logger.info("[DerpcraftChatFilter] has been disabled");
	}
	
}
