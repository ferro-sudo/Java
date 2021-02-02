package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class q170_Arrays_Zombie_Attack_2 {

	public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        //TODO. Write you code below this line.
        int[] inhabitantsTemp = new int[8];
        System.arraycopy(inhabitants, 0, inhabitantsTemp, 0, 8);
        for (int i = 0; i < 10; i++) {
            boolean flag = true;
            if (i == 0) {
                System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
            } else {
                for (int city = 0; city < inhabitantsTemp.length; city++) {
                    if (city == 0) {
                        if (inhabitantsTemp[city + 1] < 1) {
                            inhabitants[city] = inhabitants[city] / 2;
                        }
                    } else if (city == inhabitantsTemp.length - 1) {
                        if (inhabitantsTemp[city - 1] < 1) {
                            inhabitants[city] = inhabitants[city] / 2;
                        }
                    } else {
                        if (inhabitantsTemp[city + 1] < 1) {
                            inhabitants[city] = inhabitants[city] / 2;
                        } else if (inhabitantsTemp[city - 1] < 1) {
                            inhabitants[city] = inhabitants[city] / 2;
                        }
                    }
                }
                System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
            }

            if (Arrays.equals(inhabitants, new int[8]))
				break;
            System.arraycopy(inhabitants, 0, inhabitantsTemp, 0, 8);
        }
        System.out.println("---- EXTINCT ----");
    }


}
