package com.sebbaindustries.warps.commands.actions;

import com.sebbaindustries.warps.commands.components.CommandFactory;
import com.sebbaindustries.warps.commands.components.ICmd;
import com.sebbaindustries.warps.commands.components.ITab;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @author sebba
 * @version 1.0
 */
public class Warp extends CommandFactory implements ICmd, ITab {

    @Override
    public String command() {
        return "warp";
    }

    @Override
    public String permission() {
        return "warps.warp";
    }

    @Override
    public void execute(@NotNull CommandSender sender, @NotNull String[] args) {

    }

    @Override
    public List<String> complete(@NotNull CommandSender sender, @NotNull String[] args) {
        return null;
    }
}
