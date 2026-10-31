#feito por MIM
"""Criar um programa qual o usuario  informe um numero e o sistema façe a soma dele"""

n = int(input("informe n: "))

i=1
o=2
while o <= n:
    print(f"{i} + {o} = {i+o}")
    i = i + o 
    o = o+1