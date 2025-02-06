public class BiggestOfThreeNumbers {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;

        int big= Math.max(n1,Math.max(n2,n3));
        System.out.println("Biggest of "+n1+" , "+n2+ ", " +n3+ " is " + big);
    }
}
