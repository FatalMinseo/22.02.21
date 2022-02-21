package 상속01;

public class Folder extends Tell {
	// 하위 클래스 명 extends 상위 클래스 명
	public void Camera() {
		System.out.println("사진을 찍다");
	}

	@Override
	public void ButtonClick() {
		System.out.println("똑 똑 똑 버튼을 클릭합니다");
	}
}
