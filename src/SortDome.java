import java.util.Arrays;

/**
 * 排序算法比较 冒泡，选择，快速
 * @author yangxixi
 *
 */
public class SortDome {
	public static void main(String[] args) {
		
		final int N = 50000;
		int[] nums = new int[N];
		int[] nums1 = new int[N];
		int[] nums2 = new int[N];
		int[] nums3 = new int[N];
		//生成随机数组
		for(int i = 0; i < N; i++) {
			nums[i]=(int)(Math.random()*100000);
		}
		
		//控制台输出随机数组,1000个数换行
		for(int i = 0; i < N; i++) {
			System.out.printf("\t%d", nums[i]);
			if((i%1000)==999)
				System.out.printf("\n");
		}		
		
				
		for (int i = 0; i < N ; i++) {
			nums1[i] = nums2[i] = nums3[i] = nums[i];
		}
		
		System.out.println();
		
		//冒泡排序	nums1	
		//从小到大
		long startTime = System.currentTimeMillis();
		
		for(int i = N-1; i > 0; i--) {
			for (int j = 0; j < i-1; j++) {
				if(nums1[j] > nums1[j+1]) {
					int temp = nums1[j];
					nums1[j] = nums1[j+1];
					nums1[j+1] = temp;
				}
					
			}
		}		
		
		long endTime = System.currentTimeMillis();
		System.out.printf("\n冒泡排序用时：%d\tms\n",endTime-startTime);
		
		for(int i = 0; i < N; i++) {
			System.out.printf("\t%d", nums1[i]);
			if((i%1000)==999)
				System.out.printf("\n");
		}		
		
		System.out.println();
		//选择排序	nums2	
		//从小到大
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < N; i++) {
			int k = i;
			for(int j = i; j < N-2; j++) {
				if(nums2[k] > nums2[j+1]) {
					k = j+1;
				}
				
			}
			int temp = nums2[k];
			nums2[k] = nums2[i];
			nums2[i] = temp;
		}
		
		endTime = System.currentTimeMillis();
		System.out.printf("\n选择排序用时：%d\tms\n",endTime-startTime);
		
		for(int i = 0; i < N; i++) {
			System.out.printf("\t%d", nums2[i]);
			if((i%1000)==999)
				System.out.printf("\n");
		}				
		
		System.out.println();
		//快速排序	nums3	
		//从小到大
		startTime = System.currentTimeMillis();
		Arrays.sort(nums3 ,0 , N-1);		
		
		endTime = System.currentTimeMillis();
		System.out.printf("\n快速排序用时：%d\tms\n",endTime-startTime);
		
		for(int i = 0; i < N; i++) {
			System.out.printf("\t%d", nums3[i]);
			if((i%1000)==999)
				System.out.printf("\n");
		}				
		
		
		
				
	}

}
