package com.design.pattern.command.control;

import com.design.pattern.command.IAction;
import com.design.pattern.command.Player;

public class PauseAction implements IAction {

    private Player player;

    public PauseAction(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.pause();
    }
}
