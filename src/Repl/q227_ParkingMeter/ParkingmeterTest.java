package Repl.q227_ParkingMeter;

import assignments.assignment_14.q01.Atts;
import assignments.assignment_14.q03.Db;

public class ParkingmeterTest {
    public static void main(String[] args) {

        Db db = new Db();
        db.setData("zzz");
        db.setYint(200);

        System.out.println(db.getData());//zzz
        System.out.println(db.getYint());//200



    }
}
