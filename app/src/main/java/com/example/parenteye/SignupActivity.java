package com.example.parenteye;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class SignupActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText signup_email;
    private EditText signup_password;
    private EditText signup_reEnterpassword;
    private Button signup;
    private TextView signup_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_signup);
        signup_email=(EditText) findViewById(R.id.signup_email);
        signup_password=(EditText) findViewById(R.id.signup_password);
        signup_reEnterpassword=(EditText) findViewById(R.id.signup_reenterpassword);
        signup_login=(TextView) findViewById(R.id.signup_login);
        signup=(Button) findViewById(R.id.signup_btn);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=signup_email.getText().toString();
                String password=signup_password.getText().toString();
                String passwordreenter=signup_reEnterpassword.getText().toString();



           if(!TextUtils.isEmpty(email)&&!TextUtils.isEmpty(passwordreenter)&&!TextUtils.isEmpty(password)){
                    if(TextUtils.equals(password,passwordreenter)){
                        final ProgressDialog progressdialogue=new ProgressDialog(SignupActivity.this);
                        progressdialogue.setTitle("loading...");
                        progressdialogue.show();
                        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                if(task.isSuccessful()){
                                    progressdialogue.dismiss();
                                    Toast.makeText(SignupActivity.this,"Account Created Successfully!",Toast.LENGTH_LONG).show();
                                    Go_to_userdata();

                                }
                                else{
                                    progressdialogue.dismiss();
                                    Toast.makeText(SignupActivity.this,"Error !! "+task.getException(),Toast.LENGTH_LONG).show();
                                }
                            }
                        });

                       }
                 else{

                        Toast.makeText(SignupActivity.this,"The two password do not match  ",Toast.LENGTH_LONG).show();
                    }




           }
           else{

               Toast.makeText(SignupActivity.this,"please fill all the fields , they are mandatory ",Toast.LENGTH_LONG).show();

           }

            }
        });


        signup_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Go_to_login();
            }
        });



    }



    private  void Go_to_main(){
        Intent signup_main=new Intent(SignupActivity.this,MainActivity.class);
        startActivity(signup_main);
        finish();
    }

    private void Go_to_userdata(){
        Intent signup_userdata=new Intent(SignupActivity.this,UserdataActivity.class);
        startActivity(signup_userdata);
        finish();

    }
    private void Go_to_login(){
        Intent signuplogin=new Intent(SignupActivity.this,LoginActivity.class);
        startActivity(signuplogin);
        finish();
    }
}
