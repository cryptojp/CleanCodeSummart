public class Functions {
    /**
     * 1. Functions should do one thing. They should do it well. They should do it only.
     * 2. Functions should be small. Many short functions are better that fewer longer ones.
     * 3. You should be able to read code from top to bottom easily, without a lot of conditionals, cycles,
     * 4. Exception handling, that kind of things should be encapsulated in a function.
     * 5. Use descriptive names
     * 6. The fewer arguments passed to a function, the better. Avoid passing flag arguments and never pass/return null
     * 7. Don’t repeat yourself principle. Functions are reuse, not encapsulating repeated code.
     * **/

    // 4) Extract parts of try/catch blocks into functions
    public void deletePage(){
        try {
            deleteAllPageReferencesOnSite(page);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    // 5) Descriptive names of what the function should do
    public void loadInfo(){
        // LOGIC
    }

    public void getDataFromExternalApi(){ // PREFERRED
        // LOGIC
    }



    // 6) The more arguments, the more difficult it becomes to read the code
    public void insertIntoDatabase( boolean shouldNewsBeSaved, String title, String body, String author, String summary,
            String publication, int timestamp, int numberOfLikes){
        // LOGIC
    }

    public void insertIntoNewsDatabase(boolean shouldNewsArticleBeSaved, HashMap articleDetailsToSave){
        // LOGIC
    }
}
