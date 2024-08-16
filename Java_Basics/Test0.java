package Java_Basics;

public class Test0 {
static  int variable = 10;

static  {
System.out.println(" from Static Block");
System.err.println(variable + "   Static Block");
Test0 Test0 = new Test0 ();
}

public static void main(String[] args) {
    System.out.println( " from Main Method ");
    System.out.println(variable+"      main method");
}
Test0 (){
    System.out.println(" Constructor  ");
}

}
