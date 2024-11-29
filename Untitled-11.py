class Scoop:
    flavor = ""
    __price = None
    count = 0

    def __init__(self, flavor, price):
        self.flavor = flavor
        self.__price = price
        print("Flavor - ",self.flavor, "Price -",self.__price)
        Scoop.count += 1

    def get_price(self):
        return self.__price

    def set_price(self, price):
        self.__price = price

    def sold(self):
        print(f"{Scoop.count} scoops sold")


    # def __str__(self):
    #     return self.flavor

    # def __add__(self, other):
    #     return self.__price + other.__price

    # def __sub__(self, other):
    #     return self.__price - other.__price

    # def __mul__(self, other):
    #     return self.__price * other.__price

    # def __truediv__(self, other):
    #     return self.__price / other.__price

    # def __eq__(self, other):
    #     return self.__price == other.__price

class Bowl:
    __scoop_list = []
    count = 0

    def __init__(self):
        Bowl.count += 1 
        for s in self.__scoop_list:
            print(s.flavor, end="\n")

    def add_scoops(self, *Scoop):
        self.__scoop_list = self.__scoop_list + list(Scoop) # list(Scoop)
        # for s in scoop:
            # if not isinstance(s, scoop):
            #     raise TypeError("Not a scoop!")

        # self.__scoop_list.append(scoop)
        # self.__scoop_list = self.__scoop_list + list(scoop)
        

    # def get_scoops(self):
    #     return self.__scoop_list

    def display(self):
        print("Displaying Bowl \n")
        for s in self.__scoop_list:
            print("Flavor - ",s.flavor, "Price -",s.get_price())
        print(self.__scoop_list)

    def sold(self):
        print(f"{Bowl.count} bowls sold")

#------------------------------------------------------------------------------

choco = Scoop("Chocolate")
print(choco)
choco.set_price(100)

berry = Scoop("Berry")
berry.set_price(120)
print(berry)

vanilla = Scoop("vanilla")
print(vanilla)

bowl = Bowl()

bowl.add_scoops(choco)
bowl.add_scoops(berry, vanilla)
bowl.display()
bowl.sold()

