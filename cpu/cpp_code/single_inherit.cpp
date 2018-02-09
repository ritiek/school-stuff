#include <iostream>
using namespace std;

class studentbase {
    protected:
        int roll, height, weight;
        char name[20], gender;
    public:
        void getdata() {
            cout << "Enter Student Details:";
            cout << "\n\tRoll No: ";
            cin >> roll;
            cout << "\tName: ";
            cin >> name;
            cout << "\tGender (M or ): ";
            cin >> gender;
            cout << "\tHeight (in cm): ";
            cin >> height;
            cout << "\tWeight (in Kg): ";
            cin >> weight;
        }
};

class studderived : public studentbase {
    public:
        void disp() {
            cout << "\n\t\tStudent Details";
            cout << "\n\t\t*-*-*-*-*";
            cout << "\n\n\tName: " << name;
            cout << "\n\tRollNo.: " << roll;
            cout << "\n\tGender: " << gender;
            cout << "\n\tHeight: " << height << " cm";
            cout << "\n\tWeight: " << weight << " Kg";
        }
};

int main() {
    studderived s;
    s.getdata();
    s.disp();
    return 0;
}
