package com.first.myapplicatio;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;

        import com.github.barteksc.pdfviewer.PDFView;

public class dbms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms);

        PDFView pdfView =findViewById(R.id.pdfview);

        pdfView.fromAsset("dbms.pdf").load();
    }
}