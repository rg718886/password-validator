package com.example.raghdakashgari.a2;
/**
 * Created by raghdakashgari on 2018-02-10.
 */
import  org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import java.lang.ref.SoftReference;

import static android.support.test.espresso.Espresso.onView;

public class ESPRESSOtest {
    private String password;
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initValidString() {
      //valid string specification
        password = "nespresso";
    }
    @Test
    public void test() {

        onView(withId(R.id.editText2)).perform(typeText(password), closeSoftKeyboard());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.textView2)).check(matches(withText(password)));

    }
}





