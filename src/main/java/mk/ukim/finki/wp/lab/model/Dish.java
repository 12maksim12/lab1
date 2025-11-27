package mk.ukim.finki.wp.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {
    private static long counter = 6L;
    private long id;
    private String dishId;
    private String name;
    private String cuisine;
    private int preparationTime;

    public Dish(String dishId, String name, String cuisine, int preparationTime) {
        this.id = counter++;
        this.dishId = dishId;
        this.name = name;
        this.cuisine = cuisine;
        this.preparationTime = preparationTime;
    }

    public void setPreparation(int preparationTime) {
        this.preparationTime = preparationTime;
    }
}
