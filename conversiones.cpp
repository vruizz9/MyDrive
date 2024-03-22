#include <iostream>
#include <string>
#include <sstream>
#include <cmath>

using namespace std;

string decimalToBinary(int decimal) {
    if (decimal == 0)
        return "0";

    string binary = "";
    while (decimal > 0) {
        binary = (decimal % 2 == 0 ? "0" : "1") + binary;
        decimal /= 2;
    }
    return binary;
}

string decimalToOctal(int decimal) {
    stringstream octal;
    octal << oct << decimal;
    return octal.str();
}

string decimalToHexadecimal(int decimal) {
    stringstream hexadecimal;
    hexadecimal << hex << decimal;
    return hexadecimal.str();
}

int binaryToDecimal(string binary) {
    int decimal = 0;
    int size = binary.length();
    for (int i = 0; i < size; ++i) {
        if (binary[i] == '1') {
            decimal += pow(2, size - i - 1);
        }
    }
    return decimal;
}

int main() {
    int choice;
    cout << "Seleccione la conversión que desea realizar:\n";
    cout << "1. De decimal a binario, octal y hexadecimal.\n";
    cout << "2. De binario a decimal, octal y hexadecimal.\n";
    cout << "Ingrese su elección (1 o 2): ";
    cin >> choice;

    if (choice == 1) {
        int decimal;
        cout << "Ingrese un número decimal: ";
        cin >> decimal;

        cout << "Número binario: " << decimalToBinary(decimal) << endl;
        cout << "Número octal: " << decimalToOctal(decimal) << endl;
        cout << "Número hexadecimal: " << decimalToHexadecimal(decimal) << endl;
    } else if (choice == 2) {
        string binary;
        cout << "Ingrese un número binario: ";
        cin >> binary;

        int decimal = binaryToDecimal(binary);
        cout << "Número decimal: " << decimal << endl;
        cout << "Número octal: " << decimalToOctal(decimal) << endl;
        cout << "Número hexadecimal: " << decimalToHexadecimal(decimal) << endl;
    } else {
        cout << "Selección no válida. Por favor ingrese 1 o 2.\n";
    }

    return 0;
}
