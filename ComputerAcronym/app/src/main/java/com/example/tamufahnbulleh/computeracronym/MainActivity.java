package com.example.tamufahnbulleh.computeracronym;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView resultTextView;
    EditText acronymEditText;
    Button searchBtn;
    String result;
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView=(TextView)findViewById(R.id.result_textview);
        acronymEditText=(EditText)findViewById(R.id.acronym_editText);
        searchBtn=(Button)findViewById(R.id.search_btn);
        mContext=this;
        searchBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Search();
            }
        });
    }

    public void Search()
    {
        SearchWord searchWord=new SearchWord(this.acronymEditText.getText().toString(),this);
        searchWord.search();
        this.result=searchWord.getResult().toString();

        if (this.result.length() < 1)
        {
            this.resultTextView.setText("Match not found");
        }
        else {
                this.resultTextView.setText(this.result);
        }
    }

}
