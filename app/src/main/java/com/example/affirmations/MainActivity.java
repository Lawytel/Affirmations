package com.example.affirmations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.affirmations.adapter.ItemAdapter;
import com.example.affirmations.data.DataSource;
import com.example.affirmations.model.Affirmation;
//import com.example.affirmations.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Affirmation> myDataset = DataSource.loadAffirmations();
        RecyclerView recyclerView  = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new ItemAdapter(this, myDataset));
        recyclerView.setHasFixedSize(true);
    }
}