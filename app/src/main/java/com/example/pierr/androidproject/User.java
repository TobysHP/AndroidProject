package com.example.pierr.androidproject;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private int nbrGamesWon;
    private int nbrGamesPlayed;
    private double ratioGameWon;
    private ArrayList<String> unitiesNames;//ce qu'on va charger avec la db
    private ArrayList<Healable> unities;
    User(int id, String name, int nbrGamesWon, int nbrGamesPlayed, ArrayList<String>unitiesNames){
        this.id=id;
        this.name=name;
        this.nbrGamesWon=nbrGamesWon;
        this.nbrGamesPlayed=nbrGamesPlayed;
        ratioGameWon=this.nbrGamesWon/this.nbrGamesPlayed*100;
        this.unitiesNames=unitiesNames;
        for(String unityName:this.unitiesNames){
            if(unityName.contains("Aircraft")){
                if(unityName.contains("Damage")){
                    this.unities.add(new Damage(new Aircraft()));
                }
                else if(unityName.contains("Speed")){
                    this.unities.add(new Speed(new Aircraft()));
                }
                else if(unityName.contains("Tank")){
                    this.unities.add(new Tank(new Aircraft()));
                }
                else{
                    this.unities.add(new Aircraft());
                }
            }
            else if(unityName.contains("Melee")){
                if(unityName.contains("Damage")){
                    this.unities.add(new Damage(new Melee()));
                }
                else if(unityName.contains("Speed")){
                    this.unities.add(new Speed(new Melee()));
                }
                else if(unityName.contains("Tank")){
                    this.unities.add(new Tank(new Melee()));
                }
                else{
                    this.unities.add(new Melee());
                }

            }
            else if(unityName.contains("Shooter")){
                if(unityName.contains("Damage")){
                    this.unities.add(new Damage(new Shooter()));
                }
                else if(unityName.contains("Speed")){
                    this.unities.add(new Speed(new Shooter()));
                }
                else if(unityName.contains("Tank")){
                    this.unities.add(new Tank(new Shooter()));
                }
                else{
                    this.unities.add(new Shooter());
                }
            }
            else if(unityName.contains("Base")){
                this.unities.add(new Base());
            }
            else{
                System.out.println("Problème critique !");
            }
        }
    }
}
