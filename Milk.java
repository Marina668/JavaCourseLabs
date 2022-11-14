package mypack_t_8_1;

public class Milk extends Item{

    int fat;

    Milk(){
        this.type = "liquid";
    }

    Milk(float price, String name){
        super(price, name, "liquid");
    }

    public int getFat(){
        return fat;
    }

    public void setFat(int fat){
        this.fat = fat;
    }
}
