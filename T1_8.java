/** Represents a T1_8 untitled1209.
 * @author Maryna Kostiuchenko
 * @version 1.0
 * @since 1.0
 */

public class T1_8 {
    /**
     * Username input from command line
     */
    private String username;

    public static void main(String args[]){
        T1_8 obj = new T1_8();

        if(args.length < 1){
            System.out.println("Incorrect input");
        } else {
            obj.username = args[0];
            System.out.println(obj.username);
        }
    }
}
