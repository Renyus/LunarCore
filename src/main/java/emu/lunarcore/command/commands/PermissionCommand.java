package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.player.Player;

@Command(label = "permission", aliases = {"perm"}, permission = "server.permission")
public class PermissionCommand implements CommandHandler {

    @Override
    public void execute(Player sender, CommandArgs args) {
        // Check target
        if (args.getTarget() == null) {
            this.sendMessage(sender, "Error: Targeted player not found or offline");
            return;
        } else if (args.size() < 2) {
            this.sendMessage(sender, "Error: Not enough arguments");
            return;
        }
        
        String type = args.get(0).toLowerCase();
        String permission = args.get(1).toLowerCase();
        
        switch (type) {
            case "add" -> {
                // Add permission
                args.getTarget().getAccount().addPermission(permission);
                // Send message
                this.sendMessage(sender, "Added permission for " + args.getTarget().getName());
            }
            case "remove" -> {
                // Remove permission
                args.getTarget().getAccount().removePermission(permission);
                // Send message
                this.sendMessage(sender, "Removed permission for " + args.getTarget().getName());
            }
            case "clear" -> {
                // Clear permissions
                args.getTarget().getAccount().clearPermission();
                // Send message
                this.sendMessage(sender, "Cleared permissions for " + args.getTarget().getName());
            }
            default -> {
                this.sendMessage(sender, "Error: Invalid argument");
            }
        }
    }

}