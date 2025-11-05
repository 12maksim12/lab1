package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Chef;
import mk.ukim.finki.wp.lab.model.Dish;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Chef> chefs = new ArrayList<>();
    public static List<Dish> dishes = new ArrayList<>();

    @PostConstruct
    public void init(){
        dishes.add(new Dish("d1", "Pasta Carbonara", "Italian", 25));
        dishes.add(new Dish("d2", "Sushi", "Japanese", 40));
        dishes.add(new Dish("d3", "Tacos", "Mexican", 20));
        dishes.add(new Dish("d4", "Moussaka", "Greek", 60));
        dishes.add(new Dish("d5", "Burger", "American", 15));

        chefs.add(new Chef(0L, "Gordon", "Ramsey", "Famous British chef known for his fiery personality", new ArrayList<>()));
        chefs.add(new Chef(1L, "Jamie", "Oliver", "A really calm chef.", new ArrayList<>()));
        chefs.add(new Chef(2L, "Marco", "Pierre White", "Youngest chef to ever be awarded three Michelin stars.", new ArrayList<>()));
        chefs.add(new Chef(3L, "Gino", "D'Acampo", "One of the best italian chefs and TV personality.", new ArrayList<>()));
        chefs.add(new Chef(4L, "Guy", "Fieri", "An American restaurateur, author and an Emmy Award winning television presenter.", new ArrayList<>()));
    }
}
