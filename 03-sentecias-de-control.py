# Usando un if
numero_if = 5

if numero_if > 0:
  print("El número es positivo")
elif numero_if < 0:
  print("El número es negativo")
else:
  print("El número es cero")

# Bucle While
numero_while = 0

while numero_while < 3:
  numero_while += 1
  print(numero_while)

# Bucle Do While (en Python se llama do-while)
numero_do_while = 0

while True:
  numero_do_while += 1
  print(numero_do_while)
  if numero_do_while >= 3:
    break

# Bucle For
for numero_for in range(4):
  print(numero_for)

# Switch (en Python no existe switch, pero se puede simular con un diccionario)
estacion = "verano"

switch = {
  "primavera": "Estamos en primavera",
  "verano": "Estamos en verano",
  "otoño": "Estamos en otoño",
  "invierno": "Estamos en invierno"
}

print(switch.get(estacion, "No es una estación válida"))
