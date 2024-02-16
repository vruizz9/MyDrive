#include<iostream>
using namespace std;

int main() {
	double a;
	double b;
	double c;
	cout << "La ecuación es la siguiente: x + 3 * 8 = 3x - 5" << endl;
	cout << "¿Cuánto equivale x?" << endl;
	a = 3*8;
	b = 1;
	b = b-3;
	c = -5-a;
	cout << "x - 3x = - 5 - " << a << endl;
	cout << b << "x = " << c << endl;
	cout << "x = " << -1*c << "/" << -1*b << endl;
	return 0;
}