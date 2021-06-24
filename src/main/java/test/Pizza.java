package test;

import java.util.EnumSet;

/**
 * @Author: panyusheng
 * @Date: 2021/6/23
 * @Version 1.0
 */
public class Pizza {

    private PizzaStatus status;

    private static EnumSet<PizzaStatus> undeliveredPizzaStatuses =
            EnumSet.of(PizzaStatus.ORDERED, PizzaStatus.READY);

    public enum PizzaStatus {
        ORDERED(5) {
            @Override
            public boolean isOrdered() {
                return true;
            }
        },
        READY(1),
        DELIVERED(3);

        PizzaStatus(int num) {

        }

        public boolean isOrdered() {
            return false;
        }
    }

    public boolean isDeliverable() {
        return getStatus() == PizzaStatus.READY;
    }

    public PizzaStatus getStatus() {
        return this.status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    public static void main(String[] args) {
        Pizza.PizzaStatus pizza = null;
//        System.out.println(pizza.equals(Pizza.PizzaStatus.DELIVERED));
//        System.out.println(pizza == Pizza.PizzaStatus.DELIVERED);
        pizza = PizzaStatus.ORDERED;
//        boolean ordered = pizza.isOrdered();
//        System.out.println(ordered);


    }

}
