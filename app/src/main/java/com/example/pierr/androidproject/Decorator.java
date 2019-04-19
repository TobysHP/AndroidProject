package com.example.pierr.androidproject;

public abstract class Decorator implements Decorable, Healable{
    protected Unity wrappee;
    public Decorator(Unity unity){
        this.wrappee=unity;
    }
    @Override
    public void getHeal(Heal heal){
        heal.heal(this.wrappee);
        if(this.wrappee.hpCurrent>=this.wrappee.hpMax){
            this.wrappee.hpCurrent=this.wrappee.hpMax;
        }
    }
    public Unity getWrappee(){
        return wrappee;
    }
}
