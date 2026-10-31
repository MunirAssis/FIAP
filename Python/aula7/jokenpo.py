import random
pontPLAY=0
pontCPU=0

while (pontCPU <= 2) or (pontPLAY <=2):
    msg = """1 pedra \n 2 papel \n 3 tesoura"""
    print(msg)
    jogada=int(input("escolha: "))
    cpu = random.randint(1, 3)
    if jogada == 1 and cpu == 2:
        print("cpu venceu")
        pontCPU= pontCPU+1
    elif jogada == 2 and cpu == 3:
        print("cpu venceu")
        pontCPU= pontCPU+1
    elif jogada == 3 and cpu == 1:
        print("cpu venceu")
        pontCPU= pontCPU+1
    elif jogada !=  cpu:
        print("player venceu")
        pontPLAY= pontPLAY+1
    else:
        print("empate")

print(f"{pontPLAY} X {pontCPU}")