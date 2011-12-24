package com.ashu.javasamples;

public class AToI {

	public static void main(String[] args) {

		String input = "       -1111111111             ";
		Parser parser = new Parser(input);
		if (parser.parseString()) {
			System.out.println("The integer is: " + parser.getInteger());
		} else {
			System.err.println("Not an integer");
		}
	}

}

class Parser {

	private String _string;
	private int _start;
	private int _len;

	private boolean _isNegative;

	private static final int max = Integer.MAX_VALUE;
	private static final int min = Integer.MIN_VALUE;

	// private static final int max = 15;
	// private static final int min = -16;

	private int _output;

	Parser(String input) {
		this._string = input;
		this._start = 0;
		this._len = _string.length() - 1;

		this._isNegative = false;

		this._output = 0;
	}

	int getInteger() {
		return (int) _output;
	}

	boolean parseString() {

		int _limit;

		while (_string.charAt(_start) == ' ') {
			_start++;
		}

		while (_string.charAt(_len) == ' ') {
			_len--;
		}

		if (_string.charAt(_start) != '-'
				&& (_string.charAt(_start) < '0' || _string.charAt(_start) > '9')) {
			return false;
		}

		if (_string.charAt(_start) == '-') {
			_isNegative = true;
			_start++;
		}

		if (!_isNegative) {
			_limit = max;
			while (_start <= _len) {
				if (_string.charAt(_start) >= '0'
						&& _string.charAt(_start) <= '9') {
					if (_limit / 10 >= _output) {
						_output = _output * 10;
					} else {
						return false;
					}

					if (_limit - _output >= (_string.charAt(_start) - '0')) {
						_output += _string.charAt(_start) - '0';
					} else {
						return false;
					}
					_start++;
				} else {
					return false;
				}
			}
			return true;

		} else {
			_limit = min;
			while (_start <= _len) {
				if (_string.charAt(_start) >= '0'
						&& _string.charAt(_start) <= '9') {
					if (_limit / 10 <= _output) {
						_output = _output * 10;
					} else {
						return false;
					}

					if (_limit - _output <= (_string.charAt(_start) - '0') * -1) {
						_output -= _string.charAt(_start) - '0';
					} else {
						return false;
					}
					_start++;
				} else {
					return false;
				}
			}
			return true;

		}
	}
}
