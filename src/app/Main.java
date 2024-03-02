package app;

public class Main {
    public static void main(String[] args) {
        Outputer outputer = new Outputer();
        DataProvider provider = new DataProvider();
        outputer.getSingleUserOutput(provider.getData(), 4);
        outputer.getOutput(provider.getData());
    }
}
