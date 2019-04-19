package com.example.pierr.androidproject;

public abstract class Decorator implements Decorable{
    protected Unity wrappee;
    public Decorator(Unity decorable){
        this.wrappee=decorable;
    }
}
