package app;

import java.util.List;

public class Outputer {
    static int count;

    public void getSingleUserOutput(List<User> users, int index) {
        String output = users.get(index).toString();
        System.out.println(output);
    }

    public void getOutput(List<User> users) {
        for (User user : users) {
            count++;
            System.out.println(count + ")" + " " + user);
        }
    }
}

