package com.example.shad_calculator;

/*<!-- import android.support.v7.app.AppCompaActivity;

import android.view.Menu;
import android.view.MenuItem; */

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class jvcalc extends AppCompatActivity {

    Button button0, button1, button2, button3,button4,button5,button6, button7,
    button8, button9, buttonadd, buttonsub, buttoneql, buttondiv, buttonmul, button10, buttonC;

    EditText edt1;
    float mValueOne, mValueTwo;
    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutcalc);

        button0=(Button) findViewById(R.id.button0);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button10=(Button) findViewById(R.id.button10);
        buttonadd=(Button) findViewById(R.id.buttonadd);
        buttonsub=(Button) findViewById(R.id.buttonsub);
        buttonmul=(Button) findViewById(R.id.buttonmul);
        buttonC=(Button) findViewById(R.id.buttonC);
        buttondiv=(Button) findViewById(R.id.buttondiv);
        buttoneql=(Button) findViewById(R.id.buttoneql);
        edt1=(EditText) findViewById(R.id.edt1);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });
button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edt1.setText(edt1.getText()+"2");
    }
});
button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edt1.setText(edt1.getText()+"3");
    }
});
button4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edt1.setText(edt1.getText()+"4");
    }
});
button5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edt1.setText(edt1.getText()+"5");
    }
    });

    button6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            edt1.setText(edt1.getText()+"6");
        }
    });

    button7.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edt1.setText(edt1.getText()+"7");
    }
});

button8.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edt1.setText(edt1.getText()+"8");
    }
});

button9.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edt1.setText(edt1.getText()+"9");
    }
});

button0.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edt1.setText(edt1.getText()+"0");
    }
});

buttonadd.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if (edt1 == null) {
            edt1.setText("");
        } else {
            mValueOne = Float.parseFloat(edt1.getText() + ""); {
            }
        }
    }});

buttonsub.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        mValueOne=Float.parseFloat(edt1.getText()+"");
        mSubtract=true;
        edt1.setText(null);
    }
});

buttonmul.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        mValueOne=Float.parseFloat(edt1.getText()+"");
        mMultiplication=true;
        edt1.setText(null);
    }
});

buttondiv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        mValueOne=Float.parseFloat(edt1.getText()+"");
        mDivision=true;
        edt1.setText(null);
    }
});

buttoneql.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        mValueTwo = Float.valueOf(edt1.getText() + "");

        if (mAddition = true) {
            edt1.setText(mValueOne + mValueTwo + "");
            mAddition = false;
        }
        if (mSubtract == true) {
            edt1.setText(mValueOne - mValueTwo + "");
            mSubtract = false;
        }

        if (mMultiplication == true) {
            edt1.setText(mValueOne * mValueTwo + "");
            mMultiplication = false;
        }

        if (mDivision == true) {
            edt1.setText(mValueOne / mValueTwo + "");
            mDivision = false;
        }
    }
});

buttonC.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edt1.setText("");
    }
});

button10.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        edt1.setText(edt1.getText()+".");
    }
});
}
}
