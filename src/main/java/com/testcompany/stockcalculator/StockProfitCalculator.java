/**
 * Simple class to find the Max profit in a given set of brokerage prices for a same share
 */
package com.testcompany.stockcalculator;

import java.util.Arrays;


/**
 * @author akshattandon
 *
 */
public class StockProfitCalculator {
	
	private int maxProfit = 0; 
	private int minPrice = 0; 
	
	/**
	 * This method will take the input as an array of stock prices at a given day and time
	 * return the profit calculated with buy before selling
	 * @param stockPrices
	 * @return
	 * Throws IllegalArgumentException in case for Empty and NULL input 
	 */
	public int getMaxProfit(int[] stockPrices) {
		// Check for boundary conditions and throw IllegalArgumentException if input is empty null or with 
		// 1 argument 
		if(stockPrices == null || stockPrices.length == 0 || stockPrices.length == 1)
			throw new IllegalArgumentException("Incorrect input");
		// Set the min Price as 1st value
		this.minPrice = stockPrices[0];
		// Iterate in array 
		this.maxProfit = Arrays.stream(stockPrices)
		.map(
				currentPrice -> { 
					// Profit will min - current Price
					int profit = currentPrice - this.minPrice;
					// Set the min Price if it is less than current price
			        this.minPrice = Math.min(this.minPrice, currentPrice);
			        // Return the updated max profit value if it is greater than current 
			        return Math.max(this.maxProfit, profit);
				})
		// get the max against all profits
		.max().getAsInt();
		return this.maxProfit;
	}
	
	
	

}
