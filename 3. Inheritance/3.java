class Employee:
    def __init__(self, name, id_number):
        self.name = name
        self.id_number = id_number

    def get_name(self):
        return self.name

    def get_id_number(self):
        return self.id_number

class ShiftSupervisor(Employee):
    def __init__(self, name, id_number, salary, bonus):
        super().__init__(name, id_number)
        self.salary = salary
        self.bonus = bonus

    def get_salary(self):
        return self.salary

    def set_salary(self, salary):
        self.salary = salary

    def get_bonus(self):
        return self.bonus

    def set_bonus(self, bonus):
        self.bonus = bonus

    def to_string(self):
        return f"Shift Supervisor: {self.name}, ID: {self.id_number}, Salary: ${self.salary}, Bonus: ${self.bonus}"

# Input for ShiftSupervisor
name = input("Enter Shift Supervisor's name: ")
id_number = input("Enter Shift Supervisor's ID number: ")
salary = float(input("Enter Shift Supervisor's annual salary: "))
bonus = float(input("Enter Shift Supervisor's annual bonus: "))

shift_supervisor = ShiftSupervisor(name, id_number, salary, bonus)
print(shift_supervisor.to_string())
