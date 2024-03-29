package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {   // アプリ本体であるAppCompatActivityを継承

    private TextView text1;     // TextViewの変数 text1 を用意
    private TextView text2;     // TextViewの変数 text2 を用意
    private TextView text3;     // TextViewの変数 text3 を用意
    private Button btn1;        // Buttonの変数 btn1 を用意
    private Button btn2;        // Buttonの変数 btn2 を用意
    private Button btn3;
    private Button Reset;

    @Override   // オーバーライドアノテーション（このメソッドは親からオーバーライドしたものだと表す）
    protected void onCreate(Bundle savedInstanceState) {    // アプリが起動したときに呼ばれるメソッド
        super.onCreate(savedInstanceState);                 // 親クラス(AppCompatActivity)のonCreate()を実行
        setContentView(R.layout.activity_main);             // 画面にactivity_main.xmlのレイアウトを設定

        text1 = findViewById(R.id.text1);                   // text1というIDのViewを取得しtext1変数に代入
        text2 = findViewById(R.id.text2);                   // text2というIDのViewを取得しtext2変数に代入
        text3 = findViewById(R.id.text3);
        btn1 = findViewById(R.id.btn1);                     // btn1というIDのViewを取得しbtn1変数に代入
        btn2 = findViewById(R.id.btn2);                     // btn2というIDのViewを取得しbtn2変数に代入
        btn3 = findViewById(R.id.btn3);                     // btn2というIDのViewを取得しbtn2変数に代入
        Reset = findViewById(R.id.reset);

        btn1.setOnClickListener(new View.OnClickListener() {   // btn1にクリックリスナーを設定（定義も同時に行っている）
            @Override
            public void onClick(View view) {	               // 設定したViewがクリックされたら実行されるメソッド
                text1.setText("私");                           // text1のテキストを変更

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {    // btn2にクリックリスナーを設定（定義も同時に行っている）
            @Override
            public void onClick(View view) {		            // 設定したViewがクリックされたら実行されるメソッド
                text2.setText("好き");                          // text1のテキストを変更
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {    // btn3にクリックリスナーを設定（定義も同時に行っている）
            @Override
            public void onClick(View view) {		            // 設定したViewがクリックされたら実行されるメソッド
                text3.setText("バスケットボール");              // text3のテキストを変更
            }
        });
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("I");
                text2.setText("like");
                text3.setText("basketball");
            }
        });

    }
}