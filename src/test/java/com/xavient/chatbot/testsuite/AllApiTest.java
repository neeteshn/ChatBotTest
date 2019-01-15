package com.xavient.chatbot.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.xavient.chatbot.Billing_InteractionTest;
import com.xavient.chatbot.LoginE2ETest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        Billing_InteractionTest.class,
        LoginE2ETest.class
       
})
public class AllApiTest {
}
