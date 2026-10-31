num = int(input("infore um numeo positivo: "))
while num<= 0:
    print("numero invalido")
    num = int(input("digite um numero positivo: "))

i=1
while i<10:
    k=num%i
    if k==0:
        print(f"{i} não é divisivel por {num}")
        i=i+1
        k=num%i
    else:
        print(f"{num} / {i} = {num/i}")
        i=i+1
        k=num%i