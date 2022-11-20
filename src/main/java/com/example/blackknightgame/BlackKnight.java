package com.example.blackknightgame;

import java.util.Scanner;

public class BlackKnight {
    private static Integer arms = 2;
    private static Integer legs = 2;
    private static Integer head = 1;
    private static Boolean alive = true;
    private static String name;

    public static int numOfAliveKnights = 0;
    public static int numOfDeadKnights = 0;
    public static BlackKnight[] allKnights = new BlackKnight[10];




    public static void main(String[] args){
        System.out.println("Please enter the name of the BlackKnight");
        Scanner scan = new Scanner(System.in);
        String nameInput = scan.nextLine();
        BlackKnight knight = new BlackKnight(nameInput);
        allKnights[0] = knight;
        BlackKnight.numOfAliveKnights++;

        allKnights[0].strike();
        System.out.println(allKnights[0].toString());

    }

    public BlackKnight(String name){
        this.name = name;
        legs = 2;
        arms = 2;
        head = 1;
        alive = true;

    }


    public static String cutOffArm() {
        if (arms == 1) {
            arms--;
            return "You have no more arms! But legs are there!";
        } else if (arms == 2) {
            System.out.println(arms);
            arms--;
            System.out.println(arms);
            return "It's OK! One arm left! 2 legs left!";
        } else {
            System.out.println("There is no more arms, I'm cutting your first leg");
            return "There is no more arms, I'm cutting your first leg";
        }
    }



    public static String cutOffLeg(){
        if(legs == 2){
            legs--;
            return "Beware! 1 leg is left only!";
        } else if (legs == 1){
            legs--;
            return "You have no more arms and legs! Beware! Only head is there...";
        } else {
            return "There is no more arms and legs, I'm cutting your HEAD!";
        }
    }

    public static String cutOffHead(){
        if(head == 1){
            head--;
            alive = false;
            numOfDeadKnights++;
            numOfAliveKnights--;
            return "Say goodbye to your head! HA-HA!!!";
        } else {
            return "You have no more arms and legs! Beware! Only head is there...";
        }
    }

    public static String strike() {
        if (alive) {
            if(arms>0){
                return cutOffArm();
            }else if(legs>0){
                return cutOffLeg();
            }else{
                return cutOffHead();
            }
        } else {
            System.out.println("He is already dead...");
            return "He is already dead...";
        }
    }

    @Override
    public String toString(){
        return "BlackKnight { " +
                "\nname: " + name +
                "\narms: " + arms +
                "\nlegs: " + legs +
                "\nhead: " + head +
                "\nalive: " + alive + "}";
    }

    public String getName(){
        return this.name;
    }

    public Integer getLegs() {
        return legs;
    }

    public Integer getArms() {
        return arms;
    }

    public Integer getHead() {
        return head;
    }

    public void setArms(Integer arms) {
        this.arms = arms;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    // actions===> cutOffArm(), cutoffLeg(), cutOffHead(), strike()
}
