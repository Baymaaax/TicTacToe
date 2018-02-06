package com.example.nyt.tictactoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    static int PLAYER = -1;
    TextView tvPlayer;
    ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    ImageButton btnRestart;
    ImageButton btnCircle, btnWrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvPlayer = (TextView) findViewById(R.id.tv_player);
        btn1=(ImageButton)findViewById(R.id.btn1);
        btn2=(ImageButton)findViewById(R.id.btn2);
        btn3=(ImageButton)findViewById(R.id.btn3);
        btn4=(ImageButton)findViewById(R.id.btn4);
        btn5=(ImageButton)findViewById(R.id.btn5);
        btn6=(ImageButton)findViewById(R.id.btn6);
        btn7=(ImageButton)findViewById(R.id.btn7);
        btn8=(ImageButton)findViewById(R.id.btn8);
        btn9=(ImageButton)findViewById(R.id.btn9);
        btnRestart=(ImageButton)findViewById(R.id.btn_restart);
        btnCircle=(ImageButton)findViewById(R.id.btn_circle);
        btnWrong=(ImageButton)findViewById(R.id.btn_wrong);
        btnCircle.setOnClickListener(this);
        btnWrong.setOnClickListener(this);
        btnRestart.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);


    }
    private void restartGame(){
        AlertDialog.Builder dialog= new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("重新开局");
        dialog.setMessage("是否确定要重新开局");
        dialog.setCancelable(false);
        dialog.setPositiveButton("restart", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                btn1.setImageResource(R.drawable.squarebox);
                btn2.setImageResource(R.drawable.squarebox);
                btn3.setImageResource(R.drawable.squarebox);
                btn4.setImageResource(R.drawable.squarebox);
                btn5.setImageResource(R.drawable.squarebox);
                btn6.setImageResource(R.drawable.squarebox);
                btn7.setImageResource(R.drawable.squarebox);
                btn8.setImageResource(R.drawable.squarebox);
                btn9.setImageResource(R.drawable.squarebox);
                tvPlayer.setText("当前玩家：");
                PLAYER=-1;
            }
        });
        dialog.setNegativeButton("cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                PLAYER=-1;
                tvPlayer.setText("当前玩家：");

            }
        });
        dialog.show();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_circle:{
                PLAYER=1;
                tvPlayer.setText("当前玩家：Player1");
            }break;
            case R.id.btn_wrong:{
                PLAYER=2;
                tvPlayer.setText("当前玩家：Player2");
            }break;
            case R.id.btn_restart:restartGame();break;
            case R.id.btn1:{
                if(PLAYER==1) btn1.setImageResource(R.drawable.circle);
                else if(PLAYER==2) btn1.setImageResource(R.drawable.wrong);
            }break;
            case R.id.btn2:{
                if(PLAYER==1) btn2.setImageResource(R.drawable.circle);
                else if(PLAYER==2) btn2.setImageResource(R.drawable.wrong);
            }break;
            case R.id.btn3:{
                if(PLAYER==1) btn3.setImageResource(R.drawable.circle);
                else if(PLAYER==2) btn3.setImageResource(R.drawable.wrong);
            }break;
            case R.id.btn4:{
                if(PLAYER==1) btn4.setImageResource(R.drawable.circle);
                else if(PLAYER==2) btn4.setImageResource(R.drawable.wrong);
            }break;
            case R.id.btn5:{
                if(PLAYER==1) btn5.setImageResource(R.drawable.circle);
                else if(PLAYER==2) btn5.setImageResource(R.drawable.wrong);
            }break;
            case R.id.btn6:{
                if(PLAYER==1) btn6.setImageResource(R.drawable.circle);
                else if(PLAYER==2) btn6.setImageResource(R.drawable.wrong);
            }break;
            case R.id.btn7:{
                if(PLAYER==1) btn7.setImageResource(R.drawable.circle);
                else if(PLAYER==2) btn7.setImageResource(R.drawable.wrong);
            }break;
            case R.id.btn8:{
                if(PLAYER==1) btn8.setImageResource(R.drawable.circle);
                else if(PLAYER==2) btn8.setImageResource(R.drawable.wrong);
            }break;
            case R.id.btn9:{
                if(PLAYER==1) btn9.setImageResource(R.drawable.circle);
                else if(PLAYER==2) btn9.setImageResource(R.drawable.wrong);
            }break;
            default:break;
        }

    }

}
