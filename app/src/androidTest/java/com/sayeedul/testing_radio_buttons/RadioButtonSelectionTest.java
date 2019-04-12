package com.sayeedul.testing_radio_buttons;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class RadioButtonSelectionTest  {
    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

//    @Test
//    public void useAppContext() throws Exception {
//        // Context of the app under test.
//        Context appContext = InstrumentationRegistry.getTargetContext();
//
//        assertEquals("com.sayeedul.testing_radio_buttons",
//                appContext.getPackageName());
//   }

    /**
     * Iterate through the spinner, selecting each item and
     * checking to see if it matches the string in the array.
     */
    @Test
    public void iterateRadioGroupItems() {
//        String[] myArray = mActivityRule.getActivity().getResources()
//                .getStringArray(R.array.labels_array);
        Integer myArray[] = {R.id.radio_red, R.id.radio_green, R.id.radio_blue , R.id.radio_yellow};
        // Iterate through the spinner array of items.
        int size = myArray.length;
        for (int i=0; i<size; i++) {
            // Find the spinner and click on it.
           onView(withId(myArray[i])).perform(click());
            // Find the spinner item and click on it.
            //onData(is(myArray[i])).perform(click());
            // Find the text view and check that the spinner item
            // is part of the string.
           // onView(withId(R.id.myAr))
                   // .check(matches(withId(myArray[i])));


        }
    }


}
