package com.first.myapplicatio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class os extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);

        PDFView pdfView =findViewById(R.id.pdfview);

        pdfView.fromAsset("os.pdf").load();
    }
}