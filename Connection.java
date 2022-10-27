package mypack_t_1;

public class Connection {
    private final String message;

    public Connection(String s){
        this.message = s;
    }

    public void show(){
        System.out.println("Connection message: " + message);
    }
}
