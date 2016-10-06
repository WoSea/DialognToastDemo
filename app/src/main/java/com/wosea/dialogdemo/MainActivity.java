package com.wosea.dialogdemo;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  //  AlertDialog.Builder myDialog;
    ProgressDialog myprogress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this.getApplicationContext(),
                "My name is Toast", Toast.LENGTH_LONG).show();
       // myprogress =ProgressDialog.show(this,"Processing","Please wait..."); // Using dimiss() function to turn off Progress
        //AlertDialog

    //    myDialog = new AlertDialog.Builder(this);

         /*   myDialog.setTitle("Can i ask you a question");
            myDialog.setMessage("Is it ok?");
          myDialog.setIcon(R.mipmap.ic_launcher);// custom image by give any your image into
//drawable folder, code is change as
// myDialog.setIcon(R.drawable.myimage);
        myDialog.setPositiveButton("yes",new DialogInterface.OnClickListener(){   //setPositiveButton, display button at the left position

            public void onClick(DialogInterface dialog,int which){
                //TODO Auto-generated method stub
                MainActivity.this.finish(); // Closing Activity => Thoát hoàn toàn ứng dụng
                dialog.cancel(); // closing Dialog, Activity to continued start again
            }
        });
// Changeable "setPositiveButton" by: setNagetiveButton, setNeutralButton to create any function for dialog
//  AlertDialog is showed
        AlertDialog alertExample = myDialog.create();
        alertExample.show();
*/


    }
}
