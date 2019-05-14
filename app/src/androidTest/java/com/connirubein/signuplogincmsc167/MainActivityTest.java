package com.connirubein.signuplogincmsc167;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
//import androidx.test.runner.AndroidJUnit4;
//import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

//import androidx.test.rule.ActivityTestRule;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;
import android.support.test.espresso.Espresso;
import static android.support.test.espresso.Espresso.onView;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    String pleaseEnterValidUserName = "Please enter valid username!";

//    @Test
//    public void clickBtnSignUp() {
//        Espresso.onView(withId(R.id.btnSignup)).perform(ViewActions.click());
//    }
//
//    @Test
//    public void clickBtnLogIn() {
//        Espresso.onView(withId(R.id.btnLogin)).perform(ViewActions.click());
//    }


//    @Test
//    public void createPerson() {
//        Espresso.onView(withId(R.id.btnSignup)).perform(ViewActions.click());
//        Espresso.onView(withId(R.id.et_name)).perform(ViewActions.typeText("helloworld"));
//        Espresso.onView(withId(R.id.et_password)).perform(ViewActions.typeText("helloworld"));
//        Espresso.onView(withId(R.id.btnSignup)).perform(ViewActions.click());
//    }

    @Test
    public void logInPerson_logOutPerson() {
        Espresso.onView(withId(R.id.btnLogin)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.et_name)).perform(ViewActions.typeText("helloworld"));
        Espresso.onView(withId(R.id.et_password)).perform(ViewActions.typeText("helloworld"));
        Espresso.onView(withId(R.id.btnLogin)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.btnLogout)).perform(ViewActions.click());
    }

    @Test
    public void userNameAlreadyExists() {
        Espresso.onView(withId(R.id.btnSignup)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.et_name)).perform(ViewActions.typeText("helloworld"));
        Espresso.onView(withId(R.id.et_password)).perform(ViewActions.typeText("helloworld"));
        Espresso.onView(withId(R.id.btnSignup)).perform(ViewActions.click());

    }

    @Test
    public void enterValidUsername() {
        Espresso.onView(withId(R.id.btnSignup)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.et_name)).perform(ViewActions.typeText(""));
        Espresso.onView(withId(R.id.et_password)).perform(ViewActions.typeText("helloworld"));
        Espresso.onView(withId(R.id.btnSignup)).perform(ViewActions.click());
        //Espresso.onView(withId(R.id.tv_notif)).check(matches(withText(pleaseEnterValidUserName)));
    }

    @Test
    public void enterValidPassword() {
        Espresso.onView(withId(R.id.btnSignup)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.et_name)).perform(ViewActions.typeText("hellowwwwwww"));
        Espresso.onView(withId(R.id.et_password)).perform(ViewActions.typeText(""));
        Espresso.onView(withId(R.id.btnSignup)).perform(ViewActions.click());
        Espresso.onView(withId(R.id.tv_notif)).check(matches(withText("Please enter valid password!")));
    }

}
