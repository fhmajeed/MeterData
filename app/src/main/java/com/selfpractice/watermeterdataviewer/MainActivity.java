package com.selfpractice.watermeterdataviewer;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    public static final String _URL = "https://integratedcontrolsystem.000webhostapp.com/display.php";
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        httpRequest();
    }

    private void httpRequest() {

        Volley.newRequestQueue(this).add(new StringRequest(0, _URL, new Listener<String>() {

            @Override
            public void onResponse(String response) {

                settingListForView(new Gson().fromJson(response, ListOfMeterData.class));

            }
        }, new ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }));
    }
    public void onClickForRefresh(View view) {

        Snackbar.make(view, (CharSequence) "Please Wait", -1).show();
        httpRequest();

    }

    private void settingListForView(ListOfMeterData meterRecords) {

        adapter = new MeterAdapter(meterRecords.getList());
        this.recyclerView.setAdapter(adapter);
        this.recyclerView.invalidate();
    }
}
