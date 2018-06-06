public class Comments {
    /** Firstly, I am aware I have used comments but the intend use for this repo is to be for reference not as a running program
     * 1. Don’t comment bad code, rewrite it! Comments are often used to compensate for bad code.
     * It is better to articulate what the program should do with good code as opposed to using comments
     * 2. Legal comments are ok. Comments which show things like licenses, copyright and authors.
     * 3. Warning comments are ok. Could the code cause problems if it is used? Should the reader refer to other code?
     * 4. To-do comments are ok
     * 5. Avoid comments for the sake of comments
     * **/

    // 1) In general, comments in a program should be kept to minimal and ideally have no comments in a program.
    // Consider the code block below. Rather than using comments to explain what the code does, it is better to convey
    // the intention through code

    // CHECK TO SEE IF EMPLOYEE CAN DRIVE THE COMPANY CAR
    if (employee.age>21 && hasPermission){
        driveCar();
    }

    if (isEmployeeAllowedToDrive(employee)){ // PREFERRED
        driveCar();
    }


    // 3) Comments to warn future developers of the consequences of using a function are perfectly okay

    public void tableToDeleteFromDatabase(){
        // IF YOU DO NOT PASS ANY ARGUMENTS, THE FUNCTION WILL DELETE ALL TABLES IN DATABASE!
    }


    // 5) Do not add comments unnecessarily. For example

    // The day of the month
    String currentMonth = "February";


}
