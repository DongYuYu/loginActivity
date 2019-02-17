package uga.cs.myapplication;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.action.ViewActions.typeTextIntoFocusedView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;














@RunWith(AndroidJUnit4.class)





@LargeTest
public class MainActivityTest23 {








    public static final String STRING_TO_BE_TYPED = "DongYu";


    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule
            = new ActivityTestRule<>(MainActivity.class);
    @Test
    public void changeText() {

        onView(withId(R.id.userName)).perform(typeTextIntoFocusedView(STRING_TO_BE_TYPED),closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());

        onView(withId(R.id.textView)).check(matches(withText(STRING_TO_BE_TYPED)));








        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText(STRING_TO_BE_TYPED)));

    }
}