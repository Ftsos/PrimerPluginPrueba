package ftsos.primerpluginprueba.comandos;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;


import ftsos.primerpluginprueba.MiPlugin;

public class PrimerComando implements CommandExecutor{

	private MiPlugin plugin;
	
	public PrimerComando(MiPlugin plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		if (!(sender instanceof Player)) {
			Bukkit.getConsoleSender().sendMessage(plugin.nombre + ": No Puedes Renombrar a Un Team Si no eres Un jugador de ese team Tontito xDDDDD");
		return false;
		}else{
			Player jugador = (Player) sender;
			if (label.equalsIgnoreCase("renameteam")){
				if (args.length == 0) { //Sender only typed '/hello' and nothing else
				sender.sendMessage(ChatColor.BOLD + "Escribe Como quieres renombrar a tu team, este nombre no debe tener espacios");
				 return false;
				} else { 
					Scoreboard scoreboard = Bukkit.getServer().getScoreboardManager().getMainScoreboard();
					//Team.get
					
							//Team teams = scoreboard.getTeams();
							 for(Team team : Bukkit.getServer().getScoreboardManager().getMainScoreboard().getTeams()) {
					              if(team.hasEntry(sender.getName())) {   
					            	  
					            	  //team.getName();
					            	  if(team.getName() == "general") {
					            		  sender.sendMessage(ChatColor.BOLD + "" + ChatColor.AQUA + "UHC▶" + ChatColor.WHITE + " Todavia No tienes Team Debes esperar hasta las 2 Horas para que tengas un Team");
					            	  }else{
					            	  team.setPrefix(args[0]);
										
										sender.sendMessage(ChatColor.BOLD + "" + ChatColor.AQUA + "UHC▶" + ChatColor.WHITE + " El Equipo ha Sido Renombrado Correctamente a: " + args[0]);
					            	  }
					              } else {
					            	sender.sendMessage(ChatColor.BOLD + "" + ChatColor.AQUA + "UHC▶" + ChatColor.WHITE + " A Ocurrido un error ya que no formas parte de ningun equipo");  
					              }
					          }
							
				return true;
				}
				//return false;
				}
			return false;
		}
		//return false;
		
	}

}
