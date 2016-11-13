package com.wei.junit_test;

import com.wei.utils.Utils;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class Test {

	public static class Test1 extends TestCase {

		protected void runTest() {
			Utils.print("Test1");
		}

	}

	public static class Test2 extends TestCase {

		public void doSth() {
			Utils.print("Test2.doSth");
		}
	}

	public static void main(String[] args) {
		// runTest的方法是TestCase中真正运行测试例的地方，TestResult是用于收集测试例的运行结果
		// 通过覆写TestCase中的runTest方法
		Test1 oTest1 = new Test1();
		TestResult res = oTest1.run();
		Utils.print(res.wasSuccessful());

		// TestCase中的runTest中通过反射运行测试方法
		// 通过setName方法设置需要运行的方法的名称
		Test2 oTest2 = new Test2();
		oTest2.setName("doSth");
		res = oTest2.run();
		Utils.print(res.wasSuccessful());
	}

}
