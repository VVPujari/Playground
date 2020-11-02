#include<iostream>
#include<string>
using namespace std;
string reverse(string const &s)
{
	string rev;
	for (int i = s.size() - 1; i >= 0; i--) {
		rev = rev.append(1, s[i]);
	};

	return rev;
}

int main()
{
	string s;
    getline(cin,s);
  
	s = reverse(s);
	cout << s;

	return 0;
}