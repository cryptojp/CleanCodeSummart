import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


public class CleanCode {

    public static void main(String[] args) {
	    /*********** 1. USE MEANINGFUL NAMES ******************/

	    // Variables should reveal to a developer the use of a variable
        // Consider the example below. It is easier to tell understand the use of the variable
        // numberOfDaysSincePay compared to d
	    int d;
	    int numberOfDaysSincePay; // PREFERRED

	    // Useful to show what kind of information is stored in collections
        // employeeNamesInTheCompany gives the impression immediately that employee names will be stored in the list
	    List<String> l = new ArrayList<String>();
	    List<String> employeeNamesInTheCompany = new ArrayList<String>(); // PREFERRED

	    // Intention-revealing functions that return booleans are helpful in determining
        // what a block of code should do. for instance
        int month = 10;

        if (month == 2){
            purchaseGift();
        } /**NEEEEEEEED EXAMPLE**/

        // is much more difficult to follow than

        if (isBirthdayInFebruary()) {

        }

        // Avoid names which are misleading
        String accountList; // List gives the impression the data type is a collection and is unsuitable to be used as
                            // a variable name in this scenario

        // Avoid variable that vary very slightly from another as it can be very difficult to differentiate between
        // the variables
        String SuperDuperNameThatIsUsedToPredictWhetherItWillRainOnFriday;
        String SuperDuperNameThatIsUsedToPredictWhetherItWillSnowOnFriday;
        String SuperDuperNameThatIsUsedToPredictWhetherItWillFloodOnFriday;

        // Avoid noise words such as table, the, a
        int theAmountOfTimesAnEmployeeTakesALunchBreak; // Contains noise words
        int employeeLunchBreakInHours;  // No noise words, is compact and tells the programmer exactly what information
                                        // is stored in the variable

        // Use Searchable names (names which can be Ctrl+F easily!)
        Object a = new Object();            // a search on the variable a would lead to multiple records making it
        a.start();                          // difficult to find where it is used
        Object musicPlayer = new Object();
        musicPlayer.start();

        // Classes and object names should be a noun and not a verb, whereas a method SHOULD be a verb
        class Player {
            public void kickBall(){
                // CODE
            }
        }

        // Be consistent with word concepts. In this example, the words 'get' and 'fetch' are used to describe a similar
        // time of functionality. It's important to be consistent with the naming conventions of variables and methods
        class Car {
            int topSpeed = 100;
            double engineSize = 1.8;

            public int getTopSpeed(){
                return topSpeed;
            };

            public double fetchEngineSize(){
                return engineSize;
            };
        }

        /*********** 2. FUNCTIONS ***********/
        // Keep functions small and should do one thing really well. Long functions which do multiple different things
        // should be avoided with one level of abstraction
        public void saveNewsArticlesToDatabase(){

        }

        // Used descriptive names just as with explained above
        public void load(){

        }

        public void getDataFromExternalApi(){ // PREFERRED

        }

        // Reduce the number of arguments passed to a function as much as possible. The more arguments, the more difficult
        // it becomes to read the code
        public void insertIntoDatabase( boolean shouldNewsBeSaved, String title, String body, String author, String summary,
                                        String publication, int timestamp, ){

        }

        public void insertIntoNewsDatabase(boolean shouldNewsArticleBeSaved, HashMap articleDetailsToSave){

        }

        // Extract parts of try/catch blocks into functions
        public void deletePage(){
            try {
                deleteAllPageReferencesOnSite(page);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        // DO. NOT. REPEAT. YOURSELF.!!!!!


        /*** 3. COMMENTS ***/
        // I am aware I have used comments but the intend use for this repo is to be for reference not as a running program
        // In general, comments in a program should be kept to minimal and ideally have no comments in a program
        // It is better to articulate what the program should do with good code as opposed to using comments


        // CHECK TO SEE IF EMPLOYEE CAN DRIVE THE COMPANY CAR
        if (employee.age>21 && hasPermission){
            driveCar();
        }

        if (isEmployeeAllowedToDrive(employee)){ // PREFERRED
            driveCar();
        }

        // However, comments can be useful in SOME cases such as : warning of consequence of an action, leave "to-do"
        // comments in the code or to demonstrate the importance of something

        // Avoid comments for the sake of comments. For example:
        // The day of the month
        String currentMonth = "February"; // REALLY???


        // Avoid commenting out functions as it can be misleading for future developers to know if commented out code
        // is significant




    }
}
