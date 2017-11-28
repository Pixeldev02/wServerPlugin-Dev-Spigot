package de.chrxssxdev.wserver.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§aDas Plugin §6Wirtschaftsserver §awurde aktiviert§7!");
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§cDas Plugin §6Wirtschaftsserver §cwurde deaktiviert§7!");

	}

}
