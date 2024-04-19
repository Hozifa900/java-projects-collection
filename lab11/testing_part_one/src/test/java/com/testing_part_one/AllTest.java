package com.testing_part_one;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, ArrayFlattenerTest.class, ArrayReverserTest.class })
public class AllTest {

}
