package com.ashu.javasamples;

public class PermutationsDemo {

	public static void main(String[] args) {
		String str = "aabb";
		Permutations p = new Permutations(str);
		p.permute(str.length(), 0);
	}
}

class Permutations {

	String word;
	int size;

	Permutations(String _word) {
		this.word = _word;
	}

	public void setSize() {
		size = word.length();
	}

	public int getLength() {
		return word.length();
	}

	public int getLength(String word) {
		return word.length();
	}

	public char[] toCharArrar(String _word) {
		return _word.toCharArray();
	}

	public void permute(int _size, int _index) {
		if (_index == _size) {
			for (int i = 0; i < _size; i++) {
				System.out.print(word.charAt(i));
			}
			System.out.println();
		} else {
			for (int i = _index; i < _size; i++) {
				swap(i, _index);
				permute(_size, _index + 1);

				swap(i, _index);

			}
		}
	}

	private void swap(int a, int b) {
		char[] c = word.toCharArray();
		char temp = c[a];
		c[a] = c[b];
		c[b] = temp;

		word = new String(c);

	}
}
