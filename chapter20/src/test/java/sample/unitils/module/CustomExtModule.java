package sample.unitils.module;

import org.unitils.core.Module;
import org.unitils.core.TestListener;

import java.lang.reflect.Method;
import java.util.Properties;

public class CustomExtModule implements Module {

	public TestListener getTestListener() {
		return new CustomExtListener();
	}

	protected class CustomExtListener extends TestListener {
		@Override
		public void beforeTestSetUp(Object testObject, Method testMethod) {

		}

		@Override
		public void afterCreateTestObject(Object testObject) {
		}

		@Override
		public void afterTestMethod(Object testObject, Method testMethod,
				Throwable testThrowable) {
		}

		@Override
		public void afterTestTearDown(Object testObject, Method testMethod) {
		}

		@Override
		public void beforeTestClass(Class<?> testClass) {
		}

		@Override
		public void beforeTestMethod(Object testObject, Method testMethod) {
		}
	}


	public void afterInit() {

	}


	public void init(Properties configuration) {

	}

}
