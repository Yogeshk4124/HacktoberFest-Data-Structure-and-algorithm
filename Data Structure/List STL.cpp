#include<iostream>
#include<vector>
#include<algorithm>
#include<set>
#include<forward_list>
#include<list>
using namespace std;
int main()
{
    //PUSH FRONT, BACK
    list<int> l1={1,2,5,5};
    l1.push_back(0); //1 2 5 5 0
    l1.push_front(0); //0 1 2 5 5 0 
    auto it=l1.begin();
    advance(it,2);
    //INSERT
    auto la=l1.insert(it,2,7); // 0 1 7 7 2 5 5 0
    it = l1.insert(la,1,9); // 0 1 9 7 7 2 5 5 0 //Returns pointer to the newly inserted first item
    for(int &x : l1)
        cout<<x<<" ";
    //POP FRONT BACK
    l1.pop_front();
    l1.pop_back();
    cout<<endl<<"Erased = ";
    for(int &x : l1)
        cout<<x<<" ";
    //ASSIGN
    l1.assign({1,9,7,2,2,6,5});
    cout<<endl<<"Assigned = ";
    for(int &x : l1)
        cout<<x<<" ";
    //ERASE
    auto in=l1.begin();
    advance(in,2);
    auto ij=in;
    advance(ij,3);
    l1.erase(in,ij); //ij exclusive, in inclusive since it's not erase_after, it is erase only
    cout<<endl<<"Erasing range = ";
    for(int &x : l1)
        cout<<x<<" ";
    auto gd = l1.begin();
    advance(gd,1);
    auto erased = l1.erase(gd);
    cout<<endl<<"Erasing one element  = ";
     for(int &x : l1)
        cout<<x<<" ";
    cout<<endl<<"Element after erased item  = "<<*erased;
    l1.remove(5);
    cout<<"\nRemoving duplicates 5 = ";
    for(int &x : l1)
        cout<<x<<" ";
    //MERGING SORTED
    list<int> list1={2,9,16,24};
    list<int> list2={3,8,22,23};
    list1.merge(list2);
    cout<<endl<<"Merged = ";
    for(int &x : list1)
        cout<<x<<" ";
    //REVERSE
    list1.reverse();
    cout<<endl<<"Reversed = ";
    for(int &x : list1)
        cout<<x<<" ";
    //SORT 
    list1.sort();
    //UNIQUE
    l1.assign({1,9,7,2,2,6,5});
    l1.unique();
    cout<<endl<<"Unique = ";
    for(int &x : l1)
        cout<<x<<" ";
    //SWAP
    //l1.swap(list1);
    //SPLICE
    list<int> j={1,0,0,0,0,6};
    auto e = j.begin();
    e++;
    auto s=e;
    advance(s,3);
    list1.splice(list1.end(),j,e,s);
    cout<<endl<<"Spliced = ";
    for(int &x : list1)
        cout<<x<<" ";
    auto ghe=list1.rbegin();
    auto ghs=list1.rend();
    cout<<endl<<"Reversed r = ";
    for(auto k=ghe;k!=ghs;k++)
        cout<<*k<<" ";
}