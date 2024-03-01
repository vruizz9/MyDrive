#include <iostream>
using namespace std;

int main() {
    int opcion;

    do {
        cout << "Menú:" << endl;
        cout << "1. Imprimir números del 1 al 10" << endl;
        cout << "2. Imprimir letras de la A a la Z" << endl;
        cout << "3. Salir" << endl;
        cout << "Ingrese su opción: ";
        cin >> opcion;

        switch (opcion) {
            case 1:
                cout << "Imprimiendo números del 1 al 10:" << endl;
                for (int i = 1; i <= 10; i++) {
                    cout << i << " ";
                }
                cout << endl;
                break;
            case 2:
                cout << "Imprimiendo letras de la A a la Z:" << endl;
                for (char c = 'A'; c <= 'Z'; c++) {
                    cout << c << " ";
                }
                cout << endl;
                break;
            case 3:
                cout << "Saliendo del programa..." << endl;
                break;
            default:
                cout << "Opción no válida. Por favor, ingrese una opción válida." << endl;
                break;
        }
    } while (opcion != 3);

    cout << "Fin del programa." << endl;

    return 0;
}
