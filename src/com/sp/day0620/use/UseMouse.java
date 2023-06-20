package com.sp.day0620.use;

//현재 클래스와 사용하려는 클래스가 서로 다른 경로에 있으면 사용이 불가능하므로
//사용하려는 대상 클래스의 경로를 import해야함
//이때 import경로는 해당 os의 환경변수에 의존적임
import com.sp.day0620.hardware.Mouse;
//D:\morning\java_workspace\day0620\bin\com\sp\day0620\hardware
class UseMouse{
	public static void main(String[] args) 
	{
		Mouse m=new Mouse();
		System.out.println("마우스 올렷어!");
	}
}
