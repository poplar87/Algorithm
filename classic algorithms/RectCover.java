 /**
         * 其实就是一个斐波那契数列，满足公式：d(n) = d(n-1) + d(n-2) 
         * @param target
         * @return
         */
        public int RectCover(int target) {
            int tempNum = 1;
            int result = 2;

            if (target == 0) {
                return 1;
            }

            if (target == 1 || target == 2) {
                return target;
            }

            int count = 2;
            while (count < target) {
                result += tempNum;
                tempNum = result - tempNum;
                count ++;
            }
            return result;
        }

        public static void main(String []args) {
            Solution solution = new Solution();

            int target = 5;
            System.out.println(solution.RectCover(target));
        }
--------------------- 
作者：shansusu 
来源：CSDN 
原文：https://blog.csdn.net/shansusu/article/details/49687291 
版权声明：本文为博主原创文章，转载请附上博文链接！
