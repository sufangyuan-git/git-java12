package com.neuedu.classam20200805;

public class maopao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mp = { 5, 7, 3, 8, 1, 6, 9, 0, 2, 4 };
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < mp.length - 1; i++) {
				if (mp[i] > mp[i + 1]) {
					int temp;
					temp = mp[i];
					mp[i] = mp[i + 1];
					mp[i + 1] = temp;
				}
			}

		}
		for (int k : mp) {
			System.out.println(mp[k]);
		}
	}

}
