package org.example.task2;

public class Order {

    public long id;
    public String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(id).append(" for customer ").append(customer);
        builder.append("\n------------------\n");

        double sum = 0.0;

        for (int i = 0; i < cart.index; i++) {

            sum += cart.contents[i].price;

            builder.append("Item id: ");
            builder.append(cart.contents[i].id);
            builder.append(" name: ");
            builder.append(cart.contents[i].name);
            builder.append(" price: ");
            builder.append(cart.contents[i].price);
            builder.append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ");
        builder.append(sum);


        return builder.toString();
    }
}
