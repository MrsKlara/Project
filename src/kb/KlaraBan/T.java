package kb.KlaraBan;

import org.bukkit.ChatColor;

public class T {
    private static String prefix = b("&b`[&d`Klara&a`Ban&b`]");

    public static String b(String text, boolean needPrefix) {
        String[]
                black = {"&0", "$black", "$b"},
                dblue = {"&1", "$dblue", "$db"},
                dgreen = {"&2", "$dgreen", "$dg"},
                daqua = {"&3", "$daqua", "$dq"},
                dred = {"&4", "$dred", "$dr"},
                dpurple = {"&5", "$dpurple", "$dp"},
                dyellow = {"&6", "$dyellow", "dy"},
                gray = {"&7", "$gray", "$a"},
                dgray = {"&8", "$dgray", "$da"},
                blue = {"&9", "$blue", "$b"},
                green = {"&a", "$green", "$g"},
                aqua = {"&b", "$aqua", "$q"},
                red = {"&c", "$red", "$r"},
                purple = {"&d", "$pink", "$p"},
                yellow = {"&e", "$yellow", "y"},
                white = {"&f", "$white", "$w"},

                magic = {"&k", "#magic", "#m"},
                bold = {"&l", "#bold", "#b"},
                line = {"&m", "#line", "#l"},
                under = {"&n", "#under", "#u"},
                italic = {"&o", "#italic", "#i"},
                reset = {"&r", "#reset", "#r"};


        for(String s : black)
            text = text.replace(s, ChatColor.BLACK.toString());
        for(String s : dblue)
            text = text.replace(s, ChatColor.DARK_BLUE.toString());
        for(String s : dgreen)
            text = text.replace(s, ChatColor.DARK_GREEN.toString());
        for(String s : daqua)
            text = text.replace(s, ChatColor.DARK_AQUA.toString());
        for(String s : dred)
            text = text.replace(s, ChatColor.DARK_RED.toString());
        for(String s : dpurple)
            text = text.replace(s, ChatColor.DARK_PURPLE.toString());
        for(String s : dyellow)
            text = text.replace(s, ChatColor.GOLD.toString());
        for(String s : gray)
            text = text.replace(s, ChatColor.GRAY.toString());
        for(String s : dgray)
            text = text.replace(s, ChatColor.DARK_GRAY.toString());
        for(String s : blue)
            text = text.replace(s, ChatColor.BLUE.toString());
        for(String s : green)
            text = text.replace(s, ChatColor.GREEN.toString());
        for(String s : aqua)
            text = text.replace(s, ChatColor.AQUA.toString());
        for(String s : red)
            text = text.replace(s, ChatColor.RED.toString());
        for(String s : purple)
            text = text.replace(s, ChatColor.LIGHT_PURPLE.toString());
        for(String s : yellow)
            text = text.replace(s, ChatColor.YELLOW.toString());
        for(String s : white)
            text = text.replace(s, ChatColor.WHITE.toString());


        for(String s : magic)
            text = text.replace(s, ChatColor.MAGIC.toString());
        for(String s : bold)
            text = text.replace(s, ChatColor.BOLD.toString());
        for(String s : line)
            text = text.replace(s, ChatColor.STRIKETHROUGH.toString());
        for(String s : under)
            text = text.replace(s, ChatColor.UNDERLINE.toString());
        for(String s : italic)
            text = text.replace(s, ChatColor.ITALIC.toString());
        for(String s : reset)
            text = text.replace(s, ChatColor.RESET.toString());


        if(needPrefix)
            return prefix + text.replace("`", "");
        return text.replace("`", "");
    }

    public static String b(String text) {
        return b(text, true);
    }
    public static String t(String text) {
        return b(text, false);
    }
}
