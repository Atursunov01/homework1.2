package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();

    public static void main(String[] args) {

        InfoMashina[] infoMashinas = {
                InfoMashina.mashina(1,"TESLA","AZAMAT",State.BASE),
                InfoMashina.mashina(2,"FORD","MURTAZA",State.REPAIR),
                InfoMashina.mashina(3,"TOYOTA","ALMAZBEK",State.ROUTE),

        };

        Driver[] drivers = {
                Driver.driver(1,"BEKZAT"),
                Driver.driver(2,"SAPAR"),
                Driver.driver(3,"JYRGAL"),
        };

        String driver = GSON.toJson(drivers);
        write(driver);
        System.out.println(driver);

        String mashina = GSON.toJson(infoMashinas);
        write(mashina);
        System.out.println(mashina);

    }

    private static void write(String obj){
        Path write = Paths.get("./mashina.json");
        try {
            Files.writeString(write,obj,StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE);
        }catch (IOException e){
            e.getMessage();
        }
    }
}

