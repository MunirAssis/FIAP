'''exercicio11'''
Salario = float(input("Informe seu Salario: "))
Por = int(input("informe a porcentagem do aumento: "))

valorA = Salario + (Salario * (Por/100))
print(f"o seu salario passara a custar: {valorA}")