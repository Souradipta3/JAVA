from abc import ABC, abstractmethod

# Interface Attendance
class Attendance(ABC):
    @abstractmethod
    def getAttendance(self):
        pass

# Class Student
class Student:
    def __init__(self):
        self.roll = 0

    def setRoll(self, roll: int):
        self.roll = roll

    def getRoll(self):
        return self.roll

# Subclass Test
class Test(Student):
    def __init__(self):
        super().__init__()
        self.sub1 = 0.0
        self.sub2 = 0.0

    def setMarks(self, sub1: float, sub2: float):
        self.sub1 = sub1
        self.sub2 = sub2

    def getMarks(self):
        return f"Marks in Subject 1: {self.sub1}, Marks in Subject 2: {self.sub2}"

# Class Result extends Test and implements Attendance
class Result(Test, Attendance):
    def __init__(self):
        super().__init__()
        self.atten = 0
        self.total = 0.0

    def getAttendance(self):
        return f"Attendance: {self.atten}%"

    def setAttendance(self, atten: int):
        self.atten = atten

    def getTotal(self):
        self.total = self.sub1 + self.sub2 + self.atten
        return self.total

    def display(self):
        print(f"Roll Number: {self.getRoll()}")
        print(self.getMarks())
        print(self.getAttendance())
        print(f"Total: {self.getTotal()}")

# Input for Result
result = Result()

roll = int(input("Enter roll number: "))
result.setRoll(roll)

sub1 = float(input("Enter marks for subject 1: "))
sub2 = float(input("Enter marks for subject 2: "))
result.setMarks(sub1, sub2)

atten = int(input("Enter attendance percentage: "))
result.setAttendance(atten)

result.display()
