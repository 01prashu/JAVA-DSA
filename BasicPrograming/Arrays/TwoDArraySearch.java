public class TwoDArraySearch {
    public static void main(String[]arg)
    {
        int arr1[][] ={{1 , 2, 3} ,{4 , 56 ,78} ,{76 , 98 ,80}};
        int target = 8;
        int pos = SearchTwoD(arr1 , target);
        System.out.println(pos);
    }
    static int SearchTwoD(int arr1[][] , int target)
    {
        int ans = -1;
        for(int i = 0;i<arr1.length;i++)
        {
            for(int j = 0;j<arr1[i].length;j++)
            {
                if(arr1[i][j] ==target)return i;
            }
        }
        return ans;
    }
}
