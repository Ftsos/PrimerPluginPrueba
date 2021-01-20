package ftsos.primerpluginprueba;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import ftsos.primerpluginprueba.comandos.PrimerComando;
import ftsos.primerpluginprueba.comandos.warp;

public class MiPlugin extends JavaPlugin{
	PluginDescriptionFile pdffile = getDescription();
	public String version = pdffile.getVersion();
	public String nombre = pdffile.getName();
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.BOLD + "" + ChatColor.RED + "Ha Sido Activado. Version: " + version);
		registrarComandos();
	}
	
	public void registrarComandos() {
		this.getCommand("renameteam").setExecutor(new PrimerComando(this));
		this.getCommand("warp").setExecutor(new warp(this));
	}
	
}
