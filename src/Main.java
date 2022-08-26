import java.util.Scanner;

public class Main {//testing our class
    public static void main(String[] args) {
        int N;
        if(args.length!=0){//input from cmd
            N=Integer.parseInt(args[0]);
        }else {//input from keyboard during execution
            System.out.print("Enter the length of Lucas sequence: ");
            Scanner scanner = new Scanner(System.in);
            N=scanner.nextInt();
        }
        if(N<=0){//checking for positive
            throw new IllegalArgumentException("Length must be positive!");
        }

        LucasNumber [] sequence = new LucasNumber[N];//creating array of objects
        for (int i = 0; i < N; i++) {
            sequence[i]=new LucasNumber(i, sequence);
        }
        System.out.println("Sequence of "+N+" values has been generated");

        int resultNum=0;//amount of Lucas numbers, that meet our condition
        for (LucasNumber num: sequence) {
            if(num.doesMeetCondition()) resultNum++;
        }
        System.out.println(resultNum+" from first "+N+" numbers of Lucas sequence equal w^2+1");
    }
}
