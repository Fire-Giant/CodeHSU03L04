public class BillTester
{
    public static void main(String[] args)
    {
        double cost = 125.45;
        int people = 10;
        Bill birthdayDinner = new Bill(cost, people);

        // Create a bill for a birthday dinner for 10 people

        System.out.println("Birthday Dinner");
        System.out.println();

        // Add the tip
        birthdayDinner.addTip();
        System.out.println("\nBirthday Dinner after tip");



        System.out.println("\n\n"); // print a few blank lines
        // Another dinner with 5 guests
        System.out.println("Birthday Dinner");
        System.out.println(birthdayDinner);

        // Add the tip
        birthdayDinner.addTip();
        // Notice the difference in the final amount

        System.out.println("\nBirthday Dinner after tip");
        System.out.println();



        System.out.println("\n\n"); // print a few blank lines
        // Another dinner with 2 guests
        System.out.println("Birthday Dinner");
        System.out.println();

        // Add the tip
        // Notice the difference in the final amount

        System.out.println("\nBirthday Dinner after tip");
        System.out.println();


    }
}
