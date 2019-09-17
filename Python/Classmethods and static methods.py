import datetime
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

    @classmethod
    def set_raise_amount(cls, amount):
        cls.raise_amount = amount

    @classmethod
    def from_string(cls, emp_string):
        first, last, pay = emp_string.split("-")
        return cls(first, last, pay)

    @staticmethod
    def is_workday(day):
        if day.weekday() == 5 or day.weekday == 6:
            return False
        return True


emp1 = Employee('rohan', 'kamat', 50000)
# print(emp1.raise_amount)
Employee.set_raise_amount(1.50)
emp2 = Employee('sidd', 'kamat', 50000)
# print(emp1.raise_amount)
emp = "r-kamat-4000"
emp3 = Employee.from_string(emp)
# print(emp3.email)
my_day = datetime.datetime(2020,6,1)
print(Employee.is_workday(my_day))