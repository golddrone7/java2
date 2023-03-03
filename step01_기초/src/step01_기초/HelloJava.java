package step01_기초;

import java.util.HashMap;

// 주석(comment) 작성 날짜, 복잡한 방식으로 코딩을 했으면 간단한 원리를 적음
// 시간이 지나도 기억할 수 있게 끔 작성
// 싱글라인주석
// 컨트롤 + / (주석 단축 키)

/*
  Ctrl+Shift+/ 주석 설정
  Ctrl+Shift+\ 주석 해제
	멀티라인 주석
	주석
	;;;
*/ 
// 한줄 삭제 : ctrl + d

/* ` 그레이브
 * ' 어포스트로피
 * @ 앳
 * # 샾
 * ^ 캐럿
 * & 앰퍼샌드
 * * 별표 or 아스트리스크
 * () 괄호 or 파렌thㅔ시스
 * \ 역슬래시
 * | 파이프 입력의전환 OR 연산할 때 사용
 * {} 브레이스 
 * [] 스퀘어 브라켓
 * <> 앵글브라켓
 * ; : " '
 * 
 */
// ctrl + space : 자동 완성
public class HelloJava {
	// 프로그래밍 진입점	
	public static void main(String[] args) {
		// syso  > ctrl+space
		System.out.println("이름은 홍길동입니다.");
		// println() 함수, 무언가를 출력할 때
		System.out.println("사는곳은 강남입니다");
		System.out.println("나이는 23세입니다");
		// ctrl+f11 : 메인함수 실행
		System.out.println("이름은 홍길동입니다.\n사는곳은 강남입니다\n나이는 23세입니다");
		System.out.println("이름은 홍길동입니다.\n"
				+"사는곳은 강남입니다\n"
				+"나이는 23세 입니다");
		// \n 줄바꿈
		// 입력=>연산->출력
		// "" 문자열
		System.out.println("Hello java\n");
		System.out.println("Hello oracle\n");
		// ln 줄바꿈
	}
}


