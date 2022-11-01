Funcion resultadoSuma <- Suma(operandoUno, operandoDos)
	Definir resultadoSuma Como Real
	resultadoSuma <- operandoUno + operandoDos
FinFuncion

Funcion resultadoResta <- Resta(operandoUno, operandoDos)
	Definir resultadoResta Como Real
	resultadoResta <- operandoUno - operandoDos
FinFuncion

Funcion resultadoMultiplicacion <- Multiplicacion(operandoUno, operandoDos)
	Definir resultadoMultiplicacion Como Real
	resultadoMultiplicacion <- operandoUno * operandoDos
FinFuncion

Funcion resultadoDivision <- Division(operandoUno, operandoDos)
	Definir resultadoDivision Como Real
	resultadoDivision <- operandoUno / operandoDos
FinFuncion

Algoritmo Calculadora
	Definir operacion Como Entero
	Definir numeroUno, numeroDos, res Como Real
	Escribir "¿Que operacion desea realizar?";
	Escribir "1. Suma"
	Escribir "2. Resta"
	Escribir "3. Multiplicacion"
	Escribir "4. Division"
	Escribir "Ingrese su opcion:"
	Leer operacion
	Escribir "Ingrese su primer numero"
	Leer numeroUno
	Escribir "Ingrese su segundo numero"
	Leer numeroDos
	Segun operacion Hacer
		1: res <- Suma(numeroUno, numeroDos)
		2: res <- Resta(numeroUno, numeroDos)
		3: res<- Multiplicacion(numeroUno, numeroDos)
		4: res<- Division(numeroUno, numeroDos)
	FinSegun
	Escribir res
FinAlgoritmo