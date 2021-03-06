package com.javagists.strategy.design.pattern;
/**
 * https://www.javagists.com/strategy-design-pattern
 * @author T TAK
 *
 */
public class LowDiscountStrategy implements DiscountStrategy {

	@Override
	public int getFinalBill(int billAmount) {
		return (int) ((billAmount) - (billAmount * 0.1));
	}
}
