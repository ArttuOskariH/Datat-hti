#include <iostream>
#include <deque>
#include <vector>

using namespace std;

int main()
{
    vector< deque<bool> > boolTable;
    int n;
    cin >> n;

    int arr[n];

    for(int i = 0; i < n; i++)
    {
        int a;
        cin >> a;
        arr[i] = a;
    }
//    n = 4;
//    int arr[n];
//
//    arr[0] = 3;
//    arr[1] = 2;
//    arr[2] = 7;
//    arr[3] = 1;

    int k = 1;

    deque<bool> tmp (n, true);

    boolTable.push_back (tmp);

    while(true)
    {
        deque<bool> line (n, false);
        if(arr[0] == k)
            line.at(0) = true;

        for(int i = 1; i < n; i++)
        {

            if(line.at(i-1))
            {
                line.at(i) = true;
                continue;
            }
            if(k-arr[i] < 0)
            {
                continue;
            }

            if(boolTable.at(k-arr[i]).at(i-1))
            {
                line.at(i) = true;
            }
        }

        if(!line.at(n-1))
        {
            cout << k << endl;
            break;
        }
        boolTable.push_back(line);
        k++;
    }
    return 0;
}
