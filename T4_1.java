package mypack_t_1;

public class T4_1 {
    public static void main(String[] args){
        String[] messages = {"First message", "Second message", "Third message"};
        ConnectionManager cm = new ConnectionManager(messages);
        while(cm.existConnection()){
            ConnectionManager.getConnection().show();
        }
    }
}
