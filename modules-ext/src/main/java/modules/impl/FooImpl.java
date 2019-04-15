package modules.impl;

import modules.Foo;

public class FooImpl implements Foo {

	@Override
	public void foo() {
		System.out.println("FooImpl::foo called");
	}
	
	public static void main(String[] args) {
		Foo f = new FooImpl();
		f.foo();
	}

}
