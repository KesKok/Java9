class Dominos
{
    int price;
    int quantity;
    static int total;

    static void bill()
    {
        System.out.println(total);
    }
    public static void main(String[] args)
    {

        Dominos pizza = new Dominos();
        pizza.price=100;
        pizza.quantity=2;
        total=pizza.price * pizza.quantity;
        pizza.bill();

        Dominos fires = new Dominos();  //Fries
        fires.price = 50;
        fires.quantity=1;
        total=fires.price * fires.quantity;
        fires.bill();

        
    }
}
