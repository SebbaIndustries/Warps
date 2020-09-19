package com.sebbaindustries.warps.commands.components;

import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

/**
 * @author sebba
 * @version 1.0
 */
public interface ICmd {

    void execute(@NotNull CommandSender sender, @NotNull String[] args);

}
