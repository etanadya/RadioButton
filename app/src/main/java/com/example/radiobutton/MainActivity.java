package com.example.radiobutton;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvhasil;
    RadioButton samarinda, kendari, palu, makasar;
    RadioGroup rg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvhasil = findViewById(R.id.hasil);
        samarinda = findViewById(R.id.rb1);
        kendari = findViewById(R.id.rb2);
        palu = findViewById(R.id.rb3);
        makasar = findViewById(R.id.rb4);
        rg1 = findViewById(R.id.rg_jawaban);
    }

    public void nilai(View view) {
        int selectedId = rg1.getCheckedRadioButtonId();
        if (selectedId == samarinda.getId()) {
            tvhasil.setText("2");
        } else if (selectedId == kendari.getId()) {
            tvhasil.setText("10");
        } else if (selectedId == palu.getId()) {
            tvhasil.setText("2");
        } else if (selectedId == makasar.getId()) {
            tvhasil.setText("2");
        } else {
            tvhasil.setText("0");
        }
    }
}
