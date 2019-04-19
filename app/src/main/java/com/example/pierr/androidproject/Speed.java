package com.example.pierr.androidproject;

public class Speed extends Decorator {
    Speed(Unity unity){
        super(unity);
        this.wrappee.setName(this.wrappee.getName()+" Speed");
        this.wrappee.setHpMax(Math.round(this.wrappee.getHpMax()/2));
        this.wrappee.setHpCurrent(this.wrappee.getHpMax());
        this.wrappee.setMaxMovements(this.wrappee.getMaxMovements()*2);
        this.wrappee.setAvailableMovements(this.wrappee.getMaxMovements());
    }
}
