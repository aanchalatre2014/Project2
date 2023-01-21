public class YA_Print_Table_Of_Two_Using_Loop {
    public static void main (String [] args) {
        //Java class to print any table using loops
        //int i=2;
        for (int i = 1; i <10 ; i++)
        {
            System.out.println("Printing Table of :"+i);
            for (int j = 1; j <= 10; j++)
            {
                System.out.println(i+"x"+j +"=" + i*j);
            }

        }
    }
}
