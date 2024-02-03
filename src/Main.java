//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class leapyear{
public static void main (String[]args)
{

    int year = 2024;

    if (year % 400 == 0)
        System.out.println ( "Leap Year");

    else if (year % 4 == 0 && year % 100 != 0)
        System.out.println ("Leap Year");

    else
        System.out.println ("is not a Leap Year");

}
}