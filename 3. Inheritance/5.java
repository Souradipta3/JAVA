class Ship:
    def __init__(self, name, year_built):
        self.name = name
        self.year_built = year_built

    def get_name(self):
        return self.name

    def get_year_built(self):
        return self.year_built

    def to_string(self):
        return f"Ship Name: {self.name}, Year Built: {self.year_built}"

class CruiseShip(Ship):
    def __init__(self, name, year_built, max_passengers):
        super().__init__(name, year_built)
        self.max_passengers = max_passengers

    def get_max_passengers(self):
        return self.max_passengers

    def to_string(self):
        return f"Cruise Ship: {self.name}, Max Passengers: {self.max_passengers}"

class CargoShip(Ship):
    def __init__(self, name, year_built, cargo_capacity):
        super().__init__(name, year_built)
        self.cargo_capacity = cargo_capacity

    def get_cargo_capacity(self):
        return self.cargo_capacity

    def to_string(self):
        return f"Cargo Ship: {self.name}, Cargo Capacity: {self.cargo_capacity} tons"

# Input for Ship, CruiseShip, and CargoShip
ship_count = int(input("Enter number of ships to create: "))
ships = []

for _ in range(ship_count):
    ship_type = input("Enter Ship type (CruiseShip/CargoShip): ").lower()
    name = input("Enter Ship's name: ")
    year_built = input("Enter Ship's year built: ")
    
    if ship_type == "cruise":
        max_passengers = int(input("Enter maximum passengers: "))
        ships.append(CruiseShip(name, year_built, max_passengers))
    elif ship_type == "cargo":
        cargo_capacity = int(input("Enter cargo capacity in tons: "))
        ships.append(CargoShip(name, year_built, cargo_capacity))

# Display all ships
for ship in ships:
    print(ship.to_string())
