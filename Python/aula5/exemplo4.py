nota = float(input("Nota: "))

while nota > 10 or nota < 0:
    print (f"nota inalida")
    nota = float(input("Digite a nota novamente: "))
print(nota)