package Assignment2.ControlCoupling;

@Control_Example(
        description = "Control Coupling occurs when the flow of execution of one class is decided by a variable" +
                "of another class. Here, ControlCoupling class is controlling the flow of CoinToss class."
)
public class ControlCoupling {

    public void main(String[] args) {
        CoinToss cointoss = new CoinToss();
        cointoss.tossACoin("head");
    }

    public class CoinToss{
        public void tossACoin(String coin)
        {
            if(coin.equals("head"))
                System.out.println("Heads");
            else if(coin.equals("tail"))
                System.out.println("Tails");
        }
    }
}
