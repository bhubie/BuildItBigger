package com.example;

import java.util.ArrayList;
import java.util.Random;

public class JokeTeller {
    public ArrayList<String> jokeList = new ArrayList<>();

    public JokeTeller(){
        jokeList.add("Chuck Norris uses ribbed condoms inside out, so he gets the pleasure.");
        jokeList.add("MacGyver can build an airplane out of gum and paper clips. Chuck Norris can " +
                "kill him and take it.");
        jokeList.add("Chuck Norris doesn't read books. He stares them down until he gets the " +
                "information he wants.");
        jokeList.add("If you ask Chuck Norris what time it is, " +
                "he always answers \"Two seconds till\". After you ask \"Two seconds to what?\", he " +
                "roundhouse kicks you in the face.");
        jokeList.add("Chuck Norris sheds his skin twice a year.");
        jokeList.add("When Chuck Norris goes to donate blood, he declines the syringe, and instead " +
                "requests a hand gun and a bucket.");
        jokeList.add("According to the Encyclopedia Brittanica, the Native American \"Trail of Tears\"" +
                " has been redefined as anywhere that Chuck Norris walks.");
    }

    public String randomJoke(){

        Random rand = new Random();
        int randomNum = rand.nextInt((jokeList.size()- 1) + 1);
        String joke = jokeList.get(randomNum);
        return joke;
    }
}
