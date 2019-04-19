package com.example.pierr.androidproject;

public class Healer extends Decorator implements Heal{
    Healer(Unity unity){
        super(unity);
        this.wrappee.setName(this.wrappee.getName()+" Healer");
    }
    @Override
    public void heal(Unity unity) {
        if(this.wrappee.isInAttackRange(unity)){
            unity.getHeal(this);
            this.wrappee.setHasAttacked(true);
        }
    }

    public void attackUnity(Unity unity){
        heal(unity);
    }
}
