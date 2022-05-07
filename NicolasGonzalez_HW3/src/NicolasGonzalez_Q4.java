// Author: Nicolas Gonzalez
// Assignment: HW 3 -- Q4
// Description: Prints out the calendar year and the give beginning day

import java.util.Scanner;

public class NicolasGonzalez_Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter first day of the year: ");
        int day = input.nextInt();

        if(day >= 7)
            day %= 7;

        // int reset is used to determine when to move down a line
        int reset = 1;

        //Taking advantange of the falling case work to print out the whole calendar
        switch(1) {
            case 1:
                System.out.printf("\t\tJanuary %d\n", year);
                System.out.print("-----------------------------\n");
                System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");

                for(int j = 0; j < day; j++)
                    System.out.print("    ");

                    for(int j = 1; j <= 7 - day; j++)
                        System.out.printf(" %d  ", j);
                    System.out.print("\n");

                    for(int j = 7 - day + 1; j <= 31; j++ ,reset++){

                        if(j >= 10)
                            System.out.printf(" %d ", j);
                        else
                            System.out.printf(" %d  ", j);

                        if(reset == 7) {
                            System.out.print("\n");
                            reset = 0;
                        }
                    }

                System.out.print("\n");

                case 2:
                    System.out.printf("\t\tFebruary %d\n", year);
                    System.out.print("-----------------------------\n");
                    System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");

                    for(int j = 1; j < reset; j++)
                        System.out.print("    ");

                    if(year % 4 == 0) {
                        for (int j = 1; j <= 29; j++, reset++) {

                            if (j >= 10)
                                System.out.printf(" %d ", j);
                            else
                                System.out.printf(" %d  ", j);

                            if (reset == 7) {
                                System.out.print("\n");
                                reset = 0;
                            }
                        }
                    }
                    else {
                        for (int j = 1; j <= 28; j++, reset++) {

                            if (j >= 10)
                                System.out.printf(" %d ", j);
                            else
                                System.out.printf(" %d  ", j);

                            if (reset == 7) {
                                System.out.print("\n");
                                reset = 0;
                            }
                        }
                    }

                    System.out.print("\n");

                case 3:
                    System.out.printf("\t\tMarch %d\n", year);
                    System.out.print("-----------------------------\n");
                    System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");

                    for(int j = 1; j < reset; j++)
                        System.out.print("    ");

                    for(int j = 1; j <= 31; j++ ,reset++){

                        if(j >= 10)
                            System.out.printf(" %d ", j);
                        else
                            System.out.printf(" %d  ", j);

                        if(reset == 7) {
                            System.out.print("\n");
                            reset = 0;
                        }
                    }

                    System.out.print("\n");

                case 4:
                    System.out.printf("\t\tApril %d\n", year);
                    System.out.print("-----------------------------\n");
                    System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");

                    for(int j = 1; j < reset; j++)
                        System.out.print("    ");

                    for(int j = 1; j <= 30; j++ ,reset++){

                        if(j >= 10)
                            System.out.printf(" %d ", j);
                        else
                            System.out.printf(" %d  ", j);

                        if(reset == 7) {
                            System.out.print("\n");
                            reset = 0;
                        }
                    }

                    System.out.print("\n");

                case 5:
                    System.out.printf("\t\tMay %d\n", year);
                    System.out.print("-----------------------------\n");
                    System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");

                    for(int j = 1; j < reset; j++)
                        System.out.print("    ");

                    for(int j = 1; j <= 31; j++ ,reset++){

                        if(j >= 10)
                            System.out.printf(" %d ", j);
                        else
                            System.out.printf(" %d  ", j);

                        if(reset == 7) {
                            System.out.print("\n");
                            reset = 0;
                        }
                    }

                    System.out.print("\n");

                case 6:
                    System.out.printf("\t\tJune %d\n", year);
                    System.out.print("-----------------------------\n");
                    System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");

                    for(int j = 1; j < reset; j++)
                        System.out.print("    ");

                    for(int j = 1; j <= 30; j++ ,reset++){

                        if(j >= 10)
                            System.out.printf(" %d ", j);
                        else
                            System.out.printf(" %d  ", j);

                        if(reset == 7) {
                            System.out.print("\n");
                            reset = 0;
                        }
                    }

                    System.out.print("\n");

                case 7:
                    System.out.printf("\t\tJuly %df\n", year);
                    System.out.print("-----------------------------\n");
                    System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");

                    for(int j = 1; j < reset; j++)
                        System.out.print("    ");

                    for(int j = 1; j <= 31; j++ ,reset++){

                        if(j >= 10)
                            System.out.printf(" %d ", j);
                        else
                            System.out.printf(" %d  ", j);

                        if(reset == 7) {
                            System.out.print("\n");
                            reset = 0;
                        }
                    }

                    System.out.print("\n");

                case 8:
                    System.out.printf("\t\tAugust %d\n", year);
                    System.out.print("-----------------------------\n");
                    System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");

                    for(int j = 1; j < reset; j++)
                        System.out.print("    ");

                    for(int j = 1; j <= 31; j++ ,reset++){

                        if(j >= 10)
                            System.out.printf(" %d ", j);
                        else
                            System.out.printf(" %d  ", j);

                        if(reset == 7) {
                            System.out.print("\n");
                            reset = 0;
                        }
                    }

                    System.out.print("\n");

                case 9:
                    System.out.printf("\t\tSeptember %d\n", year);
                    System.out.print("-----------------------------\n");
                    System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");

                    for(int j = 1; j < reset; j++)
                        System.out.print("    ");

                    for(int j = 1; j <= 30; j++ ,reset++){

                        if(j >= 10)
                            System.out.printf(" %d ", j);
                        else
                            System.out.printf(" %d  ", j);

                        if(reset == 7) {
                            System.out.print("\n");
                            reset = 0;
                        }
                    }

                    System.out.print("\n");

                case 10:
                    System.out.printf("\t\tOctober %d\n", year);
                    System.out.print("-----------------------------\n");
                    System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");

                    for(int j = 1; j < reset; j++)
                        System.out.print("    ");

                    for(int j = 1; j <= 31; j++ ,reset++){

                        if(j >= 10)
                            System.out.printf(" %d ", j);
                        else
                            System.out.printf(" %d  ", j);

                        if(reset == 7) {
                            System.out.print("\n");
                            reset = 0;
                        }
                    }

                    System.out.print("\n");

                case 11:
                    System.out.printf("\t\tNovember %d\n", year);
                    System.out.print("-----------------------------\n");
                    System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");

                    for(int j = 1; j < reset; j++)
                        System.out.print("    ");

                    for(int j = 1; j <= 30; j++ ,reset++){

                        if(j >= 10)
                            System.out.printf(" %d ", j);
                        else
                            System.out.printf(" %d  ", j);

                        if(reset == 7) {
                            System.out.print("\n");
                            reset = 0;
                        }
                    }

                    System.out.print("\n");

                case 12:
                    System.out.printf("\t\tDecember %d\n", year);
                    System.out.print("-----------------------------\n");
                    System.out.print(" Sun Mon Tue Wed Thu Fri Sat\n");

                    for(int j = 1; j < reset; j++)
                        System.out.print("    ");

                    for(int j = 1; j <= 31; j++ ,reset++){

                        if(j >= 10)
                            System.out.printf(" %d ", j);
                        else
                            System.out.printf(" %d  ", j);

                        if(reset == 7) {
                            System.out.print("\n");
                            reset = 0;
                        }
                    }

                    System.out.print("\n");
        }

        input.close();
    }
}
