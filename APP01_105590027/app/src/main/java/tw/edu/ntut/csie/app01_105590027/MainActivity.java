package tw.edu.ntut.csie.app01_105590027;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTxtResult;
    private EditText eTxtPoint;
    private Button tranBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTxtResult = (TextView)findViewById(R.id.resultTxt);
        eTxtPoint = (EditText)findViewById(R.id.inputEdt);

        tranBtn =(Button)findViewById(R.id.transBtn);

        tranBtn.setOnClickListener(btnOKOnClick);
    }
    private View.OnClickListener btnOKOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int score=0;
            String result="等第:";
            char retureResult=' ';
            score=Integer.valueOf(eTxtPoint.getText().toString());
            retureResult=letterGrade(score);
            if(retureResult=='X'){
                result+="輸入分數應介於[0..100]之間";
            }else{
                result+=retureResult;
            }
            mTxtResult.setText(result);
        }
    };
    public char letterGrade(int score){
        if(score>100){
            return 'X';
        }else if(score>=90 && score <=100){
            return 'A';
        }else if(score>80 && score <=89){
            return 'B';
        }else if(score>70 && score <=79){
            return 'C';
        }else if(score>60 && score <=69){
            return 'D';
        }else if(score>=0 && score <=59){
            return 'F';
        }else{
            return 'X';
        }
    }
}
