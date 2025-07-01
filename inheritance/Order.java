package inheritance;

class Order {
    String orderId, orderDate;

    public Order(String id, String date) {
        orderId = id;
        orderDate = date;
    }

    public String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String id, String date, String trackingNumber) {
        super(id, date);
        this.trackingNumber = trackingNumber;
    }

    public String getOrderStatus() {
        return "Order shipped, Tracking #: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(String id, String date, String tracking, String deliveryDate) {
        super(id, date, tracking);
        this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}
