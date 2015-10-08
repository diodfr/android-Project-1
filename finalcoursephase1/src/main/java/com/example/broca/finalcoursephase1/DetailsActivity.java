package com.example.broca.finalcoursephase1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;

public class DetailsActivity extends Activity implements FilmHandler {
    private Film film;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        film = getIntent().getParcelableExtra(Intent.EXTRA_TEXT);
        setContentView(R.layout.activity_details);
        getActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public Film getFilm() {
        return film;
    }
}
