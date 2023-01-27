package application;

public class kioskModel {

	public int msum(int [] cnt) {
		
		int summ = 0; //총계
		int p =0; //제품별 단가 초기 값
		
		for (int i=0; i< cnt.length;i++) {
			if(i==0) p=1000;
			if(i==1) p=2000;
			if(i==2) p=3000;
			
			summ = summ +cnt[i] *p;
		}
		
		return summ;
	}
	
}
