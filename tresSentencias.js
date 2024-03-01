function tressentencias() {
	var opcion = new Number();
	var i = new Number();
	do {
		document.write("Menú:", '<BR/>');
		document.write("1. Imprimir números del 1 al 10", '<BR/>');
		document.write("2. Imprimir números pares del 0 al 10:", '<BR/>');
		document.write("3. Salir", '<BR/>');
		document.write("Ingrese su opción: ", '<BR/>');
		opcion = Number(prompt());
		switch (opcion) {
		case 1:
			document.write("Imprimiendo números del 1 al 10:", '<BR/>');
			for (i=1; i<=10; ++i) {
				document.write(i, '<BR/>');
			}
			break;
		case 2:
			document.write("Imprimiendo números pares del 0 al 10:", '<BR/>');
			for (i=0; i<=10; ++i) {
				if (i%2==0) {
					document.write(i, '<BR/>');
				}
			}
			break;
		case 3:
			break;
		default:
			document.write("Opción no válida. Por favor, ingrese una opción válida.", '<BR/>');
		}
	} while (opcion<3);
document.write("Fin del programa.", '<BR/>')}