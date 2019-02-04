package com.xavient.chatbot.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.xavient.chatbot.Offer_InteractionTest;
import com.xavient.chatbot.Price_InteractionTest;
import com.xavient.chatbot.Color_InteractionTest;
import com.xavient.chatbot.Device_InteractionTest;
import com.xavient.chatbot.LoginE2ETest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        Offer_InteractionTest.class,
        Price_InteractionTest.class,
        Device_InteractionTest.class,
        Color_InteractionTest.class,
        LoginE2ETest.class
       
})
public class AllApiTest {
}
