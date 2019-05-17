package personalproject.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button fifteenPercent;
    Button eighteenPercent;
    Button twentyPercent;
    Button twentyTwoPercent;
    EditText editText;
    TextView tip;
    TextView billAndTip;
    Double money;
    Double tipAmount;
    Double finalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fifteenPercent = findViewById(R.id.fifteenPercent);
        eighteenPercent = findViewById(R.id.eighteenPercent);
        twentyPercent = findViewById(R.id.twentyPercent);
        twentyTwoPercent = findViewById(R.id.twentyTwoPercent);

        editText = findViewById(R.id.totalAmount);
        tip = findViewById(R.id.tip);
        billAndTip = findViewById(R.id.billAndTip);

        finalAmount = 1.00;

        fifteenPercent.setOnClickListener(this);
        eighteenPercent.setOnClickListener(this);
        twentyPercent.setOnClickListener(this);
        twentyTwoPercent.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        money = Double.parseDouble(editText.getText().toString());
        if (view.getId() == fifteenPercent.getId()) {
            tipAmount = money * 0.15;
            tipAmount = Math.round(tipAmount * 100.0) / 100.0;
            finalAmount = money + tipAmount;
            tip.setText("$" + tipAmount.toString());
            billAndTip.setText("$" + finalAmount.toString());
        }

        if (view.getId() == eighteenPercent.getId()) {
            tipAmount = money * 0.18;
            tipAmount = Math.round(tipAmount * 100.0) / 100.0;
            finalAmount = money + tipAmount;
            tip.setText("$" + tipAmount.toString());
            billAndTip.setText("$" + finalAmount.toString());
        }

        if (view.getId() == twentyPercent.getId()) {
            tipAmount = money * 0.20;
            tipAmount = Math.round(tipAmount * 100.0) / 100.0;
            finalAmount = money + tipAmount;
            tip.setText("$" + tipAmount.toString());
            billAndTip.setText("$" + finalAmount.toString());
        }

        if (view.getId() == twentyTwoPercent.getId()) {
            tipAmount = money * 0.22;
            tipAmount = Math.round(tipAmount * 100.0) / 100.0;
            finalAmount = money + tipAmount;
            tip.setText("$" + tipAmount.toString());
            billAndTip.setText("$" + finalAmount.toString());
        }
    }
}
