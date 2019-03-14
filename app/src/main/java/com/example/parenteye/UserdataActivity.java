package com.example.parenteye;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.DateTimeKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserdataActivity extends AppCompatActivity {
    private  static  final  String TAG="UserdataActivity";
    private TextView date;
    private DatePickerDialog.OnDateSetListener datepicker;
    private RadioGroup radio_group_gender;
    private RadioButton choosenRadiobutton;
    private EditText username;
    private EditText addresse;
    private Button submit;
    private Integer filldate=0;
    private  String choosendate;
    private FirebaseAuth mAuth;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Users");
    private   Date newdate;
    private boolean isMale;
    private Integer currentyear;
    private Integer useryear;
    private CircleImageView circleimage;
    private Integer PICK_IMAGE_REQUEST=71;
    private Uri filepath;
    private StorageReference mStorageRef;
    private String imagekey;
    private TextView logout;
    //private TextView test;          //for test



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdata);

        mAuth=FirebaseAuth.getInstance();
        mStorageRef = FirebaseStorage.getInstance().getReference();
        date=(TextView) findViewById(R.id.date);
        radio_group_gender=(RadioGroup) findViewById(R.id.radipgp_gender);
        username=(EditText) findViewById(R.id.usernameedittext) ;
        addresse=(EditText) findViewById(R.id.addresse_edittext);
        circleimage=(CircleImageView) findViewById(R.id.profile_image);
        submit=(Button) findViewById(R.id.submit);
        logout=(TextView) findViewById(R.id.logout_data);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mAuth.getCurrentUser()!=null){
                    mAuth.signOut();
                    Go_to_main();
                }
            }
        });

        /*

        //testing something
         test=(TextView) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main=new Intent(UserdataActivity.this,MainActivity.class);
                startActivity(main);
            }
        });

*/


        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal=Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                currentyear=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialogue=new DatePickerDialog(UserdataActivity.this,android.R.style.Theme_DeviceDefault_Dialog,datepicker,year,month,day);
                dialogue.getWindow().setBackgroundDrawable(new ColorDrawable(Color.GRAY));
                dialogue.show();
            }
        });


        datepicker=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                  month=month+1;
                   choosendate=dayOfMonth +"/" + month +"/" +year;
                    date.setText(choosendate);
                    filldate=1;
                    newdate=new Date(year,month,dayOfMonth);
                   useryear=year;


                }


        };

       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String name=username.getText().toString();
               String useraddresse=addresse.getText().toString();
               if(!TextUtils.isEmpty(name)&&!TextUtils.isEmpty(useraddresse)&&filldate!=0){
                   if(currentyear-useryear>20){
                       int genderId=radio_group_gender.getCheckedRadioButtonId();
                       choosenRadiobutton= (RadioButton)findViewById(genderId);
                       if(TextUtils.equals(choosenRadiobutton.getText().toString(),"Male")){
                           isMale=true;

                       }
                       else{
                           isMale=false;

                       }

                 /*  SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yy");
                 try {
                       newdate = fmt.parse(choosendate);
                   } catch (ParseException e) {

                       e.printStackTrace();
                   }
                   */
                       upload_profile_pic();
                       //mAuth.getCurrentUser().getUid()
                                                    //kan hena newdate
     Users newuser=new Users(mAuth.getCurrentUser().getUid(),name,newdate,useraddresse,isMale,"1",true,imagekey);
                       myRef.push().setValue(newuser).addOnCompleteListener(new OnCompleteListener<Void>() {
                           @Override
                           public void onComplete(@NonNull Task<Void> task) {
                               if(task.isSuccessful()){

                                   Toast.makeText(UserdataActivity.this,"Profile Information completed Successfully",Toast.LENGTH_LONG).show();
                                   Go_to_main();
                               }
                               else{
                                   Toast.makeText(UserdataActivity.this,"Error !!!  "+task.getException(),Toast.LENGTH_LONG).show();

                               }
                           }
                       });
                   }
                     else{
        Toast.makeText(UserdataActivity.this,"Sorry,your age should not less than 20 years!!",Toast.LENGTH_LONG).show();

                   }
               }






                 else{
                   Toast.makeText(UserdataActivity.this,"Fill all fields please ,they are all mandatory !!",Toast.LENGTH_LONG).show();

               }

              // String chosen=choosenRadiobutton.getText().toString();
             //  Toast.makeText(UserdataActivity.this,choosenRadiobutton.getText(),Toast.LENGTH_LONG).show();
           }
       });


        circleimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent,"select image"),PICK_IMAGE_REQUEST);
            }
        });

    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==PICK_IMAGE_REQUEST&&resultCode==RESULT_OK&&data!=null&&data.getData()!=null){
            filepath=data.getData();

            try{
                Bitmap bitmap= MediaStore.Images.Media.getBitmap(getContentResolver(),filepath);
                circleimage.setImageBitmap(bitmap);
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private void upload_profile_pic(){
        if(filepath!=null){
            final ProgressDialog progressdialogue=new ProgressDialog(this);
            progressdialogue.setTitle("loading...");
            progressdialogue.show();
            imagekey = UUID.randomUUID().toString();
            StorageReference ref = mStorageRef.child("images/"+imagekey);
            ref.putFile(filepath)

                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            progressdialogue.dismiss();
                        }
                    })
            .addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    progressdialogue.dismiss();
            Toast.makeText(UserdataActivity.this,"Profile Photo uploading error",Toast.LENGTH_LONG).show();
                }
            });
        }
    }
    private void Go_to_main(){
        Intent goMain=new Intent(UserdataActivity.this,MainActivity.class);
        startActivity(goMain);
        finish();
    }

}
   