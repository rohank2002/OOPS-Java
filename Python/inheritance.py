class Employee:

    raise_amount = 1.05
    num_of_employees = 0

    def __init__(self, first, last, pay):
        self.first = first
        self.last = last
        self.pay = pay
        self.email = first + "." + last + "@company.com"
        Employee.num_of_employees += 1

    def fullname(self):
        return '{} {}'.format(self.first, self.last)

    def apply_raise(self):
        self.pay = int(self.pay * self.raise_amount)
class Developer(Employee):
    def __init__(self, first, last, pay, prog_lang):
        super().__init__(first, last, pay)
        self.prog_lang = prog_lang

class Manager(Employee):
    def __init__(self, first, last, pay, employees=None):
        super().__init__(first, last, pay)
        if self.num_of_employees==None:
            employees=[]
        else:
            self.employees=employees
    def add_emp(self,emp):
        if emp not in self.employees:
            self.employees.append(emp)
    def remove_emp(self,emp):
        if emp in self.employees:
            self.employees.remove(emp)
    def print_emp(self):
        for emp in self.employees:
            print("-->", emp.fullname())
    


dev1 = Developer('rohan', 'kamat', 50000, "python")
dev2 = Developer('sidd', 'kamat', 50000, "java")
mgr_1 = Manager('Santosh', 'Kamat', 90000, [dev1])
# mgr_1.print_emp()
# mgr_1.add_emp(dev2)
# mgr_1.print_emp()
# mgr_1.remove_emp(dev2)
# mgr_1.print_emp()

# print(isinstance(dev2,Developer))
# print(issubclass(Developer,Employee))


# print(dev1.first)