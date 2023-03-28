class Animal:
    def __init__(self, name, age, run, fly):
        self.name = name
        self.age = age
        self.run = run
        self.fly = fly

    def info(self):
        print(f"Name: {self.name}")
        print(f"Age: {self.age}")
        print(f"Can run: {self.run}")
        print(f"Can fly: {self.fly}")
        print()

# Create three instances of the Animal class
lion = Animal("Lion", 5, True, False)
eagle = Animal("Eagle", 3, False, True)
dolphin = Animal("Dolphin", 10, True, False)

# Print info for each animal
lion.info()
eagle.info()
dolphin.info()