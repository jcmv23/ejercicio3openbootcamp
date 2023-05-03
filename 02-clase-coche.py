class Coche:
    def __init__(self, num_puertas: int):
        self.num_puertas = num_puertas

    def anadir_puerta(self):
        self.num_puertas += 1

def main():
    miCoche = Coche(num_puertas=2)
    miCoche.anadir_puerta()
    print("El coche tiene", miCoche.num_puertas, "puertas.")

if __name__ == "__main__":
    main()
