package com.example.gurtej.gfacebook;

import java.util.Comparator;

/**
 * Created by gurtej on 20/12/16.
 */

public class fbuser {
    String datetime;
    String name;
    String status;
    int dpimage;

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public int getDpimage() {
        return dpimage;
    }

    public String getDatetime() {
        return datetime;
    }

    public fbuser( String datetime,String name, String status, int dpimage) {
        this.datetime = datetime;
        this.name = name;
        this.status = status;
        this.dpimage = dpimage;
    }

    public static Comparator<fbuser> fbdatecomparator = new Comparator<fbuser>() {

        @Override
        public  int compare(fbuser f1, fbuser f2) {
            String s2=f2.getDatetime();
            String s1=f1.getDatetime();
            String s11=s1.substring(6,8)+s1.substring(3,5)+s1.substring(0,2)+s1.substring(15,16)+s1.substring(9,14);
            String s22=s2.substring(6,8)+s2.substring(3,5)+s2.substring(0,2)+s2.substring(15,16)+s2.substring(9,14);
            return s22.compareTo(s11);
      }
    };
}
