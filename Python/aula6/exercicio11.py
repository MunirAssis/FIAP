#1 1   2 1    3 2    4 3   5 5    6 8    7 13    8 21    9 34    10 55   11 89
i=0
ant=0
atual=1
prox = atual + ant

num = int(input("informe que numero vc deseja contar de fibonacci: "))

while i < num:
    prox = atual + ant
    ant = atual
    atual = prox
    i= i+1
print(f"o {num}ºn de fibonacci é {ant}")