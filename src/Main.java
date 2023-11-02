import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student num1 = new Student("Nurtilek",LocalDate.of(2006,04,06),"Java");
        Student num2 = new Student("Nurmuhammed",LocalDate.of(2006,11,23),"Java");
        Student num3 = new Student("Erlan",LocalDate.of(2007,12,21),"JS");
        Student num4 = new Student("Almaz",LocalDate.of(2004,9,2),"JS");
        Student num5 = new Student("Bekzat",LocalDate.of(2006,04,18),"Java");
        Student [] nums = {num1,num2,num3,num4,num5};
        int n1 = 0;
        int n2 = 0;

        for (int i = 0; i < nums.length; i++) {
         if (nums[i].group.contains("Java")) {
             ++n1;
         } else {
             ++n2;

         }
            System.out.println("Java"+ " " +n1 );
            System.out.println("JS "+" "+ n2);


        }




        }

    }
