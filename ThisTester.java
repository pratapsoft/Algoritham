package CH02;

public class ThisTester {
    public int dog = 2;
    public void clobber(){
        int dog = 5;
        System.out.println("The dog local variable = " + dog);
        System.out.println("The dog field = " + this.dog);

    }

    public static void main(String args[]){
        ThisTester t = new ThisTester();
        t.clobber();
    }
}
