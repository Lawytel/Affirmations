package com.example.affirmations.data;

import com.example.affirmations.R;
import com.example.affirmations.model.Affirmation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataSource {
    public static List< Affirmation > loadAffirmations() {
        return new ArrayList<Affirmation>(Arrays.asList(
                new Affirmation(R.string.affirmation1, R.drawable.image1),
                new Affirmation(R.string.affirmation2, R.drawable.image2),
                new Affirmation(R.string.affirmation3, R.drawable.image3),
                new Affirmation(R.string.affirmation4, R.drawable.image4),
                new Affirmation(R.string.affirmation5, R.drawable.image5),
                new Affirmation(R.string.affirmation6, R.drawable.image6),
                new Affirmation(R.string.affirmation7, R.drawable.image7),
                new Affirmation(R.string.affirmation8, R.drawable.image8),
                new Affirmation(R.string.affirmation9, R.drawable.image9),
                new Affirmation(R.string.affirmation10, R.drawable.image10)
            )
        );
    }
}
