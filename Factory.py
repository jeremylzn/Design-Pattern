from abc import ABC

class Person(ABC):

    def __init__(self, name, password):
        self.name=name
        self.password=password
        print("Person constructor")

class Client(Person):

    def __init__(self, name, password):
        Person.__init__(self, name, password)
        print("Client constructor")

class Admin(Person):

    def __init__(self, name, password):
        Person.__init__(self, name, password)
        print("Admin constructor")

class Manager(Person):

    def __init__(self, name, password):
        Person.__init__(self, name, password)
        print("Manager constructor")

class Factory:

       @classmethod
       def createPerson(self, name, password):
            if name=="Bob" and password=="123":
                return Admin(name, password)

            if name=="Alice" and password=="678":
                return Manager(name, password)
               
            return Client(name, password)


p=Factory.createPerson("Tom", "123")