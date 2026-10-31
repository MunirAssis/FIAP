salario = input("informe seu salario: ")
dias = int(input("quantos dias voce trablhou esse mes: "))

horas = int(input("informe quantas horas voce trabalhou no mes: "))
valor_hora = (salario / dias)  #o valor que ele recebe por hora

totalhora = dias*8 #esse é o total de horas que ele deveria trabalhar (sem horas extras)

porcAumetExtra = valor_hora+(salario/2) #valor que ele receberia se fizesse hora extra

if totalhora < horas:
    salarioExtra = salario + porcAumetExtra

    print(f"voce recebe {salarioExtra} esse mes ")

else:
    print(f"voce não fez horas extra, seu salario é {salario}")