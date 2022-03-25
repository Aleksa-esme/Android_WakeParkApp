package com.example.wakepark;

import android.os.Bundle;
import android.view.View;
import android.text.method.ScrollingMovementMethod;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    //output to UDP and input from UDP respectively
    private Map<String,Integer> ctrlStateOutgoing;

    DialogFragment ask1;
    DialogFragment ask2;
    DialogFragment ask3;
    DialogFragment ask4;
    DialogFragment ask5;
    DialogFragment ask6;
    DialogFragment ask7;
    DialogFragment ask8;
    DialogFragment ask9;
    DialogFragment ask10;

    Button btn_auto_manual;
    Button btn_speed_plus;
    Button btn_speed_minus;
    Button btn_remove_current;
    Button btn_seat_current;
    Button btn_withdraw;
    Button btn_load1;
    Button btn_remove1;
    Button btn_load2;
    Button btn_remove2;
    Button btn_load3;
    Button btn_remove3;
    Button btn_load4;
    Button btn_remove4;
    Button btn_load5;
    Button btn_remove5;
    Button btn_load6;
    Button btn_remove6;
    Button btn_load7;
    Button btn_remove7;
    Button btn_load8;
    Button btn_remove8;
    Button btn_load9;
    Button btn_remove9;
    Button btn_load10;
    Button btn_remove10;

    private int count_auto_manual;
    private int count_speed_plus;
    private int count_speed_minus;
    private int count_remove_current;
    private int count_seat_current;
    private int count_withdraw;
    private int count_load1;
    private int count_remove1;
    private int count_load2;
    private int count_remove2;
    private int count_load3;
    private int count_remove3;
    private int count_load4;
    private int count_remove4;
    private int count_load5;
    private int count_remove5;
    private int count_load6;
    private int count_remove6;
    private int count_load7;
    private int count_remove7;
    private int count_load8;
    private int count_remove8;
    private int count_load9;
    private int count_remove9;
    private int count_load10;
    private int count_remove10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ctrlStateOutgoing = new HashMap<String,Integer>();
        setContentView(R.layout.activity_main);
        ask1 = new Dialog1();
        ask2 = new Dialog2();
        ask3 = new Dialog3();
        ask4 = new Dialog4();
        ask5 = new Dialog5();
        ask6 = new Dialog6();
        ask7 = new Dialog7();
        ask8 = new Dialog8();
        ask9 = new Dialog9();
        ask10 = new Dialog10();

        TextView errors = (TextView) findViewById(R.id.errors);
        errors.setMovementMethod(new ScrollingMovementMethod());

        btn_auto_manual = (Button) findViewById(R.id.auto_manual);
        btn_auto_manual.setOnClickListener(oclBtnOk);

        btn_speed_plus = (Button) findViewById(R.id.button_speed_plus);
        btn_speed_plus.setOnClickListener(oclBtnOk);

        btn_speed_minus = (Button) findViewById(R.id.button_speed_minus);
        btn_speed_minus.setOnClickListener(oclBtnOk);

        btn_remove_current = (Button) findViewById(R.id.button_remove_current);
        btn_remove_current.setOnClickListener(oclBtnOk);

        btn_seat_current = (Button) findViewById(R.id.button_seat_current);
        btn_seat_current.setOnClickListener(oclBtnOk);

        btn_withdraw = (Button) findViewById(R.id.button_withdraw);
        btn_withdraw.setOnClickListener(oclBtnOk);

        btn_load1 = (Button) findViewById(R.id.button_load1);
        btn_load1.setOnClickListener(oclBtnOk);
        btn_remove1 = (Button) findViewById(R.id.button_remove1);
        btn_remove1.setOnClickListener(oclBtnOk);

        btn_load2 = (Button) findViewById(R.id.button_load2);
        btn_load2.setOnClickListener(oclBtnOk);
        btn_remove2 = (Button) findViewById(R.id.button_remove2);
        btn_remove2.setOnClickListener(oclBtnOk);

        btn_load3 = (Button) findViewById(R.id.button_load3);
        btn_load3.setOnClickListener(oclBtnOk);
        btn_remove3 = (Button) findViewById(R.id.button_remove3);
        btn_remove3.setOnClickListener(oclBtnOk);

        btn_load4 = (Button) findViewById(R.id.button_load4);
        btn_load4.setOnClickListener(oclBtnOk);
        btn_remove4 = (Button) findViewById(R.id.button_remove4);
        btn_remove4.setOnClickListener(oclBtnOk);

        btn_load5 = (Button) findViewById(R.id.button_load5);
        btn_load5.setOnClickListener(oclBtnOk);
        btn_remove5 = (Button) findViewById(R.id.button_remove5);
        btn_remove5.setOnClickListener(oclBtnOk);

        btn_load6 = (Button) findViewById(R.id.button_load6);
        btn_load6.setOnClickListener(oclBtnOk);
        btn_remove6 = (Button) findViewById(R.id.button_remove6);
        btn_remove6.setOnClickListener(oclBtnOk);

        btn_load7 = (Button) findViewById(R.id.button_load7);
        btn_load7.setOnClickListener(oclBtnOk);
        btn_remove7 = (Button) findViewById(R.id.button_remove7);
        btn_remove7.setOnClickListener(oclBtnOk);

        btn_load8 = (Button) findViewById(R.id.button_load8);
        btn_load8.setOnClickListener(oclBtnOk);
        btn_remove8 = (Button) findViewById(R.id.button_remove8);
        btn_remove8.setOnClickListener(oclBtnOk);

        btn_load9 = (Button) findViewById(R.id.button_load9);
        btn_load9.setOnClickListener(oclBtnOk);
        btn_remove9 = (Button) findViewById(R.id.button_remove9);
        btn_remove9.setOnClickListener(oclBtnOk);

        btn_load10 = (Button) findViewById(R.id.button_load10);
        btn_load10.setOnClickListener(oclBtnOk);
        btn_remove10 = (Button) findViewById(R.id.button_remove10);
        btn_remove10.setOnClickListener(oclBtnOk);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ask1:
                ask1.show(getSupportFragmentManager(), "ask1");
                break;
            case R.id.ask2:
                ask2.show(getSupportFragmentManager(), "ask2");
                break;
            case R.id.ask3:
                ask3.show(getSupportFragmentManager(), "ask3");
                break;
            case R.id.ask4:
                ask4.show(getSupportFragmentManager(), "ask4");
                break;
            case R.id.ask5:
                ask5.show(getSupportFragmentManager(), "ask5");
                break;
            case R.id.ask6:
                ask6.show(getSupportFragmentManager(), "ask6");
                break;
            case R.id.ask7:
                ask7.show(getSupportFragmentManager(), "ask7");
                break;
            case R.id.ask8:
                ask8.show(getSupportFragmentManager(), "ask8");
                break;
            case R.id.ask9:
                ask9.show(getSupportFragmentManager(), "ask9");
                break;
            case R.id.ask10:
                ask10.show(getSupportFragmentManager(), "ask10");
                break;
            default:
                break;
        }
    }

    private View.OnClickListener oclBtnOk = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.auto_manual:
                    count_auto_manual=count_auto_manual+1;
                    if (count_auto_manual>7) {  count_auto_manual=0;  }
                    ctrlStateOutgoing.put("'autoManual'", 0);
                    ctrlStateOutgoing.put("'count_auto_manual'", count_auto_manual);
                    break;
                case R.id.button_speed_plus:
                    count_speed_plus=count_speed_plus+1;
                    if (count_speed_plus>7) {  count_speed_plus=0;  }
                    ctrlStateOutgoing.put("'speedPlus'", 0);
                    ctrlStateOutgoing.put("'count_speed_plus'", count_speed_plus);
                    break;
                case R.id.button_speed_minus:
                    count_speed_minus=count_speed_minus+1;
                    if (count_speed_minus>7) {  count_speed_minus=0;  }
                    ctrlStateOutgoing.put("'speedMinus'", 0);
                    ctrlStateOutgoing.put("'count_speed_minus'", count_speed_minus);
                    break;
                case R.id.button_remove_current:
                    count_remove_current=count_remove_current+1;
                    if (count_remove_current>7) {  count_remove_current=0;  }
                    ctrlStateOutgoing.put("'removeCurrent'", 0);
                    ctrlStateOutgoing.put("'count_remove_current'", count_remove_current);
                    break;
                case R.id.button_seat_current:
                    count_seat_current=count_seat_current+1;
                    if (count_seat_current>7) {  count_seat_current=0;  }
                    ctrlStateOutgoing.put("'seatCurrent'", 0);
                    ctrlStateOutgoing.put("'count_seat_current'", count_seat_current);
                    break;
                case R.id.button_withdraw:
                    count_withdraw=count_withdraw+1;
                    if (count_withdraw>7) {  count_withdraw=0;  }
                    ctrlStateOutgoing.put("'withdraw'", 0);
                    ctrlStateOutgoing.put("'count_withdraw'", count_withdraw);
                    break;
                case R.id.button_load1:
                    count_load1=count_load1+1;
                    if (count_load1>7) {  count_load1=0;  }
                    ctrlStateOutgoing.put("'load1'", 0);
                    ctrlStateOutgoing.put("'count_load1'", count_load1);
                    break;
                case R.id.button_remove1:
                    count_remove1=count_remove1+1;
                    if (count_remove1>7) {  count_remove1=0;  }
                    ctrlStateOutgoing.put("'remove1'", 0);
                    ctrlStateOutgoing.put("'count_remove1'", count_remove1);
                    break;
                case R.id.button_load2:
                    count_load2=count_load2+1;
                    if (count_load2>7) {  count_load2=0;  }
                    ctrlStateOutgoing.put("'load2'", 0);
                    ctrlStateOutgoing.put("'count_load2'", count_load2);
                    break;
                case R.id.button_remove2:
                    count_remove2=count_remove2+1;
                    if (count_remove2>7) {  count_remove2=0;  }
                    ctrlStateOutgoing.put("'remove2'", 0);
                    ctrlStateOutgoing.put("'count_remove2'", count_remove2);
                    break;
                case R.id.button_load3:
                    count_load3=count_load3+1;
                    if (count_load3>7) {  count_load3=0;  }
                    ctrlStateOutgoing.put("'load3'", 0);
                    ctrlStateOutgoing.put("'count_load3'", count_load3);
                    break;
                case R.id.button_remove3:
                    count_remove3=count_remove3+1;
                    if (count_remove3>7) {  count_remove3=0;  }
                    ctrlStateOutgoing.put("'remove3'", 0);
                    ctrlStateOutgoing.put("'count_remove3'", count_remove3);
                    break;
                case R.id.button_load4:
                    count_load4=count_load4+1;
                    if (count_load4>7) {  count_load4=0;  }
                    ctrlStateOutgoing.put("'load4'", 0);
                    ctrlStateOutgoing.put("'count_load4'", count_load4);
                    break;
                case R.id.button_remove4:
                    count_remove4=count_remove4+1;
                    if (count_remove4>7) {  count_remove4=0;  }
                    ctrlStateOutgoing.put("'remove4'", 0);
                    ctrlStateOutgoing.put("'count_remove4'", count_remove4);
                    break;
                case R.id.button_load5:
                    count_load5=count_load5+1;
                    if (count_load5>7) {  count_load5=0;  }
                    ctrlStateOutgoing.put("'load5'", 0);
                    ctrlStateOutgoing.put("'count_load5'", count_load5);
                    break;
                case R.id.button_remove5:
                    count_remove5=count_remove5+1;
                    if (count_remove5>7) {  count_remove5=0;  }
                    ctrlStateOutgoing.put("'remove5'", 0);
                    ctrlStateOutgoing.put("'count_remove5'", count_remove5);
                    break;
                case R.id.button_load6:
                    count_load6=count_load6+1;
                    if (count_load6>7) {  count_load6=0;  }
                    ctrlStateOutgoing.put("'load6'", 0);
                    ctrlStateOutgoing.put("'count_load6'", count_load6);
                    break;
                case R.id.button_remove6:
                    count_remove6=count_remove6+1;
                    if (count_remove6>7) {  count_remove6=0;  }
                    ctrlStateOutgoing.put("'remove6'", 0);
                    ctrlStateOutgoing.put("'count_remove6'", count_remove6);
                    break;
                case R.id.button_load7:
                    count_load7=count_load7+1;
                    if (count_load7>7) {  count_load7=0;  }
                    ctrlStateOutgoing.put("'load7'", 0);
                    ctrlStateOutgoing.put("'count_load7'", count_load7);
                    break;
                case R.id.button_remove7:
                    count_remove7=count_remove7+1;
                    if (count_remove7>7) {  count_remove7=0;  }
                    ctrlStateOutgoing.put("'remove7'", 0);
                    ctrlStateOutgoing.put("'count_remove7'", count_remove7);
                    break;
                case R.id.button_load8:
                    count_load8=count_load8+1;
                    if (count_load8>7) {  count_load8=0;  }
                    ctrlStateOutgoing.put("'load8'", 0);
                    ctrlStateOutgoing.put("'count_load8'", count_load8);
                    break;
                case R.id.button_remove8:
                    count_remove8=count_remove8+1;
                    if (count_remove8>7) {  count_remove8=0;  }
                    ctrlStateOutgoing.put("'remove8'", 0);
                    ctrlStateOutgoing.put("'count_remove8'", count_remove8);
                    break;
                case R.id.button_load9:
                    count_load9=count_load9+1;
                    if (count_load9>7) {  count_load9=0;  }
                    ctrlStateOutgoing.put("'load9'", 0);
                    ctrlStateOutgoing.put("'count_load9'", count_load9);
                    break;
                case R.id.button_remove9:
                    count_remove9=count_remove9+1;
                    if (count_remove9>7) {  count_remove9=0;  }
                    ctrlStateOutgoing.put("'remove9'", 0);
                    ctrlStateOutgoing.put("'count_remove9'", count_remove9);
                    break;
                case R.id.button_load10:
                    count_load10=count_load10+1;
                    if (count_load10>7) {  count_load10=0;  }
                    ctrlStateOutgoing.put("'load10'", 0);
                    ctrlStateOutgoing.put("'count_load10'", count_load10);
                    break;
                case R.id.button_remove10:
                    count_remove10=count_remove10+1;
                    if (count_remove10>7) {  count_remove10=0;  }
                    ctrlStateOutgoing.put("'remove10'", 0);
                    ctrlStateOutgoing.put("'count_remove10'", count_remove10);
                    break;

            }

        }
    };

}

