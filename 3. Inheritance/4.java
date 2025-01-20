class ProductionWorker:
    def __init__(self, name, id_number, hourly_rate, shift):
        self.name = name
        self.id_number = id_number
        self.hourly_rate = hourly_rate
        self.shift = shift

    def get_hourly_rate(self):
        return self.hourly_rate

    def get_shift(self):
        return self.shift

class TeamLeader(ProductionWorker):
    def __init__(self, name, id_number, hourly_rate, shift, bonus, required_training_hours, attended_training_hours):
        super().__init__(name, id_number, hourly_rate, shift)
        self.bonus = bonus
        self.required_training_hours = required_training_hours
        self.attended_training_hours = attended_training_hours

    def get_bonus(self):
        return self.bonus

    def set_bonus(self, bonus):
        self.bonus = bonus

    def get_required_training_hours(self):
        return self.required_training_hours

    def set_required_training_hours(self, required_training_hours):
        self.required_training_hours = required_training_hours

    def get_attended_training_hours(self):
        return self.attended_training_hours

    def set_attended_training_hours(self, attended_training_hours):
        self.attended_training_hours = attended_training_hours

    def to_string(self):
        return f"Team Leader: {self.name}, ID: {self.id_number}, Bonus: ${self.bonus}, Required Training: {self.required_training_hours} hours, Attended Training: {self.attended_training_hours} hours"

# Input for TeamLeader
name = input("Enter Team Leader's name: ")
id_number = input("Enter Team Leader's ID number: ")
hourly_rate = float(input("Enter Team Leader's hourly rate: "))
shift = input("Enter Team Leader's shift: ")
bonus = float(input("Enter Team Leader's monthly bonus: "))
required_training_hours = int(input("Enter required training hours: "))
attended_training_hours = int(input("Enter attended training hours: "))

team_leader = TeamLeader(name, id_number, hourly_rate, shift, bonus, required_training_hours, attended_training_hours)
print(team_leader.to_string())
