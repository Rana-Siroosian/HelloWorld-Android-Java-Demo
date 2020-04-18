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

        Vampire vlad = new Vampire("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();

        for (int i = 0; i < 10; i++) {
            VampireKing dracula = new VampireKing("Dracula");
            dracula.showInfo();
//        dracula.takeDamage(12);
//        dracula.showInfo();
            dracula.setLives(0);
//            while (dracula.getLives() > 0) {
            do{
                if (dracula.dodges()) {
                    dracula.setLives((dracula.getLives()+1));
                    continue;
                }
                if (dracula.runAway()) {
                    System.out.println("Dracula ran away!");
                    break;
                } else {
                    dracula.takeDamage(80);
                    dracula.showInfo();
                }
            } while (dracula.getLives() > 0);

            System.out.println("********************************");
        }

        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 183));
        conan.pickUpLoot(new Loot("Ring of speed", LootType.RING, 25));
        conan.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
//        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));
        conan.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        conan.pickUpLoot(new Loot("Chain Mail", LootType.ARMOR, 4));
        conan.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        conan.pickUpLoot(new Loot("Health Potion", LootType.POTION, 3));
        conan.pickUpLoot(new Loot("Silver Ring", LootType.RING, 6));
        conan.showInventory();

        System.out.println(conan.score());
        //        ********************************************************************
        conan.dropLoot("Cursed Shield");
        System.out.println(conan.score());

    }

}
