#include <bits/stdc++.h>
using namespace std;

void bubble_sort(int a[], int n)
{
	for (int i = n - 1; i > 0; --i)
	{
		for (int j = 0; j < i; ++j)
		{
			if (a[j] > a[j + 1])
			{
				swap(a[j], a[j + 1]);
			}
		}
	}
}

int main()
{
	int n;
	cin >> n;   // input size of array
	int a[n];
	for (int i = 0; i < n; ++i)
	{
		cin >> a[i];   // int n elements to be sorted
	}
	bubble_sort(a, n);
	cout << "After Bubble Sort:";
	for (int i = 0; i < n; ++i)
	{
		cout << " " << a[i];  // printing sorted elements
	}
	return 0;
}