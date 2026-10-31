saldo = float(input("insira seu saldo: "))

print("selecione 1 para deposito")

print("selecione 2 para saque")

escolha = int(input(""))

valor = float(input("informe o valor q deseja depoistar/sacar: "))

if escolha==1:
    result = saldo + valor 
    op = "+"
elif escolha==2:
    if saldo>=valor:
        result=saldo-valor
        op = "-"
    else:
        print("saldo insuficiente!")

print(f"{saldo}{op}{valor}= {result}")

