#include <iostream>
using namespace std;

cass publications {
    protected:
        int book_no;
    public:
        void getdata1() {
            cout << "\nEnter book no. ";
            cin >> book_no;
        }
};

class author: public publications {
    private:
        char author_name[20];
    public:
        void getdata() {
            publications getdata1();
            cout << "Enter author's name";
            cin >> author_name;
        }
        void show() {
            cout << book_no << " " << author_name;
        }
};

class deri: public author {};

int main() {
    deri d;
    d.getdata();
    d.show();
    return 0;
}
