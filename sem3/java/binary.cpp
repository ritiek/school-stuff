#include <iostream>
using namespace std;

int main() {
    int n_elements, to_search;
    int arr[100];

    cout << "Enter the number of elements: ";
    cin >> n_elements;
    for (int i=0; i<n_elements; i++) {
        cout << "Enter element no. " << i << ": ";
        cin >> arr[i];
    }

    cout << "Enter the element to search: ";
    cin >> to_search;

    int start = 0;
    int end = n_elements;
    int mid_term;

    while (1) {
        mid_term = (start + end) / 2;
        if (arr[mid_term] == to_search) {
            cout << "Element found at position " << mid_term << "!" << endl;
            break;
        } else if (arr[mid_term] > to_search) {
            end = mid_term;
        } else if (arr[mid_term] < to_search) {
            start = mid_term;
        }
    }

    return 0;
}
