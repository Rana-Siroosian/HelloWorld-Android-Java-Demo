package com.example.learnjava;

/**
 * @author >>RanaSiroosian<<
 */

public class Demo {

    public static void main(String[] args) {

        Player rana = new Player();
        System.out.println(rana.getHandleName());
        rana.setNameAndLevel("Parisa", 10);
        System.out.println(rana.getHandleName());
        System.out.println(rana.getWeapon().getName());

        Weapon myAxe = new Weapon("Goldshine Axe", 15, 50);
        rana.setWeapon(myAxe);
//        System.out.println(rana.getWeapon().getName());
        Weapon ranasWeapon = rana.getWeapon();
        System.out.println(ranasWeapon.getName().toUpperCase());
//        Player sam = new Player("Sam");
//        System.out.println(sam.getHandleName());
//        sam.setLives(5);
//        System.out.println("leve: " + sam.getLevel());
//        System.out.println("lives: "+ sam.getLives());
//
//        Player mike = new Player("mike",9);
//        System.out.println(mike.getHandleName() + " level is " + mike.getLevel());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        rana.pickUpLoot(redPotion);
        rana.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOR, 80));
        rana.pickUpLoot(new Loot("Ring of Protection +2", LootType.RING, 40));
        rana.pickUpLoot(new Loot("invisibility Potion", LootType.POTION, 35));
        rana.showInventory();

//        Loot bluePotion = new Loot("Blue Potion", LootType.POTION,6);
        boolean wasDeleted = rana.dropLoot(redPotion);
        System.out.println(wasDeleted);
        rana.showInventory();
//        ********************************************************************
        Enemy enemy = new Enemy("test enemy", 10, 3);
        enemy.showInfo();

        enemy.takeDamage(3);
        enemy.showInfo();

        enemy.takeDamage(11);
        enemy.showInfo();
        //        ********************************************************************
        Troll uglyTroll = new Troll("Ugly Troll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);


    }
}
