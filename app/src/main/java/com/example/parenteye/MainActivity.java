package com.example.parenteye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Users");
    private Integer userCompleteProfile=0;
    private Button logout;
  //  private ArrayList<custom_posts_returned> HomePosts=new ArrayList<custom_posts_returned>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mAuth = FirebaseAuth.getInstance();
        logout=(Button) findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(mAuth.getCurrentUser()!=null){
                   mAuth.signOut();
                   main_login();

               }
           }
       });



    }
    @Override
    protected void onStart() {

        if(mAuth.getCurrentUser()==null){
            main_login();
        }
        else{
            check_complete_profile();

        }
        super.onStart();
    }


    private void main_signup(){
        Intent main_signup=new Intent(MainActivity.this,SignupActivity.class);
        startActivity(main_signup);
        finish();
    }
    private void main_login(){
        Intent main_login=new Intent(MainActivity.this,LoginActivity.class);
        startActivity(main_login);
        finish();

    }
    private void check_complete_profile(){


        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot UsersSnapshot: dataSnapshot.getChildren()) {
                     Users user=UsersSnapshot.getValue(Users.class);
                     if(TextUtils.equals(user.getUserId(),mAuth.getCurrentUser().getUid())){
                         userCompleteProfile=1;
                    }

                }
                if(userCompleteProfile==0){
                    Intent userdataactivity_intent=new Intent(MainActivity.this,UserdataActivity.class);
                    startActivity(userdataactivity_intent);
                    finish();
                }



            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value

            }
        });
    }


}
