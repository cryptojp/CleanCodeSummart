public class Functions {
    public static void main(String[] args) {
        /**
         * 1. Functions should do one thing. They should do it well. They should do it only.
         * 2. Functions should be small. Many short functions are better that fewer longer ones.
         * 3. You should be able to read code from top to bottom easily, without a lot of conditionals, cycles,
         * exception handling, that kind of things should be encapsulated in a function.
         * 4. Use descriptive names
         * 5. The fewer arguments passed to a function, the better. Avoid passing flag arguments and never pass/return null
         * 6. Don’t repeat yourself principle. Functions are reuse, not encapsulating repeated code.
         * **/

        // 4) Descriptive names of what the function should do
        public void load(){

        }

        public void getDataFromExternalApi(){ // PREFERRED

        }

        // 5) The more arguments, the more difficult it becomes to read the code
        public void insertIntoDatabase( boolean shouldNewsBeSaved, String title, String body, String author, String summary,
                String publication, int timestamp, int numberOfLikes){
            // LOGIC
        }

        public void insertIntoNewsDatabase(boolean shouldNewsArticleBeSaved, HashMap articleDetailsToSave){
            // LOGIC
        }

    }
}
