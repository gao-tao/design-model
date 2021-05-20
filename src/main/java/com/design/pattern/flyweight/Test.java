package com.design.pattern.flyweight;

public class Test {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("北京南", "济南");
        ticket.showInfo("二等座");

        ITicket ticket1 = TicketFactory.queryTicket("北京南", "济南");
        ticket1.showInfo("二等座");
    }
}
