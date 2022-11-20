package com.first.myapplicatio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
public class ARRAY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        PDFView pdfView =findViewById(R.id.pdfview);
        pdfView.fromAsset("array.pdf").load();

    }
}