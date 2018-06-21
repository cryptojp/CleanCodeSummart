public class Formatting {
    /***
     * 1. Formatting should indicate things of importance since it is a developer of communication form.
     * A messy code is hard to read.
     * 2. Ensure you correctly indent programs and refrain from collapsing short if and loops into one line
     * 3. Try to write a class with a maximum of 500 lines. Smaller files/classes are easier to understand
     * 4. Source code should feel like a newspaper as it is read from top to bottom.
     * 5. Group of lines together complete a thought. Separate thoughts with a blank line
     * 6. Use spaces between operators, parameters, and commas
     * 7. Horizontal alignment is rarely useful
     * 5. Functions that call each other or are related should be vertically close
     * 4. Follow team rules. IF EVERYONE IN THE TEAM USES FOUR SPACES INSTEAD OF TABS THEN ALSO FOLLOW THE PREFERRED
     * CONVENTION OF THE TEAM
     ***/

    // 2) Correctly indent programs and do not collapse if statements
    if(userIsLoggedIn()){System.out.println("Hello there");} // Not recommended

    class Bicycle{ // Poorly indented class, difficult to interpret
        int wheels;
          String name;
       boolean hasTreeWheels;
        }



    // 6) Use spaces between operators in functions and in if statements for readability
    boolean hasScoredAGoal = true;
    int goalsScoredThisSeason = 20;
    if (hasScoredAGoal == true && goalsScoredThisSeason > 30){
        givePlayerGoldenBoot();
    }



    // 7) Taking the time to horizontally align variable has little/ no value
    class Bitcoin implements Crypto{
        String          name            ;
        boolean         isMinable       ;
        float           priceUSD        ;
    }

    class Bitcoin implements Crypto{ // PREFERRED
        String name = "BTC";
        boolean isMinable = true;
        double priceUSD = 6670.4;
    }

}
