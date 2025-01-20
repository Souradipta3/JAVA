# Interface Speaker
class Speaker(ABC):
    @abstractmethod
    def speak(self):
        pass

# Subclass Lecturer implements Speaker
class Lecturer(Speaker):
    def speak(self):
        print("Lecturer is giving a lecture.")

# Subclass Politician implements Speaker
class Politician(Speaker):
    def speak(self):
        print("Politician is giving a speech.")

# Main function to demonstrate Speaker
speaker1 = Lecturer()
speaker2 = Politician()

# Using a reference variable of Speaker
speaker: Speaker
speaker = speaker1
speaker.speak()

speaker = speaker2
speaker.speak()
