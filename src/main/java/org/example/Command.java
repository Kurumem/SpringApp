package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class Boo {
    @Autowired
    private DateCommand dc;
    @Autowired
    private TimeCommand tc;

    public void doBoo(){
        System.out.println("Choose command: ShowTime; ShowDate; Exit");
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();

        switch (c){
            case ("ShowTime"):
                tc.showTime();
                break;
            case ("ShowDate"):
                dc.showDate();
                break;
            case ("Exit"):
                break;
        }



    }
}
