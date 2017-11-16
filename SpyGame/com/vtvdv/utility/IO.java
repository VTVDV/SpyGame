package com.vtvdv.utility;

import com.vtvdv.actors.Agent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IO {

    public static void main(String[] args) throws IOException {
        File file = new File("agentNames.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        generateNames(file);
    }

    private static void generateNames(File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Dan,m");
        bufferedWriter.newLine();
        bufferedWriter.write("Pudge,m");
        bufferedWriter.newLine();
        bufferedWriter.write("Avery,m");
        bufferedWriter.newLine();
        bufferedWriter.write("Vesta,f");
        bufferedWriter.newLine();
        bufferedWriter.write("Lulu,f");
        bufferedWriter.newLine();
        bufferedWriter.write("Macy,f");
        bufferedWriter.newLine();
        bufferedWriter.write("Charlie,m");
        bufferedWriter.newLine();
        bufferedWriter.write("Charlie,f");
        bufferedWriter.newLine();
        bufferedWriter.write("Ronni,f");
        bufferedWriter.newLine();
        bufferedWriter.write("Bruce,m");
        bufferedWriter.newLine();
        bufferedWriter.close();
        fileWriter.close();
    }

    public static List<String> getNames(boolean maleNames) throws IOException {
        File file = new File("agentNames.txt");
        if(!file.exists()) {
            file.createNewFile();
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        List<String> names = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split(",");
            if(split.length >= 2) {
                String name = split[0];
                String gender = split[1];
                if(gender.equals("m") && maleNames) {
                    names.add(name);
                } else if (gender.equals("f") && !maleNames) {
                    names.add(name);
                }
            }
        }
        bufferedReader.close();
        fileReader.close();
        return names;
    }

    public static void saveAgents(List<Agent> agents) throws IOException {
        File file = new File("agents.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
             for(Agent a : agents) {
                 bufferedWriter.write(a.getName() + ","
                                        + a.getGender() + ","
                                        + a.getType() + ","
                                        + a.getAgencyName() + ","
                                        + a.getAttack() + ","
                                        + a.getDefence() + ","
                                        + a.getSpeed() + ","
                                        + a.getStealth() + ","
                                        + a.getMaxHealth() + ","
                                        + a.getHealth() + ",");
                 bufferedWriter.newLine();
             }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }


}
