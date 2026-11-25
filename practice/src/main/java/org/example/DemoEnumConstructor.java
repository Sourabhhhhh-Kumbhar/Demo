package org.example;

public class DemoEnumConstructor
{
    enum BurgerSize
    {
        SMALL(100),
        MEDIUM(200),
        LARGE(300);

        private int price;
        BurgerSize(int price)
        {
            this.price = price;
        }
        public int getPrice()
        {
            return price;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(BurgerSize.SMALL.getPrice());
    }
}
