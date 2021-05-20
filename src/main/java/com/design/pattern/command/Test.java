package com.design.pattern.command;

import com.design.pattern.command.control.PauseAction;
import com.design.pattern.command.control.PlayAction;
import com.design.pattern.command.control.SpeedAction;
import com.design.pattern.command.control.StopAction;

public class Test {

    public static void main(String[] args) {

        Player player = new Player();
        Controller controller = new Controller();

        controller.execute(new PlayAction(player));

        controller.addAction(new PauseAction(player));
        controller.addAction(new PlayAction(player));
        controller.addAction(new SpeedAction(player));
        controller.addAction(new StopAction(player));
        controller.executes();
    }
}
