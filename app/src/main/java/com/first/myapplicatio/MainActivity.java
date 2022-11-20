package com.first.myapplicatio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {

    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {

            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {


                super.onAdFailedToLoad(adError);
                mAdView.loadAd(adRequest);

            }

            @Override
            public void onAdImpression() {
                // Code to be executed when an impression is recorded
                // for an ad.
            }

            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.

            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }
        });






        b();
        ARRAY();
        sorting();
        LL();
        STACK();
        QUEUE();
        BINARYTREE();
        BST();
        HEAP();
        HASHING();
        dp();
        TC();
        ADS();
        oops();
        dbms();
        os();
        cn();
        INTERVIEW();
        quanta();




      }




    private void b()
{
    Button bds;
    bds=findViewById(R.id.bds);
    bds.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, Basic.class));

        }
    });
}
    private void ARRAY()
    {
        Button ARRAY;
        ARRAY=findViewById(R.id.ARRAY);
        ARRAY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ARRAY.class));

            }
        });
    }

    private void sorting()
    {
        Button sorting;
        sorting=findViewById(R.id.SORTING);
        sorting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, sorting.class));

            }
        });
    }


    private void LL()
    {
        Button LL;
      LL=findViewById(R.id.LL);
       LL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Linklist.class));

            }
        });
    }
    private void STACK()
    {
        Button STACK;
      STACK=findViewById(R.id.stack);
        STACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Stack.class));

            }
        });
    }
    private void QUEUE()
    {
        Button QUEUE;
        QUEUE=findViewById(R.id.Queue);
        QUEUE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, queue.class));

            }
        });
    }
    private void BINARYTREE()
    {
        Button BINARYTREE;
        BINARYTREE=findViewById(R.id.BinaryTree);
       BINARYTREE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, binarytree.class));

            }
        });
    }
    private void BST()
    {
        Button BST;
        BST=findViewById(R.id.BinarySearchTree);
      BST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BST.class));

            }
        });
    }
    private void HEAP()
    {
        Button HEAP;
        HEAP=findViewById(R.id.Heap);
        HEAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, heap.class));

            }
        });
    }
    private void HASHING()
    {
        Button HASHING;
     HASHING=findViewById(R.id.Hashing);
      HASHING.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, hashing.class));

            }
        });
    }

    private void dp()
    {
        Button dp;
        dp=findViewById(R.id.dp);
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, dp.class));

            }
        });
    }

    private void TC()
    {
        Button TC;
        TC=findViewById(R.id.TC);
        TC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TC.class));

            }
        });
    }
    private void ADS()
    {
        Button ADS;
        ADS=findViewById(R.id.ADS);
        ADS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ads.class));

            }
        });
    }

    private void oops()
    {
        Button oops;
        oops=findViewById(R.id.oops);
        oops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, oops.class));

            }
        });
    }
    private void dbms()
    {
        Button dbms;
        dbms=findViewById(R.id.dbms);
        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, dbms.class));

            }
        });
    }

    private void os()
    {
        Button os;
        os=findViewById(R.id.os);
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, os.class));

            }
        });
    }
    private void cn()
    {
        Button cn;
        cn=findViewById(R.id.cn);
        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, cn.class));

            }
        });
    }

    private void INTERVIEW()
    {
        Button INTERVIEW;
        INTERVIEW=findViewById(R.id.INTERVIEW);
        INTERVIEW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, INTERVIEW.class));

            }
        });
    }

    private void quanta()
    {
        Button quanta;
        quanta=findViewById(R.id.quanta);
        quanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, quanta.class));

            }
        });
    }
}


