package com.company;

public class InfoMashina {
    private int id;
    private String name;
    private String driver;
    private State state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public static  InfoMashina mashina(int id,String name,String driver,State state){
        InfoMashina infoMashina = new InfoMashina();
        infoMashina.id = id;
        infoMashina.name = name;
        infoMashina.driver = driver;
        infoMashina.state = state;
        return infoMashina;
    }

}
