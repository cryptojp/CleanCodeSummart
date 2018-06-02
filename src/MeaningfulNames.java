public class MeaningfulNames {
    public static void main(String[] args) {
        /***
         * 1. Use intention-revealing names. Names should describe what things are and what they do.
         * 2. Use pronounceable names and avoid using variable names which look very similar.
         * 3. Use Searchable names.
         * 4. Pick one word per concept. Avoid using the same word for two purposes eg calling a function get... then using
         * the word fetch...
         * 5. Avoid noise words such as table, the, a
         * 6. Boolean names should sound like true/false questions. Examples: isOpen, done, isActive, LoggedIn.
         * 7. Classes and objects should have noun or noun-phrase names, like Customer, WikiPage, Account and AddressParser
         * 8. Methods should have verb or verb-phrase names, like deletePage or save
         ***/

        // 1) Variables should reveal to a developer the use of a variable
        int d; // AVOID
        int numberOfDaysSincePay; // PREFERRED

        String accountList; // List gives the impression the data type is a collection and is unsuitable to be used as
        // a variable name in this scenario


        // 2) Avoid variable that vary very slightly from another as it can be very difficult to differentiate between
        // the variables for instance:
        String SuperDuperNameThatIsUsedToPredictWhetherItWillRainOnFriday;
        String SuperDuperNameThatIsUsedToPredictWhetherItWillSnowOnFriday;
        String SuperDuperNameThatIsUsedToPredictWhetherItWillFloodOnFriday;


        // 3)
        Object a = new Object();            // a search on the variable a would lead to multiple records making it
        a.start();                          // difficult to find where it is used
        Object musicPlayer = new Object();
        musicPlayer.start();

        // 5) Avoid 'noise' words
        int theAmountOfTimesAnEmployeeTakesALunchBreak; // Contains noise words
        int employeeLunchBreakInHours;  // No noise words, is compact and tells the programmer exactly what information
                                        // is stored in the variable

        // 6) 7) 8)
        class Player {
            public void kickBall(){
                // CODE
            }
            public boolean hasPlayerScored(){
                return false;
            }
        }



    }
}
