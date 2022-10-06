package ex030;

import view.Menu;
/*
 * TestMenuSelection.java
 *
 * Copyright(c) 2013-2015 Nihon Unisys, Ltd.
 * All rights reserved.
 */
public class TestMenuSelection {
    public static void main(String[] args) {
        int selected_menu = 9;

        selected_menu = Menu.getNo();

        System.out.println("選択されたメニュー番号は [" + selected_menu + "] です");
    }
}
