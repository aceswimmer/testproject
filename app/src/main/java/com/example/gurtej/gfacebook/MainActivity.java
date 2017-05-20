package com.example.gurtej.gfacebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        ArrayList<fbuser> facebooklist;
        ListView facebooklistview;
    TextView tvlatest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "onCreate: bebwbbwbebwbe");
        tvlatest.setText("0");
        facebooklist=new ArrayList<>();
        facebooklist.add(new fbuser("05/01/17,01:00 am","My name is A","This is the status update for A. He just keeps on writing and never ever stops. He feels happy to keep on writing till he forcefully crosses 140 characters.",R.drawable.a));
        facebooklist.add(new fbuser("05/01/17,02:00 am","My name is B","This is the short status update for B",R.drawable.b));
        facebooklist.add(new fbuser("05/01/17,03:00 am","My name is C","This is the short status update for C",R.drawable.c));
        facebooklist.add(new fbuser("03/01/17,04:00 am","My name is D","This is the status update for D. He just keeps on writing and never ever stops. He feels happy to keep on writing till he forcefully crosses 140 characters.",R.drawable.d));
        facebooklist.add(new fbuser("03/01/17,05:00 am","My name is E","This is the short status update for E",R.drawable.e));
        facebooklist.add(new fbuser("03/01/17,06:00 am","My name is F","This is the short status update for F",R.drawable.f));
        facebooklist.add(new fbuser("01/01/17,07:00 am","My name is G","This is the status update for G. He just keeps on writing and never ever stops. He feels happy to keep on writing till he forcefully crosses 140 characters.",R.drawable.g));
        facebooklist.add(new fbuser("01/01/17,08:00 am","My name is H","This is the short status update for H",R.drawable.h));
        facebooklist.add(new fbuser("01/01/17,09:00 am","My name is I","This is the short status update for I",R.drawable.i));
        facebooklist.add(new fbuser("04/01/17,10:00 am","My name is J","This is the short status update for J",R.drawable.j));
        facebooklist.add(new fbuser("04/01/17,11:00 am","My name is K","This is the status update for K. He just keeps on writing and never ever stops. He feels happy to keep on writing till he forcefully crosses 140 characters.",R.drawable.k));
        facebooklist.add(new fbuser("04/01/17,02:00 pm","My name is L","This is the short status update for L",R.drawable.l));
        facebooklist.add(new fbuser("04/01/17,03:00 pm","My name is M","This is the short status update for M",R.drawable.m));
        facebooklist.add(new fbuser("04/01/17,04:00 pm","My name is N","This is the status update for N. He just keeps on writing and never ever stops. He feels happy to keep on writing till he forcefully crosses 140 characters.",R.drawable.n));
        facebooklist.add(new fbuser("01/01/16,05:00 pm","My name is O","This is the short status update for O",R.drawable.o));
        facebooklist.add(new fbuser("01/01/16,06:00 pm","My name is P","This is the short status update for P",R.drawable.p));
        facebooklist.add(new fbuser("05/01/16,07:00 pm","My name is q","This is the status update for Q. He just keeps on writing and never ever stops. He feels happy to keep on writing till he forcefully crosses 140 characters.",R.drawable.q));
        facebooklist.add(new fbuser("01/01/16,08:00 pm","My name is R","This is the short status update for R",R.drawable.r));
        facebooklist.add(new fbuser("01/01/16,09:00 pm","My name is S","This is the short status update for S",R.drawable.s));
        facebooklist.add(new fbuser("01/01/16,10:00 pm","My name is T","This is the short status update for T",R.drawable.t));
        facebooklist.add(new fbuser("02/01/16,01:00 pm","My name is U","This is the short status update for U",R.drawable.u));
        facebooklist.add(new fbuser("02/01/16,02:00 pm","My name is V","This is the status update for V. He just keeps on writing and never ever stops. He feels happy to keep on writing till he forcefully crosses 140 characters.",R.drawable.v));
        facebooklist.add(new fbuser("02/01/16,03:00 pm","My name is W","This is the short status update for W",R.drawable.w));
        facebooklist.add(new fbuser("02/01/16,01:00 am","My name is X","This is the short status update for X",R.drawable.x));
        facebooklist.add(new fbuser("02/01/16,02:00 am","My name is Y","This is the status update for Y. He just keeps on writing and never ever stops. He feels happy to keep on writing till he forcefully crosses 140 characters.",R.drawable.y));
        facebooklist.add(new fbuser("02/01/16,03:00 am","My name is Z","This is the short status update for Z",R.drawable.z));

        facebooklistview  = (ListView) findViewById(R.id.facebookfeed);
        tvlatest= (TextView) findViewById(R.id.tvlatest);
        facebookadapter fbadapter= new facebookadapter(this,facebooklist);
        facebooklistview.setAdapter(fbadapter);

    }
}
