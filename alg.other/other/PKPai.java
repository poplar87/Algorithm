import java.util.*;

class PKPai  
{
 /*
	 * 先默认初始牌堆为1-n,按规则法则。
	 */
	public int[] pkPai(int n) {
		// 定义一个数组，给牌赋值
		int[] m = new int[n];
		for (int i = 0; i < m.length; i++) {
			m[i] = i + 1;
		}
		int[] j = new int[n];// 桌子上牌的数组
		int count = 0;
		while (count < n) {
			// 一直抽牌，第一张放桌子上，第二张放牌低，循环操作
			for (int i = 0; i < m.length; i++) {
				if (i % 2 == 0) {
					j[count] = m[i];
					count++;
				}
				// 扩容数组:每在牌低加一张便算作数组扩容+1
				if (i % 2 == 1) {
					int l = m[i];
					m = Arrays.copyOf(m, m.length + 1);
					m[m.length - 1] = l;
				}
			}
			// 反转序列
			// Collections.reverse(list);
		}
		return j;
	}
 
	// 传入默认1-n牌堆发牌的数组，交换坐标的到需要得到的序列
	public int[] pai(int[] j) {
		int length = j.length;
		// 定义接收新排序的数组
		int[] r = new int[length];
		int count = 0;
		// 置换排序
		for (int i = length; i > 0; i--) {
			r[j[i-1] - 1] = i;
		
		}
		return r;
	}
 
	public static void main(String[] args) {
		PKPai pkPai = new PKPai();
		int[] p = pkPai.pkPai(9);
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
		}
			System.out.print("pai'xu hou:");
		int[] pai = pkPai.pai(p);
		for (int i = 0; i < pai.length; i++) {
			System.out.print(pai[i] + " ");
		}
	}


}

