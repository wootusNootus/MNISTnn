public class App {
    public static void main(String[] args) throws Exception {

        List<Image> images = new DataReader.readData("data/mnist_test.csv");
        System.out.printf(images.get(0).toString());

    }
}
