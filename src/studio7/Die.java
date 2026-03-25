public class Die {

    private int n;


    public Die(int n){
        this.n = n;
    }

    public int rollDie(){
        int roll = (int) (Math.random() * n) +1;
        return roll;

    }

    public int getN(){
        return n;
    }
public static void main(String[] args) {
    Die d1 = new Die(1);
    // System.out.println("n);
    System.out.println("Roll: " + d1.rollDie());
    Die d6 = new Die(6);
    System.out.println("Roll: " + d6.rollDie());
    Die d20 = new Die(20);
    System.out.println("Roll: " + d20.rollDie());
}



}
