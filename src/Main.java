public class Main {

public static void main(String[] args) {
        int i = 7;
        System.out.println(i);
        int j;
        j = 19;
        System.out.println(j);
        long myVariable = 176;
        long anotherVariable = 9000000000L;

        int first = 50;
        int second = 100;
        int third = first + 10;
    System.out.println(third);
    first = 65;
    System.out.println(first);
    System.out.println(third);

    //print out the value of first multiplied bu 3
    System.out.println("first * 3 =" + first * 3);
    System.out.println(second /50); //2
    System.out.println(second / first); //1.85... but result will be an in 1
    System.out.println(first * 3.1); //result will be 201.5
    double size = 17.3;
    float smallerSize = 17.1f;
    double largerSize = 18;
    int extraLargeSize = 19;

    extraLargeSize = extraLargeSize + 1;
    extraLargeSize++;
    extraLargeSize--;
    System.out.println(extraLargeSize);
    System.out.println(largerSize++);
    System.out.println(largerSize);
    double megaSize = ++largerSize;
    System.out.println(megaSize);

    i = 1 + 5;
    i +=5; // -= *= /=

    //26 /7 3r5
    int remainder = 26 % 7;
    System.out.println(remainder);

    //print out is 163 even
    System.out.println(163 % 2);

    boolean iAmHappy = true;
    boolean iAmSad = false;

    char firstInitial = 'M';

    int [] participantAges = {23,21,27,24,22};  //creates an array of size 5
    System.out.println(participantAges[2]);
    participantAges[0] = 24;
    System.out.println(participantAges[0]);

    int [] scores = new int[20];
    System.out.println(scores);
        }
        }
