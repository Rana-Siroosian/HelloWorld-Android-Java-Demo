package com.example.learnjava;
/**
 *
 * @author >>RanaSiroosian<<
 */

import java.util.ArrayList;

public class Player {

    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;


    public Player(){
        this("Unknown player");

    }

    public Player(String handle){
        this(handle,1);

    }
    public String getHandleName(){
        return handleName;
    }

    public Player (String handle, int startingLevel){
//        this.handleName = handle;
//        this.lives = 3;
//        this.level = startingLevel;
//        this.score = 0;
        setHandleName(handle);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
        setDefaultWeapon();
        inventory = new ArrayList<>();

    }
    public void setHandleName(String handle){
        if(handle.length() < 3){
            System.out.println("The name " + handle + " is too short, must be 3 characters or more!");
            return;
        }
        this.handleName = handle;
    }

    private void setDefaultWeapon(){
        this.weapon = new Weapon("Sword",10,20);
    }
    public void setNameAndLevel(String name, int level){
//        this.handleName = name;
//        this.level = level;
        setHandleName(name);
        setLevel(level);
    }
    public int getLives() {
        return lives;
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }

    public void pickUpLoot(Loot newLoot){
        inventory.add(newLoot);
    }

    public boolean dropLoot(Loot loot){
        if(this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }
    public boolean dropLoot(String lootName){
        for (Loot currentLoot : inventory){
            if(currentLoot.getName().equals(lootName)){
                inventory.remove(currentLoot);
                return true;
            }
        }
        return false;
    }
    public void showInventory(){
        System.out.println("==============================");
        for (Loot item : inventory){
            System.out.println(item.getName());
        }
        System.out.println("==============================");
    }
    public int score(){
        int total = 0;
        //for loop below is a more efficient way to processing the ordinary Arrays
//        for (int i=0; i<inventory.size();i++){

        //for loop below is a more efficient way to processing the collection objects
        for (Loot currentLoot : inventory){
//            Loot currentLoot = inventory.get(i);
            System.out.println(currentLoot.getName() + " si worth " + currentLoot.getValue());
            total = total + currentLoot.getValue();
        }
        return total;
    }
}
