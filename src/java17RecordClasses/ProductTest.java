package java17RecordClasses;

import java.math.BigDecimal;

public class ProductTest {

    @Test
    void createProduct(){

        var product = new Product("iphone", new BigDecimal("999.99"),"Electronics");

        assertEquals("iphone",product.name());
        assertEquals("Electronics",product.type());

        System.out.println(product.toString());

    }
}
