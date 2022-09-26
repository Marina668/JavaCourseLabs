/** Represents a T1_9 untitled1209.
 * <strong>The HTML header</strong>
 * @author Maryna Kostiuchenko
 * @version 1.0
 * @since 1.0
 */
public class T1_9 {
    /**
     * Username input from command line
     */
    private String username;

    public static void main(String args[]){
        T1_9 obj = new T1_9();
        if(args.length<1){
            System.out.println("Incorrect Input");
        } else {
            obj.username = args[0];
            System.out.println(obj.username);
        }
    }
}
