public class NestingLoop {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"

        for (char c = 'A'; c <= 'E'; c++) {
            for (int n = 1; n <= 3; n++) {
                System.out.println(c + " " + n);
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.println(a + "-" + b + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

    }
}


 /* 1.Inner loop runs faster(N) 
  2.IF the order of loops are changed , it would reverse order of 
      output and it will be A1B1C1D1E1 ,A2B2C2D2E2 
  3.If we change print to println(),we get output in vertical line. 
  4.After adding output statement after close braces, WE will get answer in vertical line.*/