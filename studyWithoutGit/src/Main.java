import java.io.*;
import java.util.*;
class Print {

    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("SJBM.txt");
        Scanner sc = new Scanner(reader);
        String input = sc.nextLine();
        String [] array = input.split(" ");
        reader.close();
        boolean flag = true;
        try {
            double num1 = Double.valueOf(array[0]);
            double num2 = Double.valueOf(array[2]);
        } catch (NumberFormatException ex) {
            System.out.println("Error! Not number\n");
            flag = false;
            System.exit(0);
        }
        try {
        if (flag) {
            if (!(array[1].equals("+") || array[1].equals("-") || array[1].equals("*") || array[1].equals("/"))) {
                flag = false;
                throw new Exception("Operation Error!");
            }
            if (flag) {
                if (Double.parseDouble(array[2]) == 0.0 && array[1].equals("/")) {
                    flag = false;
                    throw new Exception("Error! Division by zero\n");
                }
            }
        }
        if (array[1].equals("+")) System.out.println((Double.parseDouble(array[0])+Double.parseDouble(array[2])));
        if (array[1].equals("-")) System.out.println((Double.parseDouble(array[0])-Double.parseDouble(array[2])));
        if (array[1].equals("*")) System.out.println((Double.parseDouble(array[0])*Double.parseDouble(array[2])));
        if (array[1].equals("/")) System.out.println((Double.parseDouble(array[0])/Double.parseDouble(array[2])));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

