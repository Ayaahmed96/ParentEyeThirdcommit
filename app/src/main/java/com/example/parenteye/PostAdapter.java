package com.example.parenteye;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PostAdapter extends ArrayAdapter<custom_posts_returned> {
    public PostAdapter(Activity context, ArrayList<custom_posts_returned> post_returned){
        super(context,0,post_returned);
    }



    @NonNull
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View postlist=convertView;
        if(postlist==null){
            postlist = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_posts, parent, false);
        }
       custom_posts_returned post= getItem(position);
        TextView postownername=(TextView) postlist.findViewById(R.id.postowner);
        postownername.setText(post.getPost_owner_name());
        TextView postDescription=(TextView) postlist.findViewById(R.id.postDescription);
        if(post.getPost_text()!=null){
            postDescription.setText(post.getPost_text());
        }
        else {
            postDescription.setVisibility(View.GONE);
        }

        TextView postdate=(TextView) postlist.findViewById(R.id.postdate);
        postdate.setText("1/1/2001");
       // postdate.setText(post.getPost_date().toString());

        ImageView profileimage=(ImageView) postlist.findViewById(R.id.profile_post);
        ImageView postimage=(ImageView) postlist.findViewById(R.id.post_image);

        if(post.hasprofieimage()==true) {
           // profileimage.setImageResource(post.getProfile_image());
          //  img.setVisibility(View.VISIBLE);
           // profileimage.setVisibility(View.GONE);
            profileimage.setImageBitmap(post.getProfile_image());
        }
        else{
            profileimage.setImageResource(R.drawable.defaultprofile);

        }
        if(post.haspostimage()==true){
            postimage.setImageBitmap(post.getPost_image());
        }
        else{
            postimage.setVisibility(View.GONE);
        }





        return postlist;


    }

}
