package edu.rpg.weapon;
public class Claymore extends Weapon {
      private int power = 40;
      public Claymore() {
         super("クレイモア");
      }
      public int getPower() {
          return this.power;
      }
}