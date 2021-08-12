package org.pytorch.demo.objectdetection;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ViewLogFileActivity extends AppCompatActivity {


    private TextView mLogView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textview_log);
        mLogView = findViewById(R.id.logview);
        try {
            mLogView.invalidate();
            mLogView.setText(readFileAndDisplay(getApplicationContext()));
            //mLogView.setText("View TEXT FILE");
            Toast.makeText(this, "Viewed Successfully", Toast.LENGTH_LONG).show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private String readFileAndDisplay(Context context) {
        File fileEvents = new File(context.getFilesDir()+"/"+ AppUtilities.OUTPUTFILE);
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileEvents));
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
            br.close();
        } catch (IOException e) { }
        String result = text.toString();
        return result;
    }
}
