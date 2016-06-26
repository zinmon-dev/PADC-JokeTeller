package com.example.asus.padc_ex3.data.models;

import android.content.Context;

import com.example.asus.padc_ex3.PADCEx3App;
import com.example.asus.padc_ex3.R;
import com.example.asus.padc_ex3.data.vos.JokeVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 6/25/2016.
 */
public class JokeModel {
    private static JokeModel objInstance;

    private List<JokeVO> jokeList;

    private JokeModel() {
        jokeList = setUpInitialJokes();
    }

    public static JokeModel getInstance() {
        if (objInstance == null) {
            objInstance = new JokeModel();
        }

        return objInstance;
    }

    private List<JokeVO> setUpInitialJokes() {
        Context context = PADCEx3App.getContext();

        List<JokeVO> jokeList = new ArrayList<>();
        jokeList.add(new JokeVO(context.getString(R.string.joke_title_1), context.getString(R.string.main_content), R.drawable.joke_1));
        jokeList.add(new JokeVO(context.getString(R.string.joke_title_2), context.getString(R.string.main_content_2), R.drawable.joke_2));
        jokeList.add(new JokeVO(context.getString(R.string.joke_title_3), context.getString(R.string.main_content_3), R.drawable.joke_3));
        return jokeList;
    }

    public JokeVO getJoke(int index) {
        return jokeList.get(index);
    }
}
