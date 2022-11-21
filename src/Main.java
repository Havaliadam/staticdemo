public class Main {

    public static void main(String[] args) {
	// write your code here,
        ProductManager manager=new ProductManager();
        Product product =new Product();
        product.price=10;
        product.name="";

        manager.add(product);
    }
}
