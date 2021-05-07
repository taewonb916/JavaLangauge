public class Test {

public static void main(String[] args) {
Boy b1 = new Boy();
Boy b2 = new Boy();

Boy.i = 1;
b1.i = 2;
b2.i = 3;
System.out.println(Boy.i);
System.out.println(b1.i);
System.out.println(b2.i);
}

}

class Boy {
static int i = 0;
}