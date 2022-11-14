package mypack_t_8_1;

import static mypack_t_8_1.EnumProducts.*;

public class Payment<Client> {

    class Warehouse {

        public void get(Item it) {
            System.out.println("Get Item" + it);
        }

        public void find(Item it) {
            System.out.println("Find Item" + it);
        }

        public void sell(Item it) {
            System.out.println("Sell Item" + it);
        }
    }

    private Warehouse ware;
    private Client client;
    static float sum_money;

    public Payment(Client client) {
        this.client = client;
        ware = new Warehouse();
        sum_money = 0;
    }

    void setClient(Client c) {
        this.client = c;
    }

    Client getClient() {
        return client;
    }

    public Item order(EnumProducts prod, String name, float price) {
        Item item = client.order(prod, name, price);

        ware.find(item);
        ware.sell(item);

        sum_money += price;

        return item;
    }

    public static <Client> void main(String[] args) {
        Client cl = new Client();
        Payment p = new Payment(cl);

        Item v[] = new Item[4];
        v[0] = p.order(ALCOHOL, "Beer", 10);
        v[1] = p.order(ALCOHOL, "Wine", 100);
        v[2] = p.order(MEAL, "Chips", 50);
        v[3] = p.order(MILK, "Ferma", 45);

        for (Item x : v) {
            System.out.println("Sell " + x);
        }

        System.out.println("Payment: " + sum_money);
    }
}

