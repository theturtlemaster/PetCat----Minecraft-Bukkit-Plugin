import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class PetCat extends JavaPlugin {
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments) {
		if (label.equalsIgnoreCase("petcat")) {
			if (sender instanceof Player) {
				Player me = (Player) sender;
				Location spot = me.getLocation();
				World world = me.getWorld();
				
				Ocelot cat = world.spawn(spot, Ocelot.class);
				cat.setOwner(me);
				cat.setAdult();
				me.sendMessage("You now have a pet cat!");
				return true;
			}
		}
		return false;
	}
}
