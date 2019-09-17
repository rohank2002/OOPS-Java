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


emp1 = Employee('rohan', 'kamat', 50000)
emp2 = Employee('sidd', 'kamat', 50000)
print(emp1.pay)
# emp1.apply_raise()
Employee.raise_amount = 2
emp1.apply_raise()
print(emp1.pay)
print(emp2.pay)
# print(Employee.fullname(emp1))
