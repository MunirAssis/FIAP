soma = 0

num = int(input("Digite um numero: "))
while num != 0:
    if num >= 10:
        print("seu numero é maior que 10")
    if num % 2 == 0:
        soma = soma + num
    num = int(input("Digite um numero: "))

print(f"A soma dos pares vale {soma}")
