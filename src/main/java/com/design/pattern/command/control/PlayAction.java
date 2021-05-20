package com.design.pattern.command.control;

import com.design.pattern.command.IAction;
import com.design.pattern.command.Player;

public class PlayAction implements IAction {

    private Player player;

    public PlayAction(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }
}
