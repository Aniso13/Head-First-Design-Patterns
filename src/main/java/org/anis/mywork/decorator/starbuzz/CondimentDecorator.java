package org.anis.mywork.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription();
}