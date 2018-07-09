package com.example.tongxiwen.hotfixtestforbugly;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tencent.bugly.beta.Beta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder
                .setTitle("这是个弹窗")
                .setMessage("这次，我添加了一个弹窗")
                .setCancelable(true);
        AlertDialog dialog = builder.create();
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialogInterface) {
                Beta.checkUpgrade(false, false);
            }
        });
        dialog.show();
    }
}
