package com.example.pierr.androidproject;

public class Damage extends Decorator {
    Damage(Unity unity){
        super(unity);
        this.wrappee.setName(this.wrappee.getName()+" Damage");
        this.wrappee.setAttack(this.wrappee.getAttack()*2);
        this.wrappee.setHpMax(Math.round(this.wrappee.getHpMax()/2));
        this.wrappee.setHpCurrent(this.wrappee.getHpMax());
    }
}
