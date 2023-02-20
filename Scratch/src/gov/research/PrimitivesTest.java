package gov.research;

class PrimitivesTest {

    public static void main(String[] args) {

        int age = 30;
        System.out.println("The age is: " + age);

        long population = 7_000_000_000L;
        System.out.println("The population is: " + population);

        double height = 185.3;
        System.out.println("My height is: " + height);

        boolean isTall = true;
        System.out.println("I am tall? " + isTall);

        char grade = 'B';
        System.out.println("I got a " + grade + " on the test.");

        System.out.println("My favorite word is \"belly\"");

        int i = 18;
        System.out.println(i);

        int j = i;
        System.out.println(j);

        i++; //i is 19 now, what is j??? STILL 18 j has its own 18
        System.out.println(i);
        System.out.println(j);

        int n = 3;
        System.out.println(n++); //++ at the end is the post-increment and at the beginning is pre-increment
        // it prints n then increments which is why we don't see the increment

        System.out.println(n);

    }
}