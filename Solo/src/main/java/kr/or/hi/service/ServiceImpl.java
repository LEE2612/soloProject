package kr.or.hi.service;

public class ServiceImpl implements Service {

	@Override
	public String addNumber(String name) {
		/*비지니스 로직*/
		int a = 1;
		int b = 2;
		int c = 3;

		return name + a + b + c;
	}

}
