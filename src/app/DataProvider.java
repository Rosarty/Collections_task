package app;

import java.util.Arrays;
import java.util.List;

public class DataProvider {
    public List<User> getData() {
        return Arrays.asList(
                new User("Alex", "alex@gmail.com"),
                new User("Micha", "micha@gmail.com"),
                new User("Bill", "bill@gmail.com"),
                new User("Vadym", "vadym@gmail.com"),
                new User("Roman", "roman@gmail.com")

        );


    }
}
