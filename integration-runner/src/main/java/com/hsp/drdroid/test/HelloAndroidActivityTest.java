package com.hsp.drdroid.test;

import android.test.ActivityInstrumentationTestCase2;
import com.hsp.drdroid.HelloAndroidActivity;
import com.squareup.spoon.Spoon;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

  public HelloAndroidActivityTest() {
    super(HelloAndroidActivity.class);
  }

  public void testActivity() {
    Spoon.screenshot(getActivity(), "Hello_Android_activity__initial_state");

    HelloAndroidActivity activity = getActivity();
    assertNotNull(activity);
  }
}