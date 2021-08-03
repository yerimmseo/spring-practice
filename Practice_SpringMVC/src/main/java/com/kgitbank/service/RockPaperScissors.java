package com.kgitbank.service;

import org.springframework.stereotype.Component;

// 스프링의 root-context에 컴포넌트로서 등록할 것
@Component
public class RockPaperScissors {
	private int win;
	private int tie;
	private int lose;

	// 가위, 바위, 보 중 하나를 입력받으면 승/무/패 결과가 리턴되는 메서드를 하나 작성
	// JUnit 테스트로 메서드를 20회 테스트하고 파일에 메서드 실행 결과에 대한 로그를 남겨보세요
	public String versus(String user) {
		String[] com = { "가위", "바위", "보" };
		int ran = (int)(Math.random() * com.length);
		
		if (user.equals("가위")) {
			if (com[ran].equals("가위")) {
				tie++;
			} else if (com[ran].equals("바위")) {
				lose++;
			} else if (com[ran].equals("보")) {
				win++;
			}
		} else if (user.equals("바위")) {
			if (com[ran].equals("가위")) {
				win++;
			} else if (com[ran].equals("바위")) {
				tie++;
			} else if (com[ran].equals("보")) {
				lose++;
			}
		} else if (user.equals("보")) {
			if (com[ran].equals("가위")) {
				lose++;
			} else if (com[ran].equals("바위")) {
				win++;
			} else if (com[ran].equals("보")) {
				tie++;
			}
		}
		return String.format("%d/%d/%d", win, tie, lose);
	}
	
}
