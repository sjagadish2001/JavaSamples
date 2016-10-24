package com.sai;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CountATest.class, HelloWorldTest.class, SquareTest.class })
public class AllTests {

}
