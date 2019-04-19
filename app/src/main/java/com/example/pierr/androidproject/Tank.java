package com.example.pierr.androidproject;

public class Tank extends Decorator {
    Tank(Unity unity){
        super(unity);
        this.wrappee.setName(this.wrappee.getName()+" Tank");
        this.wrappee.setHpMax(this.wrappee.getHpMax()*2);
        this.wrappee.setHpCurrent(this.wrappee.getHpMax());
        this.wrappee.setArmor(this.wrappee.getArmor()*2);
        this.wrappee.setAttack(Math.round(this.wrappee.getAttack()/2));
    }
}
