package sub2;

/* 
 * 날짜 : 2020/05/04
 * 이름 : 윤재이 
 * 내용 : 반복문 while 실습하기
 */

public class WhileTest {
	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while( k <= 10 ) {
		
			sum += k; //무한루트
			k++;
		}	
		System.out.println("1부터 10까지 합 :" +sum);
		
		// do~ while (와일문의 본체가 와일문의 위에 있다.한번은 실행후 조건에 따라 하지 말지 결정한다)
		int eSum = 0;
		int i = 1;
		
	
		do {
			
			if(i%2 == 0) {
			    eSum += i;
			   }
			i++;
			
		}	
		while(i <= 10);
		

		 System.out.println("1부터 10까지 짝수합 : "+eSum);
		
		
		
		// break
	    int num = 0;    
	
	    while(true) {
	    	
	    	num++;
	    	
	    	if(num%5 == 0 && num%7 == 0) {
	    		break; //반복문을 탈출
	    	}
	    	
	    	
	   	}
	
	    System.out.println("5와 7의 최소공배수:"+num);
	
	
	
		//continue
	    int total = 0;
	    
	    for(int j=1 ; j<=10 ; j++) {
	    	
	    	if(j % 2 == 1) {
	    		continue; //반복문의 상위로 이동
	    	}
	    	
	    	total += j;
	  	    }
	
	    System.out.println("1부터 10까지 짝수합: "+total);
	}
}


