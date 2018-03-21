#Vehicle class
#By: Owen M
#19/03/2018

class Vehicle:
    licencsePlate = ""
    colour = ""
    doors = 0
    _speed = 0
    _maximumSpeed = 0

    def __init__(self, Licencse,Colour,Doors):
        self.licencsePlate = Licencse
        self.colour = Colour
        self.doors = Doors
        
    def accelerate(newSpeed):
        speed = newSpeed

    def brake(self):
        speed = 0

class Horse(Vehicle):
    altitude = 0
    
    def __init__(self, Licencse,Colour,Doors, Height):
        Vehicle.__init__(self,Licencse,Colour,Doors)
        
    def brake(self):
        speed = 4

Car = Vehicle("BXRN 597", "black", 5)
Plane = Horse("HJRE 234", "red", 11, 3000)

print("> List of commands:")
print("> getSpeed - gets the speed of the vehicles")
print("> getLicencse - gets the licencse plate")
print("> getDoors - gets the number of doors for each vehicle")
print("> changeSpeed(newSpeed) - changes the speed of the vehicle")
print("> changeAltitude(newAltitude) - changes the altitude of the plane")
print("> brake - stops the car, setting the speed to 0")
print("> quit - ends the program")

while True:
    command = input("> ")

    chars = command.split('(')
    
    if command == "getSpeed":
        print("> Car1: " + str(Car._speed) + "km/h")
        print("> Plane " + str(Plane._speed) + "km/h")
    elif command == "getLicencse":
        print("> Car1: " + Car.licencsePlate)
        print("> Plane: " + Plane.licencsePlate)
    elif command == "getDoors":
        print("> Car1: " + str(Car.doors))
        print("> Plane: " + str(Plane.doors))
    elif len(chars) == 2:
        if chars[0] == "changeSpeed":
            print("> changed vehicle speeds to " + chars[1][:-1] + "km/h")
            Car.accelerate(int(chars[1][:-1]))
            Plane.accelerate(int(chars[1][:-1]))
        elif chars[0] == "changeAltitude":
            print("> changed plane altitude to " + chars[1][:-1] + "km above sea level")
            Plane.changeAltitude(int(chars[1][:-1]))
    elif command == "brake":
        print("> changed car speed to 0")
        print("> changed horse speed to a saunter")
        Car.brake()
        Plane.brake()
    elif command == "quit":
        break
    else:
        print("> Invalid input, you may have mispelled the command")

        
