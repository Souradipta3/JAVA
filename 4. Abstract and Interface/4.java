# Abstract class Shape
class Shape(ABC):
    @abstractmethod
    def calculateArea(self):
        pass

# Class Circle extends Shape
class Circle(Shape):
    def __init__(self, radius: int):
        self.radius = radius

    def calculateArea(self):
        area = 3.14 * self.radius ** 2
        print(f"Area of Circle with radius {self.radius} is: {area}")

# Input for Circle
radius = int(input("Enter radius of the circle: "))
circle = Circle(radius)
circle.calculateArea()
