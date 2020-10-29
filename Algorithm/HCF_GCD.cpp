#include<bits/stdc++.h>
using namespace std;

int get_gcd(int p, int q) {

	if (p < q)
		swap(p, q);

	if (p % q == 0)
		return q;
	else
		return get_gcd(q, (p % q));
}

int get_lcm(int m, int n) {
	int lc = (m * n) / get_gcd(m, n);
	return lc;
}

int main() {
	int a, b;
	cout << "Enter 'a' :- ";
	cin >> a;
	cout << "Enter 'b' :- ";
	cin >> b;

	int gcd, lcm;
	gcd = get_gcd(a, b);
	lcm = get_lcm(a, b);

	cout << "HCF/GCD => " << gcd << endl;
	cout << "LCM => " << lcm << endl;

	return 0;
}