package com.example.broca.finalcoursephase1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class MovieDetailFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public Film film;

    public MovieDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_movie_detail, container, false);

        TextView yearTextView = (TextView) view.findViewById(R.id.movieYear);
        yearTextView.setText(film.releaseDate.split("-")[0]);

        TextView dateTextView = (TextView) view.findViewById(R.id.movieDuration);
        dateTextView.setText(film.duration);

        TextView overviewTextView = (TextView) view.findViewById(R.id.movieOverview);
        overviewTextView.setText(film.overview);

        TextView ratingTextView = (TextView) view.findViewById(R.id.movieUserRating);
        ratingTextView.setText(film.voteAverage);

        TextView titleTextView = (TextView) view.findViewById(R.id.movieTitle);
        titleTextView.setText(film.originalTitle);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        final Picasso picaso = Picasso.with(getActivity());
        picaso.load(film.posterUrl).into(imageView);

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        if (activity instanceof FilmHandler) {
            film = ((FilmHandler) activity).getFilm();
        }
    }
}
