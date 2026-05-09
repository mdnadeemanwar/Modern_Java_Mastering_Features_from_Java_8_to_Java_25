////package java17RecordClasses;
////
////import org.testng.annotations.Test;
////
////import java.math.BigDecimal;
////
////import static org.testng.Assert.assertThrows;
////import static org.testng.AssertJUnit.assertEquals;
////
////public class ProductTest {
////
////    @Test
////    public void createProduct() {
////        var product = new Product("iphone", new BigDecimal("999.99"), "Electronics");
////        assertEquals("iphone", product.name());
////        assertEquals("Electronics", product.type());
////        System.out.println(product.toString());
////    }
////
////    @Test
////    public void createProductNameNotValid() {
////        var exception = assertThrows(IllegalArgumentException.class, () ->
////                new Product("", new BigDecimal("999.99"), "Electronics"));
////        assertEquals("name is not valid", exception.getMessage("name is not valid here"));
////    }
////    @Test
////    public void createProductCostNotValid() {
////        var exception = assertThrows(IllegalArgumentException.class, () ->
////                new Product("iphone", new BigDecimal("-999.99"), "Electronics"));
////        assertEquals("name is not valid", exception.getMessage("cost is not valid here"));
////    }
////
////    }
////}
//
//
//package org.learnjava.java17RecordClasses;
//
//import org.testng.annotations.Test;
//
//import java.math.BigDecimal;
//
//import static org.testng.Assert.assertThrows;
//import static org.testng.AssertJUnit.assertEquals;
//
//public class ProductTest {
//
//    @Test
//    public void createProduct() {
//        var product =
//                new Product(
//                        "iphone",
//                        new BigDecimal("999.99"),
//                        "Electronics"
//                );
//        assertEquals("iphone", product.name());
//        assertEquals("Electronics", product.type());
//        System.out.println(product);
//    }
//
//    @Test
//    public void createProductNameNotValid() {
//        var exception =
//                assertThrows(
//                        IllegalArgumentException.class,
//                        () -> new Product(
//                                "",
//                                new BigDecimal("999.99"),
//                                "Electronics"
//                        )
//                );
//        assertEquals("Name is not valid", exception.getMessage());
//    }
//
//    @Test
//    public void createProductCostNotValid() {
//
//        var exception =
//                assertThrows(
//                        IllegalArgumentException.class,
//                        () -> new Product(
//                                "iphone",
//                                new BigDecimal("-999.99"),
//                                "Electronics"
//                        )
//                );
//
//        assertEquals(
//                "Cost should be greater than 0",
//                exception.getMessage()
//        );
//    }
//}

package org.learnjava.java17SealedClasses;

import org.learnjava.java17RecordClasses.Product;
import org.learnjava.java17SealedClassInterface.Bus;
import org.learnjava.java17SealedClassInterface.Car;
import org.learnjava.java17SealedClassInterface.Truck;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class VehicleTest {

    @Test
    public void vehicleTest() {
        var bus = new Bus();
        var truck = new Truck();
        assertInstanceOf(Bus.class, bus);
        assertInstanceOf(Truck.class, truck);


    }


    @Test
    public void driveTest() {
        var bus = new Bus();
        var truck = new Truck();
        var car = new Car();

        assertEquals ("BUS", bus.drive());
        assertEquals ("TRUCK", truck.drive());
        assertEquals ("CAR", car.drive());
    }

}