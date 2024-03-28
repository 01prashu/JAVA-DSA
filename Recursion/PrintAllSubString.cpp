#include<iostream>
#include<vector>
using namespace std;
void PrintSubSequence(int i ,vector<int>ans ,vector<int>seq  , int size , vector<vector<int>>&result)
{
    if(i== size)
    {
        vector<int>t;
        for(auto ele:seq)
        {
            t.push_back(ele);
        }
        result.push_back(t);
        return;
    }
    seq.push_back(ans[i]);
    PrintSubSequence(i+1 , ans ,seq, size , result);
    seq.pop_back();
    PrintSubSequence(i+1, ans , seq , size , result);
}
int main()
{
    vector<int>first{3 , 2 , 1};
    vector<int>temp;
    vector<vector<int>>ans;
    PrintSubSequence(0 , first , temp, first.size() , ans);
    for(auto i:ans)
    {
        for(auto j:i)
        {
            cout<<j<<" ";
        }
        cout<<endl;
    }
 return 0;
}