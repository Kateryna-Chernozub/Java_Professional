package com.javaProfessional.Lesson_10.main;


import com.javaProfessional.Lesson_10.task.task1.dto.Car;
import com.javaProfessional.Lesson_10.task.task1.dto.OrderId;

public class TaskFirstShallowCloning {
    public static void main(String[] args) {
        OrderId orderId = new OrderId(1);
        OrderId orderId1 = new OrderId(2);

        Car car = new Car("Suzuki", 2020, 15000, orderId);

        try {
            Car cloneCar = (Car) car.clone();

            System.out.println("Original car: " + car);
            System.out.println("Clone car:" + cloneCar);

            cloneCar.setModel("KIA");
            cloneCar.setOrderId(orderId1);

            System.out.println("\nAfter shallow cloning: ");
            System.out.println("Original car: " + car);
            System.out.println("Clone car:" + cloneCar);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
