package com.ardli.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ardli.submissiondicoding.framework.Framework;

public class DetailFrameworkActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String EXTRA_DETAIL_FRAMEWORK = "detail_framework";
    private static final String TAG = "DetailFrameworkActivity";
    ImageView imgDetail;
    TextView tvDetail, tvNama;
    Button bhsDetail, jnsDetail, versiDetail, situsDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_framework);

        imgDetail = findViewById(R.id.img_detail_framework);
        tvDetail = findViewById(R.id.desc_detail_framework);
        tvNama = findViewById(R.id.nama_detail_framework);
        bhsDetail = findViewById(R.id.bhs_detail_framework);
        jnsDetail = findViewById(R.id.jns_detail_framework);
        versiDetail = findViewById(R.id.versi_detail_framework);
        situsDetail = findViewById(R.id.situs_detail_framework);

        Framework framework = getIntent().getParcelableExtra(EXTRA_DETAIL_FRAMEWORK);
        setTitle(framework.getNama());

        imgDetail.setImageResource(framework.getImage());
        tvDetail.setText(framework.getDetail());
        tvNama.setText(framework.getNama());
        jnsDetail.setText(framework.getJenis());
        bhsDetail.setText(framework.getBahasa());
        versiDetail.setText(framework.getVersi());
        situsDetail.setTag(framework.getSitus());
        situsDetail.setText(framework.getNama());
        situsDetail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.situs_detail_framework:
                Uri uri = Uri.parse(situsDetail.getTag().toString());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                break;
        }
    }
}
