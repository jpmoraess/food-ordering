package com.food.ordering.system.messaging;

public enum DebeziumOp {
	CREATE("c"), UPDATE("u"), DELETE("d");

	private final String value;

	DebeziumOp(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
