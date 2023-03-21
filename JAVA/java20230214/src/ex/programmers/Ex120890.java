package ex.programmers;

import java.util.*;
import java.util.stream.*;

public class Ex120890 {
	public static void main(String[] args) {
		int[] array = {1,2,45,44,45,46,78,8,9,9,0,0, 5, 4,35,64};
		int n= 48;
		int answer = 0;
		int j = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(j > (Math.abs(n - array[i]))) {
				answer = array[i];
				j = (Math.abs(n-array[i]));
			} else if(j == (Math.abs(n - array[i]))) {
				answer = array[i] < array[i-1] ? array[i] :array[i-1];
			}
		}
		System.out.println(answer);
		answer = Math.min(
				array[Arrays.stream(array)
				      .map(operand -> Math.abs(n - operand))
				      .boxed()
				      .collect(Collectors.toList())
				      		.indexOf(Arrays.stream(array)
				    		.map(operand -> Math.abs(n - operand))
				    		.min().orElse(0))], 
				
				array[Arrays.stream(array)
				      .map(operand -> Math.abs(n - operand))
				      .boxed()
				      .collect(Collectors.toList())
				      		.lastIndexOf(Arrays.stream(array)
			    		  	.map(operand -> Math.abs(n - operand))
			    		  	.min().orElse(0))]
    			);
        
	}
}
