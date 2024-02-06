package org.example.facade;

import org.example.facade.entities.Mobile;

public class FacadeDemo {
    public static void main(String[] args) {
        MobileFacade facade = new MobileFacade();
        Mobile mobile = facade.on();
        System.out.println("----------");
        facade.off(mobile);
    }
}
