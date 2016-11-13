package com.wei.wunit.fw;

public abstract class TestCase implements Test {

	@Override
	public void run(TestResult res) {

	}

	public TestResult run() {
		TestResult res = new TestResult();
		run(res);
		return res;
	}

}
