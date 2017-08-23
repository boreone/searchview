package com.jinlin.custom.iconcenterview;

import android.content.Context;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity{
    private EditText et_search;

    private IconCenterEditText icet_search;

    @Override
    public void iniView() {
        setContentView(R.layout.activity_main);

        et_search = (EditText) findViewById(R.id.et_search);

        icet_search = (IconCenterEditText) findViewById(R.id.icet_search);
        icet_search.setFocusable(true);
        icet_search.setFocusableInTouchMode(true);
        icet_search.requestFocus();
        // 实现TextWatcher监听即可
        icet_search.setOnSearchClickListener(new IconCenterEditText.OnSearchClickListener() {
            @Override
            public void onSearchClick(View view) {
                Toast.makeText(MainActivity.this, "i'm going to seach", Toast.LENGTH_SHORT).show();
                Log.d("MainActivity", "done");
            }
        });

    }
}
