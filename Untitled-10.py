class student:
    __id = 0
    __age = 0
    __marks = 0

    def __init__(self, id, age, marks):
        self.id = id
        self.age = age
        self.marks = marks

    def display(self):
        print(self.id, self.age, self.marks)

    def validate_marks(self):
        if self.marks < 0 or self.marks > 100:
            #raise ValueError("Marks should be between 0 and 100")
            return False
        return True
    def validate_age(self):
        if self.age < 20 or self.age > 100:
            #raise ValueError("Age should be between 0 and 100")
            return False
        return True
    
    def check_qualification(self):
        if self.validate_marks() and self.validate_age():
            if self.marks >= 65 :    #and self.age >= 20
                return True
            else:
                return False
        else:
            return False
        
    #setter methods for all instance variables to set its values
    def set_id(self, id):
        self.__id = id
    def set_age(self, age):
        self.__age = age
    def set_marks(self, marks):
        self.__marks = marks


    #setter methods for all instance variables to set its values
    def get_id(self):
        return self.__id
    def get_age(self):
        return self.__age
    def get_marks(self):
        return self.__marks

d = student(1, 20, 65)
# print(d.display()) # why getting none on calling d.display() method , bcoz using print() on print function
# print(d.get_id())

d.display()

# print(d.check_qualification())