public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;

         while (count !=5){
            System.out.println("ASHLEY GAIL");
            count ++;
        }
        // do while loop

         int i = 0;
         do {
            System.out.println("LOPEZ");
             i ++;
        } while (i != 6);

        //for loop

        for (int l = 0; l != 7;  l++) {
            System.out.println("ISIDORO");
        }
        // char array
        
        String[] myFirstName = {"A","S","H","L","E","Y","G","A","I","L"};
        

        for (int counter = 0; counter < myFirstName.length; counter++) {
            System.out.println(myFirstName[counter]);
        }

        // char array in reverse
        
        String[] myfirstname = {"L","I","A","G","Y","E","L","H","S","A"};

        for (int l = 0; l < myFirstName.length; l++) {
            System.out.println(myfirstname[l]);
}
    }
}
