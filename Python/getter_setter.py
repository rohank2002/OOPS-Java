class Employee:
    raise_amount = 1.05
    num_of_employees = 0

    def __init__(self, first, last, pay):
        self.first = first
        self.last = last
        self.pay = pay

        Employee.num_of_employees += 1
    @property
    def fullname(self):
        return '{} {}'.format(self.first, self.last)

    @fullname.setter
    def fullname(self,name):
        first, last=name.split(" ")
        self.first=first
        self.last=last

    @fullname.deleter
    def fullname(self):
        print("Name Deleted")
        self.first = None
        self.last = None

    @property
    def email(self):
        return "{}.{}@company.com".format(self.first, self.last)

    def apply_raise(self):
        self.pay = int(self.pay * self.raise_amount)

    def __repr__(self):
        return "Employee('{}' '{}' '{}')".format(self.first, self.last, self.pay)

    def __str__(self):
        return '{} - {}'.format(self.fullname(), self.email)

    def __add__(self,other):
        return self.pay + other.pay

    def __len__(self):
        return len(self.fullname())


class Developer(Employee):
    def __init__(self, first, last, pay, prog_lang):
        super().__init__(first, last, pay)
        self.prog_lang = prog_lang


class Manager(Employee):
    def __init__(self, first, last, pay, employees=None):
        super().__init__(first, last, pay)
        if self.num_of_employees is None:
            employees = []
        else:
            self.employees = employees

    def add_emp(self, emp):
        if emp not in self.employees:
            self.employees.append(emp)

    def remove_emp(self, emp):
        if emp in self.employees:
            self.employees.remove(emp)

    def print_emp(self):
        for emp in self.employees:
            print("-->", emp.fullname())


dev1 = Developer('rohan', 'kamat', 50000, "python")
dev2 = Developer('sidd', 'kamat', 50000, "java")
mgr_1 = Manager('Santosh', 'Kamat', 90000, [dev1])
dev1.first = "aparna"
print(dev1.fullname)
dev1.fullname = "rohan kamat"
print(dev1.fullname)
del dev1.fullname
# print(dev1.fullname)