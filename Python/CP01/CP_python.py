'''Exercico 1'''
anterior = float(input("Consumo do mês anterior (m³): "))
atual = float(input("Consumo do mês atual (m³): "))

if atual <= 20:
    preco = 2.00
elif atual <= 35:
    preco = 3.50
elif atual <= 50:
    preco = 5.50
else:
    preco = 7.00

valor_consumo = atual * preco
print(f"Valor do consumo: R$ {valor_consumo:.2f}")

if atual < anterior:
    desconto = valor_consumo * 0.15
    total = valor_consumo - desconto
    print(f"Desconto: R$ {desconto:.2f}")
elif atual > anterior:
    multa = valor_consumo * 0.10
    total = valor_consumo + multa
    print(f"Multa: R$ {multa:.2f}")
else:
    total = valor_consumo

print(f"Total da conta: R$ {total:.2f}")

'''Exercicio 2'''

login = input("informe o login: ")
senha = input("informe a senha: ")

if login == "scott":
    if senha == "tiger":
        print("autenticado com sucesso")
    else:
        print("usuario ou senha inválida")

elif login == "walt":
    if senha == "disney":
        print("autenticado com sucesso")
    else:
        print("usuario ou senha inválida")

elif login == "spock":
    if senha == "ncc1701":
        print("autenticado com sucesso")
    else:
        print("usuario ou senha inválida")

else:
    print("usuario ou senha invalido")
    
    
'''Exercicio 3'''

peso = int(input("informe seu peso (Kg): "))
altura = float(input("informe sua altura (m): "))

Imc = peso / (altura * altura)

if Imc < 18.5:
    print("Abaixo do peso")
elif Imc <= 24.9:
    print("peso normal")
elif Imc <=29.9:
    print("sobrepeso")
else:
    print("Obesidade")


'''Exercicio 4'''

num = int(input("insira um numero: "))
par = 0
impar = 0

while num > 1:

    dig = num % 10
    if dig % 2 == 0:
        print(f"{dig} é par")
        par= par + 1
    else:
        print(f"{dig} é impar")
        impar = impar + 1
    num = num // 10
print(f"Isso são: {par} pares e {impar} impares")

'''Exercicio 5 - Urna'''

voto = 5
cadA = 0
cadB = 0
nulo = 0
branco = 0

while voto != 0:
    voto = int(input(" \n 0 - encerrar votação \n " \
                        "1 - candidato A \n " \
                        "2 -  candidato B \n " \
                        "3 - Voto nulo \n " \
                        "4 Voto em Branco \n " \
                        "informe seu voto: " ))
    if voto == 1:
        cadA = cadA + 1
        print("\nVoto validado")
    elif voto ==2:
        cadB = cadB + 1
        print("\nVoto validado")
    elif voto == 3:
        nulo = nulo + 1
        print("\nVoto validado")
    elif voto == 4:
        branco = branco + 1
        print("\nVoto validado")
    else:
        print("\nVoto invalido")

print(f"\n ====Apuração dos votos====\n Candidato A com: {cadA} votos \n Candidato B com: {cadB} votos\n nulos : {nulo} \n brancos: {branco}" )

'''Exercicio 6 '''

print("Localizado de Quadrantes (Plano Cartesiano)")
x = float(input("Digite a coordenada X: "))
y = float(input("Digite a coordenada Y: "))
if x == 0 and y == 0:
    print("Origem")
elif x > 0 and y == 0:
    print("Eixo X")
elif y > 0 and x == 0:
    print("Eixo Y")
elif x > 0 and y > 0:
    print("Quadrante 1")
elif x < 0 and y > 0:
    print("Quadrante 2")
elif x < 0 and y < 0:
    print("Quadrante 3")
elif x > 0 and y < 0:
    print("Quadrante 4")


'''Exercicio 7 - E-commerce'''

cmp = float(input("insira o valor da compra: "))
fid = int(input("indique a fidelidade: "))
desc = 0 
valor_desc = 0

if (fid == 2 and cmp > 100):
    valor_desc = cmp * 0.05
    cmp = cmp - (cmp*0.05)
    desc = desc + 5
elif (fid == 3 and cmp > 500):
    valor_desc = cmp * 0.15
    cmp = cmp - (cmp*0.15)
    desc = desc + 15
elif (fid == 3 and cmp <= 500):
    valor_desc = cmp * 0.10
    cmp = cmp - (cmp*0.10)
    desc = desc + 10
else:
    cmp = cmp


frete = 0
if cmp < 200:
    frete = frete + 25
else: 
    frete = frete

print(f"\n======\n  O valor da compra (com desconto) R$:{cmp} \n desconto aplicado foi de: {desc}%, isso da R$:{valor_desc}  \n frete foi de R$:{frete} \n valor total da compra R$:{cmp + frete} \n=======")