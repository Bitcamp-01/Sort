package com.bit.sort.sh;

import java.util.Arrays;

public class CountingSort {

	//사용된 횟수를 세어서 정렬, 가장 빠른 정렬 방법
	// Counting Sort - 제한 조건: 정렬 대상이 '정수'이어야 한다. 메모리 낭비가 심하다.
	public static void main(String[] args) {
		
		int c[] = {3,4,5,2,2,3,4,1,1,5,1,0,1,0,2,0,2,5,3};
		int cnt[] = new int[6];

		for(int i = 0; i<c.length; i++){
			cnt[c[i]]++;
		}

		//출력할 필요는 없으나 숫자가 몇개씩 저장되있나 확인하기 위해 출력
		System.out.println("카운터 정렬: " + Arrays.toString(cnt));

		for(int i = 0; i< cnt.length; i++){
		    for(int j = 0; j<cnt[i]; j++){
			System.out.print(i +" ");
		     }
		}
		System.out.println();
		
		
		
		
	}
	
	
	
}

