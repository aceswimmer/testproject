package com.example.gurtej.gfacebook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by gurtej on 20/12/16.
 */

public class facebookadapter extends BaseAdapter {

    Context context;
    ArrayList<fbuser> facebooklist;

    public facebookadapter(Context context, ArrayList<fbuser> facebooklist) {
        this.context = context;
        this.facebooklist = facebooklist;
        Collections.sort((List<fbuser>)this.facebooklist,fbuser.fbdatecomparator);
    }


    @Override
    public int getCount() {
        return facebooklist.size();
    }

    @Override
    public fbuser getItem(int position) {
        return facebooklist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        facebookviewholder fbholder;
        if(convertView==null)
        {
            if(getItemViewType(position)==1)
            {
                convertView=inflater.inflate(R.layout.facebook_less140,parent,false);
            }
            else
            {
                convertView=inflater.inflate(R.layout.facebook_more140,parent,false);
            }
            fbholder= new facebookviewholder();
            fbholder.tvdate= (TextView) convertView.findViewById(R.id.tvdate);
            fbholder.tvname= (TextView) convertView.findViewById(R.id.tvname);
            fbholder.tvstatus= (TextView) convertView.findViewById(R.id.tvstatus);
            fbholder.ivdp= (ImageView) convertView.findViewById(R.id.ivdp);
            convertView.setTag(fbholder);
        }
        else
        {
            fbholder= (facebookviewholder) convertView.getTag();
        }
        fbuser thisuser=getItem(position);
        fbholder.tvname.setText(thisuser.getName());
        fbholder.tvdate.setText(thisuser.getDatetime());
        fbholder.tvstatus.setText(thisuser.getStatus());
        fbholder.ivdp.setImageResource(thisuser.getDpimage());

        return convertView;
    }

    @Override
    public int getItemViewType(int position) {
        String status=getItem(position).getStatus();
        if(status.length()<=140)
            return 1;
        else
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    static class facebookviewholder
    {
        TextView tvname,tvstatus,tvdate;
        ImageView ivdp;
    }
}
