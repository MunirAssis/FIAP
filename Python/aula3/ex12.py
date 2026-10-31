'''Exercicio 12'''
''' Jeito errado pois pede cada numero individualmente 

M1=int(input("Insira o 1 numero do seu RM:"))
M2=int(input("Insira o 2 numero do seu RM:"))
M3=int(input("Insira o 3 numero do seu RM:"))
M4=int(input("Insira o 4 numero do seu RM:"))
M5=int(input("Insira o 5 numero do seu RM:"))

soma = M1+M2+M3+M4+M5
print(f'a soma dos seus RM s é: {soma}')'''

'''exercicio 12'''

rm = int(input("Insira seu Rm: "))

soma = 0              # setamos o valor em 0 para n atrapalhar a conta
soma = soma + rm % 10 # {soma} recebe o 0+ resto da divisão entre {rm} e 10
rm = rm//10           # {rm} recebe {rm} dividido por 10 (para excluir o ultimo Nº)

soma = soma + rm % 10 # repete o processo 
rm = rm//10

soma = soma + rm % 10
rm = rm//10

soma = soma + rm % 10
rm = rm//10

soma = soma + rm % 10 

#algoritmo de descascar o numero 

print(f'a soma dos digitos do seu RM é {soma}')


