package com.company.school;

public class Classroom {

     private int howManyRoom;
     String location;
     private String classSpace;
     String favouriteRoom;
     private int fanCapacity;
     private int lightCapacity;
     private int howManyBenches;

     public Classroom(String location, int howManyRoom, String favouriteRoom){
          this.location = location;
          this.howManyRoom = howManyRoom;
          this.favouriteRoom = favouriteRoom;
     }

     public int getFanCapacity() {
          return this.fanCapacity;
     }

     public int getHowManyRoom(){
          return this.howManyRoom;
     }

     public int getHowManyBenches(){
          return this.howManyBenches;
     }

     public int getLightCapacity(){
          return this.lightCapacity;
     }

     public void setLightCapacity(int capacity){

          this.lightCapacity= capacity;
     }
}
