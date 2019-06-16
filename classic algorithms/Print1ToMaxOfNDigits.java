 public static void Print1ToMaxOfNDigits(int n)
    {
        if (n <= 0)
            return;

        char[] number = new char[n];
        for(int i=0;i<number.length;i++){
            number[i]='0';
        }
       // memset(number, '0', n);

        while (!Increment(number))
        {
            PrintNumber(number);
        }

    }


    // 字符串number表示一个数字，在 number上增加1
// 如果做加法溢出，则返回true；否则为false
    static boolean Increment(char[] number)
    {
        boolean isOverflow = false;
        int nTakeOver = 0;
        int nLength = number.length;

        for (int i = nLength - 1; i >= 0; i--)
        {
            int nSum = number[i] - '0' + nTakeOver;
            if (i == nLength - 1)
                nSum++;

            if (nSum >= 10)
            {
                if (i == 0)
                    isOverflow = true;
                else
                {
                    nSum -= 10;
                    nTakeOver = 1;
                    number[i] = (char)('0' + nSum);
                }
            }
            else
            {
                number[i] = (char)('0' + nSum);
                break;
            }
        }

        return isOverflow;
    }
    public static void main(String[] args) {
        Print1ToMaxOfNDigits(2);
        System.out.println("pause");

    }
    static void PrintNumber(char[] number) {
        boolean isBeginning0 = true;
        int nLength = number.length;

        for (int i = 0; i < nLength; ++i) {
            if (isBeginning0 && number[i] != '0')
                isBeginning0 = false;

            if (!isBeginning0) {
                System.out.print(number[i]);
            }
        }

        System.out.println("\t");

    }
