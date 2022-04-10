package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        StringBuffer iaiaia = new StringBuffer();
        StringBuffer rash = new StringBuffer();
        System.out.println("Ведите слово, которое хотите зашифровать");
        Scanner in = new Scanner(System.in);
        String[] _1000_7_ = in.nextLine().split("");
        String[][] zxc = new String[][]{
                {"A", "B", "C", "D", "E", "F"},
                {"G", "H", "I", "J", "K", "L"},
                {"M", "N", "O", "P", "Q", "R"},
                {"S", "T", "U", "V", "W", "X"},
                {"Y", "Z", "0", "1", "2", "3"},
                {"4", "5", "6", "7", "8", "9"}

        };

        String[] coor = {"A", "D", "F", "G", "V", "X"};
        for (int u = 0; u < _1000_7_.length; u++) {
            for (int i = 0; i < zxc.length; i++) {
                for (int j = 0; j < zxc[0].length ; j++) {
                    if (_1000_7_[u].equalsIgnoreCase(zxc[i][j])) {
                        iaiaia.append(coor[i]);
                        iaiaia.append(coor[j]);
                        break;
                    }
                    if (_1000_7_[u].equalsIgnoreCase(zxc[i][j])) {
                        i = 0;
                        j = 0;
                        break;
                    }
                }
            }
        }

        System.out.print("Шифр: ");
        System.out.print(iaiaia.toString());

        String[] shifr = iaiaia.toString().split("");
        for(int i = 0; i<shifr.length;i+=2){
            rash.append(zxc[Arrays.binarySearch(coor, shifr[i])][Arrays.binarySearch(coor, shifr[i+1])]);
        }

        System.out.print("\nРасшифровка: ");
        System.out.print(rash.toString().toLowerCase(Locale.ROOT));

    }

       }


