class ProductManager extends Employee {
    public String toString(){
        String productManager = super.Employee("Product Manager","Julia", 15, 10, 50000*2, 4);
        String manager = super.toString();
        String manage = super.motto();

        return productManager + manager + "Shares of Company Stock: " + 100*10 + "\n" +  manage + "There is nothing so useless as doing efficiently that which should not be done at all.\n";
        //TODO

    }
}