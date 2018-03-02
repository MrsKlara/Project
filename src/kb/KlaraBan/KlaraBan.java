package kb.KlaraBan;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.server.v1_8_R1.MinecraftServer;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class KlaraBan extends JavaPlugin
{
    static ConsoleCommandSender clog;
    static KlaraBan instance;
    static List<String> disableCommands = new ArrayList();
    static String message;

    public void onLoad()
    {
        clog.sendMessage("KlaraBan загружается...");
    }

    public void onEnable()
    {
        instance = this;
        Bukkit.getPluginManager().registerEvents((Listener) this, this);
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        disableCommands = getConfig().getStringList("commands");
        message = getConfig().getString("noperm").replace('&', '�');
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("klaraban")) {
            p.sendMessage(T.b("&4`KlaraBan, разработан &a`MrsKlara&4` для сервера &6`Wart&f`Craft"));
        }
        return false;
    }

    @EventHandler
    public void onPlayerCommandPreProcess(PlayerCommandPreprocessEvent e)
    {
        int i = 0;
        Player p = e.getPlayer();
        for (String a : disableCommands) {
            if (e.getMessage().equalsIgnoreCase("/" + a))
            {
                i++;
                if(i == 1) {
                    e.getPlayer().sendMessage(message + "&4`Предупреждение [" + i + "]");
                    e.setCancelled(true);
                }
                else if(i == 2) {
                    e.getPlayer().sendMessage(message + "&4`Предупреждение [" + i + "]");
                    e.setCancelled(true);
                }
                else if(i == 3) {
                    e.getPlayer().sendMessage(message + "&4`Предупреждение [" + i + "]");
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "ban " + p + " 7d Использовал запрещенные команды");
                    e.setCancelled(true);
                }
            }
        }
    }
}
