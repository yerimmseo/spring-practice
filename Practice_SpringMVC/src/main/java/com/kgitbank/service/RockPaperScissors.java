package com.kgitbank.service;

import org.springframework.stereotype.Component;

// �������� root-context�� ������Ʈ�μ� ����� ��
@Component
public class RockPaperScissors {
	private int win;
	private int tie;
	private int lose;

	// ����, ����, �� �� �ϳ��� �Է¹����� ��/��/�� ����� ���ϵǴ� �޼��带 �ϳ� �ۼ�
	// JUnit �׽�Ʈ�� �޼��带 20ȸ �׽�Ʈ�ϰ� ���Ͽ� �޼��� ���� ����� ���� �α׸� ���ܺ�����
	public String versus(String user) {
		String[] com = { "����", "����", "��" };
		int ran = (int)(Math.random() * com.length);
		
		if (user.equals("����")) {
			if (com[ran].equals("����")) {
				tie++;
			} else if (com[ran].equals("����")) {
				lose++;
			} else if (com[ran].equals("��")) {
				win++;
			}
		} else if (user.equals("����")) {
			if (com[ran].equals("����")) {
				win++;
			} else if (com[ran].equals("����")) {
				tie++;
			} else if (com[ran].equals("��")) {
				lose++;
			}
		} else if (user.equals("��")) {
			if (com[ran].equals("����")) {
				lose++;
			} else if (com[ran].equals("����")) {
				win++;
			} else if (com[ran].equals("��")) {
				tie++;
			}
		}
		return String.format("%d/%d/%d", win, tie, lose);
	}
	
}
