package ru.startandroid.develop.melkovhw61;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mTextView = findViewById(R.id.result);
    }

    public void onButtonClick(View view) {
        Button button = (Button) view;
        String text = button.getText().toString();

        /* second comma denied */
        if(mTextView.getText().toString().contains(".") && text.contains(".")) {
            return;
        }

        /* clear first 0, except before comma */
        if(mTextView.getText().toString().equals("0") && !text.equals(".")) {
            mTextView.setText(text);
            return;
        }

        mTextView.setText(String.format("%s%s", mTextView.getText(), text));
    }
}