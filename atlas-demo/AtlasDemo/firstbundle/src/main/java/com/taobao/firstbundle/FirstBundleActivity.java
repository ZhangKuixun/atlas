package com.taobao.firstbundle;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.taobao.firstbundle.fragment.BlankFragment;

public class FirstBundleActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstbundle);
        Toast.makeText(this, "this is first bundle with single", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
