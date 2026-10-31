num_a = float(input("digite um numero: "))
num_b = float(input("digite um numero: "))

op = input("informe a operação (+-*/): ")

if op=="+":
    result = num_a + num_b
elif op=="-":
    result = num_a - num_b
elif op == "*":
    result=num_a*num_b
elif op=="/":
    if num_b!=0:
        result=num_a/num_b
    else:
        print("não é possivel dividir por 0")
else:
    print("operador invalido!")

print(f"{num_a}{op}{num_b}={result}")