#include <iostream>
using namespace std;

class ComplexNumber {
    private:
        int real;
        int imaginary;
    public:
        friend void print_sum(ComplexNumber a, ComplexNumber b);
        void take_input(int y, int z) {
            real = y;
            imaginary = z;
        }
};

void print_sum(ComplexNumber a, ComplexNumber b) {
    cout << endl << "Sum is: ";
    int real = a.real + b.real;
    int imaginary = a.imaginary + b.imaginary;
    cout << real << " + " << imaginary << "i";
}

int main() {
    ComplexNumber a, b;
    cout << "Real and imaginary part of 1st number: ";
    a.take_input(5 ,5);
    cout << "Real and imaginary part of 2nd number: ";0
    b.take_input(15, 10);
    print_sum(a, b);
    return 0;
}
