package com.xavient.chatbot.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.xavient.chatbot.Offer_InteractionTest;
import com.xavient.chatbot.Price_InteractionTest;
import com.xavient.chatbot.LoginE2ETest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        Offer_InteractionTest.class,
        Price_InteractionTest.class,
        LoginE2ETest.class
       
})
public class AllApiTest {
}
