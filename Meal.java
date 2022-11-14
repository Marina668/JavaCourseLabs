package mypack_t_8_1;

public class Meal extends Item{

    float calor;

    Meal(){
        super();
        this.type = "kg";
        this.calor = 0;
    }

    Meal(float price, String name){
        super(price, name, "kg");
    }

    public int getCalor(){
        return (int) calor;
    }

    public void setCalor(float calor){
        this.calor = calor;
    }
}
