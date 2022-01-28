package com.company;

public enum State {
    BASE("на базе"),
    ROUTE("в пути"),
    REPAIR("на ремонте");
  private String state1;
   State(String state1){
       this.state1 = state1;
   }
}
