package com.hsp.drdroid.test;

import android.test.ActivityInstrumentationTestCase2;
import com.hsp.drdroid.HelloAndroidActivity;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

  public HelloAndroidActivityTest() {
    super(HelloAndroidActivity.class);
  }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
}