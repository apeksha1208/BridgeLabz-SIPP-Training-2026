package Inheritance;

class Order {
    protected int orderId;
    protected String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId +
                ", Order Date: " + orderDate;
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    DeliveredOrder(int orderId, String orderDate,
                   String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Delivery Date: " + deliveryDate;
    }
}

class OrderMain {
    public static void main(String[] args) {
        Order order = new Order(101, "25-06-2026");
        ShippedOrder shippedOrder =new ShippedOrder(102, "24-06-2026", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "22-06-2026", "TRK67890", "25-06-2026");
        System.out.println(order);
        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder);
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder);
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
