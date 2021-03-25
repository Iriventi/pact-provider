package com.example.contract;

import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import au.com.dius.pact.provider.spring.SpringRestPactRunner;
import au.com.dius.pact.provider.spring.target.SpringBootHttpTarget;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
@RunWith(SpringRestPactRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Provider("sample-provider")
@PactBroker(host = "yourbrokerUrl", port = "80")
public class GreetingProviderTest {

    @TestTarget
    public final Target target = new SpringBootHttpTarget();

    @Before
    public  void start() { }

    @State("testGetGreetingContract")
    public void testGetGreetingContract() {

    }

}
