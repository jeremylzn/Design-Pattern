class School:

    def openSchoolDoor(self):
      print("Open School door")

    def lockSchoolDoor(self):
      print("Lock School door")

class SchoolCinema:

    def openSchoolCinemaDoor(self):
      print("Open School Cinema door")

    def lockSchoolCinemaDoor(self):
      print("Lock School Cinema door")

class Facade :
    s=School()
    sc=SchoolCinema()

    def open(self):
        self.s.openSchoolDoor()
        self.sc.openSchoolCinemaDoor()

    def close(self):
        self.s.lockSchoolDoor
        self.sc.lockSchoolCinemaDoor()

facade=Facade()

facade.open()