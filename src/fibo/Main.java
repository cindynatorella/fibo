package fibo;

import java.util.HashMap;

public class Main {
	//Other timing for more precision
	/*
	 * long startTime = System.nanoTime();
methodToTime();
long endTime = System.nanoTime();

long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
	 * */
	
	
	public static void main(String[] args) {
		HashMap<Integer, Long> cache = new HashMap<Integer,Long>();
		
			
		System.out.println("hello");
		long startTime_fibonachi = System.currentTimeMillis();
		System.out.println(fibonachi(30));
		long endTime_fibonachi = System.currentTimeMillis();
		System.out.println("endTime_fibonachi took " + (endTime_fibonachi - startTime_fibonachi) + " milliseconds");
		
		long startTime_fibonachi_memiozed = System.currentTimeMillis();
		System.out.println(fibonachi_memiozed(50, cache));
		long endTime_fibonachi_memiozed = System.currentTimeMillis();
		System.out.println("endTime_fibonachi_memiozed took " + (endTime_fibonachi_memiozed - startTime_fibonachi_memiozed) + " milliseconds");
	}
	
	
	public static int fibonachi(int n) {
		
		if(n<=2)
			return 1;
		
		return fibonachi(n-1)+fibonachi(n-2);
		
	}
	
	public static long fibonachi_memiozed(int n, HashMap<Integer, Long> cache) {//2 power n
		if(cache.get(n) != null) {
			return cache.get(n);
		}
		if(n<=2)
			return 1;
		
		cache.put(n,fibonachi_memiozed(n-1, cache)+fibonachi_memiozed(n-2, cache));
		return cache.get(n);
		
	}
	
}
