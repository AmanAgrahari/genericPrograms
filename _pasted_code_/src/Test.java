import java.util.concurrent.atomic.AtomicInteger;

public class Test {

    static int c = 10;
    private AtomicInteger clusterMemberCount = new AtomicInteger();

    int x = 2;

    Test() {

    }

    Test(final int i) {
        x = i;
    }

    public static void main(final String[] args) {
        final Test t = new Test(5);
        final Test t1 = new Test();
        System.out.println("t1 " + t1.x);
        System.out.println("t " + t.x);
        t.listenChange();
        System.out.println(t.getNumberOfInstances());
    }

    private void listenChange() {
        clusterMemberCount.set(2);
    }

    public int getNumberOfInstances() {
        c++;
        return clusterMemberCount.get();
    }

    static int fun() {
        int x = 10; //Error: Static local variables are not allowed
        return x--;
    }
}
