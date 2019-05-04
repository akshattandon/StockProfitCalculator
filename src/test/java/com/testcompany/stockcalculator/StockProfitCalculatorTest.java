/**
 * 
 */
package com.testcompany.stockcalculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * @author akshattandon
 *
 */
public class StockProfitCalculatorTest {
	
	StockProfitCalculator stockProfitCalculator;
	
	@Before
	public void setUp() throws Exception {
		stockProfitCalculator = new StockProfitCalculator();
	}

	@After
	public void tearDown() throws Exception {
		stockProfitCalculator = null;
	}
	
	/**
	 * Test method for {@link com.testcompany.stockcalculator.StockProfitCalculator#getMaxProfit(int[])}.
	 */
	@Test(expected = IllegalArgumentException.class) 
	public void testGetMaxProfitForNullInput() {
		int[] stockPrices = null;
		stockProfitCalculator.getMaxProfit(stockPrices);
	}
	
	/**
	 * Test method for {@link com.testcompany.stockcalculator.StockProfitCalculator#getMaxProfit(int[])}.
	 * to test for empty input 
	 */
	@Test(expected = IllegalArgumentException.class) 
	public void testGetMaxProfitEmptyInput() {
		int[] stockPrices = {};
		stockProfitCalculator.getMaxProfit(stockPrices);
	}
	/**
	 * Test method for {@link com.testcompany.stockcalculator.StockProfitCalculator#getMaxProfit(int[])}.
	 * to test for one argumnent
	 */
	@Test(expected = IllegalArgumentException.class) 
	public void testGetMaxProfitForOneArgument() {
		int[] stockPrices = {10};
		stockProfitCalculator.getMaxProfit(stockPrices);
	}
	/**
	 * Test method for {@link com.testcompany.stockcalculator.StockProfitCalculator#getMaxProfit(int[])}.
	 * to test for NULL input
	 */
	@Test
	public void testGetMaxProfit() {
		int[] stockPrices = {10, 7, 5, 8, 11, 9};
		Assert.assertEquals (6, stockProfitCalculator.getMaxProfit(stockPrices));
	}
	
	/**
	 * Test method for {@link com.testcompany.stockcalculator.StockProfitCalculator#getMaxProfit(int[])}.
	 * to test for schenario where max share price comes first followed by min price 
	 */
	@Test
	public void testGetMaxProfitWithMaxValBeforeMinVal() {
		int[] stockPrices = {11, 7, 5, 8, 8, 9};
		Assert.assertEquals (4, stockProfitCalculator.getMaxProfit(stockPrices));
	}
	/**
	 * Test method for {@link com.testcompany.stockcalculator.StockProfitCalculator#getMaxProfit(int[])}.
	 * to test for schenario where max share price comes first followed by min price 
	 */
	@Test
	public void testGetMaxProfitWithMinValBeforeMaxVal() {
		int[] stockPrices = {5, 7, 6, 8, 8, 11};
		Assert.assertEquals (6, stockProfitCalculator.getMaxProfit(stockPrices));
	}
	/**
	 * Test method for {@link com.testcompany.stockcalculator.StockProfitCalculator#getMaxProfit(int[])}.
	 * to test for all same input
	 */
	@Test
	public void testGetMaxProfitForSameInput() {
		int[] stockPrices = {10, 10};
		Assert.assertEquals (0, stockProfitCalculator.getMaxProfit(stockPrices));
	}
	
	
	/**
	 * Test method for {@link com.testcompany.stockcalculator.StockProfitCalculator#getMaxProfit(int[])}.
	 * to test for -ve input
	 */
	@Test
	public void testGetMaxProfitForNegative() {
		int[] stockPrices = {-10, 7, 5, 8, 11, 9};
		Assert.assertEquals (21, stockProfitCalculator.getMaxProfit(stockPrices));
	}
	
}
