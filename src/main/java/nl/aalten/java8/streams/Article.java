package nl.aalten.java8.streams;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Article {

    private long id;
    private String name;
    private Double price;
    private Type type;

    public Article(long id, String name, Double price, Type type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

}
