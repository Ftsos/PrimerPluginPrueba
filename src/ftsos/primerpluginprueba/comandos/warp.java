package ftsos.primerpluginprueba.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import ftsos.primerpluginprueba.MiPlugin;

public class warp implements CommandExecutor{
private MiPlugin plugin;
	
	public warp(MiPlugin plugin) {
		this.plugin = plugin;
	}
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if(!(sender instanceof Player)){
			Bukkit.getConsoleSender().sendMessage(ChatColor.BOLD + "" + ChatColor.GOLD + "No puedes viajar a este lugar si eres la consola");
			return false;
		}else {
			Player jugador = (Player) sender;
			if(args.length != 0) {
			if(args[0].equalsIgnoreCase("spawn")) {
				Location lugar = new Location(Bukkit.getWorld("world"), 234.5, 66.0, -245.5, 0 ,0);
				jugador.teleport(lugar);
			}else if(args[0].equalsIgnoreCase("minijuegos")){
				Location lugar = new Location(Bukkit.getWorld("minijuegos"), -44.5, 221.0, 31.5, -90 ,0);
				jugador.teleport(lugar);
			} else if(args[0].equalsIgnoreCase("bedwars")) {
				Location lugar = new Location(Bukkit.getWorld("minijuegos"), 285.5, 81.0, -38.5, -90 ,0);
				jugador.teleport(lugar);
			}
			return true;
			}else {
				sender.sendMessage(ChatColor.BOLD + "" + ChatColor.AQUA + "Los warps son spawn, bedwars, minijuegos");
				return false;
			}
		}
		
	}
	
}
